/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author JORGE ZAVALETA
 */
public class frmEleccion extends javax.swing.JFrame {

    /**
     * Creates new form frmOperaciones
     */
    public frmEleccion() {
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

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panBotonEstand = new javax.swing.JPanel();
        btnRetroceder = new javax.swing.JButton();
        btnPrincipalSalida = new javax.swing.JButton();
        btnOp = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPleyenda = new javax.swing.JButton();
        lbltitulo_1 = new javax.swing.JLabel();
        lblTitulo_2 = new javax.swing.JLabel();
        lblFacebook = new javax.swing.JLabel();
        lblTwiter = new javax.swing.JLabel();
        lblIstagram = new javax.swing.JLabel();
        lblServicios = new javax.swing.JLabel();
        lblRedes = new javax.swing.JLabel();
        lblfondElec = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fond/fondo.png"))); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(311, 598));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/celInf_1.JPG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/celSup_1.JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 35));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 92, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panBotonEstand.setBackground(new java.awt.Color(0, 0, 0));
        panBotonEstand.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/salir.JPG"))); // NOI18N
        btnRetroceder.setBorder(null);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        panBotonEstand.add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 34, 29));

        btnPrincipalSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/panPrincipal.JPG"))); // NOI18N
        btnPrincipalSalida.setBorder(null);
        panBotonEstand.add(btnPrincipalSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 0, 33, 29));

        btnOp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/opciones.JPG"))); // NOI18N
        btnOp.setBorder(null);
        panBotonEstand.add(btnOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 0, 30, 29));

        jPanel3.add(panBotonEstand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Really.png"))); // NOI18N
        jPanel3.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel6.setText("Really");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        btnPleyenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/tigre.JPG"))); // NOI18N
        btnPleyenda.setBorder(null);
        jPanel3.add(btnPleyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 120));

        lbltitulo_1.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        lbltitulo_1.setText("Parque");
        jPanel3.add(lbltitulo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 30));

        lblTitulo_2.setFont(new java.awt.Font("Vladimir Script", 0, 32)); // NOI18N
        lblTitulo_2.setText("de Huachipa");
        jPanel3.add(lblTitulo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        lblFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/facebook.png"))); // NOI18N
        jPanel3.add(lblFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lblTwiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/twiter.png"))); // NOI18N
        jPanel3.add(lblTwiter, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        lblIstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/istagram.png"))); // NOI18N
        jPanel3.add(lblIstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        lblServicios.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblServicios.setText("Nuestro servicio");
        jPanel3.add(lblServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblRedes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblRedes.setText("Nuestras redes");
        jPanel3.add(lblRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        lblfondElec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fond/fondo.png"))); // NOI18N
        jPanel3.add(lblfondElec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 460));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 299, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederActionPerformed

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
            java.util.logging.Logger.getLogger(frmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOp;
    public javax.swing.JButton btnPleyenda;
    public javax.swing.JButton btnPrincipalSalida;
    public javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFacebook;
    private javax.swing.JLabel lblIstagram;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRedes;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblTitulo_2;
    private javax.swing.JLabel lblTwiter;
    private javax.swing.JLabel lblfondElec;
    private javax.swing.JLabel lbltitulo_1;
    private javax.swing.JPanel panBotonEstand;
    // End of variables declaration//GEN-END:variables
}
