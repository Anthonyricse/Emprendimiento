<<<<<<< Updated upstream

import controlador.ControladorPantalla;
import vista.frmCel;
import modelo.UsuarioArreglo;
import modelo.Usuario;
import sistema.Datos;

public class App {
    public static void main(String[] args) {
      Datos.usuarios.add(new Usuario("dokouser98@gmail.com", "4932665"));
      frmCel fcel = new frmCel();
      
      ControladorPantalla controlaPant = new ControladorPantalla(Datos.usuarios,fcel);
      controlaPant.iniciar();
    }
}
=======

import controlador.ControladorPantalla;
import vista.frmCel;
import modelo.UsuarioArreglo;
import modelo.Usuario;
import sistema.Datos;

public class App {
    public static void main(String[] args) {
      Datos.usuarios.add(new Usuario("dokouser98@gmail.com", "4932665"));
      frmCel fcel = new frmCel();
      
      ControladorPantalla controlaPant = new ControladorPantalla(Datos.usuarios,fcel);
      controlaPant.iniciar();
    }
}
>>>>>>> Stashed changes
