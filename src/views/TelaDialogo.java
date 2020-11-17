
package views;

public class TelaDialogo extends javax.swing.JFrame {

    public TelaDialogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atDialogo = new javax.swing.JLabel();
        nextDialogo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        bgDialogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Allan Turing");
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        atDialogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/at-explode.png"))); // NOI18N
        getContentPane().add(atDialogo);
        atDialogo.setBounds(-20, 70, 380, 400);

        nextDialogo.setBackground(new java.awt.Color(45, 45, 45));
        nextDialogo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nextDialogo.setForeground(new java.awt.Color(255, 255, 255));
        nextDialogo.setText("Clique aqui para avancaçar >>>");
        nextDialogo.setBorder(null);
        nextDialogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextDialogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextDialogoActionPerformed(evt);
            }
        });
        getContentPane().add(nextDialogo);
        nextDialogo.setBounds(400, 380, 210, 20);

        jScrollPane1.setBackground(new java.awt.Color(45, 45, 45));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        jTextPane1.setBackground(new java.awt.Color(45, 45, 45));
        jTextPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Estou ferrado, acidentalmente criei um bug que irá dispara todos os misseis nuclueares ao redor do mundo, e não sei como resolver, preciso de ajuda, algum me ajude!!! CHAPOLIM COLORODO CADE VOCÊ!!!!!!");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 250, 330, 190);

        bgDialogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        getContentPane().add(bgDialogo);
        bgDialogo.setBounds(0, -10, 760, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextDialogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextDialogoActionPerformed
        TelaDialogo2 Tela2 = new TelaDialogo2();
        Tela2.setVisible(true);
        dispose();
    }//GEN-LAST:event_nextDialogoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atDialogo;
    private javax.swing.JLabel bgDialogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton nextDialogo;
    // End of variables declaration//GEN-END:variables
}
