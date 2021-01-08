
package controlador;
import controlador.ControladorAnuncio;
import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioArreglo;
import vista.frmAnuncio;
import vista.frmEleccion;

public class ControladorService {
    private UsuarioArreglo modelo; 
    private frmEleccion vista ; 

    public ControladorService(UsuarioArreglo modelo, frmEleccion vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnHuachipa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmAnuncio fanuncio = new frmAnuncio();
                   ControladorAnuncio controla = new ControladorAnuncio(sistema.usuarios, fanuncio);
                   controla.iniciar();      
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
