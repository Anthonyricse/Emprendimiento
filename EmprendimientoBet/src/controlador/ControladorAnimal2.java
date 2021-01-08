
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import modelo.UsuarioArreglo;
import vista.frmAnimal1;
import vista.frmAnimal3;
import vista.frmAnimales2;

public class ControladorAnimal2 {
    private UsuarioArreglo modelo ;
     private frmAnimales2 vista ;

    public ControladorAnimal2(UsuarioArreglo modelo, frmAnimales2 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnAfterAnima2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal1 frmanimal = new frmAnimal1();
                ControladorAnimal1 controla = new ControladorAnimal1(sistema.usuarios, frmanimal);
                controla.iniciar();
            }
        });
        this.vista.btnnextanima2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmAnimal3 fanimal = new frmAnimal3();
                    ControladorAnimal3 controla = new ControladorAnimal3(sistema.usuarios, fanimal);
                    controla.inciar();
            }
        });
    }
      public void iniciar(){
          this.vista.setLocationRelativeTo(null);
          this.vista.setVisible(true);
      }
}
