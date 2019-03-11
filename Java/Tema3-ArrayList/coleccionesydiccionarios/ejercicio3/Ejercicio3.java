/**
 * 
 */
package coleccionesydiccionarios.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Ejercicio3 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce 10 números enteros.");
    for(int i=0;i<10;i++) {
      numeros.add(entrada.nextInt());
    }
    
    System.out.println("ArrayList sin ordenar: "+numeros);
    Collections.sort(numeros);
    System.out.println("ArrayList ordenado: "+numeros);

  }

}
