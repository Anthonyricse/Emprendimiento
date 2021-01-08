
package modelo;


public class Tarjeta {
    private String nombre ; 
    private String clave;
    private int dinero;
    private Boolean Conect;
    
    public Tarjeta( String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.dinero = 580; 
        this.Conect=Boolean.FALSE;
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
    
}
