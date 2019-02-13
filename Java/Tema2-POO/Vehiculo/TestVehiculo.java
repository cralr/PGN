/**
 * 
 */
package Vehiculo;

import java.util.Scanner;

import Listado1.Fraccion;

/**
 *VEH�CULOS
 *=========
 *1. Anda con la bicicleta
 *2. Haz el caballito con la bicicleta
 *3. Anda con el coche
 *4. Quema rueda con el coche
 *5. Ver kilometraje de la bicicleta
 *6. Ver kilometraje del coche
 *7. Ver kilometraje total
 *8. Salir
 *Elige una opci�n (1-8):
 *
 * @author Rafael Miguel Cruz �lvarez
 * @version 1.0
 */
public class TestVehiculo {

  public static void main(String[] args) {
    Coche Skoda = new Coche("Rojo");
    Bicicleta BiciMonta�a = new Bicicleta("Freno Disco");
    int opc;
    int km;
    Scanner entrada = new Scanner (System.in);
    
    do {
      //Menu para elegir una opci�n
      System.out.println("----Menu Vehiculos----");
      System.out.println("1�)Anda con la Bicicleta");
      System.out.println("2�)Haz el caballito con la Bicicleta.");
      System.out.println("3�)Anda con el Coche.");
      System.out.println("4�)Quema rueda con el Coche.");
      System.out.println("5�)Ver kilometraje de la bicicleta.");
      System.out.println("6�)Ver kilometraje del coche.");
      System.out.println("7�)Ver kilometraje total.");
      System.out.println("8�)Salir");
    
      System.out.print("Introduzca una opci�n entre 1 y 8: ");
      opc = entrada.nextInt();
    
    
      switch(opc) {
        case 1:
          System.out.println("Introduce el n�mero de km recorridos con su bicicleta: ");
          km = entrada.nextInt();
          BiciMonta�a.recorrer(km);
          break;
          
        case 2:
          BiciMonta�a.hacerCaballito();
          break;
          
        case 3:
          System.out.println("Introduce el n�mero de km recorridos con su coche: ");
          km = entrada.nextInt();
          Skoda.recorrer(km);
          break;
          
        case 4:
          Skoda.quemarRueda();
          break;
          
        case 5: 
          System.out.println("Ha recorrido con su bicicleta "+BiciMonta�a.getKilometrosRecorridos()+" kms.");
          break;
          
        case 6: 
          System.out.println("Ha recorrido con su coche "+Skoda.getKilometrosRecorridos()+" kms.");
          break;
         
        case 7:
          System.out.println("Se ha recorrido un total de "+Vehiculo.getKilometrosTotal()+" kms.");
          break;
          
        default:
          System.out.println("Fin del Programa\n");
      }
    }while(opc!=8);
  }

}