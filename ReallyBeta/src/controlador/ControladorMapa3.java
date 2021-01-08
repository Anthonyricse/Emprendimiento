
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import modelo.UsuarioArreglo;
import vista.frmEntorno;
import vista.frmMapa2;
import vista.frmMapa3;
import vista2.frmAcuario1;
import vista2.frmCamara;
import vista2.frmJuego;

public class ControladorMapa3 {
    private UsuarioArreglo modelo;
    private frmMapa3 vista;

    public ControladorMapa3(UsuarioArreglo modelo, frmMapa3 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnafterm3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmMapa2 fmapa2 = new frmMapa2();
                    ControladorMapa2 controla = new ControladorMapa2(sistema.usuarios, fmapa2);
                    controla.iniciar();
            }
        });
        this.vista.btnregresom3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmEntorno fentorno = new frmEntorno();
                    ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                    controla.iniciar();
                           
            }
        });
        this.vista.btnAcuarioM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAcuario1 facuario = new frmAcuario1();
                ControladorAcuario controla = new ControladorAcuario(sistema.usuarios, facuario);
                controla.iniciar();
            }
        });
        
        this.vista.btncamara3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              vista.dispose();
                frmCamara fcam = new frmCamara();
                ControladorCamara controla = new ControladorCamara(sistema.usuarios, fcam);
                controla.iniciar();
            }
        });
        this.vista.btnJuegos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmJuego fjuego = new frmJuego();
                    ControladorJuegos controla = new ControladorJuegos(sistema .usuarios, fjuego);
                    controla.iniciar();
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
