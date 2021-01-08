/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmEntorno;
import vista.frmMapa2;
import vista2.frmRestaurant5;
import vista2.frmRestaurant6;

/**
 *
 * @author Toshiba
 */
public class ControladorRestaurant6 {
    private UsuarioArreglo modelo ;
    private frmRestaurant6 vista ;

    public ControladorRestaurant6(UsuarioArreglo modelo, frmRestaurant6 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAfterR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmRestaurant5 frestaurant = new frmRestaurant5();
                    ControladorRestaurant5 controla = new ControladorRestaurant5(sistema.usuarios, frestaurant);
                    controla.iniciar();
            }
        });
        this.vista.btnMapaR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmMapa2 fmapa = new frmMapa2();
                    ControladorMapa2 controla = new ControladorMapa2(sistema.usuarios, fmapa);
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
    }
     public void iniciar(){
         this.vista.setLocationRelativeTo(null);
         this.vista.setVisible(true);
     }
}
