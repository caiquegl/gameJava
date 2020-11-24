
package views;

import static java.lang.Thread.sleep;

public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
        new Thread(){
            
           
            public void run(){
                int i = 0;
                while (i<100){
                    
                    i++;
                 
                  try {
                      sleep(50);
                      jProgressBar1.setValue(i);
                  }catch(Exception e){
                      System.out.println(e);
                           
                  }
            }
           TelaInicial tl = new TelaInicial();
          
          tl.setVisible(true);
          dispose();
                  
        }
         
        }.start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/at-explode.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -40, 440, 460);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("HELP ALLAN TURING");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 130, 310, 70);

        jProgressBar1.setBackground(new java.awt.Color(0, 255, 218));
        jProgressBar1.setForeground(java.awt.Color.orange);
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(50, 490, 650, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg-home.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
