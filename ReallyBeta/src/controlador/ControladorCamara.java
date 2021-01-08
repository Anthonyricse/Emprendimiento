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
import vista.frmMapa1;
import vista2.frmCamara;

/**
 *
 * @author Toshiba
 */
public class ControladorCamara {
    private UsuarioArreglo modelo ;
    private frmCamara vista ;

    public ControladorCamara(UsuarioArreglo modelo, frmCamara vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnMapaCam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa1 fmapa = new frmMapa1();
                ControladorMapa1 controla = new ControladorMapa1(sistema.usuarios, fmapa);
                controla.iniciar();
            }
        });
        this.vista.btnRetornoCam.addActionListener(new ActionListener() {
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
