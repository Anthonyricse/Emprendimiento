import controlador.ControladorPantalla;
import modelo.Usuario;
import vista.frmCel;
import modelo.UsuarioArreglo;
import sistema.Datos;
public class app {
   public static void main(String[] args)  {
      UsuarioArreglo user = new UsuarioArreglo(8);
      user.add(new Usuario("dokouser98@gmail.com", "4932665"));
               
       
        frmCel fcel = new frmCel();
          ControladorPantalla ControlaPant = new ControladorPantalla(fcel);
        ControlaPant.iniciar();
      
    }
}
