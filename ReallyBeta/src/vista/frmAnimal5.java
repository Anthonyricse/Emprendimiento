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
public class frmAnimal5 extends javax.swing.JFrame {

    /**
     * Creates new form frmAnimal5
     */
    public frmAnimal5() {
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

        btnafterA5 = new javax.swing.JButton();
        btnNextA5 = new javax.swing.JButton();
        lblanima5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnafterA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/aftera5.JPG"))); // NOI18N
        getContentPane().add(btnafterA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 88, 40, 30));

        btnNextA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/nexta5.JPG"))); // NOI18N
        getContentPane().add(btnNextA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 40, 30));

        lblanima5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondoanima5.png"))); // NOI18N
        getContentPane().add(lblanima5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 511));

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
            java.util.logging.Logger.getLogger(frmAnimal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnimal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnimal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnimal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnimal5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNextA5;
    public javax.swing.JButton btnafterA5;
    private javax.swing.JLabel lblanima5;
    // End of variables declaration//GEN-END:variables
}
