
package modelo;


public class Tarjeta {
    private String nombre ; 
    private String clave;
    private int dinero;
    private Boolean Conect;
    Datos dato;

    public Tarjeta(String clave, Datos dato) {
        this.nombre = nombre;
        this.clave = clave;
        this.dinero = 580;
        this.Conect = Conect;
        this.dato = dato;
    }
    
    public boolean isConect(){
        return this.Conect;
    }
    public int getGasto(int gasto){
        return gasto;
    }
    public void gastar(int gasto){
       this.dinero -= gasto ; 
       
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDato() {
        return dato.getNombre();
    }

 
    
    
    public String getDinero(){
        String cambio = String.valueOf(dinero);
       
        return cambio;
    }
    
    public boolean ingreso(String clave){
        boolean result = false;
        if( this.clave.equalsIgnoreCase(clave) &&  !isConect()
                ){
            result = true;
            this.Conect = Boolean.TRUE;
        }        return result;
    }
       @Override
    public String toString() {
        return  "clave=" + clave + ", dato=" + getDato() +  "["+dato+"]" ;
    }
  

    
}
