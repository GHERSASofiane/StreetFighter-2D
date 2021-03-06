/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_cps;

import impl.Engine;
import impl.FightChar;
import impl.Hitbox;
import impl.Technique;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author ghersa_sofiane
 */
public class Login extends javax.swing.JFrame {

    String login_1 = "";
    String login_2 = "";
  /* Map contien les commande de player 1 */
   private static HashMap <Character, String>driving_1  = new HashMap(); 
  /* Map contien les commande de player 2 */
   private static HashMap  <Character, String>driving_2  = new HashMap(); 
    
  
    
    private static String player_1 = "";
    private static String player_2 = "";
    private static String Terain = "";
    private static String Musique = "Acc.wav";
    static Audio Musique_j = new Audio(Musique);
    
    /** 
     * 
     *  Implimentation
     * 
     */
    public static Engine My_Engine = new Engine();
    public static Hitbox My_Hitbox1 = new Hitbox();
    public static Hitbox My_Hitbox2 = new Hitbox();
    public static FightChar My_FightChar1 ;
    public static FightChar My_FightChar2 ;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        f_c = new javax.swing.JPanel();
        FC_jLabel3 = new javax.swing.JLabel();
        FC_jLabel2 = new javax.swing.JLabel();
        Login_1 = new javax.swing.JTextField();
        Login_2 = new javax.swing.JTextField();
        B_Connect = new javax.swing.JButton();
        jLabel_Error_Connex = new javax.swing.JLabel();
        J_11 = new javax.swing.JLabel();
        J_12 = new javax.swing.JLabel();
        J_13 = new javax.swing.JLabel();
        J_14 = new javax.swing.JLabel();
        J_17 = new javax.swing.JLabel();
        J_19 = new javax.swing.JLabel();
        J_20 = new javax.swing.JLabel();
        CHOIX_J_2 = new javax.swing.JLabel();
        CHOIX_J_1 = new javax.swing.JLabel();
        CHOIX_S_1 = new javax.swing.JLabel();
        CHOIX_S_4 = new javax.swing.JLabel();
        CHOIX_S_2 = new javax.swing.JLabel();
        CHOIX_S_3 = new javax.swing.JLabel();
        FC_jLabel1 = new javax.swing.JLabel();
        f_J = new javax.swing.JPanel();
        jPanel_jouer = new javax.swing.JPanel();
        Bar_J_2 = new javax.swing.JLabel();
        Bar_J_1 = new javax.swing.JLabel();
        arrier_p = new javax.swing.JLabel();
        Image_1 = new javax.swing.JLabel();
        Image_2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1399 = new javax.swing.JLabel();
        jLabel149999 = new javax.swing.JLabel();
        jPanel_affiche = new javax.swing.JPanel();
        jLabel_nom_j_1 = new javax.swing.JLabel();
        jProgressBar_nom_j_2 = new javax.swing.JProgressBar();
        jLabel_nom_j_2 = new javax.swing.JLabel();
        jProgressBar_nom_j_1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alo(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        f_c.setLayout(null);

        FC_jLabel3.setForeground(java.awt.Color.white);
        FC_jLabel3.setText("  Player 1  ");
        f_c.add(FC_jLabel3);
        FC_jLabel3.setBounds(90, 60, 90, 18);

        FC_jLabel2.setForeground(java.awt.Color.white);
        FC_jLabel2.setText(" Player 2 ");
        f_c.add(FC_jLabel2);
        FC_jLabel2.setBounds(1120, 70, 70, 18);

        Login_1.setToolTipText("");
        f_c.add(Login_1);
        Login_1.setBounds(30, 90, 180, 28);

        Login_2.setToolTipText("");
        f_c.add(Login_2);
        Login_2.setBounds(1060, 100, 180, 28);

        B_Connect.setText("To Start");
        B_Connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ConnectMouseClicked(evt);
            }
        });
        f_c.add(B_Connect);
        B_Connect.setBounds(600, 40, 130, 30);

        jLabel_Error_Connex.setForeground(java.awt.Color.red);
        jLabel_Error_Connex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Error_Connex.setToolTipText("");
        f_c.add(jLabel_Error_Connex);
        jLabel_Error_Connex.setBounds(459, 8, 400, 30);

        J_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Adelheid/Acc.png"))); // NOI18N
        J_11.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        J_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_11P_C1_Adelheid(evt);
            }
        });
        f_c.add(J_11);
        J_11.setBounds(20, 170, 100, 70);

        J_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Ai/Acc.png"))); // NOI18N
        J_12.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        J_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_12P_C1_Ai(evt);
            }
        });
        f_c.add(J_12);
        J_12.setBounds(190, 170, 100, 70);

        J_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Alex/Acc.png"))); // NOI18N
        J_13.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        J_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_13P_C1_Alex(evt);
            }
        });
        f_c.add(J_13);
        J_13.setBounds(20, 310, 130, 110);

        J_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Feilong/Acc.png"))); // NOI18N
        J_14.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        J_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_14P_C1_Feilong(evt);
            }
        });
        f_c.add(J_14);
        J_14.setBounds(190, 310, 120, 110);

        J_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Akari/Acc.png"))); // NOI18N
        J_17.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        J_17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_17P_C_Akari(evt);
            }
        });
        f_c.add(J_17);
        J_17.setBounds(990, 320, 110, 80);

        J_19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Cammy/Acc.png"))); // NOI18N
        J_19.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        J_19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_19P_C_Cammy(evt);
            }
        });
        f_c.add(J_19);
        J_19.setBounds(980, 180, 120, 90);

        J_20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Chunli/Acc.png"))); // NOI18N
        J_20.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        J_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_20P_C_Chunli(evt);
            }
        });
        f_c.add(J_20);
        J_20.setBounds(1150, 320, 100, 80);

        CHOIX_J_2.setToolTipText("");
        CHOIX_J_2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        f_c.add(CHOIX_J_2);
        CHOIX_J_2.setBounds(1150, 480, 130, 80);

        CHOIX_J_1.setToolTipText("");
        CHOIX_J_1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        f_c.add(CHOIX_J_1);
        CHOIX_J_1.setBounds(20, 460, 130, 90);

        CHOIX_S_1.setForeground(java.awt.Color.black);
        CHOIX_S_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/airport.gif"))); // NOI18N
        CHOIX_S_1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        CHOIX_S_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHOIX_S_1CHOIX_T_0(evt);
            }
        });
        f_c.add(CHOIX_S_1);
        CHOIX_S_1.setBounds(170, 510, 280, 170);

        CHOIX_S_4.setForeground(java.awt.Color.black);
        CHOIX_S_4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        f_c.add(CHOIX_S_4);
        CHOIX_S_4.setBounds(510, 80, 280, 170);

        CHOIX_S_2.setForeground(java.awt.Color.black);
        CHOIX_S_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/chain.gif"))); // NOI18N
        CHOIX_S_2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        CHOIX_S_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHOIX_S_2CHOIX_T_1(evt);
            }
        });
        f_c.add(CHOIX_S_2);
        CHOIX_S_2.setBounds(530, 510, 280, 170);

        CHOIX_S_3.setForeground(java.awt.Color.black);
        CHOIX_S_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/nuit.gif"))); // NOI18N
        CHOIX_S_3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        CHOIX_S_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHOIX_S_3CHOIX_T_2(evt);
            }
        });
        f_c.add(CHOIX_S_3);
        CHOIX_S_3.setBounds(850, 510, 280, 170);

        FC_jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fond.jpg"))); // NOI18N
        f_c.add(FC_jLabel1);
        FC_jLabel1.setBounds(0, 0, 1335, 740);

        getContentPane().add(f_c);

        f_J.setLayout(null);

        jPanel_jouer.setLayout(null);

        Bar_J_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bar_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Ai/Pov.gif"))); // NOI18N
        Bar_J_2.setToolTipText("");
        Bar_J_2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        Bar_J_2.setMaximumSize(new java.awt.Dimension(110, 100));
        Bar_J_2.setMinimumSize(new java.awt.Dimension(110, 100));
        jPanel_jouer.add(Bar_J_2);
        Bar_J_2.setBounds(600, 330, 120, 130);

        Bar_J_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bar_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Ai/Pov.gif"))); // NOI18N
        Bar_J_1.setToolTipText("");
        Bar_J_1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        Bar_J_1.setMaximumSize(new java.awt.Dimension(110, 100));
        Bar_J_1.setMinimumSize(new java.awt.Dimension(110, 100));
        jPanel_jouer.add(Bar_J_1);
        Bar_J_1.setBounds(380, 330, 120, 130);

        arrier_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/chain.gif"))); // NOI18N
        arrier_p.setBorder(null);
        arrier_p.setMaximumSize(new java.awt.Dimension(1000, 850));
        arrier_p.setMinimumSize(new java.awt.Dimension(1000, 850));
        jPanel_jouer.add(arrier_p);
        arrier_p.setBounds(170, 120, 800, 350);

        Image_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Ai/Acc.png"))); // NOI18N
        Image_1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        jPanel_jouer.add(Image_1);
        Image_1.setBounds(-30, 70, 170, 110);

        Image_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/Ai/Acc.png"))); // NOI18N
        Image_2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, java.awt.Color.white));
        jPanel_jouer.add(Image_2);
        Image_2.setBounds(1060, 70, 170, 110);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("J : Right");
        jPanel_jouer.add(jLabel1);
        jLabel1.setBounds(1090, 220, 150, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("L : Punch");
        jPanel_jouer.add(jLabel2);
        jLabel2.setBounds(1090, 250, 150, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("M : Kick");
        jPanel_jouer.add(jLabel3);
        jLabel3.setBounds(1090, 280, 150, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("K : Power");
        jPanel_jouer.add(jLabel4);
        jLabel4.setBounds(1090, 300, 150, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("H : Left");
        jPanel_jouer.add(jLabel6);
        jLabel6.setBounds(1090, 190, 150, 20);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("A : Left");
        jPanel_jouer.add(jLabel10);
        jLabel10.setBounds(-20, 200, 150, 20);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Z : Right");
        jPanel_jouer.add(jLabel9);
        jLabel9.setBounds(-20, 230, 150, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X : Punch");
        jPanel_jouer.add(jLabel8);
        jLabel8.setBounds(-20, 260, 150, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C : Kick");
        jPanel_jouer.add(jLabel7);
        jLabel7.setBounds(-20, 290, 150, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("W : Power");
        jPanel_jouer.add(jLabel5);
        jLabel5.setBounds(-20, 310, 150, 20);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("E : Top");
        jPanel_jouer.add(jLabel11);
        jLabel11.setBounds(-20, 340, 150, 20);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("D : Bottom");
        jPanel_jouer.add(jLabel12);
        jLabel12.setBounds(-20, 360, 150, 20);

        jLabel1399.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1399.setText("U : Top");
        jPanel_jouer.add(jLabel1399);
        jLabel1399.setBounds(1090, 320, 150, 20);

        jLabel149999.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149999.setText("N : Bottom");
        jPanel_jouer.add(jLabel149999);
        jLabel149999.setBounds(1090, 340, 150, 20);

        f_J.add(jPanel_jouer);
        jPanel_jouer.setBounds(62, 100, 1200, 600);

        jPanel_affiche.setLayout(null);
        jPanel_affiche.add(jLabel_nom_j_1);
        jLabel_nom_j_1.setBounds(10, 18, 100, 20);

        jProgressBar_nom_j_2.setForeground(java.awt.Color.blue);
        jProgressBar_nom_j_2.setValue(100);
        jPanel_affiche.add(jProgressBar_nom_j_2);
        jProgressBar_nom_j_2.setBounds(770, 10, 280, 30);
        jPanel_affiche.add(jLabel_nom_j_2);
        jLabel_nom_j_2.setBounds(1089, 10, 160, 20);

        jProgressBar_nom_j_1.setBackground(java.awt.Color.blue);
        jProgressBar_nom_j_1.setForeground(java.awt.Color.blue);
        jProgressBar_nom_j_1.setToolTipText("");
        jProgressBar_nom_j_1.setValue(100);
        jPanel_affiche.add(jProgressBar_nom_j_1);
        jProgressBar_nom_j_1.setBounds(130, 10, 280, 30);

        f_J.add(jPanel_affiche);
        jPanel_affiche.setBounds(40, 60, 1230, 60);

        jButton1.setText("Leave");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1Leave_J(evt);
            }
        });
        f_J.add(jButton1);
        jButton1.setBounds(512, 10, 120, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        f_J.add(jTextField1);
        jTextField1.setBounds(40, 20, 110, 30);

        getContentPane().add(f_J);
    }// </editor-fold>//GEN-END:initComponents
/* Methode Utile */
    private static void Init_Var(){
        driving_2.put('h', "left");
        driving_2.put('j', "rignt");
        driving_2.put('l', "punch");
        driving_2.put('m', "kick");
        driving_2.put('k', "power");
        driving_2.put('u', "top");
        driving_2.put('n', "bottom");
        
        /*  */ 
        
        driving_1.put('a', "left");
        driving_1.put('z', "rignt");
        driving_1.put('x', "punch");
        driving_1.put('c', "kick");
        driving_1.put('w', "power");
        driving_1.put('e', "top");
        driving_1.put('d', "bottom");
      
    }
    private void B_ConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ConnectMouseClicked
       
        login_1 = Login_1.getText();
        login_2 = Login_2.getText();
        if (login_1.equals("") ) {
            jLabel_Error_Connex.setText("Name Error");
        }else if(login_2.equals("")){
            jLabel_Error_Connex.setText("Name Error");
        }else if(player_1.equals("") ){
            jLabel_Error_Connex.setText("Choose a player 1 ");
        }else if(player_2.equals("")){
            jLabel_Error_Connex.setText("Choose a player 2 ");
        }else if(Terain.equals("")){
            jLabel_Error_Connex.setText("Choose the ground");
        }else {
           
            jLabel_Error_Connex.setText("");
            f_c.setVisible(false);
            f_J.setVisible(true);
            jLabel_nom_j_1.setText(login_1);
            jLabel_nom_j_2.setText(login_2);
            Bar_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Deb.gif")));
            Bar_J_1.setBounds(400, 330, 120, 130);

            Bar_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Deb.gif")));
            Bar_J_2.setBounds(600, 330, 120, 130);

            Image_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Acc.png")));
            Image_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Acc.png")));
            if(Terain.equals("airport.gif")){
                arrier_p.setBounds(170, 120, 750, 350);
            }else if (Terain.equals("nuit.gif")) {
                arrier_p.setBounds(170, 120, 600, 350);
            }
            arrier_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/"+Terain)));

            Musique_j.relanceExplosionloop(Musique);
            My_Hitbox1.init(Bar_J_1.getX(), Bar_J_1.getY(), Bar_J_1.getWidth(), Bar_J_1.getHeight());
            My_Hitbox2.init(Bar_J_2.getX(), Bar_J_2.getY(), Bar_J_2.getWidth(), Bar_J_2.getHeight());

            My_FightChar1 = new FightChar(100, 10, true, My_Hitbox1 , Bar_J_1 , player_1);
            My_FightChar2 = new FightChar(100, 10, false, My_Hitbox2 , Bar_J_2 , player_2);

           jProgressBar_nom_j_1.setValue(100);
           jProgressBar_nom_j_2.setValue(100);
            
            My_Engine.init(arrier_p.getX(), arrier_p.getY(),arrier_p.getHeight(), arrier_p.getWidth(), Bar_J_2.getX()-Bar_J_1.getX(), My_FightChar1, My_FightChar2);

          }
    }//GEN-LAST:event_B_ConnectMouseClicked

    private void J_11P_C1_Adelheid(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_11P_C1_Adelheid
        player_1 = "Adelheid";
        CHOIX_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Acc.png")));
    }//GEN-LAST:event_J_11P_C1_Adelheid

    private void J_12P_C1_Ai(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_12P_C1_Ai
        player_1 = "Ai";
        CHOIX_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Acc.png")));
    }//GEN-LAST:event_J_12P_C1_Ai

    private void J_13P_C1_Alex(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_13P_C1_Alex
        player_1 = "Alex";
        CHOIX_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Acc.png")));
    }//GEN-LAST:event_J_13P_C1_Alex

    private void J_14P_C1_Feilong(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_14P_C1_Feilong
        player_1 = "Feilong";
        CHOIX_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Acc.png")));
    }//GEN-LAST:event_J_14P_C1_Feilong

    private void J_17P_C_Akari(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_17P_C_Akari
        player_2 = "Akari";
        CHOIX_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Acc.png")));
    }//GEN-LAST:event_J_17P_C_Akari

    private void J_19P_C_Cammy(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_19P_C_Cammy
        player_2 = "Cammy";
        CHOIX_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Acc.png")));
    }//GEN-LAST:event_J_19P_C_Cammy

    private void J_20P_C_Chunli(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_20P_C_Chunli
        player_2 = "Chunli";
        CHOIX_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Acc.png")));
    }//GEN-LAST:event_J_20P_C_Chunli

    private void CHOIX_S_1CHOIX_T_0(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHOIX_S_1CHOIX_T_0
        Terain =  "airport.gif";  Musique = "airport.wav";
        CHOIX_S_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/"+Terain)));
    }//GEN-LAST:event_CHOIX_S_1CHOIX_T_0

    private void CHOIX_S_2CHOIX_T_1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHOIX_S_2CHOIX_T_1
        Terain =  "chain.gif";  Musique = "chain.wav";
        CHOIX_S_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/"+Terain)));
    }//GEN-LAST:event_CHOIX_S_2CHOIX_T_1

    private void CHOIX_S_3CHOIX_T_2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHOIX_S_3CHOIX_T_2
        Terain =  "nuit.gif";  Musique = "lac.wav";
        CHOIX_S_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Terain/"+Terain)));
    }//GEN-LAST:event_CHOIX_S_3CHOIX_T_2

    private void alo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alo
        // TODO add your handling code here:
        System.out.println("projet_cps.Login.alo()");
    }//GEN-LAST:event_alo

    private void jButton1Leave_J(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1Leave_J
        f_J.setVisible(false);
        f_c.setVisible(true);
        Musique_j.relanceExplosionloop("Acc.wav");
    }//GEN-LAST:event_jButton1Leave_J

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char press = evt.getKeyChar();
        if(!java.lang.Character.isLowerCase(press)){
            press = java.lang.Character.toLowerCase(press);
        }

        if (driving_1.containsKey(press)) {
            if (! My_FightChar1.isBlocking) {
                switch(driving_1.get(press)){
                    case "left": Gest_Commande.Move_Left(Bar_J_1 , My_FightChar1 , My_FightChar2 ); break;
                    case "rignt": Gest_Commande.Move_Rignt(Bar_J_1 , My_FightChar1 , My_FightChar2); break;
                    case "punch":
                    Technique punch = new Technique();
                    Hitbox h_tmp = new Hitbox();
                    h_tmp.init(Bar_J_1.getX()+Bar_J_1.getWidth(), Bar_J_1.getY()+Bar_J_1.getHeight()-10, 20, 20);
                    punch.init(5, 400, 400, 400, h_tmp);
                    My_FightChar1.startTech(punch , My_Engine , Bar_J_2);
                    Bar_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Main.gif")));
                    Bar_J_1.setBounds(My_FightChar1.PositionX, My_FightChar1.PositionY, 130, My_FightChar1.getCharBox().getHeight());
                    jProgressBar_nom_j_2.setValue(My_FightChar2.life);
                    break;
                    case "kick":
                    Technique kick = new Technique();
                    Hitbox Hitbox_kick = new Hitbox();
                    Hitbox_kick.init(Bar_J_1.getX()+Bar_J_1.getWidth(), Bar_J_1.getY(), 5, 5);
                    kick.init(15, 600, 600, 600, Hitbox_kick);
                    My_FightChar1.startTech(kick , My_Engine , Bar_J_2);
                    Bar_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Pied.gif")));
                    Bar_J_1.setBounds(My_FightChar1.PositionX, My_FightChar1.PositionY, 130, My_FightChar1.getCharBox().getHeight());
                    jProgressBar_nom_j_2.setValue(My_FightChar2.life);
                    break;
                    case "power":
                    Technique power = new Technique();
                    Hitbox Hitbox_power = new Hitbox();
                    Hitbox_power.init(Bar_J_1.getX()+Bar_J_1.getWidth()+15, Bar_J_2.getY(), 15, 15);
                    power.init(25, 1000, 1000, 1000, Hitbox_power);
                    My_FightChar1.startTech(power , My_Engine , Bar_J_2);
                    Bar_J_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_1+"/Pov.gif")));
                    Bar_J_1.setBounds(My_FightChar1.PositionX, My_FightChar1.PositionY, 130, My_FightChar1.getCharBox().getHeight());
                    jProgressBar_nom_j_2.setValue(My_FightChar2.life);
                    break;
                    case "top":
                    Gest_Commande tmp = new Gest_Commande();
                    tmp.top( Bar_J_1 ,  player_1 , "top"); break;
                    case "bottom":
                    Gest_Commande tmp1 = new Gest_Commande();
                    tmp1.top( Bar_J_1 ,  player_1 , "bottom"); break;
                    default: break;
                }}

            }else if (driving_2.containsKey(press)) {
                if (! My_FightChar2.isBlocking) {
                    switch(driving_2.get(press)){
                        case "left": Gest_Commande.Move_Left(Bar_J_2 , My_FightChar2 , My_FightChar1); break;
                        case "rignt": Gest_Commande.Move_Rignt(Bar_J_2 , My_FightChar2 , My_FightChar1); break;
                        case "punch":
                        Technique punch = new Technique();
                        Hitbox h_tmp = new Hitbox();
                        h_tmp.init(Bar_J_2.getX()-10, Bar_J_2.getY()+Bar_J_2.getHeight()-10, 10, 10);
                        punch.init(5, 400, 400, 400, h_tmp);
                        My_FightChar2.startTech(punch , My_Engine , Bar_J_1);
                        Bar_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Main.gif")));
                        Bar_J_2.setBounds(My_FightChar2.PositionX, My_FightChar2.PositionY, 130, My_FightChar2.getCharBox().getHeight());
                        jProgressBar_nom_j_1.setValue(My_FightChar1.life);
                        break;
                        case "kick":

                        Technique kick = new Technique();
                        Hitbox Hitbox_kick = new Hitbox();
                        Hitbox_kick.init(Bar_J_2.getX()-5, Bar_J_2.getY(), 5, 5);
                        kick.init(15, 600, 600, 600, Hitbox_kick);
                        My_FightChar2.startTech(kick , My_Engine , Bar_J_1);
                        Bar_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Pied.gif")));
                        Bar_J_2.setBounds(My_FightChar2.PositionX, My_FightChar2.PositionY, 130, My_FightChar2.getCharBox().getHeight());
                        jProgressBar_nom_j_1.setValue(My_FightChar1.life);
                        break;
                        case "power":
                        Technique power = new Technique();
                        Hitbox Hitbox_power = new Hitbox();
                        Hitbox_power.init(Bar_J_2.getX()-15, Bar_J_2.getY(), 15, 15);
                        power.init(25, 2000, 2000, 2000, Hitbox_power);
                        Bar_J_2.setBounds(My_FightChar2.PositionX, My_FightChar2.PositionY, 300, My_FightChar2.getCharBox().getHeight());
                        Bar_J_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Player/"+player_2+"/Pov.gif")));
                        My_FightChar2.startTech(power , My_Engine , Bar_J_1);
                        jProgressBar_nom_j_1.setValue(My_FightChar1.life);
                        break;
                        case "top":
                        Gest_Commande tmp = new Gest_Commande();
                        tmp.top( Bar_J_2 ,  player_2 , "top"); break;
                        case "bottom":
                        Gest_Commande tmp1 = new Gest_Commande();
                        tmp1.top( Bar_J_2 ,  player_2 , "bottom"); break;
                        default: break;
                    }}
                }
    }//GEN-LAST:event_jTextField1KeyPressed

    
