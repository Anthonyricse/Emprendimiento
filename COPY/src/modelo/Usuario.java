
package modelo;

public class Usuario {
  private String email;
  private String password;
  private Boolean conectado; 

    public String getEmail() {
        return email;
    }
  
/*
  
    public boolean isConectado()
    {
        return this.conectado;
    }
    
    public boolean Ingreso(String email ,String password)
    {
        boolean result = false;
        if(this.email.equalsIgnoreCase(email) && this.password.equals(password) &&
                !isConectado()){
            result = true;
        }
     this.conectado=  Boolean.TRUE;
     return result;
    }
 public boolean salir()
 {
        boolean result = false;
        if(isConectado()){
            result = true;
            this.conectado = Boolean.FALSE;
        }
        return result;
    }
    */

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
        this.conectado = Boolean.FALSE ;
        
        
    }
    public boolean isConectado()
    {
        return this.conectado;
    }
    
    public boolean Ingreso(String email , String password)
    {
        boolean result = false ;
        if(this.email.equalsIgnoreCase(email)
                && this.password.equals(password)
                && !isConectado())    
        {
            result = true;
           this.conectado=Boolean.TRUE;
        }
        return result ; 
        
    }
    public boolean salir(){
        boolean result = false ; 
        if(isConectado()){
            result = true ;
            this.conectado= Boolean.FALSE;
        }
        return result ; 
        
    }
}