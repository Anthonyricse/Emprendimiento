
package controlador;

import configuracion.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.SumarDosNumeros;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import vista.frmIngreso;
import vista.frmPais;
import vista.frmSumar;

public class ControladorfrmIngreso {
    private UsuarioArreglo modelo;
    private frmIngreso vista;

    public ControladorfrmIngreso(UsuarioArreglo modelo, frmIngreso vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vista.btnIngresar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if (!modelo.isConectado()) {
                Datos.conectado = modelo.ingresar(vista.txtUsername.getText(),vista.txtPassword.getText());
                    if (  Datos.conectado != null ){
                        System.out.println(Datos.conectado);
                        
                        vista.dispose();
                        frmPais fPais= new frmPais();
                        ControladorPaises controlador =
                              new ControladorPaises(Datos.paises,fPais);
                     /*   String mensaje = "<b>Señor(a):"+ Sistema.conectado.getLogin()+"</b><br>";
                        mensaje += "<font color=red>Usted inicio sesion en la app de Algorítmica II</font><br>";
                        mensaje += "<b>Estad:"+String.valueOf(Sistema.conectado.isConectado()) +" </b>";
                      */
                  /*  Email email =  new Email(Sistema.conectado.getEmail(), "Inicio de sesión Exitoso", mensaje);
                    Thread enviar = new Thread(email);
                    enviar.start();*/
                     //   SumarDosNumeros suma = new SumarDosNumeros();
                       // frmSumar fSuma = new frmSumar();
                        //ControladorfrmSumar controlador = new ControladorfrmSumar(suma, fSuma);
                        controlador.iniciar();
                    }else {
                        JOptionPane.showMessageDialog(vista, "Error en credenciales");
                   }
                /*    
                }else{
                    JOptionPane.showMessageDialog(vista, "Usuario conectado en otra estación");
                }
                */    
            }
        });
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
    }
    
    
    
    
}
