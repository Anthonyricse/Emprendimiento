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
import vista.frmAnimal5;
import vista.frmAnimal6;
import vista.frmAnimal7;


public class ControladorAnimal6 {
    private UsuarioArreglo modelo ;
    private frmAnimal6 vista ; 

    public ControladorAnimal6(UsuarioArreglo modelo, frmAnimal6 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAftera6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal5 fAnimal = new frmAnimal5();
                ControladorAnimal5 controla = new ControladorAnimal5(sistema.usuarios, fAnimal);
                controla.inciar();
                        
            }
        });
        this.vista.btnNexta6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal7 fanimla = new frmAnimal7();
                ControladorAnimal7 controla = new ControladorAnimal7(sistema.usuarios, fanimla);
                controla.iniciar();
                
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
