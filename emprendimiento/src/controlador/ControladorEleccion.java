
package controlador;

import modelo.UsuarioArreglo;
import vista.frmEleccion;

public class ControladorEleccion {
    private UsuarioArreglo modelo;
    private frmEleccion vista;

    public ControladorEleccion(UsuarioArreglo modelo, frmEleccion vista) {
        this.modelo = modelo;
        this.vista = vista;
        
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
