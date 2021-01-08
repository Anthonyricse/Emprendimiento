
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmEntorno;
import vista.frmMapa1;
import vista.frmMapa2;
import vista2.frmRestaurant1;
import vista2.frmRestaurant2;

public class ControladorRestaurant1 {
    private UsuarioArreglo modelo ;
     private frmRestaurant1 vista;

    public ControladorRestaurant1(UsuarioArreglo modelo, frmRestaurant1 vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnMapaR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa2 fmap = new frmMapa2();
                ControladorMapa2 controla = new ControladorMapa2(sistema.usuarios, fmap);
                controla.iniciar();
            }
        });
        this.vista.btnRetornoR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEntorno fentorno = new frmEntorno();
                ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                controla.iniciar();
            }
        });
       this.vista.btnNextR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmRestaurant2 frestaurant = new frmRestaurant2();
                ControladorRestaurant2 controla = new ControladorRestaurant2(sistema.usuarios, frestaurant);
                controla.iniciar();
                        
            }
       });
    }
     public void iniciar(){
         this.vista.setLocationRelativeTo(null);
         this.vista.setVisible(true);
     }
}
