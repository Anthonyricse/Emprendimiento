
package controlador;

import modelo.UsuarioArreglo;
import vista.frmEleccion;

/**
 *
 * @author Toshiba
 */
public class ControladorService {
    private UsuarioArreglo modelo; 
    private frmEleccion vista ; 

    public ControladorService(UsuarioArreglo modelo, frmEleccion vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
