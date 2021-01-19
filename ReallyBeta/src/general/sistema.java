
package general;

import modelo.DatosArreglo;
import modelo.TarjetaArreglo;
import modelo.Usuario;
import modelo.UsuarioArreglo;

public class sistema {
    public static UsuarioArreglo usuarios = new UsuarioArreglo(10);
    public static TarjetaArreglo tarjetas =  new TarjetaArreglo(10);
    public static Usuario conectado = null ;
    public static DatosArreglo datos = new DatosArreglo(10);
}
