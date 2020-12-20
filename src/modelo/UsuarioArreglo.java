package modelo;

public class UsuarioArreglo {
    private Usuario[] usuarios;
    private int indice;
    
    public UsuarioArreglo(int tamaño){
        this.usuarios = new Usuario[tamaño];
        this.indice = 0;
    }
    
    public boolean add(Usuario usuario){
        boolean result = false;
        if(!isLleno()){
            this.usuarios[this.indice] = usuario;
            this.indice++;
            result = true;
        }
        return result;
    }

    private boolean isLleno() {
        if(this.indice == this.usuarios.length){
            return true;
        } else {
            return false;
        }
    }
    
    public Usuario ingresar(String username, String password){
        Usuario result = null;
        for(int i=0; i< this.indice ; i++){
            if( this.usuarios[i].ingresar(username, password)
                    ){
                result = this.usuarios[i];
                break;
            }
        }
        return result;
    }
    
    public boolean salir(){
        boolean result = false;
        for(int i=0; i< this.indice ; i++){
            if( this.usuarios[i].isConectado() ) {
                this.usuarios[i].salir(); 
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i< this.indice ; i++){
            result+= this.usuarios[i]+"\n";
        }
        return result;
    }
    
}
