package modelo;


public class SumarDosNumeros {
    private int operador1,operador2,suma;

    public SumarDosNumeros(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public SumarDosNumeros() {
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
   
    public int getSuma() {
        return suma;
    }
    public void sumar(){
        this.suma = this.operador1+this.operador2;
    }
 
}
