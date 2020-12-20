
package modelo;

public class PaisArreglo {
    Pais paises[];
    int indice;

    public PaisArreglo(int tamaño) {
        this.paises = new Pais[tamaño];
        this.indice=0;
        
    }
    public boolean add (Pais p){
        boolean result = false;
        if(this.indice < this.paises.length){
            this.paises[this.indice]= p ; 
            this.indice++;
            result = true;
            
        }
        return result;
    }
    @Override
    public String toString() {
       String result = "ArregloPais\n";
       for(int i = 0 ; i <this.indice;i++){
            result+= this.paises[i] + "\n";
        }
       return result ;
        }
    
    
    
}
