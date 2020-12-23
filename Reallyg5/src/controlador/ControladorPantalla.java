package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmCel;

public class ControladorPantalla {

    private frmCel vista;

    public ControladorPantalla(frmCel vista) {
        this.vista = vista;
        
        
        
        this.vista.btnReally.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              vista.dispose();
              
              
            }
        });
    }
    

     public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    
}
