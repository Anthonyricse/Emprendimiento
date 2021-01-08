/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import general.sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.TarjetaArreglo;
import modelo.UsuarioArreglo;
import vista.frmMapa1;
import vista.frmTarifa2;
import vista.frmTarifa1;
import vista2.frmAcuaActividades;
import modelo.Venta;
import modelo.Tarjeta;

/**
 *
 * @author Toshiba
 */
public class ControladorTarifa2 {
    private TarjetaArreglo modelo;
    private frmTarifa2 vista ;
    

    public ControladorTarifa2(TarjetaArreglo modelo, frmTarifa2 vista ) {
        this.modelo = modelo;
        this.vista = vista;
       
        this.vista.btnRetornoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmTarifa1 ftarifa = new frmTarifa1();
                ControladorTarifa1 controla = new ControladorTarifa1(modelo, ftarifa);
                controla.iniciar();
            }
        });
        this.vista.btn_0_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 12 ;
                   vista.lblGasto.setText(String.valueOf(modelo.getGasto(result)));
                   modelo.gastar(result);
                   vista.lblResultado.setText(String.valueOf(modelo.gasta(result)));
                   JOptionPane.showMessageDialog(vista, "L-V .Realizo la compra de una entrada para niño s/12.00");
                   
            }
        });
        this.vista.btn_0_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 14 ;
                   vista.lblGasto.setText(String.valueOf(modelo.getGasto(result)));
                   modelo.gastar(result);
                   vista.lblResultado.setText(String.valueOf(modelo.gasta(result)));
                   JOptionPane.showMessageDialog(vista, "S-D .Realizo la compra de una entrada para niño s/14.00");
                   
            }
        });
          this.vista.btn_1_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 19 ;
                   vista.lblGasto.setText(String.valueOf(modelo.getGasto(result)));
                   modelo.gastar(result);
                   vista.lblResultado.setText(String.valueOf(modelo.gasta(result)));
                   JOptionPane.showMessageDialog(vista, "L-V .Realizo la compra de una entrada para Adulto s/19.00");
                   
            }
        });
          this.vista.btn_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 21 ;
                   vista.lblGasto.setText(String.valueOf(modelo.getGasto(result)));
                   modelo.gastar(result);
                   vista.lblResultado.setText(String.valueOf(modelo.gasta(result)));
                   JOptionPane.showMessageDialog(vista, "S-D .Realizo la compra de una entrada para Adulto s/21.00");
                   
            }
        });
          this.vista.btn_2_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 12 ;
                   vista.lblGasto.setText(String.valueOf(modelo.getGasto(result)));
                   modelo.gastar(result);
                   vista.lblResultado.setText(String.valueOf(modelo.gasta(result)));
                   JOptionPane.showMessageDialog(vista, "L-V .Realizo la compra de una entrada para Adulto Mayor s/12.00");
                   
            }
        });
          this.vista.btn_2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 14;
                   vista.lblGasto.setText(String.valueOf(modelo.getGasto(result)));
                   modelo.gastar(result);
                   vista.lblResultado.setText(String.valueOf(modelo.gasta(result)));
                   JOptionPane.showMessageDialog(vista, "L-V .Realizo la compra de una entrada para niño s/14.00");
                   
            }
        });
          
    }

 
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);;
        this.vista.setVisible(true);
    }
}
