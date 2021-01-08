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
import vista2.frmRestaurant3;
import vista2.frmRestaurant4;
import vista2.frmRestaurant5;

/**
 *
 * @author Toshiba
 */
public class ControladorRestaurant4 {
    private UsuarioArreglo modelo;
    private frmRestaurant4 vista ; 

    public ControladorRestaurant4(UsuarioArreglo modelo, frmRestaurant4 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAfterR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmRestaurant3 frestaurant = new frmRestaurant3();
                ControladorRestaruant3 controla = new ControladorRestaruant3(sistema.usuarios, frestaurant);
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
                frmRestaurant5 frestaurant = new frmRestaurant5();
                ControladorRestaurant5 controla = new ControladorRestaurant5(sistema.usuarios, frestaurant);
                controla.iniciar();
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
