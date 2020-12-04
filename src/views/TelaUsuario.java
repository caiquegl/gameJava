package views;

import static views.TelaDialogo3.namePlayer;

public class TelaUsuario extends javax.swing.JFrame {
    TelaDialogo2 name = new TelaDialogo2();

    public TelaUsuario() {
        initComponents();
        
        String value = TelaDialogo2.usuario;    
        namePlayer.setText(value);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namePlayer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnModalidade = new javax.swing.JButton();
        atUsuario = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escolha a modalidade:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 290, 200, 30);

        namePlayer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        namePlayer.setForeground(new java.awt.Color(255, 255, 255));
        namePlayer.setText(getName());
        getContentPane().add(namePlayer);
        namePlayer.setBounds(460, 110, 150, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem vindo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 110, 150, 30);

        btnModalidade.setBackground(new java.awt.Color(234, 208, 114));
        btnModalidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModalidade.setForeground(new java.awt.Color(255, 255, 255));
        btnModalidade.setText("Random");
        btnModalidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModalidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnModalidade);
        btnModalidade.setBounds(320, 330, 120, 40);

        atUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/at-aplausos.png"))); // NOI18N
        getContentPane().add(atUsuario);
        atUsuario.setBounds(-30, 0, 640, 630);

        bg.setBackground(new java.awt.Color(255, 102, 51));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(1, -5, 760, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModalidadeActionPerformed

            Random Rn = new Random();
            Rn.setVisible(true);
            dispose();
        
    }//GEN-LAST:event_btnModalidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atUsuario;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnModalidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel namePlayer;
    // End of variables declaration//GEN-END:variables
}
