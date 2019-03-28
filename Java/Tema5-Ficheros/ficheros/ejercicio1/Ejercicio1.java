package ficheros.ejercicio1;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      esPrimo(bw);
      System.out.println("Archivo guardado con éxito.");
      bw.close();
    }catch(IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
    }
   
  }

  public static void esPrimo(BufferedWriter bw) throws IOException {
    boolean esPrimo;
    for (int i = 1; i <= 500; i++) {
      esPrimo = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          esPrimo = false;
        }
      }
      comprobarPrimo(esPrimo, bw, i);
    }
  }
  
  /**
   * Comprueba si un número es primo o no
   * 
   * @param esPrimo
   * @param bw
   * @param i
   * @throws IOException
   */
  public static void comprobarPrimo(boolean esPrimo, BufferedWriter bw, int i) throws IOException {
    if (esPrimo) {
      bw.write(i + "\n");
    }
}
  }
