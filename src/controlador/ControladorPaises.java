
package controlador;

import configuracion.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Pais;
import modelo.PaisArreglo;
import modelo.UsuarioArreglo;
import vista.frmIngreso;
import vista.frmPais;


public class ControladorPaises {
    private PaisArreglo modelo;
    private frmPais vista;

    public ControladorPaises(PaisArreglo modelo, frmPais vista) {
        this.modelo = modelo;
        this.vista = vista;
        
       this.vista.btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(vista, modelo);
            }
       });
       this.vista.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          String nombre = vista.txtNOMBRE.getText();
          String region = vista.svoRegion.getSelectedItem().toString();
                System.out.println("Datos del Pais->"+nombre+"-"+region);
           if(Datos.regiones.getRegionxNombre(region)!=null){
                  Pais p= new Pais(nombre,Datos.regiones.getRegionxNombre(region));
          modelo.add(p);
          limpiarControles();
            
           }else{
               JOptionPane.showMessageDialog(vista, "No se encontro dicha region , verifica los datos de entrada ");
           }
                Pais p= new Pais(nombre,Datos.regiones.getRegionxNombre(region));
          modelo.add(p);
          limpiarControles();
            
            }
       });
    this.vista.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       vista.dispose();
             
                
                //Usuario usuario = new Usuario("jzavaleta", "segura");
                frmIngreso fIngreso = new frmIngreso();
                   Datos.conectado.salir();
                ControladorfrmIngreso controlador = new ControladorfrmIngreso(Datos.usuarios, fIngreso);
                controlador.iniciar();
            }
    });
}
    private void limpiarControles(){
        vista.txtNOMBRE.setText("");
        vista.svoRegion.setSelectedIndex(-1);
        
    }
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        limpiarControles();
    }
}