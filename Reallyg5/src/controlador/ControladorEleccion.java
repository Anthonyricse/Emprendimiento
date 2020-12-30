
package controlador;
import vista.frmEleccion;
import modelo.Usuario;
import modelo.UsuarioArreglo;
public class ControladorEleccion {
    private frmEleccion vista;
    private UsuarioArreglo modelo;

    public ControladorEleccion(frmEleccion vista, UsuarioArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        
        
        
        
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
}
