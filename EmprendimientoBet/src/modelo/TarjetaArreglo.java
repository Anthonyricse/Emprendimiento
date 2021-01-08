/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Toshiba
 */
public class TarjetaArreglo{
          private Tarjeta[] tarjetas;
    private int indice;
    private int tarj;
    private int dinero;

    public TarjetaArreglo(int tamaño) {
       
        this.tarjetas = new Tarjeta[tamaño];
        this.indice = 0;
        this.tarj = 0 ;
        this.dinero = 580;
    }
    
    
    public boolean add( Tarjeta t){
        boolean result = false;
    
        if(this.indice< this.tarjetas.length){
            this.tarjetas[this.indice] = t;
            this.indice++;
           result = true;
        
      
        }
        return result; 
        
    }
    public void gastar(int gasto){
       this.dinero -= gasto ;      
    }
    public int gasta(int gasto){
        return this.dinero-=gasto;
    }
    public int getGasto(int gasto){
        return gasto;
    }
    public String getDinero(){
        String cambio = String.valueOf(dinero);
       
        return cambio;
    }
    public boolean ingreso( String clave){
        boolean result = false;
        for(int i=0;i< this.indice ;i++){
            if ( this.tarjetas[i].ingreso(clave)){
                result = true;
                break;
            }
        }
        return result;
    }

   
  
}
