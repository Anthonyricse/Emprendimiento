package modelo;

public class UsuarioArreglo {
        private Usuario[] usuarios;
      //  private Tarjeta[] tarjetas;
    private int indice;
    private int tarj;

    public UsuarioArreglo(int tamaño) {
        this.usuarios = new Usuario[tamaño];
    //    this.tarjetas = new Tarjeta[tamaño];
        this.indice = 0;
        this.tarj = 0 ;
    }
    
    
    public boolean add( Usuario u){
        boolean result = false;
    
        if(this.indice< this.usuarios.length){
            this.usuarios[this.indice] = u;
            this.indice++;
           result = true;
        
      
        }
        return result; 
        
    }

    
    public boolean ingresar( String email, String password){
        boolean result = false;
        for(int i=0;i< this.indice ;i++){
            if ( this.usuarios[i].ingresar(email, password) ){
                result = true;
                break;
            }
        }
        return result;
    }
 

    @Override
    public String toString() {
        String result = "ArregloUsuario\n ";
       
        for(int i =0 ; i>this.indice ; i ++){
              result +=  this.usuarios[i] + "\n";  
        }
        return result;
    }

   
  
}
