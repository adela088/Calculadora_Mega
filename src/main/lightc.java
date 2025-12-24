/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import static main.menu.Magic;

/**
 *
 * @author andre
 */
public class lightc extends javax.swing.JFrame {

    /**
     * Creates new form lightc
     */
    public Clip clip;
    public String ruta = "/Sonido/";

    public lightc() {
        initComponents();
        setupKeyBindings();
        recur.setVisible(false);
        iter.setVisible(false);
        dialog.setVisible(false);
        this.setLocationRelativeTo(null);
        setIcon();
        Mostrador.setEditable(false);
        m.setText("");
        mb1.setVisible(false);
        mb2.setVisible(false);
        time1.setVisible(false);
        time2.setVisible(false);
        //Muestra en consola la opción de modo seleccionada
        if (Magic == false) {
            System.out.println("Uso iterativo");
        } else {
            System.out.println("Uso recursivo");
        }

    }

    //metodo para establecer icon
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o.png")));
    }

    //metodo para llamar el sonido
    private void sonido(String archivo) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {

        }
    }

    //Variables para guardar los valores ingresados
    public static String mensaje = "";
    private BigDecimal lastResult = null;
    private int parentesisAbiertos = 0;
    double num1 = -1, num2 = -1;
    int op = 0;
    int c2 = 0;
    menu men = new menu();
    boolean resultadoMostrado = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iter = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cerrar2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        recur = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        m = new javax.swing.JLabel();
        dialog = new javax.swing.JLabel();
        Mostrador = new javax.swing.JTextField();
        p2 = new javax.swing.JPanel();
        cos = new javax.swing.JButton();
        sen = new javax.swing.JButton();
        tangente = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        com = new javax.swing.JButton();
        Euler = new javax.swing.JButton();
        more = new javax.swing.JButton();
        fact = new javax.swing.JButton();
        pot = new javax.swing.JButton();
        parentesis = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        mb = new javax.swing.JLabel();
        mb1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        mb2 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        resultado = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        division = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        div = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iter.setBackground(new java.awt.Color(255, 255, 255));
        iter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        iter.setMinimumSize(new java.awt.Dimension(760, 440));
        iter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("¿Qué son la iteraciones?");
        iter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 756, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("En el mundo de la programación, una iteración es cuando un conjunto de instrucciones, ");
        iter.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 756, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("características o actividades se repiten una o varias veces hasta que una condición se cumple");
        iter.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 756, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("proceso de código como una iteración.");
        iter.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 744, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("o deja de cumplirse. Así pues, cuando el conjunto de instrucciones se repite, se entiende el");
        iter.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 744, -1));

        cerrar2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        cerrar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar2.setText(">> Cerrar <<");
        cerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar2MouseExited(evt);
            }
        });
        iter.add(cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 756, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Aun así, cuando se sigue repitiendo de forma indefinida, se registra un loop o un bucle.");
        iter.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 744, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/girl (1).gif"))); // NOI18N
        iter.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, 220));

        jPanel1.add(iter, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 760, 440));

        recur.setBackground(new java.awt.Color(255, 255, 255));
        recur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        recur.setMinimumSize(new java.awt.Dimension(760, 440));
        recur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¿Qué es la recursividad?");
        recur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 756, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Es una técnica utilizada en programación que nos permite que un bloque de instrucciones ");
        recur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 756, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("se ejecute un cierto número de veces. Gracias a esto, podemos utilizar la recursiviadad para");
        recur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 756, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("comparar su eficacia a la hora de realizar los procedimientos matemáticos disponibles en la ");
        recur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 744, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("resolver deterninados tipos de problemas. En esta ocasión ha sido implementada para ");
        recur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 744, -1));

        cerrar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText(">> Cerrar <<");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        recur.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 756, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("calculadora con respecto a las soluciones iterativas.");
        recur.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 744, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/girl (1).gif"))); // NOI18N
        recur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, 220));

        jPanel1.add(recur, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 760, 440));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m.setForeground(new java.awt.Color(102, 102, 102));
        m.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panel.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 360, 60));

        dialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piggy.gif"))); // NOI18N
        panel.add(dialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, -1));

        Mostrador.setBackground(new java.awt.Color(254, 224, 254));
        Mostrador.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Mostrador.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Mostrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostradorActionPerformed(evt);
            }
        });
        panel.add(Mostrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 26, 370, 70));

        p2.setBackground(new java.awt.Color(222, 222, 253));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        p2.add(cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 80, 30));

        sen.setText("sin");
        sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senActionPerformed(evt);
            }
        });
        p2.add(sen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 80, 30));

        tangente.setText("tan");
        tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteActionPerformed(evt);
            }
        });
        p2.add(tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raiz.png"))); // NOI18N
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        p2.add(raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 30));

        com.setText("nCr");
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        p2.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, 30));

        Euler.setText("e");
        Euler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EulerActionPerformed(evt);
            }
        });
        p2.add(Euler, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, 30));

        panel.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -150, 370, 65));

        more.setBackground(new java.awt.Color(176, 140, 248));
        more.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bajo.png"))); // NOI18N
        more.setText("more");
        more.setBorder(null);
        more.setBorderPainted(false);
        more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreActionPerformed(evt);
            }
        });
        panel.add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 80, 30));

        fact.setText("!");
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });
        panel.add(fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 60, 30));

        pot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pot.setText("^");
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potActionPerformed(evt);
            }
        });
        panel.add(pot, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 60, 30));

        parentesis.setText("( )");
        parentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentesisActionPerformed(evt);
            }
        });
        panel.add(parentesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 60, 30));

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pi (1).png"))); // NOI18N
        pi.setToolTipText("");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        panel.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, 30));

        mb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel.add(mb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 290, 40));

        mb1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mb1.setText("Espacio utilizado por el ");
        panel.add(mb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 40));

        time.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 290, 60));

        time1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        time1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time1.setText("Tiempo empleado para realizar");
        panel.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 260, 280, 70));

        mb2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mb2.setText("procedimiento:");
        panel.add(mb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, 40));

        time2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        time2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time2.setText("la operación:");
        panel.add(time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 300, 290, 70));

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 400));

        jPanel3.setBackground(new java.awt.Color(222, 222, 253));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 370, 50));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setBackground(new java.awt.Color(93, 60, 160));
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        p1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 35));

        borrar.setText("Delete");
        borrar.setMinimumSize(new java.awt.Dimension(23, 23));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        p1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 85, 35));

        coma.setText(".");
        coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaActionPerformed(evt);
            }
        });
        p1.add(coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 85, 35));

        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        p1.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 85, 35));

        suma.setBackground(new java.awt.Color(204, 153, 255));
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        p1.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 70, 35));

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        p1.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 85, 35));

        resta.setBackground(new java.awt.Color(204, 153, 255));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        p1.add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 70, 35));

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        p1.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 85, 35));

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        p1.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 85, 35));

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        p1.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 85, 35));

        multi.setBackground(new java.awt.Color(204, 153, 255));
        multi.setText("x");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });
        p1.add(multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 70, 35));

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        p1.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 85, 35));

        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        p1.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 85, 35));

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        p1.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 85, 35));

        division.setBackground(new java.awt.Color(204, 153, 255));
        division.setText("÷");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        p1.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 35));

        mod.setBackground(new java.awt.Color(204, 153, 255));
        mod.setText("mod");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        p1.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 85, 35));

        div.setBackground(new java.awt.Color(204, 153, 255));
        div.setText("div");
        div.setMinimumSize(new java.awt.Dimension(23, 23));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        p1.add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 85, 35));

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        p1.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 85, 35));

        clear.setBackground(new java.awt.Color(153, 153, 255));
        clear.setText("Clear All");
        clear.setMinimumSize(new java.awt.Dimension(23, 23));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        p1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 85, 35));

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        p1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 85, 35));

        panel.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 370, 220));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 760, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(23, 23));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home (3).png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volv.png"))); // NOI18N
        jMenuItem1.setText("Volver");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/light.png"))); // NOI18N
        jMenu2.setText("Informacion");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_.png"))); // NOI18N
        jMenuItem4.setText("Sobre las iteraciones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_.png"))); // NOI18N
        jMenuItem5.setText("Sobre la recursividad");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/conf.png"))); // NOI18N
        jMenu3.setText("Tema");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inf.png"))); // NOI18N
        jMenuItem2.setText("Claro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dark.png"))); // NOI18N
        jMenuItem3.setText("Oscuro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        menu men = new menu();
        this.dispose();
        men.setVisible(true);
        mensaje = "";
        Mostrador.setText(mensaje);
        int dataSize = 0;
        long inicio = 0;
        sonido("op");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        sonido("more");
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        sonido("more");
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        sonido("op");
        mensaje = "";
        darkc dark = new darkc();
        dark.setVisible(false);
        this.setVisible(true);
        mensaje = "";
        Mostrador.setText(mensaje);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        sonido("op");
        mensaje = "";

        darkc dark = new darkc();
        dark.setVisible(true);
        this.dispose();
        mensaje = "";

        Mostrador.setText(mensaje);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        sonido("more");
    }//GEN-LAST:event_jMenu3MouseClicked

    private void MostradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostradorActionPerformed

    }//GEN-LAST:event_MostradorActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        sonido("op");
        resetIfResultShownForNewNumber();

        try {
            BigDecimal val = new BigDecimal(
                    ExpressionEvaluator.evaluate(m.getText()).toPlainString()
            );
            double rad = Math.toRadians(val.doubleValue());
            BigDecimal res = BigDecimal.valueOf(Math.cos(rad));
            mensaje = res.stripTrailingZeros().toPlainString();
            Mostrador.setText(mensaje);
            resultadoMostrado = true;
        } catch (Exception e) {
            Mostrador.setText("Error");
        }

    }//GEN-LAST:event_cosActionPerformed

    private void senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senActionPerformed
        sonido("op");
        resetIfResultShownForNewNumber();
        try {
            BigDecimal val = new BigDecimal(
                    ExpressionEvaluator.evaluate(m.getText()).toPlainString()
            );
            double rad = Math.toRadians(val.doubleValue());
            BigDecimal res = BigDecimal.valueOf(Math.sin(rad));
            mensaje = res.stripTrailingZeros().toPlainString();
            Mostrador.setText(mensaje);
            resultadoMostrado = true;
        } catch (Exception e) {
            Mostrador.setText("Error");
        }

    }//GEN-LAST:event_senActionPerformed

    private void tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteActionPerformed
        sonido("op");
        resetIfResultShownForNewNumber();

        try {
            BigDecimal val = new BigDecimal(
                    ExpressionEvaluator.evaluate(m.getText()).toPlainString()
            );
            double rad = Math.toRadians(val.doubleValue());
            BigDecimal res = BigDecimal.valueOf(Math.tan(rad));
            mensaje = res.stripTrailingZeros().toPlainString();
            Mostrador.setText(mensaje);
            resultadoMostrado = true;
        } catch (Exception e) {
            Mostrador.setText("Error");
        }

    }//GEN-LAST:event_tangenteActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        sonido("op");
        resetIfResultShownForNewNumber();
        m.setText(m.getText() + "sqrt(");
        parentesisAbiertos++;
    }//GEN-LAST:event_raizActionPerformed

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        sonido("op");
        resetIfResultShownForNewNumber();
        m.setText(m.getText() + "nCr(");
        parentesisAbiertos++;
    }//GEN-LAST:event_comActionPerformed

    private void EulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EulerActionPerformed
        sonido("op");
        resetIfResultShownForNewNumber();

        m.setText(m.getText() + "2.718281828459045");
    }//GEN-LAST:event_EulerActionPerformed
    public static int c = 0;
    private void moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreActionPerformed
        c++;
        if (c % 2 == 0) {
            p2.setLocation(-370, -150);
            p1.setLocation(370, 170);
        } else {
            p2.setLocation(370, 150);
            p1.setLocation(370, 210);
        }

        sonido("more");
    }//GEN-LAST:event_moreActionPerformed

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + "!");
    }//GEN-LAST:event_factActionPerformed

    private void potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + " ^ ");
    }//GEN-LAST:event_potActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        resetIfResultShownForNewNumber();
        sonido("click");

        m.setText(m.getText() + "3.141592653589793");
    }//GEN-LAST:event_piActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        int dataSize = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        while (parentesisAbiertos > 0) {
            m.setText(m.getText() + ")");
            parentesisAbiertos--;
        }

        try {
            String expr = m.getText()
                    .replace("×", "*")
                    .replace("÷", "/");

            expr = aplicarMultiplicacionImplicita(expr);

            long inicio = System.nanoTime();
            validarExpresion(expr);
            BigDecimal result = ExpressionEvaluator.evaluate(expr);
            long fin = System.nanoTime();

            long tiempoNs = fin - inicio;

            String resStr = result.stripTrailingZeros().toPlainString();
            Mostrador.setText(resStr);

            lastResult = result;

            // Mostrar tiempo
            mb1.setVisible(true);
            mb2.setVisible(true);
            time1.setVisible(true);
            time2.setVisible(true);
            time.setVisible(true);
            long espacio = (runtime.totalMemory() - runtime.freeMemory()) / dataSize;
            mb.setText(espacio + " MB");
            time.setText(tiempoNs + " ns");
            dialog.setVisible(true);

            m.setText(resStr);
            resultadoMostrado = true;

            sonido("op");

        } catch (IllegalArgumentException e) {
            Mostrador.setText(e.getMessage());
        } catch (Exception e) {
            Mostrador.setText("Error matemático");
        }

    }//GEN-LAST:event_resultadoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        sonido("borrar");

        String expr = m.getText();
        if (!expr.isEmpty()) {
            char ultimo = expr.charAt(expr.length() - 1);

            if (ultimo == '(') {
                parentesisAbiertos--;
            }
            if (ultimo == ')') {
                parentesisAbiertos++;
            }

            m.setText(expr.substring(0, expr.length() - 1));
            Mostrador.setText("");
        }


    }//GEN-LAST:event_borrarActionPerformed

    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        resetIfResultShownForNewNumber();
        m.setText(m.getText() + ".");
        sonido("click");
    }//GEN-LAST:event_comaActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        m.setText(m.getText() + "0");
        sonido("click");
    }//GEN-LAST:event_ceroActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + " + ");
    }//GEN-LAST:event_sumaActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        m.setText(m.getText() + "3");
        sonido("click");
    }//GEN-LAST:event_tresActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + " - ");
    }//GEN-LAST:event_restaActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        m.setText(m.getText() + "6");
        sonido("click");
    }//GEN-LAST:event_seisActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        m.setText(m.getText() + "5");
        sonido("click");
    }//GEN-LAST:event_cincoActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        m.setText(m.getText() + "4");
        sonido("click");
    }//GEN-LAST:event_cuatroActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + " * ");
    }//GEN-LAST:event_multiActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        m.setText(m.getText() + "8");
        sonido("click");
    }//GEN-LAST:event_ochoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        m.setText(m.getText() + "7");
        sonido("click");
    }//GEN-LAST:event_sieteActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        m.setText(m.getText() + "9");
        sonido("click");
    }//GEN-LAST:event_nueveActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + " / ");
    }//GEN-LAST:event_divisionActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + "mod(");
        parentesisAbiertos++;
    }//GEN-LAST:event_modActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        sonido("op");
        useLastResultIfNeeded();
        m.setText(m.getText() + "div(");
        parentesisAbiertos++;
    }//GEN-LAST:event_divActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        m.setText(m.getText() + "2");
        sonido("click");
    }//GEN-LAST:event_dosActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        resultadoMostrado = false;
        m.setText("");
        Mostrador.setText("");

        mb1.setVisible(false);
        mb2.setVisible(false);
        time1.setVisible(false);
        time2.setVisible(false);
        dialog.setVisible(false);
        mb.setText("");
        time.setText("");
        parentesisAbiertos = 0;

        sonido("clear_all");
    }//GEN-LAST:event_clearActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        m.setText(m.getText() + "1");
        sonido("click");
    }//GEN-LAST:event_unoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        sonido("op");
        recur.setVisible(true);
        iter.setVisible(false);
        panel.setVisible(false);
        mensaje = "";

        Mostrador.setText(mensaje);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        sonido("op");
        recur.setVisible(false);
        panel.setVisible(true);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setLocation(0, 355);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setLocation(0, 360);
    }//GEN-LAST:event_cerrarMouseExited

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        sonido("op");
        recur.setVisible(false);
        panel.setVisible(false);
        iter.setVisible(true);
        mensaje = "";
        Mostrador.setText(mensaje);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void cerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar2MouseClicked
        sonido("op");
        iter.setVisible(false);
        panel.setVisible(true);
    }//GEN-LAST:event_cerrar2MouseClicked

    private void cerrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar2MouseEntered
        cerrar2.setLocation(0, 355);
    }//GEN-LAST:event_cerrar2MouseEntered

    private void cerrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar2MouseExited
        cerrar2.setLocation(0, 360);
    }//GEN-LAST:event_cerrar2MouseExited

    private void parentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentesisActionPerformed
        sonido("click");
        useLastResultIfNeeded();

        String expr = m.getText();

        if (expr.isEmpty() || expr.endsWith(" ") || expr.endsWith("(")) {
            m.setText(expr + "(");
            parentesisAbiertos++;
            return;
        }

        if (parentesisAbiertos > 0
                && (Character.isDigit(expr.charAt(expr.length() - 1)) || expr.endsWith(")"))) {
            m.setText(expr + ")");
            parentesisAbiertos--;
            return;
        }

        m.setText(expr + "(");
        parentesisAbiertos++;
    }//GEN-LAST:event_parentesisActionPerformed

    //Operaciones recursivas
    double raizRecursiva(double numero) {
        if (numero < 0) {
            return 0;
        }

        return raizRecursivax2(numero, numero / 2);
    }

    double raizRecursivax2(double numero, double estimacion) {
        double nuevaEstimacion = (estimacion + numero / estimacion) / 2;

        if (Math.abs(nuevaEstimacion - estimacion) < 0.000001) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");//Primero objeto y su forma
            String formattedEstimation = decimalFormat.format(nuevaEstimacion);
            formattedEstimation = formattedEstimation.replace(",", ".");//Cambio de , a .
            return Double.parseDouble(formattedEstimation);
        }

        return raizRecursivax2(numero, nuevaEstimacion);
    }

    double eulerRecursivo(double x) {
        return eulerRecursivox2(x, 1, 1, 1);
    }

    double eulerRecursivox2(double x, int n, double termino, double resultado) {
        if (n > 10) {
            return resultado; // Condición de salida de la recursión
        }

        termino *= x / n;
        resultado += termino;

        return eulerRecursivox2(x, n + 1, termino, resultado);
    }

    double tangenteRecursiva(double grados) {
        double seno = senoRecursivo(grados);
        double coseno = cosenoRecursivo(grados);
        double tangente = seno / coseno;
        return tangente;
    }

    double cosenoRecursivo(double grados) {
        double radianes = Math.toRadians(grados);
        return cosenoRecursivox2(radianes, 1);
    }

    double cosenoRecursivox2(double radianes, int n) {
        if (n > 10) {
            return 0.0;
        }

        double termino = Math.pow(-1, n) * Math.pow(radianes, 2 * n) / factorialRecursivo(2 * n);

        return termino + cosenoRecursivox2(radianes, n + 1);
    }

    double senoRecursivox2(double radianes, int n) {
        if (n > 10) {
            return 0.0;
        }
        double signo = (n % 2 == 0) ? 1 : -1;
        double termino = signo * Math.pow(radianes, 2 * n + 1) / factorialRecursivo(2 * n + 1);
        return termino + senoRecursivox2(radianes, n + 1);
    }

    double senoRecursivo(double grados) {
        double radianes = Math.toRadians(grados);
        return senoRecursivox2(radianes, 0);
    }

    double combinacionesRecursivas(double a, double b) {
        if (a < 0 || b < 0 || b > a) {
            return 0;
        } else if (b == 0 || b == a) {
            return 1;
        } else {
            return combinacionesRecursivas(a - 1, b - 1) + combinacionesRecursivas(a - 1, b);
        }
    }

    public static double factorialRecursivo(double n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    double exponencialRecursivo(double base, double exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * exponencialRecursivo(base, exponente - 1);
        } else {
            return 1 / (base * exponencialRecursivo(base, Math.abs(exponente) - 1));
        }
    }

    double modRecursivo(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        } else if (Math.abs(dividendo) < Math.abs(divisor)) {
            return dividendo;
        } else {
            double resto = modRecursivo(dividendo - divisor, divisor);

            if (dividendo < 0) {
                resto *= -1; // Aplica el signo negativo al resto si el dividendo es negativo
            }

            return resto;
        }
    }

    double divRecursiva(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }

        boolean esNegativo = (dividendo < 0) ^ (divisor < 0); // XOR
        dividendo = Math.abs(dividendo);
        divisor = Math.abs(divisor);

        if (dividendo < divisor) {
            return 0;
        }

        double cociente = 1 + divRecursiva(dividendo - divisor, divisor);
        return esNegativo ? -cociente : cociente;
    }

    double divisionRecursiva(double dividendo, double divisor, int decimales) {
        if (Math.abs(divisor) < 0.000001) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }

        if (Math.abs(dividendo) < Math.abs(divisor)) {
            return 0;
        }

        double parteEntera = Math.floor(dividendo / divisor);

        double resto = dividendo - parteEntera * divisor;
        double nuevoDividendo = resto * Math.pow(10, decimales);

        double parteDecimal = divisionRecursiva(nuevoDividendo, divisor, decimales - 1);

        double resultado = parteEntera + parteDecimal / Math.pow(10, decimales);

        return resultado;
    }

    double multiplicacionRecursiva(double a, double b) {
        if (Math.abs(b) < 0.000001) {
            return 0;
        }
        return a * (b / 2) + multiplicacionRecursiva(a, b / 2);
    }

    double restaRecursiva(double a, double b) {
        if (Math.abs(b) < 0.000001) {
            return a;
        }

        return restaRecursiva(a, b / 2) - b / 2;
    }

    double sumaRecursiva(double a, double b) {
        // caso base de recursión artificial
        if (Math.abs(b) < 0.0000001) {
            return a;
        }

        // dividir recursivamente para simular esfuerzo
        return sumaRecursiva(a, b / 2) + b / 2;

    }

    //Operaciones iterativas    
    public static double raizIterativa(double numero) {
        if (numero < 0) {
            return 0;
        }

        double estimacion = numero / 2; // Estimación inicial

        while (true) {
            double nuevaEstimacion = (estimacion + numero / estimacion) / 2;

            if (Math.abs(nuevaEstimacion - estimacion) < 0.000001) {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String formattedEstimation = decimalFormat.format(nuevaEstimacion);
                formattedEstimation = formattedEstimation.replace(",", ".");
                return Double.parseDouble(formattedEstimation);
            }

            estimacion = nuevaEstimacion;
        }
    }

    double eulerIterativa(double x) {
        double resultado = 1.0;
        double termino = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= 10; i++) {
            termino *= x / i;
            factorial *= i;
            resultado += termino;
        }

        return resultado;
    }

    double tangenteIterativa(double grados) {
        double seno = senoIterativa(grados);
        double coseno = cosenoIterativa(grados);

        if (Math.abs(coseno) < 0.000001) {
            throw new ArithmeticException("La tangente no está definida para este ángulo.");
        }

        return seno / coseno;
    }

    double cosenoIterativa(double grados) {
        double radianes = Math.toRadians(grados);
        double resultado = 1.0;
        double terminoActual = 1.0;
        int n = 2;
        int signo = -1;

        for (int i = 1; i <= 10; i++) {
            terminoActual *= radianes * radianes / (n * (n - 1));
            resultado += signo * terminoActual;
            n += 2;
            signo *= -1;
        }

        return resultado;
    }

    double senoIterativa(double grados) {
        double radianes = Math.toRadians(grados);
        double resultado = 0;
        double termino = radianes;
        int signo = 1;

        for (int i = 1; i <= 10; i++) {
            resultado += signo * termino;
            termino *= radianes * radianes / ((2 * i) * (2 * i + 1));
            signo *= -1;
        }

        return resultado;
    }

    double combinacionesIterativa(double a, double b) {
        if (a < 0 || b < 0 || b > a) {
            return 0;
        }

        double coeficiente = 1;

        for (int i = 0; i < b; i++) {
            coeficiente *= (a - i);
            coeficiente /= (i + 1);
        }

        return coeficiente;
    }

    double factorialIterativo(double n) {
        if (n < 0) {
            return 0;
        }

        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    double exponencialIterativo(double base, double exponente) {
        if (exponente == 0) {
            return 1;
        }

        double resultado = 1;
        double absExponente = Math.abs(exponente);

        for (int i = 0; i < absExponente; i++) {
            resultado *= base;
        }

        if (exponente < 0) {
            return 1 / resultado;
        } else {
            return resultado;
        }
    }

    double moduloIterativa(double dividendo, double divisor) {
        double resto = Math.abs(dividendo);
        if (divisor == 0) {
            return 0;
        } else {

            while (resto >= Math.abs(divisor)) {
                resto -= Math.abs(divisor);
            }

            if (dividendo < 0) {
                resto *= -1; // Aplica el signo negativo al resto si el dividendo es negativo
            }

            return resto;
        }
    }

    double divIterativa(double dividendo, double divisor) {
        double cociente = 0;
        if (divisor == 0 || dividendo == 0) {
            return cociente;
        } else {

            boolean esNegativo = (dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0);

            double resto = Math.abs(dividendo);
            divisor = Math.abs(divisor);

            while (resto >= divisor) {
                resto -= divisor;
                cociente++;
            }

            if (esNegativo) {
                cociente *= -1;
            }

            return cociente;
        }
    }

    double divisionIterativa(double dividendo, double divisor, int decimales) {
        double cociente = 0;
        if (divisor == 0 || dividendo == 0) {
            return cociente;
        }
        double resto = Math.abs(dividendo);

        for (int i = 0; i <= decimales; i++) {
            double digito = 0;
            while (resto >= Math.abs(divisor)) {
                resto -= Math.abs(divisor);
                digito++;
            }
            resto *= 10;
            cociente = cociente * 10 + digito;
        }

        cociente /= Math.pow(10, decimales);

        if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
            cociente *= -1; // Aplica el signo negativo si el resultado debe ser negativo
        }

        return cociente;
    }

    double multiplicacionIterativa(double a, double b) {
        double resultado = 0;
        double parte = a * (b / 10000.0);

        for (int i = 0; i < 10000; i++) {
            resultado += parte;
        }

        return resultado;
    }

    double restaIterativa(double a, double b) {
        double resultado = a;
        double decremento = b / 10000.0;

        for (int i = 0; i < 10000; i++) {
            resultado -= decremento;
        }

        return resultado;
    }

    double sumaIterativa(double a, double b) {
        // proceso iterativo para medir tiempo
        double temp = a;
        double paso = b / 10000.0;

        for (int i = 0; i < 10000; i++) {
            temp += paso;
        }

        // resultado exacto para la calculadora
        return a + b;
    }

    private String aplicarMultiplicacionImplicita(String expr) {

        // Número seguido de (
        expr = expr.replaceAll("(\\d)\\(", "$1*(");

        // ) seguido de número
        expr = expr.replaceAll("\\)(\\d)", ")*$1");

        // ) seguido de (
        expr = expr.replaceAll("\\)\\(", ")*(");

        // Número seguido de función
        expr = expr.replaceAll("(\\d)(sqrt|sin|cos|tan|mod|div|nCr)", "$1*$2");

        // Constantes
        expr = expr.replaceAll("(\\d)(3\\.141592653589793)", "$1*$2"); // pi
        expr = expr.replaceAll("(\\d)(2\\.718281828459045)", "$1*$2"); // e

        return expr;
    }

    // Resetea la entrada si ya había un resultado mostrado y el usuario empieza a escribir
    private void resetIfResultShownForNewNumber() {
        if (resultadoMostrado) {
            m.setText("");
            Mostrador.setText("");
            resultadoMostrado = false;
        }
    }

    private void setupKeyBindings() {
        InputMap im = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = this.getRootPane().getActionMap();

        // Números
        bind(im, am, "0", () -> cero.doClick());
        bind(im, am, "1", () -> uno.doClick());
        bind(im, am, "2", () -> dos.doClick());
        bind(im, am, "3", () -> tres.doClick());
        bind(im, am, "4", () -> cuatro.doClick());
        bind(im, am, "5", () -> cinco.doClick());
        bind(im, am, "6", () -> seis.doClick());
        bind(im, am, "7", () -> siete.doClick());
        bind(im, am, "8", () -> ocho.doClick());
        bind(im, am, "9", () -> nueve.doClick());

        // Numpad
        bind(im, am, "NUMPAD0", () -> cero.doClick());
        bind(im, am, "NUMPAD1", () -> uno.doClick());
        bind(im, am, "NUMPAD2", () -> dos.doClick());
        bind(im, am, "NUMPAD3", () -> tres.doClick());
        bind(im, am, "NUMPAD4", () -> cuatro.doClick());
        bind(im, am, "NUMPAD5", () -> cinco.doClick());
        bind(im, am, "NUMPAD6", () -> seis.doClick());
        bind(im, am, "NUMPAD7", () -> siete.doClick());
        bind(im, am, "NUMPAD8", () -> ocho.doClick());
        bind(im, am, "NUMPAD9", () -> nueve.doClick());

        // Operadores
        // +
        bind(im, am, "+", () -> suma.doClick());
        bind(im, am, "ADD", () -> suma.doClick()); // teclado numérico
        bind(im, am, "shift EQUALS", () -> suma.doClick());

        // -
        bind(im, am, "-", () -> resta.doClick());
        bind(im, am, "SUBTRACT", () -> resta.doClick());

        // *
        bind(im, am, "*", () -> multi.doClick());
        bind(im, am, "MULTIPLY", () -> multi.doClick()); // numpad *

        // /
        bind(im, am, "/", () -> division.doClick());
        bind(im, am, "DIVIDE", () -> division.doClick()); // numpad /

        // %
        bind(im, am, "%", () -> mod.doClick());
        bind(im, am, "shift 5", () -> mod.doClick());

        // Punto decimal 
        bind(im, am, ".", () -> coma.doClick());
        bind(im, am, "DECIMAL", () -> coma.doClick()); // numpad .

        // ENTER 
        bind(im, am, "ENTER", () -> resultado.doClick());

        // BACKSPACE 
        bind(im, am, "BACK_SPACE", () -> borrar.doClick());

        // Paréntesis teclado normal
        bind(im, am, "shift 8", () -> parentesis.doClick()); // (
        bind(im, am, "shift 9", () -> parentesis.doClick()); // )

        // Paréntesis directos 
        bind(im, am, "(", () -> parentesis.doClick());
        bind(im, am, ")", () -> parentesis.doClick());

    }

    private void useLastResultIfNeeded() {
        if (resultadoMostrado && lastResult != null) {
            m.setText(lastResult.stripTrailingZeros().toPlainString());
            resultadoMostrado = false;
        }
    }

    private void validarExpresion(String expr) throws IllegalArgumentException {

        if (expr == null || expr.trim().isEmpty()) {
            throw new IllegalArgumentException("Expresión vacía");
        }

        // No debe terminar en operador
        if (expr.matches(".*[+\\-*/^]$")) {
            throw new IllegalArgumentException("Expresión incompleta");
        }

        // Operadores consecutivos
        if (expr.matches(".*[+\\-*/^]{2,}.*")) {
            throw new IllegalArgumentException("Operadores consecutivos");
        }

        // Paréntesis balanceados
        int balance = 0;
        for (char c : expr.toCharArray()) {
            if (c == '(') {
                balance++;
            }
            if (c == ')') {
                balance--;
            }
            if (balance < 0) {
                throw new IllegalArgumentException("Paréntesis incorrectos");
            }
        }
        if (balance != 0) {
            throw new IllegalArgumentException("Paréntesis sin cerrar");
        }

        // Evitar paréntesis vacíos
        if (expr.contains("()")) {
            throw new IllegalArgumentException("Paréntesis vacíos");
        }
    }

    private void bind(InputMap im, ActionMap am, String key, Runnable action) {
        im.put(KeyStroke.getKeyStroke(key), key);
        am.put(key, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action.run();
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lightc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lightc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lightc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lightc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lightc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Euler;
    private javax.swing.JTextField Mostrador;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cero;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel cerrar2;
    private javax.swing.JButton cinco;
    private javax.swing.JButton clear;
    private javax.swing.JButton com;
    private javax.swing.JButton coma;
    private javax.swing.JButton cos;
    private javax.swing.JButton cuatro;
    private javax.swing.JLabel dialog;
    private javax.swing.JButton div;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JButton fact;
    private javax.swing.JPanel iter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel m;
    private javax.swing.JLabel mb;
    private javax.swing.JLabel mb1;
    private javax.swing.JLabel mb2;
    private javax.swing.JButton mod;
    private javax.swing.JButton more;
    private javax.swing.JButton multi;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel panel;
    private javax.swing.JButton parentesis;
    private javax.swing.JButton pi;
    private javax.swing.JButton pot;
    private javax.swing.JButton raiz;
    private javax.swing.JPanel recur;
    private javax.swing.JButton resta;
    private javax.swing.JButton resultado;
    private javax.swing.JButton seis;
    private javax.swing.JButton sen;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JButton tangente;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
