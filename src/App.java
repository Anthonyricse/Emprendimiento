
import controlador.ControladorfrmOperaciones;
import modelo.OperacionMatematica;
import vista.frmOperaciones;

public class App {
    public static void main(String[] args) {
        OperacionMatematica operacion = new OperacionMatematica();
        frmOperaciones fOperaciones = new frmOperaciones();
        ControladorfrmOperaciones controlador =  new ControladorfrmOperaciones(operacion, fOperaciones);
        controlador.iniciar();
        
        System.out.println("f");

    }
    
}
