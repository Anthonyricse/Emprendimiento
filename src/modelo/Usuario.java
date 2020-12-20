package modelo;

public class Usuario {
    private String username;
    private String password;
    private Boolean conectado;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        this.conectado = Boolean.FALSE;
    }

    public String getUsername() {
        return username;
    }

    public Boolean isConectado() {
        return conectado;
    }
    
    public boolean ingresar(String username, String password){
        boolean result = false;
        if( this.username.equalsIgnoreCase(username) &&
                this.password.equals(password) &&
                !this.isConectado() ){
            result = true;
            this.conectado = Boolean.TRUE;
        }
        return result;
    }
    
    public boolean salir(){
        boolean result = false;
        if(isConectado()){
            result = true;
            this.conectado = Boolean.FALSE;
        }
        return result;
    }

    @Override
    public String toString() {
        return "username=" + username + ", password=" + password + ", conectado=" + conectado ;
    }
    
}
