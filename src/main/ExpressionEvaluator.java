/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;

/**
 *
 * @author andre
 */
public class ExpressionEvaluator {

    private static final MathContext MC = new MathContext(20);

    private static final Map<String, Integer> PRECEDENCE = Map.of(
            "+", 1,
            "-", 1,
            "*", 2,
            "/", 2,
            "^", 3
    );

    public static BigDecimal evaluate(String expr) {
        List<String> postfix = toPostfix(expr);
        if (expr.contains("nCr")) {
            return new BigDecimal(resolveNCr(expr));
        }
        if (expr.contains("!")) {
            int n = Integer.parseInt(expr.replace("!", "").trim());
            return new BigDecimal(factorialBig(n));
        }

        if (expr.contains("sqrt")) {
            return resolveSqrt(expr);
        }

        if (expr.contains("div")) {
            return new BigDecimal(resolveDiv(expr));
        }
        if (expr.contains("mod")) {
            return new BigDecimal(resolveMod(expr));
        }

        return evalPostfix(postfix);
    }

    private static List<String> toPostfix(String expr) {
        List<String> output = new ArrayList<>();
        Stack<String> ops = new Stack<>();

        StringTokenizer tok = new StringTokenizer(expr, "+-*/^() ", true);

        while (tok.hasMoreTokens()) {
            String t = tok.nextToken().trim();
            if (t.isEmpty()) {
                continue;
            }

            if (isNumber(t)) {
                output.add(t);
            } else if (isOperator(t)) {
                while (!ops.isEmpty() && isOperator(ops.peek())
                        && PRECEDENCE.get(ops.peek()) >= PRECEDENCE.get(t)) {
                    output.add(ops.pop());
                }
                ops.push(t);
            } else if (t.equals("(")) {
                ops.push(t);
            } else if (t.equals(")")) {
                while (!ops.peek().equals("(")) {
                    output.add(ops.pop());
                }
                ops.pop();
            }
        }

        while (!ops.isEmpty()) {
            output.add(ops.pop());
        }

        return output;
    }

    private static BigDecimal evalPostfix(List<String> postfix) {
        Stack<BigDecimal> stack = new Stack<>();

        for (String token : postfix) {
            if (isNumber(token)) {
                stack.push(new BigDecimal(token, MC));
            } else {
                BigDecimal b = stack.pop();
                BigDecimal a = stack.pop();

                switch (token) {
                    case "+" ->
                        stack.push(a.add(b, MC));
                    case "-" ->
                        stack.push(a.subtract(b, MC));
                    case "*" ->
                        stack.push(a.multiply(b, MC));
                    case "/" ->
                        stack.push(a.divide(b, MC));
                    case "^" ->
                        stack.push(a.pow(b.intValueExact(), MC));
                }
            }
        }
        return stack.pop();
    }

    private static BigInteger resolveDiv(String expr) {
        // div(7,3)
        int start = expr.indexOf("div(") + 4;
        int end = expr.lastIndexOf(")");

        String[] parts = expr.substring(start, end).split(",");

        BigInteger a = new BigInteger(parts[0].trim());
        BigInteger b = new BigInteger(parts[1].trim());

        if (b.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("División por cero");
        }

        return a.divide(b);
    }

    private static BigInteger resolveMod(String expr) {
        // mod(7,3)
        int start = expr.indexOf("mod(") + 4;
        int end = expr.lastIndexOf(")");

        String[] parts = expr.substring(start, end).split(",");

        BigInteger a = new BigInteger(parts[0].trim());
        BigInteger b = new BigInteger(parts[1].trim());

        if (b.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("División por cero");
        }

        return a.mod(b);
    }

    private static BigInteger resolveNCr(String expr) {
        // nCr(6,3)
        int start = expr.indexOf("nCr(") + 4;
        int end = expr.indexOf(")");
        String[] parts = expr.substring(start, end).split(",");

        int n = Integer.parseInt(parts[0].trim());
        int r = Integer.parseInt(parts[1].trim());

        return nCr(n, r);
    }

    private static BigInteger factorialBig(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    private static BigDecimal resolveSqrt(String expr) {
        // sqrt(25)
        int start = expr.indexOf("sqrt(") + 5;
        int end = expr.lastIndexOf(")");

        if (start < 5 || end < start) {
            throw new IllegalArgumentException("Sintaxis inválida de sqrt");
        }

        String inside = expr.substring(start, end);

        BigDecimal value = evaluate(inside);

        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new ArithmeticException("Raíz de número negativo");
        }

        return bigSqrt(value);
    }

    private static BigDecimal bigSqrt(BigDecimal value) {
        BigDecimal x = new BigDecimal(Math.sqrt(value.doubleValue()));
        BigDecimal TWO = BigDecimal.valueOf(2);

        for (int i = 0; i < 20; i++) {
            x = x.add(value.divide(x, MC)).divide(TWO, MC);
        }

        return x.stripTrailingZeros();
    }

    private static boolean isOperator(String s) {
        return PRECEDENCE.containsKey(s);
    }

    private static boolean isNumber(String s) {
        try {
            new BigDecimal(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static BigInteger nCr(int n, int r) {
        if (r < 0 || r > n) {
            return BigInteger.ZERO;
        }
        r = Math.min(r, n - r);
        BigInteger res = BigInteger.ONE;

        for (int i = 1; i <= r; i++) {
            res = res.multiply(BigInteger.valueOf(n - i + 1))
                    .divide(BigInteger.valueOf(i));
        }
        return res;
    }
}
