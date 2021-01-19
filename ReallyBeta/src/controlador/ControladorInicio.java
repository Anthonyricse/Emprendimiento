
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.UsuarioArreglo;
import vista.frmEleccion;
import vista.frmInicio;
import vista.frmAnuncio;
import vista.frmPrincipal;

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
                     System.out.println(sistema.usuarios);
                     System.out.println("Conectado");
                    frmEleccion feleccion =new frmEleccion();
                    ControladorService controla = new ControladorService(sistema.usuarios, feleccion);
                    controla.iniciar();
                }else{
                    JOptionPane.showMessageDialog(vista, "Error en el ingreso");
                }
            
            }
        });
       this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmPrincipal fprincipal = new frmPrincipal();
                ControladorPrincipal controla = new ControladorPrincipal(fprincipal);       
                controla.iniciar();
            }
       });
       this.vista.btnSalirRapido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmPrincipal fprincipal = new frmPrincipal();
                ControladorPrincipal controla = new ControladorPrincipal(fprincipal);  
                controla.iniciar();
            }
       });
    }
   
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
   
}
