import controlador.ControladorPrincipal;
import general.sistema;
import modelo.Datos;
import modelo.Tarjeta;
import modelo.Usuario;
import vista.frmPrincipal;
public class app {
    public static void main (String []args){
    
sistema.usuarios.add(new Usuario("dokouser98@gmail.com", "123",sistema.tarjetas.getTarjetaxClave("1523658") ,"12"));
sistema.datos.add(new Datos("001", "anthony", "7269445", "941993332"));

sistema.datos.add(new Datos("002", "Walter", "7267445", "941453332"));
sistema.datos.add(new Datos("003", "Alexander", "6269445", "941993002"));
sistema.datos.add(new Datos("004", "Leonardo", "7269895", "941991112"));
sistema.tarjetas.add(new Tarjeta("1523658", sistema.datos.getRegionxNombre("AnthonyRicse")));
sistema.tarjetas.add(new Tarjeta("123456", sistema.datos.getRegionxNombre("WalterSuel")));
sistema.tarjetas.add(new Tarjeta("789456", sistema.datos.getRegionxNombre("AlexanderTorre")));
sistema.tarjetas.add(new Tarjeta("369258147", sistema.datos.getRegionxNombre("LeonardoChavez")));
        System.out.println(sistema.tarjetas);
        System.out.println(sistema.datos);
        
        frmPrincipal fprincipal = new frmPrincipal();
      ControladorPrincipal controla = new ControladorPrincipal(fprincipal);
      controla.iniciar();
    }
}
