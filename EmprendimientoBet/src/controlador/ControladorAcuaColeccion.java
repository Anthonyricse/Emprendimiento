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
import vista.frmMapa3;
import vista2.frmAcuaColeccion;
import vista2.frmAcuario1;

public class ControladorAcuaColeccion {
    private UsuarioArreglo modelo ; 
    private frmAcuaColeccion vista;

    public ControladorAcuaColeccion(UsuarioArreglo modelo, frmAcuaColeccion vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnMapaA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa3 fmapa = new frmMapa3();
                ControladorMapa3 controla = new ControladorMapa3(sistema.usuarios, fmapa);
                controla.iniciar();
                
            }
        });
        this.vista.btnRetornoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAcuario1 facuario = new frmAcuario1();
                ControladorAcuario controla = new ControladorAcuario(sistema.usuarios, facuario);
                controla.iniciar();            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
 