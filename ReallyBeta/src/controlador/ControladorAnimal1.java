
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmAnimal1;
import vista.frmAnimales2;
import vista.frmEntorno;

public class ControladorAnimal1 {
    private UsuarioArreglo modelo ;
     private frmAnimal1 vista; 

    public ControladorAnimal1(UsuarioArreglo modelo, frmAnimal1 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnRetornoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEntorno fentorno = new frmEntorno();
                ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                controla.iniciar();
            }
        });
        this.vista.btnNextA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimales2 frmAnimal = new frmAnimales2();
                ControladorAnimal2 controla = new ControladorAnimal2(sistema.usuarios, frmAnimal);
                controla.iniciar();
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
