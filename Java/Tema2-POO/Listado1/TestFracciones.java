/**
 * 
 */
package Listado1;

import java.util.Scanner;

/**
 * Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador. 
 * Obtener la fracción. 
 * Obtener y modificar numerador y denominador. No se puede dividir por cero. 
 * Obtener resultado de la fracción(número real). 
 * Multiplicar la fracción por un número. 
 * Multiplicar, sumar y restar fracciones. 
 * Simplificar la fracción.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class TestFracciones {

  public static void main(String[] args) {
    Fraccion fraccion1 = new Fraccion(1,2);
    Fraccion fraccion2 = new Fraccion(2,3);
    int opc;
    int num;
    Scanner entrada = new Scanner (System.in);
    
    do {
      //Menu para elegir una opción
      System.out.println("----Menu Fracciones----");
      System.out.println("1º)Mostrar Fracción");
      System.out.println("2º)Fracción en numero Real.");
      System.out.println("3º)Multiplicar fracción por un número entero.");
      System.out.println("4º)Multiplicar Fracciones.");
      System.out.println("5º)Sumar Fracciones.");
      System.out.println("6º)Restar Fracciones.");
      System.out.println("7º)Simplificar Fracciones.");
      System.out.println("8º)Terminar.");
    
      System.out.print("Introduzca una opción entre 1 y 8: ");
      opc = entrada.nextInt();
    
    
      switch(opc) {
        case 1:
          System.out.println(fraccion1.toString()+"\n");
          System.out.println(fraccion2.toString()+"\n");
          break;
          
        case 2:
          System.out.println("Mostrar resultado de la fracción en numero real.");
          System.out.println(fraccion1.obtenerReal()+"\n");
          break;
          
        case 3:
          System.out.println("Introduce un número entero para multiplicarlo por la fracción.");
          num = entrada.nextInt();
          fraccion1.multiplicarPorEntero(num);
          System.out.println(fraccion1.toString()+"\n"); 
          break;
          
        case 4:
          System.out.println(Fraccion.multiplicarFracciones(fraccion1, fraccion2));
          break;
          
        case 5: 
          System.out.println("Sumar 2 fracciones: ");
          System.out.println(Fraccion.sumar(fraccion1, fraccion2));
          break;
          
        case 6: 
          System.out.println("Restar 2 fracciones: ");
          System.out.println(Fraccion.restar(fraccion1, fraccion2));
          break;
         
        case 7:
          System.out.println("Simplificar fracciones: ");
          fraccion1.simplificarFraccion();
          System.out.println(fraccion1.toString());
          
        default:
          System.out.println("Fin del Programa\n");
      }
    }while(opc!=8);
  }

}
