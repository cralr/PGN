package exceptions.ejercicio2;

/**
 * Test para probar la clase Gato.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class TestGato {
  public static void main(String[] args) {
    
    Gato garfield = new Gato("macho");
    Gato tom = new Gato("macho");
    Gato titi = new Gato("hembra");
    try {
      System.out.println(garfield.apareaCon(titi));
      garfield.apareaCon(tom);
    } catch (ApareamientoNoPosibleException e) {
      System.err.println(e.getMessage());
    }
    
  }
}
