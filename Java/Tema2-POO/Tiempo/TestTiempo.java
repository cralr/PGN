
package Tiempo;

import Listado1.Fraccion;

/**
 *Test para probar la clase Tiempo
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class TestTiempo {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Tiempo t1 = new Tiempo();

    System.out.println(t1);
    t1.modificar(1, 1, 60);
    System.out.println(t1);
    t1.modificar(-1, -1, -60);
    System.out.println(t1);
  }

}
