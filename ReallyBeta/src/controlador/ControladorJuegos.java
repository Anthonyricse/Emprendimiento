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
import vista2.frmJuego;

/**
 *
 * @author Toshiba
 */
public class ControladorJuegos {
    private UsuarioArreglo modelo ; 
    private frmJuego vista ;

    public ControladorJuegos(UsuarioArreglo modelo, frmJuego vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnRetornoJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmJuego fjuego = new frmJuego();
                ControladorJuegos controla = new ControladorJuegos(sistema.usuarios, vista);
                controla.iniciar();
            
            }
        });
        this.vista.btnMapaJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa3 fmapa = new frmMapa3() ; 
                ControladorMapa3 controla = new ControladorMapa3(sistema.usuarios, fmapa);
                controla.iniciar();
            }
        });
        
        
    }
     public void iniciar(){
         this.vista.setLocationRelativeTo(null);
         this.vista.setVisible(true);
            
     }
}
