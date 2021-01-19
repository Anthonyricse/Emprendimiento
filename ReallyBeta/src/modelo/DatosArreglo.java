
package modelo;


public class DatosArreglo {
    Datos datos[];
    int indice ; 

    public DatosArreglo(int tamaño) {
        this.datos = new Datos[tamaño];
        this.indice = 0 ;
    }
    
     
      public boolean add(Datos o){
        boolean result = false;
    
        if(this.indice< this.datos.length){
            this.datos[this.indice] = o;
            this.indice++;
           result = true;
        
      
        }
        return result; 
        
    }
  public Datos getRegionxNombre(String nombre){
    Datos result = null;
    for(int i =  0 ; i<this.indice ; i++ ){
           if(this.datos[i].getNombre().equalsIgnoreCase(nombre)){            
           result =  this.datos[i] ;
           break;       
        }  
    }     
       return result ;     
    }
        @Override
    public String toString() {
        String result = "ArregloDatos\n ";
       
        for(int i =0 ; i>this.indice ; i ++){
              result +=  this.datos[i] + "\n";  
        }
        return result;
    }

            
}
