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
import vista2.frmRestaurant2;
import vista2.frmRestaurant3;
import vista2.frmRestaurant4;

/**
 *
 * @author Toshiba
 */
public class ControladorRestaruant3 {
    private UsuarioArreglo modelo ; 
private frmRestaurant3 vista;

    public ControladorRestaruant3(UsuarioArreglo modelo, frmRestaurant3 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAfterR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmRestaurant2 frestaurnat = new frmRestaurant2();
                ControladorRestaurant2 controla = new ControladorRestaurant2(sistema.usuarios, frestaurnat);
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
                frmRestaurant4 frestaurant = new frmRestaurant4();
                ControladorRestaurant4 controla = new ControladorRestaurant4(sistema.usuarios, frestaurant);
                controla.iniciar();
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
