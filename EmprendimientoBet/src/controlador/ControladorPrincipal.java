
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmInicio;
import vista.frmPrincipal;


public class ControladorPrincipal {
    private frmPrincipal vista;

    public ControladorPrincipal(frmPrincipal vista) {
        this.vista = vista;
        this.vista.btnReally.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmInicio finicio = new frmInicio();
                ControladorInicio controla = new ControladorInicio(sistema.usuarios, finicio);
                controla.iniciar();
                
            }
        });
        
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
