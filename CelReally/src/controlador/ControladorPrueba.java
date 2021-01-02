/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.UsuarioArreglo;
import vista.frmPrueba;

/**
 *
 * @author Toshiba
 */
public class ControladorPrueba {
    private UsuarioArreglo modelo;
    private frmPrueba vista;

    public ControladorPrueba(UsuarioArreglo modelo, frmPrueba vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void iniciar (){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
