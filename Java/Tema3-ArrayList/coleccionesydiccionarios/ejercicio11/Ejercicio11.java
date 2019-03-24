/**
 * 
 */
package coleccionesydiccionarios.ejercicio11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Ejercicio11 {

  public static void main(String[] args) {

    HashMap<String, String> diccionario = new HashMap<String, String>();
    Scanner entrada = new Scanner(System.in);
    
    ArrayList<String> diccionarioA=new ArrayList<String>();
    ArrayList<String> palabrasA=new ArrayList<String>();

    int contAciertos=0;
    int contFallos=0;
    
    diccionario.put("gato", "cat");
    diccionario.put("perro", "dog");
    diccionario.put("casa", "house");
    diccionario.put("carta", "card");
    diccionario.put("arbol", "tree");
    diccionario.put("rojo", "red");
    diccionario.put("amarillo", "yellow");
    diccionario.put("verde", "green");
    diccionario.put("azul", "blue");
    diccionario.put("ordenador", "computer");
    diccionario.put("raton", "mouse");
    diccionario.put("mesa", "table");
    diccionario.put("silla", "chair");
    diccionario.put("montaña", "mountain");
    diccionario.put("baloncesto", "basketball");
    diccionario.put("juego", "game");
    diccionario.put("caballo", "horse");
    diccionario.put("mar", "sea");
    diccionario.put("sonido", "sound");
    diccionario.put("musica", "music");

    diccionarioA.addAll(diccionario.keySet());
    Collections.shuffle(diccionarioA);
    
    for (int i = 0; i < 5; i++) {
      palabrasA.add(diccionarioA.remove(0));
    }

    for (String x : palabrasA) {

      String respuesta = "";
      System.out.println("Introduzca la traducción de la palabra "+x+": ");
      respuesta = entrada.nextLine();
      if (respuesta.contains(diccionario.get(x))) {
        contAciertos++;
      } else {
        contFallos++;
      }
      System.out.println("Has acertado " + contAciertos + " palabras y has fallado " + contFallos + " palabras.");
}
   
  }

}