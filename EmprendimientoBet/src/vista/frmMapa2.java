/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Toshiba
 */
public class frmMapa2 extends javax.swing.JFrame {

    /**
     * Creates new form frmMapa2
     */
    public frmMapa2() {
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

        btnNext = new javax.swing.JButton();
        btnRegreso = new javax.swing.JButton();
        btnCamara = new javax.swing.JButton();
        btnAfter = new javax.swing.JButton();
        btnLocatationRestaurant = new javax.swing.JButton();
        lblMapa2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/next.JPG"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 40, 30, 30));

        btnRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/regreso1.JPG"))); // NOI18N
        getContentPane().add(btnRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 425, 40, 30));

        btnCamara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/camere1.JPG"))); // NOI18N
        btnCamara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamaraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCamara, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 425, 40, 30));

        btnAfter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/after.JPG"))); // NOI18N
        getContentPane().add(btnAfter, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 40, 34, 28));

        btnLocatationRestaurant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/RestaurantLocation.JPG"))); // NOI18N
        getContentPane().add(btnLocatationRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 295, 40, 40));

        lblMapa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondMap2.png"))); // NOI18N
        getContentPane().add(lblMapa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 505));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCamaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCamaraActionPerformed

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
            java.util.logging.Logger.getLogger(frmMapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMapa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAfter;
    public javax.swing.JButton btnCamara;
    public javax.swing.JButton btnLocatationRestaurant;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnRegreso;
    private javax.swing.JLabel lblMapa2;
    // End of variables declaration//GEN-END:variables
}