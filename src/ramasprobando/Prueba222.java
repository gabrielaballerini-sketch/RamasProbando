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
public class Prueba222 {
    
    private String prueba2;
    
    private String cdad;
    private int sss;

    public Prueba222(String prueba2, String cdad, int sss) {
        this.prueba2 = prueba2;
        this.cdad = cdad;
        this.sss = sss;
    }

    public String getPrueba2() {
        return prueba2;
    }

    public void setPrueba2(String prueba2) {
        this.prueba2 = prueba2;
    }

    public String getCdad() {
        return cdad;
    }

    public void setCdad(String cdad) {
        this.cdad = cdad;
    }

    public int getSss() {
        return sss;
    }

    public void setSss(int sss) {
        this.sss = sss;
    }

    @Override
    public String toString() {
        return "Prueba222{" + "prueba2=" + prueba2 + ", cdad=" + cdad + ", sss=" + sss + '}';
    }
    
    
}
