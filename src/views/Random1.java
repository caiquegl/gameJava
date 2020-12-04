
package views;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import static java.lang.Thread.sleep;
import static views.Random.intervalo;
import static views.Random.milissegundos;

        
public class Random1 extends javax.swing.JFrame {
    main html = new main();
    public static int intervalo = 1000;
    public static int milissegundos = 1000;
    String respostaCorreta;
    /**
     * Creates new form Random
     */
    public Random1() {
       
        initComponents();
        acertos.setText(Integer.toString(html.acertos(0)));
        media.setText(Float.toString(html.media()));
        quantTotal.setText(Integer.toString(html.addJogada(0)));
        
        
        int typeQuestion = html.numeroRandomType();
        
        if(typeQuestion == 0){
            int num = html.numeroRandomQuestion();
            respostaCorreta = html.exHtml(num,1);

            String titulo = html.exHtml(num,0);
            pergunta.setText(titulo);
            String perguntaA = html.exHtml(num,2);
            questionA.setText(perguntaA);
            String perguntaB = html.exHtml(num,3);
            questionB.setText(perguntaB);
            String perguntaC = html.exHtml(num,4);
            questionC.setText(perguntaC);
            String perguntaD = html.exHtml(num,5);
            questionD.setText(perguntaD);
        }
        if(typeQuestion == 1){
            int num = html.numeroRandomQuestion();
            respostaCorreta = html.exCss(num,1);

            String titulo = html.exCss(num,0);
            pergunta.setText(titulo);
            String perguntaA = html.exCss(num,2);
            questionA.setText(perguntaA);
            String perguntaB = html.exCss(num,3);
            questionB.setText(perguntaB);
            String perguntaC = html.exCss(num,4);
            questionC.setText(perguntaC);
            String perguntaD = html.exCss(num,5);
            questionD.setText(perguntaD);
        }
        if(typeQuestion == 2){
            int num = html.numeroRandomQuestion();
            respostaCorreta = html.exJava(num,1);

            String titulo = html.exJava(num,0);
            pergunta.setText(titulo);
            String perguntaA = html.exJava(num,2);
            questionA.setText(perguntaA);
            String perguntaB = html.exJava(num,3);
            questionB.setText(perguntaB);
            String perguntaC = html.exJava(num,4);
            questionC.setText(perguntaC);
            String perguntaD = html.exJava(num,5);
            questionD.setText(perguntaD);
        }
        if(typeQuestion == 2){
            int num = html.numeroRandomQuestion();
            respostaCorreta = html.exPhp(num,1);

            String titulo = html.exPhp(num,0);
            pergunta.setText(titulo);
            String perguntaA = html.exPhp(num,2);
            questionA.setText(perguntaA);
            String perguntaB = html.exPhp(num,3);
            questionB.setText(perguntaB);
            String perguntaC = html.exPhp(num,4);
            questionC.setText(perguntaC);
            String perguntaD = html.exPhp(num,5);
            questionD.setText(perguntaD);
        }
        
        

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        acertou = new javax.swing.JLabel();
        atRandom = new javax.swing.JLabel();
        questionA = new javax.swing.JRadioButton();
        questionB = new javax.swing.JRadioButton();
        questionC = new javax.swing.JRadioButton();
        questionD = new javax.swing.JRadioButton();
        quantTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pergunta = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        media = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acertos = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        acertou.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        acertou.setText(" ");
        getContentPane().add(acertou);
        acertou.setBounds(260, 40, 230, 28);

        atRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/at-esperandoRandom.png"))); // NOI18N
        getContentPane().add(atRandom);
        atRandom.setBounds(-10, 130, 260, 310);

        grupo.add(questionA);
        questionA.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        questionA.setForeground(java.awt.Color.black);
        questionA.setText("A X = = = \"true\" : 10 : 20");
        questionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionAActionPerformed(evt);
            }
        });
        getContentPane().add(questionA);
        questionA.setBounds(230, 290, 400, 23);

        grupo.add(questionB);
        questionB.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        questionB.setForeground(java.awt.Color.black);
        questionB.setText("B function* x() { return 2; }");
        questionB.setToolTipText("");
        questionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionBActionPerformed(evt);
            }
        });
        getContentPane().add(questionB);
        questionB.setBounds(230, 320, 400, 23);

        grupo.add(questionC);
        questionC.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        questionC.setForeground(java.awt.Color.black);
        questionC.setText("C switch(a) { case \"a\": case \"A\": return \"A\"; }");
        questionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionCActionPerformed(evt);
            }
        });
        getContentPane().add(questionC);
        questionC.setBounds(230, 350, 400, 23);

        grupo.add(questionD);
        questionD.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        questionD.setForeground(java.awt.Color.black);
        questionD.setText("x –> 1;");
        questionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionDActionPerformed(evt);
            }
        });
        getContentPane().add(questionD);
        questionD.setBounds(230, 390, 400, 23);

        quantTotal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        quantTotal.setForeground(java.awt.Color.white);
        quantTotal.setText("Quantidade jogada");
        getContentPane().add(quantTotal);
        quantTotal.setBounds(170, 530, 150, 18);

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Quantidade jogada");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 530, 150, 17);

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/log-out .png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 20, 30, 34);

        jScrollPane1.setBackground(new java.awt.Color(45, 45, 45));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        pergunta.setBackground(new java.awt.Color(0, 102, 0));
        pergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 8, true));
        pergunta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pergunta.setForeground(new java.awt.Color(255, 255, 255));
        pergunta.setText("   \n Atualmente, Java e JavaScript estão entre as linguagens de  programação de maior emprego pela indústria de software. Apesar da semelhança  dos nomes, elas possuem muitas  diferenças.Qual dos trechos abaixo é válido, tanto em  JavaScript quanto em Java?");
        pergunta.setCaretColor(new java.awt.Color(255, 102, 0));
        pergunta.setDisabledTextColor(new java.awt.Color(255, 102, 0));
        pergunta.setRequestFocusEnabled(false);
        pergunta.setSelectionColor(new java.awt.Color(204, 153, 0));
        jScrollPane1.setViewportView(pergunta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 140, 460, 310);

        jButton2.setBackground(java.awt.Color.orange);
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 470, 140, 27);

        jLabel1.setFont(new java.awt.Font("Chandas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para ganhar tem que responder no minimo 10 perguntas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 70, 580, 50);

        jLabel2.setFont(new java.awt.Font("Chandas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("e ter uma media de 75%");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 100, 580, 50);

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Media");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 490, 60, 17);

        media.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        media.setForeground(java.awt.Color.white);
        media.setText("Quantidade jogada");
        getContentPane().add(media);
        media.setBounds(100, 490, 150, 18);

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Acertos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 510, 60, 17);

        acertos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        acertos.setForeground(java.awt.Color.white);
        acertos.setText("Quantidade jogada");
        getContentPane().add(acertos);
        acertos.setBounds(100, 510, 150, 18);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(bg);
        bg.setBounds(0, -30, 750, 650);
        bg.getAccessibleContext().setAccessibleName("AX = = = \"true\" : 10 : 20;");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaUsuario TInicial = new TelaUsuario();
        TInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void questionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionBActionPerformed

    private void questionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionAActionPerformed

    private void questionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionDActionPerformed

    private void questionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selecionar = "";
        
        if(questionA.isSelected() == true){
            selecionar = questionA.getText();
        }
        
        if(questionB.isSelected() == true){
            selecionar = questionB.getText();
        }
        if(questionC.isSelected() == true){
            selecionar = questionC.getText();
        }
        if(questionD.isSelected() == true){
            selecionar = questionD.getText();
        }
        
        if(selecionar.equalsIgnoreCase(respostaCorreta)){

            acertou.setText("ACERTOU!!!");
            atRandom.setIcon(new ImageIcon(getClass().getResource("/Img/at-acertou.png")));
                new java.util.Timer().schedule(
            new java.util.TimerTask() {
            @Override
            public void run() {
                float finish = html.media();
                html.addJogada(1);
                html.acertos(1);
                if(finish >= 75 && html.quantJogada >= 10){
                    Win N = new Win();
                    N.setVisible(true);
                    dispose();
                }else{
                    Random1 Cn = new Random1();
                    Cn.setVisible(true);
                    dispose();
                }
                
            }
        }, 
        4000 );

        }else{
                                float finish = html.media();

            acertou.setText("ERROU!!!");
            atRandom.setIcon(new ImageIcon(getClass().getResource("/Img/at-errou-random.png")));
                new java.util.Timer().schedule(
            new java.util.TimerTask() {
            @Override
            public void run() {
                                html.addJogada(1);

                Random Cn = new Random();
                    Cn.setVisible(true);
                    dispose();
            }
        }, 
        4000 );

            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Random1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Random1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Random1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Random1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {
                
                new Random1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertos;
    private javax.swing.JLabel acertou;
    private javax.swing.JLabel atRandom;
    private javax.swing.JLabel bg;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel media;
    public static javax.swing.JTextPane pergunta;
    private javax.swing.JLabel quantTotal;
    private javax.swing.JRadioButton questionA;
    private javax.swing.JRadioButton questionB;
    private javax.swing.JRadioButton questionC;
    private javax.swing.JRadioButton questionD;
    // End of variables declaration//GEN-END:variables

}
