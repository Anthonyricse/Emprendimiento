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
import vista.frmAnimal4;
import vista.frmAnimal5;
import vista.frmAnimal6;

public class ControladorAnimal5 {
   private UsuarioArreglo modelo ;
   private frmAnimal5 vista ;

    public ControladorAnimal5(UsuarioArreglo modelo, frmAnimal5 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnafterA5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal4 frmAnimal = new frmAnimal4();
                ControladorAnimal4 controla = new ControladorAnimal4(sistema.usuarios, frmAnimal);
                controla.iniciar();
            }
        });
        this.vista.btnNextA5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal6 fanimal = new frmAnimal6();
                ControladorAnimal6 controla = new ControladorAnimal6(sistema.usuarios, fanimal);
                controla.iniciar();
            }
        });
    }
    public void inciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
