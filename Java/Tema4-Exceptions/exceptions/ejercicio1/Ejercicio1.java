package exceptions.ejercicio1;

import java.util.Scanner;

/**
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Ejercicio1 {

  public static void main(String[] args) {
  
    Scanner entrada=new Scanner (System.in);
    int maximo = Integer.MIN_VALUE;

    for (int i = 1; i < 7; i++) {
      
      boolean datoValido = false;
      int num = 0;

      do {
        try {
          System.out.print("Nº " + i + ": ");
          num = entrada.nextInt();
          datoValido = true;
        } catch (Exception e) {
          System.out.println("No ha introducido un número entero.");
          System.out.println("Por favor, inténtelo de nuevo.");
          entrada.nextLine();
        }
      } while (!datoValido);
      
      if (num > maximo) {
        maximo = num;
      }
    }
    
    System.out.println("El valor máximo introducido es " + maximo);
  }
}
