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
import vista.frmMapa2;
import vista2.frmRestaurant4;
import vista2.frmRestaurant5;
import vista2.frmRestaurant6;

/**
 *
 * @author Toshiba
 */
public class ControladorRestaurant5 {
    private UsuarioArreglo modelo ;
     private frmRestaurant5 vista ;

    public ControladorRestaurant5(UsuarioArreglo modelo, frmRestaurant5 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAfterR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmRestaurant4 frestaurant = new frmRestaurant4();
                ControladorRestaurant4 controla = new ControladorRestaurant4(sistema.usuarios, frestaurant);
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
       this.vista.btnNextR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmRestaurant6 frestaurant = new frmRestaurant6();
                ControladorRestaurant6 controla = new ControladorRestaurant6(sistema.usuarios, frestaurant);
                controla.iniciar();
            }
       });
                }
     public void iniciar(){
         this.vista.setLocationRelativeTo(null);
         this.vista.setVisible(true);
     }
}
