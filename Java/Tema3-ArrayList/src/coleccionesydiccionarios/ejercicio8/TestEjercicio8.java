
package coleccionesydiccionarios.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase <code>Carta</code>). Emplea un objeto de la clase
 * <code>ArrayList</code> para almacenarlas y asegúrate de que no se repite
 * ninguna.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class TestEjercicio8 {


  public static void main(String[] args) {

    ArrayList<Carta> baraja = new ArrayList<Carta>();
    ArrayList<Carta> descarte = new ArrayList<Carta>();

    for (Figura figura : Figura.values()) {
      for (Palo palo : Palo.values()) {
        baraja.add(new Carta(figura, palo));
      }
    }
    
    //Barajar la baraja.
    Collections.shuffle(baraja);

    //Obtener 10 cartas
    for (int i = 0; i < 10; i++) {
      descarte.add(baraja.remove(0));
    }
    
    //Mostrar la mano con las 10 cartas
    for (Carta mano : descarte) {
      System.out.println(mano);
    } 
  }
}