/** move **/
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       Init_Var();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
               f_J.setVisible(false);
               f_c.setVisible(true);
               Musique_j.explosionloop();
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Connect;
    public static javax.swing.JLabel Bar_J_1;
    public static javax.swing.JLabel Bar_J_2;
    public static javax.swing.JLabel CHOIX_J_1;
    public static javax.swing.JLabel CHOIX_J_2;
    public static javax.swing.JLabel CHOIX_S_1;
    public static javax.swing.JLabel CHOIX_S_2;
    public static javax.swing.JLabel CHOIX_S_3;
    public static javax.swing.JLabel CHOIX_S_4;
    private javax.swing.JLabel FC_jLabel1;
    private javax.swing.JLabel FC_jLabel2;
    private javax.swing.JLabel FC_jLabel3;
    private static javax.swing.JLabel Image_1;
    private static javax.swing.JLabel Image_2;
    private javax.swing.JLabel J_11;
    private javax.swing.JLabel J_12;
    private javax.swing.JLabel J_13;
    private javax.swing.JLabel J_14;
    private javax.swing.JLabel J_17;
    private javax.swing.JLabel J_19;
    private javax.swing.JLabel J_20;
    private static javax.swing.JTextField Login_1;
    private javax.swing.JTextField Login_2;
    public static javax.swing.JLabel arrier_p;
    public static javax.swing.JPanel f_J;
    public static javax.swing.JPanel f_c;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel1399;
    private javax.swing.JLabel jLabel149999;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabel_Error_Connex;
    public static javax.swing.JLabel jLabel_nom_j_1;
    public static javax.swing.JLabel jLabel_nom_j_2;
    private javax.swing.JPanel jPanel_affiche;
    private javax.swing.JPanel jPanel_jouer;
    public static javax.swing.JProgressBar jProgressBar_nom_j_1;
    public static javax.swing.JProgressBar jProgressBar_nom_j_2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
