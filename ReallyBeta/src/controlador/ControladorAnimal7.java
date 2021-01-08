
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmAnimal6;
import vista.frmAnimal7;
import vista.frmEntorno;

public class ControladorAnimal7 {
    private UsuarioArreglo modelo ;
    private frmAnimal7 vista ;

    public ControladorAnimal7(UsuarioArreglo modelo, frmAnimal7 vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnAftera7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAnimal6 fanimal = new frmAnimal6();
                ControladorAnimal6 controla = new ControladorAnimal6(sistema.usuarios, fanimal);
                controla.iniciar();
            }
        });
        this.vista.btnRegresoa7.addActionListener(new ActionListener() {
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
