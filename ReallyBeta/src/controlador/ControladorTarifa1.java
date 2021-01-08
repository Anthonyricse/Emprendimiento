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
import modelo.Tarjeta;
import modelo.TarjetaArreglo;
import modelo.UsuarioArreglo;
import vista.frmMapa1;
import vista.frmTarifa1;
import vista.frmTarifa2;


/**
 *
 * @author Toshiba
 */
public class ControladorTarifa1 {
    private TarjetaArreglo modelo ;
    private frmTarifa1 vista;

    public ControladorTarifa1(TarjetaArreglo modelo, frmTarifa1 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(modelo.ingreso(vista.TxtPassword.getText())){
                    vista.dispose();
                    frmTarifa2 ftarifa = new frmTarifa2();
                    ControladorTarifa2 controla = new ControladorTarifa2(sistema.tarjetas, ftarifa);
                    controla.iniciar();
                    
                }
            }
        });
        this.vista.btnRegreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa1 fmapa = new frmMapa1();
                ControladorMapa1 controla = new ControladorMapa1(sistema.usuarios, fmapa );
                controla.iniciar();
                
            }
        });
        
    }    public void iniciar(){
       this.vista.setLocationRelativeTo(null);
       this.vista.setVisible(true);
    }
}
