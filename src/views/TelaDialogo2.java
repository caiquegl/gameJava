
package views;

import Classes.GetUsuario;
import javax.swing.JOptionPane;

public class TelaDialogo2 extends javax.swing.JFrame {
    public static String usuario;

    
    public TelaDialogo2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialogo2 = new javax.swing.JLabel();
        nextDialogo2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        bgDialogo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Allan Turing");
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        Dialogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aT-duvida.png"))); // NOI18N
        getContentPane().add(Dialogo2);
        Dialogo2.setBounds(0, 50, 390, 380);

        nextDialogo2.setBackground(new java.awt.Color(45, 45, 45));
        nextDialogo2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nextDialogo2.setForeground(new java.awt.Color(255, 255, 255));
        nextDialogo2.setText("Clique aqui para avancaçar >>>");
        nextDialogo2.setBorder(null);
        nextDialogo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextDialogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextDialogo2ActionPerformed(evt);
            }
        });
        getContentPane().add(nextDialogo2);
        nextDialogo2.setBounds(400, 390, 210, 20);

        jScrollPane1.setBackground(new java.awt.Color(45, 45, 45));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        jTextPane1.setBackground(new java.awt.Color(45, 45, 45));
        jTextPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("VOCÊ!!!!!! Acredito que você seja o gênio em que todo mundo anda falando, acredito que você possa me ajudar, se não ajudar será o fim da humanidade como conhecemos, por favor me diga seu nome para a gente resolver esse problema.");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 250, 330, 190);

        bgDialogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        getContentPane().add(bgDialogo2);
        bgDialogo2.setBounds(-8, -11, 770, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextDialogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextDialogo2ActionPerformed
        usuario = JOptionPane.showInputDialog("Nos diga seu nome");
        TelaDialogo3 Tela3 = new TelaDialogo3();
        Tela3.setVisible(true);
        dispose();
    }//GEN-LAST:event_nextDialogo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dialogo2;
    private javax.swing.JLabel bgDialogo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    public static javax.swing.JButton nextDialogo2;
    // End of variables declaration//GEN-END:variables
}
