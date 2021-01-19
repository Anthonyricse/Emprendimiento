package modelo;


public class Usuario {
     private String email;
    private String password;
    private Boolean conectado;
   private Tarjeta tarjeta; 
  //  private Boolean tarjetConect; 
    private String edad ; 
    
    

  //  public void Tarjeta( String codigo) {
  //      this.tarjeta = new Tarjeta(codigo );
  //  }
   // public String email() {
  //      return email;
   // }
   
   
    public Usuario(String email, String password , Tarjeta tarjeta , String edad) {
        this.email = email;
        this.password = password;
        this.conectado = Boolean.FALSE;  
        this.tarjeta = tarjeta;
    }

    public String getClave() {
        return tarjeta.getClave();
    }
    public boolean isConectado (){
        return this.conectado;
    } 
   
 /* public boolean ingresoTarj(Tarjeta tarjeta){
      boolean result = false ;
       if(this.tarjeta.equals(tarjeta) && !tarjetConect){
           result = true ; 
           this.tarjetConect = Boolean.FALSE;
       }
      return result ;
  *///}
    
   
    
    
    public boolean ingresar(String email, String password){
        boolean result = false;
        if( this.email.equalsIgnoreCase(email) && 
                this.password.equals(password) &&
                !isConectado()
                ){
            result = true;
            this.conectado = Boolean.TRUE;
        }        return result;
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
        return "email=" + email + ", password=" + password + ", conectado=" + conectado ;
    }
    
   
}
