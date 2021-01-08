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
import vista.frmAnimal1;
import vista.frmEntorno;
import vista.frmInicio;
import vista.frmMapa1;
import vista.frmPrincipal;
import vista2.frmAcuario1;
import vista2.frmCamara;
import vista2.frmInvestigacion;

/**
 *
 * @author Toshiba
 */
public class ControladorEntorno {
    private UsuarioArreglo modelo;
    private frmEntorno vista; 

    public ControladorEntorno(UsuarioArreglo modelo, frmEntorno vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnMapa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa1 fmap1 = new frmMapa1();
                ControladorMapa1 controla = new ControladorMapa1(sistema.usuarios  , fmap1);
                controla.iniciar();
            }
        });
        this.vista.btnAnimales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   vista.dispose();
                   frmAnimal1 fanimal = new frmAnimal1();
                   ControladorAnimal1 controla = new ControladorAnimal1(sistema.usuarios, fanimal);
                   controla.iniciar();
            }
        });
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmInicio finicio = new frmInicio();
                ControladorInicio controla = new ControladorInicio(sistema.usuarios, finicio);
                controla.iniciar();
            
            }
        });
     this.vista.btnsalirPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmPrincipal fprincipal = new frmPrincipal();
                ControladorPrincipal controla = new ControladorPrincipal(fprincipal);
                controla.iniciar();
            }
     });
     this.vista.btnAcuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAcuario1 facuario = new frmAcuario1();
                ControladorAcuario controla = new ControladorAcuario(sistema.usuarios, facuario);
                controla.iniciar();
            }
     });
     this.vista.btnInvestigacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmInvestigacion finvestiga = new frmInvestigacion();
                    ControladorInvest controla  = new ControladorInvest(sistema.usuarios,finvestiga);
                    controla.iniciar();
            }
     });
     this.vista.btnCamara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmCamara fcam = new frmCamara();
                ControladorCamara controla = new ControladorCamara(sistema.usuarios, fcam);
                controla.iniciar();
            }
     });
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(vista);
        this.vista.setVisible(true);
    }
}
