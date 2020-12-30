package modelo;

public class UsuarioArreglo 
{
    private Usuario[] usuarios;
    private int indice;

    public UsuarioArreglo(int tamaño) 
    {
        this.usuarios = new Usuario[tamaño];
        this.indice = 0;
    }
    
 public boolean add( Usuario u)
 {
        boolean result = false;
        if(this.indice< this.usuarios.length){
            this.usuarios[this.indice] = u;
            this.indice++;
            result = true;
        }
        return result;       
    }
 public boolean isLleno()
 {if(this.indice==this.usuarios.length){
     return true;
 }else{
          return false;

    }
 }
 public Usuario Ingreso(String email, String password){
        Usuario result = null;
        for(int i=0; i< this.indice ; i++){
            if( this.usuarios[i].Ingreso(email, password)
                    ){
                result = this.usuarios[i];
                break;
            }
        }
        return result;
    }
    
  
    
}
