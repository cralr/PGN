/**
 * 
 */
package Listado1;

/**
 *
 * 3. Crea una clase TestCirculo que cree una instancia de �Circulo�, muestre su
 * estado, lo haga crecer 27 veces, averig�e su �rea, lo haga decrecer 10 veces
 * y muestre su estado final.
 * 
 * @author Rafael Miguel Cruz �lvarez
 * @version 1.0
 */
public class TestCirculo {

  public static void main(String[] args) {
   
    //Creamos el objeto
    
    Circulo circulo = new Circulo(0);
    
    System.out.println(circulo.toString());
    circulo.incrementar(27);
    circulo.decrementar(10);
    System.out.println(circulo.toString());
  }

}
