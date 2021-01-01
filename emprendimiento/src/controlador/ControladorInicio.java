
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.UsuarioArreglo;
import vista.frmEleccion;
import vista.frmInicio;
import vista.frmPrueba;

public class ControladorInicio {
    private UsuarioArreglo modelo;
    
    private frmInicio vista;

    public ControladorInicio(UsuarioArreglo modelo, frmInicio vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(modelo.ingresar(vista.txtEmail.getText(), vista.txtPassword.getText())){
                    vista.dispose();
                    frmEleccion feleccion =new frmEleccion();
                    ControladorService controla = new ControladorService(sistema.usuarios, feleccion);
                    controla.iniciar();
                }else{
                    JOptionPane.showMessageDialog(vista, "Error en el ingreso");
                }
            
            }
        });
       
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
   
}
