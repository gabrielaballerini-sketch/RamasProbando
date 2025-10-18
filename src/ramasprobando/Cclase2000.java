/*

 */
package ramasprobando;

/**
 *
 * @author Sutara
 */
public class Cclase2000 {
    
 private String algo;
 private int num;

    public Cclase2000(String algo, int num) {
        this.algo = algo;
        this.num = num;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Cclase2000{" + "algo=" + algo + ", num=" + num + '}';
    }
  public void mostrarDatos(){
  
      System.out.println("todos los datos en todas partes");
  }
 
}
