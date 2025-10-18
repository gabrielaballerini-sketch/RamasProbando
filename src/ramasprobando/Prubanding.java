/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramasprobando;

/**
 *
 * @author fatimaalcaraz
 */
public class Prubanding {
    private String vaBien;
    private int intentos= 1000;

    public Prubanding(String vaBien) {
        this.vaBien = vaBien;
    }

    public String getVaBien() {
        return vaBien;
    }

    public void setVaBien(String vaBien) {
        this.vaBien = vaBien;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Prubanding{" + "vaBien=" + vaBien + ", intentos=" + intentos + '}';
    }
    
    
    
    
}
