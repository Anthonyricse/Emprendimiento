
import controlador.ControladorPantalla;
import vista.frmCel;
import modelo.UsuarioArreglo;
import modelo.Usuario;

public class App {
    public static void main(String[] args) {
      UsuarioArreglo user = new UsuarioArreglo(8);
      user.add(new Usuario("dokouser98@gmail.com", "4932665"));
      frmCel fcel = new frmCel();
      ControladorPantalla controlaPant = new ControladorPantalla(fcel);
      controlaPant.iniciar();
    }
}
