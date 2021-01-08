
package controlador;
import controlador.ControladorEntorno;
import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import modelo.UsuarioArreglo;
import vista.frmEntorno;
import vista.frmMapa1;
import vista.frmMapa2;
import vista.frmPrincipal;
import vista.frmTarifa1;
import vista2.frmCamara;
import vista.frmTarifa2;
public class ControladorMapa1 {
    private UsuarioArreglo modelo;
    private frmMapa1 vista;

    public ControladorMapa1(UsuarioArreglo modelo, frmMapa1 vista) {
        this.modelo = modelo;
        this.vista = vista;
    this.vista.btnRegreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEntorno fentorno = new frmEntorno();
                ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                controla.iniciar();
             
            
            }
    });
    this.vista.btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa2 fmapa2 = new frmMapa2();
                ControladorMapa2 controla = new ControladorMapa2(sistema.usuarios, fmapa2);
                controla.iniciar();                   
            }
    });
        this.vista.btnTarifa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmTarifa1 ftarifa = new frmTarifa1();
                ControladorTarifa1 controla = new ControladorTarifa1(sistema.tarjetas, ftarifa);
                controla.iniciar();
            }
        });
        this.vista.btnSali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEntorno fentorno = new frmEntorno();
                ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                controla.iniciar();
            }
        });
        this.vista.btnSalirRapido.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmPrincipal fprincipal = new frmPrincipal();
                ControladorPrincipal controla = new ControladorPrincipal(fprincipal);
                controla.iniciar();
            }
        });
       this.vista.btnCamere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  vista.dispose();
                    frmCamara fcamara = new frmCamara();
                    ControladorCamara controla = new ControladorCamara(sistema.usuarios, fcamara);
                    controla.iniciar();
            }
       });
        
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(vista);
        this.vista.setVisible(true);
    }
}
