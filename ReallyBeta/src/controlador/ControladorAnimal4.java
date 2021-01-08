
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmAnimal3;
import vista.frmAnimal4;
import vista.frmAnimal5;

public class ControladorAnimal4 {
    private UsuarioArreglo modelo ;
    private frmAnimal4 vista;

    public ControladorAnimal4(UsuarioArreglo modelo, frmAnimal4 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAftera4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal3 frmAnimal = new frmAnimal3();
                ControladorAnimal3 controla = new ControladorAnimal3(sistema.usuarios, frmAnimal);
                controla.inciar();
            }
        });
        this.vista.btnNexta4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal5 frmAnimal = new frmAnimal5();
                ControladorAnimal5 controla = new ControladorAnimal5(sistema.usuarios, frmAnimal);
                controla.inciar();
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
