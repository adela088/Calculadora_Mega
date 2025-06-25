/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
        recur.setVisible(false);
        iter.setVisible(false);
        dialog.setVisible(false);
        this.setLocationRelativeTo(null);
        setIcon();
        Mostrador.setEditable(false);
        m.setText(mensaje);
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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img\\o.png")));
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
    public static String mensaje2 = "";
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
        panel.add(fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 80, 30));

        pot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pot.setText("^");
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potActionPerformed(evt);
            }
        });
        panel.add(pot, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 80, 30));

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pi (1).png"))); // NOI18N
        pi.setToolTipText("");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        panel.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, 30));

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
        mensaje2 = "";
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
        darkc dark = new darkc();
        dark.setVisible(false);
        this.setVisible(true);
        sonido("op");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        sonido("op");
        darkc dark = new darkc();
        dark.setVisible(true);
        this.dispose();
        mensaje = "";
        mensaje2 = "";
        Mostrador.setText(mensaje);
        m.setText(mensaje2);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        sonido("more");
    }//GEN-LAST:event_jMenu3MouseClicked

    private void MostradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostradorActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        double resultado;

        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }
        if (mensaje.equals("")) {
            mensaje = "coseno ";
            mensaje2 = "coseno ";
            op = 11;
            xd();
        } else {
            try {
                num1 = Double.parseDouble(mensaje);
                resultado = cosenoIterativa(num1);
                mensaje = resultado + "";
                xd();
            } catch (NumberFormatException e) {
                mensaje = "Error";
            }
        }
        c2++;
        m.setText(mensaje2);
        sonido("op");
    }//GEN-LAST:event_cosActionPerformed

    private void senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senActionPerformed
        double resultado;

        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }
        if (mensaje.equals("")) {
            mensaje = "seno ";
            mensaje2 = "seno ";
            op = 10;
            xd();
        } else {
            try {
                num1 = Double.parseDouble(mensaje);
                resultado = senoIterativa(num1);
                mensaje = resultado + "";
                xd();
            } catch (NumberFormatException e) {
                mensaje = "Error";
            }
        }
        c2++;
        m.setText(mensaje2);
        sonido("op");
    }//GEN-LAST:event_senActionPerformed

    private void tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteActionPerformed
        double resultado;
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }
        if (mensaje.equals("")) {
            mensaje = "tangente ";
            mensaje2 = "tangente ";
            op = 12;
            xd();
        } else {
            try {
                num1 = Double.parseDouble(mensaje);
                resultado = tangenteIterativa(num1);
                mensaje = resultado + "";
                xd();
            } catch (NumberFormatException e) {
                mensaje = "Error";
            }
        }
        c2++;
        if (c2 > 1) {
            mensaje2 = "Ans";
        }
        m.setText(mensaje2);
        sonido("op");
    }//GEN-LAST:event_tangenteActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }

        if (mensaje.isEmpty()) {
            mensaje = "sqrt ";
            mensaje2 = "sqrt ";
            op = 14;
            xd();
        } else {
            try {
                num1 = Double.parseDouble(mensaje);
                op = 14;
                mensaje2 += "sqrt(" + mensaje + ")";
                xd();
            } catch (NumberFormatException e) {
                Mostrador.setText("Error");
                mensaje = "";
            }
        }
        c2++;
        m.setText(mensaje2);
        sonido("op");
    }//GEN-LAST:event_raizActionPerformed

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }
        if (!mensaje.isEmpty()) {
            try {
                num1 = Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                num1 = 0;
            }
            op = 9;
            mensaje = "";
            Mostrador.setText("");
            if (mensaje2.isEmpty()) {
                mensaje2 = "0nCr";
            } else {
                mensaje2 += "nCr";
            }
            m.setText(mensaje2);
            c2++;
            sonido("op");
        } else {
            if (mensaje2.isEmpty() || !mensaje2.endsWith("nCr")) {
                num1 = 0;
                mensaje2 += "nCr";
                m.setText(mensaje2);
            }
            op = 9;
            mensaje = "";
            sonido("op");
        }
    }//GEN-LAST:event_comActionPerformed

    private void EulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EulerActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }

        if (mensaje.isEmpty()) {
            mensaje = "e^ ";
            mensaje2 = "e^ ";
            op = 13;
            xd();
        } else {
            try {
                num1 = Double.parseDouble(mensaje);
                op = 13;
                mensaje2 += "e^(" + mensaje + ")";
                xd();
            } catch (NumberFormatException e) {
                Mostrador.setText("Error");
                mensaje = "";
            }
        }
        c2++;
        m.setText(mensaje2);
        sonido("op");
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
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }
        try {
            num1 = Double.parseDouble(mensaje);
            op = 8;
            mensaje += "!";
            mensaje2 += "!";
            m.setText(mensaje2);
            Mostrador.setText(mensaje);
            c2++;
            sonido("op");
        } catch (NumberFormatException e) {
            Mostrador.setText("Error");
            mensaje = "";
        }                       // Reproduce el sonido de operación
    }//GEN-LAST:event_factActionPerformed

    private void potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }

        if (!mensaje.isEmpty()) {
            try {
                num1 = Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                num1 = 0;
            }
            op = 7;
            mensaje = "";
            Mostrador.setText("");
            if (mensaje2.isEmpty()) {
                mensaje2 = "0^";
            } else {
                mensaje2 += "^";
            }
            m.setText(mensaje2);
            c2++;
            sonido("op");
        } else {
            if (mensaje2.isEmpty() || !mensaje2.endsWith("^")) {
                num1 = 0;
                mensaje2 += "^";
                m.setText(mensaje2);
            }
            op = 7;
            mensaje = "";
            sonido("op");
        }
    }//GEN-LAST:event_potActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        if (resultadoMostrado) {
            mensaje2 = "";
            resultadoMostrado = false;
        }

        mensaje2 += "3.1415";
        addmensajex2(3.1415);
        xd();
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_piActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
// Obtener las datos de tiempo y espacio en memoria
        int dataSize = 1024 * 1024;
        long inicio = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();

        if (op == 0) {
            // No se ha seleccionado operación. Mostrar mensaje sin procesar
            try {
                // Si el usuario ingresó directamente "+3", "-9", "*4", etc.
                if ((op == 1 || op == 2 || op == 3 || op == 4 || op == 5 || op == 6 || op == 7 || op == 9)
                        && (mensaje.startsWith("+") || mensaje.startsWith("-"))) {
                    num1 = 0;
                    num2 = Double.parseDouble(mensaje);
                }

                double resultado = Double.parseDouble(mensaje);
                mensaje = resultado + "";
                xd();
                mensaje2 = mensaje;
                m.setText(mensaje2);
                Mostrador.setText(mensaje);
                resultadoMostrado = true;
                return; // Salir del método
            } catch (NumberFormatException e) {
                Mostrador.setText("Entrada inválida");
                mensaje = "";
                return;
            }
        }

        try {
            // Validación de operaciones unarias o especiales
            if (op == 8 || op == 10 || op == 11 || op == 12 || op == 13 || op == 14) {
                switch (op) {
                    case 10 ->
                        num1 = Double.parseDouble(mensaje.substring(5)); // "seno "
                    case 11 ->
                        num1 = Double.parseDouble(mensaje.substring(7)); // "coseno "
                    case 12 ->
                        num1 = Double.parseDouble(mensaje.substring(9)); // "tangente "
                    case 13 ->
                        num1 = Double.parseDouble(mensaje.substring(3)); // "e^ "
                    case 14 ->
                        num1 = Double.parseDouble(mensaje.substring(5)); // "sqrt "
                    case 8 ->
                        num1 = Double.parseDouble(mensaje.replace("!", "")); // factorial
                }
            } else {
                // Soportar -num como entrada válida
                num2 = Double.parseDouble(mensaje);
            }

            double resultado;

            // Procesamiento iterativo o recursivo
            if (!Magic) {
                resultado = switch (op) {
                    case 1 ->
                        sumaIterativa(num1, num2);
                    case 2 ->
                        restaIterativa(num1, num2);
                    case 3 ->
                        multiplicacionIterativa(num1, num2);
                    case 4 ->
                        divisionIterativa(num1, num2, 2);
                    case 5 ->
                        divIterativa(num1, num2);
                    case 6 ->
                        moduloIterativa(num1, num2);
                    case 7 ->
                        exponencialIterativo(num1, num2);
                    case 8 ->
                        factorialIterativo(num1);
                    case 9 ->
                        combinacionesIterativa(num1, num2);
                    case 10 ->
                        senoIterativa(num1);
                    case 11 ->
                        cosenoIterativa(num1);
                    case 12 ->
                        tangenteIterativa(num1);
                    case 13 ->
                        eulerIterativa(num1);
                    case 14 ->
                        raizIterativa(num1);
                    default ->
                        throw new IllegalStateException("Operación inválida");
                };
            } else {
                resultado = switch (op) {
                    case 1 ->
                        sumaRecursiva(num1, num2);
                    case 2 ->
                        restaRecursiva(num1, num2);
                    case 3 ->
                        multiplicacionRecursiva(num1, num2);
                    case 4 ->
                        divisionRecursiva(num1, num2, 2);
                    case 5 ->
                        divRecursiva(num1, num2);
                    case 6 ->
                        modRecursivo(num1, num2);
                    case 7 ->
                        exponencialRecursivo(num1, num2);
                    case 8 ->
                        factorialRecursivo(num1);
                    case 9 ->
                        combinacionesRecursivas(num1, num2);
                    case 10 ->
                        senoRecursivo(num1);
                    case 11 ->
                        cosenoRecursivo(num1);
                    case 12 ->
                        tangenteRecursiva(num1);
                    case 13 ->
                        eulerRecursivo(num1);
                    case 14 ->
                        raizRecursiva(num1);
                    default ->
                        throw new IllegalStateException("Operación inválida");
                };
            }

            // Mostrar resultado
            mensaje = resultado + "";
            xd();
            mensaje2 += "=";
            m.setText(mensaje2);
            Mostrador.setText(mensaje);

            mb1.setVisible(true);
            mb2.setVisible(true);
            time1.setVisible(true);
            time2.setVisible(true);
            long espacio = (runtime.totalMemory() - runtime.freeMemory()) / dataSize;
            mb.setText(espacio + " MB");
            long fin = System.nanoTime();
            time.setText((fin - inicio) + " nanosegundos");
            dialog.setVisible(true);
            sonido("op");

            resultadoMostrado = true;

        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            Mostrador.setText("Entrada inválida");
            mensaje = "";
            resultadoMostrado = false;
        } catch (IllegalStateException e) {
            Mostrador.setText("Operación no soportada");
            mensaje = "";
            resultadoMostrado = false;
        }

    }//GEN-LAST:event_resultadoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (!mensaje.isEmpty()) {
            // Si termina en coma, permitir que se pueda volver a ingresar
            if (mensaje.endsWith(",")) {
                coma.setEnabled(true);
            }

            // Borrar último carácter
            mensaje = mensaje.substring(0, mensaje.length() - 1);

            // Si se borró todo el mensaje, reiniciar estado de cálculo
            if (mensaje.isEmpty()) {
                mensaje2 = "";
                op = 0;
                num1 = 0;
                num2 = 0;
                resultadoMostrado = false;
            }
        }

