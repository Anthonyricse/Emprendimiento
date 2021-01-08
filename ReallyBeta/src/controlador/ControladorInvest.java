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
import vista.frmEntorno;
import vista.frmMapa1;
import vista2.frmInvestigacion;

/**
 *
 * @author Toshiba
 */
public class ControladorInvest {
    private UsuarioArreglo modelo ;
    private frmInvestigacion vista ;

    public ControladorInvest(UsuarioArreglo modelo, frmInvestigacion vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnRetornoInv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmEntorno fentorno = new frmEntorno();
                    ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                    controla.iniciar();
            }
        });
        this.vista.btnMapInves.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa1 fmapa = new frmMapa1();
                ControladorMapa1 controla = new ControladorMapa1(sistema.usuarios, fmapa);
                controla.iniciar();
            
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
