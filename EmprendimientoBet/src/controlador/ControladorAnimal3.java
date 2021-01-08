
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmAnimal3;
import vista.frmAnimal4;
import vista.frmAnimales2;

public class ControladorAnimal3 {
    private UsuarioArreglo modelo ; 
    private frmAnimal3 vista;

    public ControladorAnimal3(UsuarioArreglo modelo, frmAnimal3 vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnafterA3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimales2 frmAnima = new frmAnimales2();
                ControladorAnimal2 controla = new ControladorAnimal2(sistema.usuarios, frmAnima);
                controla.iniciar();
                        
            }
        });
        this.vista.btnNexta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal4 frmAnima = new frmAnimal4();
                ControladorAnimal4 controla = new ControladorAnimal4(sistema.usuarios, frmAnima);
                controla.iniciar();
            }
        });
    }
    public void inciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
