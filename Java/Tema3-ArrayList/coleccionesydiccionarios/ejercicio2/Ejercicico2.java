package coleccionesydiccionarios.ejercicio2;

import java.util.ArrayList;

/**
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en
 * un ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Ejercicico2 {

  public static void main(String[] args) {
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    int suma=0;
    int media=0;
    int maximo=0;
    int minimo=100;
    int tamanyo = (int) (Math.random() * 11 + 10);
    
    for (int i=0;i<tamanyo;i++) {
      numeros.add((int) (Math.random() * 101));
    }
    
    System.out.println("Este es el arraylist de números aleatorios.");
    System.out.println(numeros);
    
    for (int n : numeros) {
      suma +=n;
    }
    System.out.println("La suma es: "+suma);
    System.out.println("La media es: "+(suma)/(tamanyo));
    
    for (int n: numeros) {
      if (n > maximo) {
        maximo=n;
      }
      
      if (n<minimo) {
        minimo=n;
      }
    }
    System.out.println("El número mínimo del arraylist es: "+minimo);
    System.out.println("El número máximo del arraylist es: "+maximo);
  }

}
