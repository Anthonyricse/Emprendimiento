package modelo;

public class Venta {
    private int dinero ;
    private int compra ;
    private int gasto ;

    public Venta( int compra, int gasto) {
        this.dinero = 580;
        this.compra = compra;
        this.gasto = gasto;
    }
    
   public void gasto(){
       gasto = dinero - compra ;
   }
   public int getCalculo(){
       return this.gasto;
   }
   public int getDinero(){
       return this.dinero = 580;
       
   }
   public int getCompra(){
       return compra;
   }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }
   
}
