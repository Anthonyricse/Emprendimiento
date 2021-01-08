import controlador.ControladorPrincipal;
import general.sistema;
import modelo.Tarjeta;
import modelo.Usuario;
import vista.frmPrincipal;
public class app {
    public static void main (String []args){
        Tarjeta clave = new Tarjeta("123456");
   
      
       sistema.usuarios.add(new Usuario("rishe", "gps", clave, "25"));
        sistema.tarjetas.add(new Tarjeta("123456"));
        
        
        frmPrincipal fprincipal = new frmPrincipal();
      ControladorPrincipal controla = new ControladorPrincipal(fprincipal);
      controla.iniciar();
    }
}
