package views;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        
        new Thread(){
            public void run(){
                
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllanTuringINicio = new javax.swing.JLabel();
        BtnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Allan Turing");
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        AllanTuringINicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aT-home.png"))); // NOI18N
        getContentPane().add(AllanTuringINicio);
        AllanTuringINicio.setBounds(0, 110, 380, 380);

        BtnEntrar.setBackground(new java.awt.Color(234, 208, 114));
        BtnEntrar.setFont(new java.awt.Font("Chilanka", 1, 10)); // NOI18N
        BtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEntrar.setText("ENTRAR");
        BtnEntrar.setToolTipText("");
        BtnEntrar.setBorderPainted(false);
        BtnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEntrar.setFocusable(false);
        BtnEntrar.setHideActionText(true);
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEntrar);
        BtnEntrar.setBounds(410, 330, 130, 40);

        jLabel1.setFont(new java.awt.Font("Chandas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Help Allan Turing");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 90, 250, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-9, -5, 810, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        TelaDialogo tl = new TelaDialogo();
        tl.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnEntrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllanTuringINicio;
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
