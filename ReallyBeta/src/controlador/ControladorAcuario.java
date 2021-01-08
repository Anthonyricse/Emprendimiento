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
import vista.frmMapa3;
import vista2.frmAcuaActividades;
import vista2.frmAcuaColab;
import vista2.frmAcuaColeccion;
import vista2.frmAcuaNosotros;
import vista2.frmAcuario1;

public class ControladorAcuario {
    private UsuarioArreglo modelo;
    private frmAcuario1 vista;

    public ControladorAcuario(UsuarioArreglo modelo, frmAcuario1 vista) {
        this.modelo = modelo;
        this.vista = vista;
            this.vista.btnRetornoAcua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEntorno fentorno = new frmEntorno();
                ControladorEntorno controla = new ControladorEntorno(sistema.usuarios, fentorno);
                controla.iniciar();
            }
        });
        this.vista.mapaAcua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmMapa3 fmapa = new frmMapa3();
                ControladorMapa3 controla = new ControladorMapa3(sistema.usuarios, fmapa);
                controla.iniciar();
            }
        });
        this.vista.btnNosotros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmAcuaNosotros fanosotros= new frmAcuaNosotros();
                    ControladorAcuaNosotros controla = new ControladorAcuaNosotros(sistema.usuarios, fanosotros);
                    controla.iniciar();
            }
        });
        this.vista.btnColaboradores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAcuaColab fcolabora = new frmAcuaColab();
                ControladorAcuaColabo controla = new ControladorAcuaColabo(sistema.usuarios, fcolabora);
                controla.iniciar();
            }
        });
        this.vista.btnActividades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    vista.dispose();
                    frmAcuaActividades facua = new frmAcuaActividades();
                    ControladorAcuaActivities controla = new ControladorAcuaActivities(sistema.usuarios, facua);
                    controla.iniciar();
            }
        });
        this.vista.btnColeccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmAcuaColeccion fcolec = new frmAcuaColeccion();
                ControladorAcuaColeccion controla = new ControladorAcuaColeccion(sistema.usuarios, fcolec);
                controla.iniciar();
            }
        }
        );
    }
  

  

  
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
