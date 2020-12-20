
import configuracion.Datos;
import controlador.ControladorfrmIngreso;
import javax.mail.MessagingException;
import modelo.Pais;
import modelo.Region;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import utils.Email;
import vista.frmIngreso;
import javax.mail.AuthenticationFailedException;

public class App {
    public static void main(String[] args)  {

        Datos.usuarios = new UsuarioArreglo(10);
        Datos.usuarios.add(new Usuario("jzavaleta", "segura"));
        Datos.usuarios.add(new Usuario("jperez", "123456"));
        Datos.usuarios.add(new Usuario("fisi", "2020"));
        Datos.usuarios.add(new Usuario("unmsm", "algoritmica2"));
        Datos.regiones.add(new Region("America del sur", "AM-SUR"));
        Datos.regiones.add(new Region("AMERICA DEL NORTE", "AM-NOR"));
        Datos.regiones.add(new Region("EUROPA", "EU"));
        Datos.regiones.add(new Region("ASIA", "AS"));

       // Datos.paises.add(new Pais("Peru",Datos.regiones.getRegionxNombre("AMERICA DEL SUR")));
       // Datos.paises.add(new Pais("COLOBIA",Datos.regiones.getRegionxNombre("AMERICA DEL SUR")));
       // Datos.paises.add(new Pais("CHILE",Datos.regiones.getRegionxNombre("AMERICA DEL SUR")));
       // Datos.paises.add(new Pais("BOLIVIA",Datos.regiones.getRegionxNombre("AMERICA DEL SUR")));
       // Datos.paises.add(new Pais("ESPAÑA",Datos.regiones.getRegionxNombre("EUROPA")));
      //  Datos.paises.add(new Pais("CHINA",Datos.regiones.getRegionxNombre("ASIA")));

     //   System.out.println(Datos.usuarios);
       // System.out.println(Datos.conectado);
       // System.out.println(Datos.paises);
       // System.out.println(Datos.regiones);
      
      
       frmIngreso fIngreso = new frmIngreso();
        ControladorfrmIngreso controlador = new ControladorfrmIngreso(Datos.usuarios, fIngreso);
        controlador.iniciar();
    }
}
