
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< Updated upstream
import javax.swing.JOptionPane;
import vista.frmCelReally;
import vista.frmCel;
import modelo.UsuarioArreglo;
import modelo.Usuario;
import sistema.Datos;
        
public class ControladorPantalla {

    private frmCel vista;
    
 

    public ControladorPantalla(frmCel fcel) {

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

    public void iniciar() {
            this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);    }
    }
=======
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
        
>>>>>>> Stashed changes
    

   
    
    

