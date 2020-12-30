
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.frmCelReally;
import vista.frmCel;
import modelo.UsuarioArreglo;
import modelo.Usuario;
import sistema.Datos;
        
public class ControladorPantalla {

    private frmCel vista;
    private UsuarioArreglo modelo;
    public ControladorPantalla(frmCel vista,UsuarioArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        
        this.vista.btnReally.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              vista.dispose();
              frmCelReally freally = new frmCelReally();
              ControaldorLogin controlaLO = new ControaldorLogin(Datos.usuarios, freally);
              controlaLO.inciar();
              
              
            }
        });
    }
    

     public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    
}
