/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import modelo.UsuarioArreglo;
import vista.frmMapa3;
import vista2.frmAcuaColab;
import vista2.frmAcuario1;

/**
 *
 * @author Toshiba
 */
public class ControladorAcuaColabo {
 private UsuarioArreglo modelo ;
  private frmAcuaColab vista ;

    public ControladorAcuaColabo(UsuarioArreglo modelo, frmAcuaColab vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnMapaAcua.addActionListener(new ActionListener() {
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
                frmAcuario1 facuario = new frmAcuario1() ; 
                ControladorAcuario controla = new ControladorAcuario(sistema.usuarios, facuario);
                controla.iniciar();                   
            }
        });
    }
   public void iniciar(){
       this.vista.setLocationRelativeTo(null);
       this.vista.setVisible(true);
   }
}
