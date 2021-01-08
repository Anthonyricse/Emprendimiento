
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmEntorno;
import vista.frmMapa1;
import vista.frmMapa2;
import vista.frmMapa3;
import vista2.frmRestaurant1;
import vista2.frmCamara;

public class ControladorMapa2 {
    private UsuarioArreglo modelo ; 
    private frmMapa2 vista;

    public ControladorMapa2(UsuarioArreglo modelo, frmMapa2 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAfter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa1 fmapa1 = new frmMapa1();
                ControladorMapa1 controla = new ControladorMapa1(sistema.usuarios, fmapa1);
                controla.iniciar();
            
            }
        });
        this.vista.btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa3 fmapa3 = new frmMapa3();
                ControladorMapa3 controla = new ControladorMapa3(sistema.usuarios, fmapa3);
                controla.iniciar();
            
            }
        });
        this.vista.btnRegreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEntorno fentorno = new frmEntorno();
                ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                controla.iniciar();
            }
        });
        this.vista.btnLocatationRestaurant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmRestaurant1 frestaurant = new frmRestaurant1();
                ControladorRestaurant1 controla = new ControladorRestaurant1(sistema.usuarios, frestaurant);
                controla.iniciar();
            }
        });
     this.vista.btnCamara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  vista.dispose();
                frmCamara fcam = new frmCamara();
                ControladorCamara controla = new ControladorCamara(sistema.usuarios, fcam);
                controla.iniciar();
            }
     }
     );
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}

