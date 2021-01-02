import controlador.ControladorPrincipal;
import general.sistema;
import modelo.Usuario;
import vista.frmPrincipal;
public class app {
    public static void main (String []args){
        sistema.usuarios.add(new Usuario("dokouser98@gmail.com", "4932665"));
        
        frmPrincipal fprincipal = new frmPrincipal();
      ControladorPrincipal controla = new ControladorPrincipal(fprincipal);
      controla.iniciar();
    }
}
