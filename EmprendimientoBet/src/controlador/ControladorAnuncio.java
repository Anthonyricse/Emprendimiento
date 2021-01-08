
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmAnuncio;
import vista.frmEntorno;
import vista.frmInicio;
import vista.frmPrincipal;

public class ControladorAnuncio {
    private UsuarioArreglo modelo;
    private frmAnuncio vista;

    public ControladorAnuncio(UsuarioArreglo modelo, frmAnuncio vista) {
        this.modelo = modelo;
        this.vista = vista;
      this.vista.btnCerrarAnuncio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEntorno fentorno = new frmEntorno();
                ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                controla.iniciar();
            
            }
      });
      this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmInicio finicio = new frmInicio();
                ControladorInicio controla = new ControladorInicio(sistema.usuarios, finicio);
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
