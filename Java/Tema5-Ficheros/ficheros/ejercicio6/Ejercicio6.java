package ficheros.ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ficheros.ejercicio6.utiles.Teclado;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * @author Rafael Miguel Cruz Álvarez
 *
 */
public class Ejercicio6 {
  public static void main(String[] args) throws IOException {

    int contador = 0;
    String fichero = "";
    String palabra = "";
    fichero = Teclado.leerCadena("Introduzca el nombre del fichero");
    palabra = Teclado.leerCadena("¿Qué palabra deseas contar?");

    try {
      BufferedReader leer = new BufferedReader(new FileReader(fichero + ".txt"));

      String linea = "";
      String contenidoLinea = "";

      while (linea != null) {
        contenidoLinea = linea;
        linea = leer.readLine();
        if (contenidoLinea.equals(palabra)) {
          contador++;
        }
      }

      leer.close();

    } catch (FileNotFoundException e) {
      System.err.println("El fichero no se ha podido encontrar");
    } catch (IOException e) {
      System.err.println("Error en la lectura del fichero");
    }

    System.out.println("La palabra " + palabra + " se ha encontrado " + contador + " veces.");
  }
}