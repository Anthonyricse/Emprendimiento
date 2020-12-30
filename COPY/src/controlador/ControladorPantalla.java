
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Usuario;
import vista.frmCel;
import vista.frmCelReally;
import modelo.UsuarioArreglo;
import sistema.Datos;

public class ControladorPantalla {
    private frmCel vista;
    private  Usuario modelo;

 

    public ControladorPantalla(UsuarioArreglo usuarios, frmCel fcel) {
        this.vista = vista;
        this.modelo=modelo;
        this.vista.btnReally.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   vista.dispose();
                   frmCelReally freally = new frmCelReally();
                   ControladorLogin controlaLo = new ControladorLogin(modelo, freally);
            controlaLo.iniciar();
            }
        });
                
    }

    


  public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
        
    
}
