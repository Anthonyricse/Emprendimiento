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
public class frmAnimal4 extends javax.swing.JFrame {

    /**
     * Creates new form frmanima4
     */
    public frmAnimal4() {
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

        btnAftera4 = new javax.swing.JButton();
        btnNexta4 = new javax.swing.JButton();
        lblanima4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAftera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/aftera4.JPG"))); // NOI18N
        getContentPane().add(btnAftera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 30));

        btnNexta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/nexta4.JPG"))); // NOI18N
        getContentPane().add(btnNexta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 64, 40, 36));

        lblanima4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondoanima4.png"))); // NOI18N
        getContentPane().add(lblanima4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 515));

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
            java.util.logging.Logger.getLogger(frmAnimal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnimal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnimal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnimal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnimal4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAftera4;
    public javax.swing.JButton btnNexta4;
    private javax.swing.JLabel lblanima4;
    // End of variables declaration//GEN-END:variables
}