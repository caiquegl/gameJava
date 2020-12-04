package views;

import static views.TelaDialogo3.namePlayer;

public class Win extends javax.swing.JFrame {
    TelaDialogo2 name = new TelaDialogo2();

    public Win() {
        initComponents();
        String value = name.usuario;    
        namePlayer.setText(value);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        At = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        namePlayer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Allan Turing");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        At.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/at-aplausos.png"))); // NOI18N
        getContentPane().add(At);
        At.setBounds(230, 0, 370, 330);

        jScrollPane1.setBackground(new java.awt.Color(45, 45, 45));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        jTextPane1.setBackground(new java.awt.Color(45, 45, 45));
        jTextPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("                     Parabén!!! Você mecere um aplauso do universo interio, você salvou a humanidade estou orgulhoso de você. Mas não pare por aqui, continua a praticar que assim você irá longe meu jovem gafanhoto. Quanto mais se esforça melhor você irá ficar.");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 380, 680, 110);

        namePlayer.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(namePlayer);
        namePlayer.setBounds(70, 390, 0, 0);

        jButton1.setBackground(new java.awt.Color(247, 247, 245));
        jButton1.setText("Home");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 320, 110, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-10, -10, 770, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Splash Sp = new Splash();
        Sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel At;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    public static javax.swing.JLabel namePlayer;
    // End of variables declaration//GEN-END:variables
}
