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
public class frmEntorno extends javax.swing.JFrame {

    /**
     * Creates new form frmEntorno
     */
    public frmEntorno() {
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

        btnAnimales = new javax.swing.JButton();
        btnInvestigacion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAcuario = new javax.swing.JButton();
        btnCamara = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnsalirPrincipal = new javax.swing.JButton();
        btnOp = new javax.swing.JButton();
        lblEntorno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Imagen1.png"))); // NOI18N
        btnAnimales.setMaximumSize(new java.awt.Dimension(144, 39));
        btnAnimales.setMinimumSize(new java.awt.Dimension(144, 39));
        btnAnimales.setPreferredSize(new java.awt.Dimension(149, 30));
        getContentPane().add(btnAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 304, 90, -1));

        btnInvestigacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Imagen2.png"))); // NOI18N
        btnInvestigacion.setContentAreaFilled(false);
        btnInvestigacion.setName(""); // NOI18N
        getContentPane().add(btnInvestigacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 305, 100, 30));

        jPanel1.setBackground(new java.awt.Color(255, 192, 0));

        btnAcuario.setBackground(new java.awt.Color(255, 192, 0));
        btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Imagen3.png"))); // NOI18N
        btnAcuario.setContentAreaFilled(false);
        btnAcuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(btnAcuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnAcuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 425, 140, 30));

        btnCamara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/camara.JPG"))); // NOI18N
        btnCamara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamaraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCamara, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 161, 30, 30));

        btnMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/mapa.JPG"))); // NOI18N
        getContentPane().add(btnMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 156, 40, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciofond/salir.JPG"))); // NOI18N
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 20, 20));

        btnsalirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciofond/salir rapido.JPG"))); // NOI18N
        getContentPane().add(btnsalirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 30, 20));

        btnOp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciofond/principal.JPG"))); // NOI18N
        getContentPane().add(btnOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 20, 20));

        lblEntorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/FondoPrincipal.png"))); // NOI18N
        getContentPane().add(lblEntorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 495));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmEntorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEntorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEntorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEntorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEntorno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcuario;
    public javax.swing.JButton btnAnimales;
    public javax.swing.JButton btnCamara;
    public javax.swing.JButton btnInvestigacion;
    public javax.swing.JButton btnMapa;
    private javax.swing.JButton btnOp;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnsalirPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEntorno;
    // End of variables declaration//GEN-END:variables
}
