/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

/**
 *
 * @author Toshiba
 */
public class frmRestaurant3 extends javax.swing.JFrame {

    /**
     * Creates new form frmRestaurant3
     */
    public frmRestaurant3() {
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

        btnAfterR = new javax.swing.JButton();
        btnNextR = new javax.swing.JButton();
        btnMapaR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAfterR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/afterR.png"))); // NOI18N
        getContentPane().add(btnAfterR, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 443, 30, 28));

        btnNextR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/nextR.png"))); // NOI18N
        getContentPane().add(btnNextR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 442, 30, 30));

        btnMapaR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/mapaR.png"))); // NOI18N
        getContentPane().add(btnMapaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 442, 38, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondRestarunt3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmRestaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRestaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRestaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRestaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRestaurant3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAfterR;
    public javax.swing.JButton btnMapaR;
    public javax.swing.JButton btnNextR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}