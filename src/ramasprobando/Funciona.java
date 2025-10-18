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
public class Funciona {
    
    
    private String quefuncione;
    private String asereje ;
    private int numero ;

    public Funciona(String quefuncione, String asereje, int numero) {
        this.quefuncione = quefuncione;
        this.asereje = asereje;
        this.numero = numero;
    }

    public String getQuefuncione() {
        return quefuncione;
    }

    public void setQuefuncione(String quefuncione) {
        this.quefuncione = quefuncione;
    }

    public String getAsereje() {
        return asereje;
    }

    public void setAsereje(String asereje) {
        this.asereje = asereje;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Funciona{" + "quefuncione=" + quefuncione + ", asereje=" + asereje + ", numero=" + numero + '}';
    }
    
    
            
    
    
}
