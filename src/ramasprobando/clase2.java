/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramasprobando;

/**
 *
 * @author Capotes
 */
public class clase2 {
    
    
    private int cantidad;
    
    private String nombre;
    
    private String apellido;

    public clase2(int cantidad, String nombre, String apellido) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
