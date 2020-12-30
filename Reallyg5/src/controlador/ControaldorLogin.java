
package controlador;

import modelo.UsuarioArreglo;
import vista.frmCelReally;
public class ControaldorLogin {
    private UsuarioArreglo modelo;
    private frmCelReally vista;

    public ControaldorLogin(UsuarioArreglo modelo, frmCelReally vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void inciar (){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
}
