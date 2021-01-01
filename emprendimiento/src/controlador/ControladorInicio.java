
package controlador;

import modelo.UsuarioArreglo;
import vista.frmInicio;

public class ControladorInicio {
    private UsuarioArreglo modelo;
    
    private frmInicio vista;

    public ControladorInicio(UsuarioArreglo modelo, frmInicio vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
   
}
