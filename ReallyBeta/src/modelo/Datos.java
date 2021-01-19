/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author Toshiba
 */
public class Datos {
        private String codigo ;
        private String nombre ;
       private String edad ;
        private String Dni ;
        private String Celular;

    public Datos(String codigo, String nombre, String Dni, String Celular) {
      
        this.codigo = codigo;
        this.nombre = nombre;
        this.Dni = Dni;
        this.Celular = Celular;
        
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the Dni
     */
    public String getDni() {
        return Dni;
    }

    /**
     * @param Dni the Dni to set
     */
    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", Dni=" + Dni + ", Celular=" + Celular ;
    }
    

        
    }

 

