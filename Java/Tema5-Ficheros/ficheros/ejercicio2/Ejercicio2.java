package ficheros.ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String linea = "";
      System.out.println("Números primos del 1 al 500.");
      while (linea != null) {
        System.out.println(linea);
        linea = br.readLine();
      }
      br.close();
    } catch (FileNotFoundException fnfe) { 
      System.out.println("No se encuentra el fichero primos.dat");
    } catch (IOException ioe) { 
      System.out.println("No se puede leer el fichero primos.dat");
    }
  }
}
