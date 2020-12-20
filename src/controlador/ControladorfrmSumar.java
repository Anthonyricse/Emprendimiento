package controlador;

import configuracion.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.SumarDosNumeros;
import modelo.Usuario;
import vista.frmIngreso;
import vista.frmSumar;

public class ControladorfrmSumar {
    private SumarDosNumeros modelo;
    private frmSumar vista;

    public ControladorfrmSumar(SumarDosNumeros modelo, frmSumar vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.lblResultado.setText(Datos.conectado.getUsername());
        
        this.vista.btnSumar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.setOperador1(Integer.parseInt(vista.txtOperador1.getText()) );
                modelo.setOperador2(Integer.parseInt(vista.txtOperador2.getText()));
                modelo.sumar();
                vista.lblResultado.setText( String.valueOf( modelo.getSuma()) );
            }
        });
        
        this.vista.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                Datos.conectado.salir();
                
                //Usuario usuario = new Usuario("jzavaleta", "segura");
                frmIngreso fIngreso = new frmIngreso();
                ControladorfrmIngreso controlador = new ControladorfrmIngreso(Datos.usuarios, fIngreso);
                controlador.iniciar();
            }
        });
        
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        limpiar();
    }
    
    private void limpiar(){
        this.vista.txtOperador1.setText("");
        this.vista.txtOperador2.setText("");
    }
    
    
}
