package views;


public class TelaDialogo3 extends javax.swing.JFrame {
    TelaDialogo2 name = new TelaDialogo2();
    public TelaDialogo3() {
        initComponents();
        String value = TelaDialogo2.usuario;    
        namePlayer.setText(value);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AtDialogo3 = new javax.swing.JLabel();
        namePlayer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        bgDialogo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        AtDialogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/at-joia.png"))); // NOI18N
        getContentPane().add(AtDialogo3);
        AtDialogo3.setBounds(190, -30, 370, 380);

        namePlayer.setForeground(new java.awt.Color(255, 255, 255));
        namePlayer.setText(getName());
        getContentPane().add(namePlayer);
        namePlayer.setBounds(70, 390, 50, 17);
        namePlayer.getAccessibleContext().setAccessibleDescription("");

        jButton1.setBackground(new java.awt.Color(45, 45, 45));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Avançar >>>");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 490, 160, 27);

        jScrollPane1.setBackground(new java.awt.Color(45, 45, 45));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        jTextPane1.setBackground(new java.awt.Color(45, 45, 45));
        jTextPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("                     Obrigado por me ajudar, acredito que juntos conseguiremos resolver esse problema, e iremos salvar o mundo!!. Não se preocupe em errar, poís criei um algoritimo que quebra o tempo e o espaço e nos permite voltar um pouco no tempo até corrigirmos esse bug. Boa sorte caique, o destino do mundo está agora em suas mãos.");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 380, 680, 190);

        bgDialogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        bgDialogo3.setMaximumSize(new java.awt.Dimension(800, 650));
        bgDialogo3.setMinimumSize(new java.awt.Dimension(800, 650));
        bgDialogo3.setPreferredSize(new java.awt.Dimension(800, 650));
        getContentPane().add(bgDialogo3);
        bgDialogo3.setBounds(0, -10, 760, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaUsuario TelaUser = new TelaUsuario();
        TelaUser.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaDialogo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDialogo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDialogo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDialogo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new Thread(){
            public void run() {
                new TelaDialogo3().setVisible(true);
                
            }
            
        }.start();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtDialogo3;
    private javax.swing.JLabel bgDialogo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    public static javax.swing.JLabel namePlayer;
    // End of variables declaration//GEN-END:variables

    
}