// Actualizar pantalla
        Mostrador.setText(mensaje);
        m.setText(mensaje2);

// Ocultar indicadores de resultados previos
        mb1.setVisible(false);
        mb2.setVisible(false);
        time1.setVisible(false);
        time2.setVisible(false);
        dialog.setVisible(false);
        mb.setText("");
        time.setText("");

        sonido("borrar");

    }//GEN-LAST:event_borrarActionPerformed

    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        addmensajex3(".");
        mensaje2 = mensaje2 + (".");
        xd();
    }//GEN-LAST:event_comaActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        mensaje += 0;
        Mostrador.setText(mensaje);
        mensaje2 = mensaje2 + "0";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_ceroActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }

        if (!mensaje.isEmpty()) {
            try {
                num1 = Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                num1 = 0;  // Por si escribe +9 directamente
            }
            op = 1;
            mensaje = "";
            Mostrador.setText("");
            if (mensaje2.isEmpty()) {
                mensaje2 = "0+";
            } else {
                mensaje2 += "+";
            }
            m.setText(mensaje2);
            c2++;
            sonido("op");
        } else {
            if (mensaje2.isEmpty()) {
                num1 = 0;
                mensaje2 = "0+";
            } else if (!mensaje2.endsWith("+")) {
                num1 = 0;
                mensaje2 += "+";
            }
            op = 1;
            mensaje = "";
            m.setText(mensaje2);
            sonido("op");
        }


    }//GEN-LAST:event_sumaActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        addmensaje(3);
        xd();
        mensaje2 = mensaje2 + "3";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_tresActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }

        if (mensaje.isEmpty()) {
            // Permitir número negativo si es lo primero que se va a ingresar
            if (mensaje2.isEmpty()) {
                mensaje = "-";
                Mostrador.setText(mensaje);
                mensaje2 = "-";
                m.setText(mensaje2);
            } else if (mensaje2.endsWith("+") || mensaje2.endsWith("-") || mensaje2.endsWith("×") || mensaje2.endsWith("÷")) {
                mensaje = "-";
                Mostrador.setText(mensaje);
                mensaje2 += "-";
                m.setText(mensaje2);
            }
        } else {
            try {
                num1 = Double.parseDouble(mensaje);
                op = 2;
                mensaje = "";
                Mostrador.setText("");
                mensaje2 += "-";
                m.setText(mensaje2);
                c2++;
                sonido("op");
            } catch (NumberFormatException e) {
                Mostrador.setText("Error");
                mensaje = "";
            }
        }


    }//GEN-LAST:event_restaActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        addmensaje(6);
        xd();
        mensaje2 = mensaje2 + "6";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_seisActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        addmensaje(5);
        xd();
        mensaje2 = mensaje2 + "5";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_cincoActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        addmensaje(4);
        xd();
        mensaje2 = mensaje2 + "4";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_cuatroActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed

        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }

        if (!mensaje.isEmpty()) {
            try {
                num1 = Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                // Si el usuario escribe ×9 directamente, usar 0 como valor anterior
                num1 = 0;
            }
            op = 3;
            mensaje = "";
            Mostrador.setText("");
            mensaje2 += "×";
            m.setText(mensaje2);
            c2++;
            sonido("op");
        } else {
            if (mensaje2.isEmpty()) {
                num1 = 0;
                mensaje2 = "0×";
            } else if (!mensaje2.endsWith("×")) {
                num1 = 0;
                mensaje2 += "×";
            }
            op = 3;
            mensaje = "";
            m.setText(mensaje2);
            sonido("op");
        }


    }//GEN-LAST:event_multiActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        addmensaje(8);
        xd();
        mensaje2 = mensaje2 + "8";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_ochoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        addmensaje(7);
        xd();
        mensaje2 = mensaje2 + "7";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_sieteActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        addmensaje(9);
        xd();
        mensaje2 = mensaje2 + "9";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_nueveActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }

        if (!mensaje.isEmpty()) {
            try {
                num1 = Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                num1 = 0;  // fallback por si hay error
            }
            op = 4;
            mensaje = "";
            Mostrador.setText("");
            if (mensaje2.isEmpty()) {
                mensaje2 = "0÷";
            } else {
                mensaje2 += "÷";
            }
            m.setText(mensaje2);
            c2++;
            sonido("op");
        } else {
            if (mensaje2.isEmpty()) {
                num1 = 0;
                mensaje2 = "0÷";
            } else if (!mensaje2.endsWith("÷")) {
                num1 = 0;
                mensaje2 += "÷";
            }
            op = 4;
            mensaje = "";
            m.setText(mensaje2);
            sonido("op");
        }


    }//GEN-LAST:event_divisionActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }
        if (!mensaje.isEmpty()) {
            try {
                num1 = Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                num1 = 0;
            }
            op = 6;
            mensaje = "";
            Mostrador.setText("");
            if (mensaje2.isEmpty()) {
                mensaje2 = "0mod";
            } else {
                mensaje2 += "mod";
            }
            m.setText(mensaje2);
            c2++;
            sonido("op");
        } else {
            if (mensaje2.isEmpty() || !mensaje2.endsWith("mod")) {
                num1 = 0;
                mensaje2 += "mod";
                m.setText(mensaje2);
            }
            op = 6;
            mensaje = "";
            sonido("op");
        }
    }//GEN-LAST:event_modActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        if (resultadoMostrado) {
            mensaje2 = mensaje;
            resultadoMostrado = false;
        }
        if (!mensaje.isEmpty()) {
            try {
                num1 = Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                num1 = 0;
            }
            op = 5;
            mensaje = "";
            Mostrador.setText("");
            if (mensaje2.isEmpty()) {
                mensaje2 = "0div";
            } else {
                mensaje2 += "div";
            }
            m.setText(mensaje2);
            c2++;
            sonido("op");
        } else {
            if (mensaje2.isEmpty() || !mensaje2.endsWith("div")) {
                num1 = 0;
                mensaje2 += "div";
                m.setText(mensaje2);
            }
            op = 5;
            mensaje = "";
            sonido("op");
        }
    }//GEN-LAST:event_divActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        addmensaje(2);
        xd();
        mensaje2 = mensaje2 + "2";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_dosActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        mensaje = "";
        mensaje2 = "";
        num1 = 0;
        num2 = 0;
        op = 0;
        c2 = 0;

        Mostrador.setText("");
        m.setText("");

        // Restaurar estado de coma por si estaba deshabilitado
        coma.setEnabled(true);

        // Ocultar y limpiar información de métricas
        mb1.setVisible(false);
        mb2.setVisible(false);
        time1.setVisible(false);
        time2.setVisible(false);
        dialog.setVisible(false);
        mb.setText("");
        time.setText("");

        sonido("clear_all");
    }//GEN-LAST:event_clearActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        addmensaje(1);
        xd();
        mensaje2 = mensaje2 + "1";
        m.setText(mensaje2);
        sonido("click");
    }//GEN-LAST:event_unoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        sonido("op");
        recur.setVisible(true);
        iter.setVisible(false);
        panel.setVisible(false);
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
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiplicacionRecursiva(a, b - 1);
        }
        return -multiplicacionRecursiva(a, -b); // Manejo de negativos
    }

    double restaRecursiva(double a, double b) {
        if (Math.abs(b) < 0.000001) {
            return a;  // Caso base: cuando b es cercano a cero, retornar a (resultado final)
        } else {
            return restaRecursiva(a - 1, b - 1);  // Llamada recursiva restando 1 a a y 1 a b
        }
    }

    double sumaRecursiva(double a, double b) {
        if (Math.abs(b) < 0.000001) {
            return a;  // Caso base: cuando b es cercano a cero, retornar a (resultado final)
        } else {
            return sumaRecursiva(a + 1, b - 1);  // Llamada recursiva restando 1 a b y sumando 1 a a
        }
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
        double multiplicador = Math.abs(b); // Tomamos el valor absoluto de b

        for (int i = 0; i < multiplicador; i++) {
            resultado += a;
        }

        if (b < 0) { // Si b era negativo, cambiamos el signo del resultado
            resultado = -resultado;
        }

        return resultado;
    }

    double restaIterativa(double a, double b) {
        double resultado = a;

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                resultado--;
            }
        } else if (b < 0) {
            for (int i = 0; i > b; i--) {
                resultado++;
            }
        }

        return resultado;
    }

    double sumaIterativa(double a, double b) {
        double resultado = a;

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                resultado++;
            }
        } else if (b < 0) {
            for (int i = 0; i > b; i--) {
                resultado--;
            }
        }

        return resultado;
    }

    void addmensaje(int n) {
        if (mensaje.length() == 32) {
        } else {
            mensaje += n;
        }
    }

    void addmensajex2(double n) {
        if (mensaje.length() == 32) {
        } else {
            mensaje += n;
        }
    }

    void addmensajex3(String x) {
        if (mensaje.length() == 32) {
        } else {
            int indicePunto = mensaje.indexOf(".");

            if (indicePunto != -1) {
            } else {
                mensaje += x;
            }
        }
    }

    void xd() {
        Font font = Mostrador.getFont();
        int len = mensaje.length();

        if (len < 16) {
            font = font.deriveFont(36f);
        } else if (len <= 22) {
            font = font.deriveFont(24f);
        } else {
            font = font.deriveFont(12f);
        }

        Mostrador.setFont(font);
        Mostrador.setText(mensaje);
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
