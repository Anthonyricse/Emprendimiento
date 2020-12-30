

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.UsuarioArreglo;
import modelo.Usuario;
import sistema.Datos;
import vista.frmCel;
import vista.frmCelReally;
import vista.frmEleccion;
public class ControladorLogin {
    private UsuarioArreglo modelo;
    private frmCelReally vista;

    public ControladorLogin(UsuarioArreglo modelo, frmCelReally vista) {
        this.modelo = modelo;
        this.vista = vista;
        
  
    
 }
   
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}