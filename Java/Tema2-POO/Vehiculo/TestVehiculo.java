/**
 * 
 */
package Vehiculo;

import java.util.Scanner;

import Listado1.Fraccion;

/**
 *VEHÍCULOS
 *=========
 *1. Anda con la bicicleta
 *2. Haz el caballito con la bicicleta
 *3. Anda con el coche
 *4. Quema rueda con el coche
 *5. Ver kilometraje de la bicicleta
 *6. Ver kilometraje del coche
 *7. Ver kilometraje total
 *8. Salir
 *Elige una opción (1-8):
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class TestVehiculo {

  public static void main(String[] args) {
    Coche Skoda = new Coche("Rojo");
    Bicicleta BiciMontaña = new Bicicleta("Freno Disco");
    int opc;
    int km;
    Scanner entrada = new Scanner (System.in);
    
    do {
      //Menu para elegir una opción
      System.out.println("----Menu Vehiculos----");
      System.out.println("1º)Anda con la Bicicleta");
      System.out.println("2º)Haz el caballito con la Bicicleta.");
      System.out.println("3º)Anda con el Coche.");
      System.out.println("4º)Quema rueda con el Coche.");
      System.out.println("5º)Ver kilometraje de la bicicleta.");
      System.out.println("6º)Ver kilometraje del coche.");
      System.out.println("7º)Ver kilometraje total.");
      System.out.println("8º)Salir");
    
      System.out.print("Introduzca una opción entre 1 y 8: ");
      opc = entrada.nextInt();
    
    
      switch(opc) {
        case 1:
          System.out.println("Introduce el número de km recorridos con su bicicleta: ");
          km = entrada.nextInt();
          BiciMontaña.recorrer(km);
          break;
          
        case 2:
          BiciMontaña.hacerCaballito();
          break;
          
        case 3:
          System.out.println("Introduce el número de km recorridos con su coche: ");
          km = entrada.nextInt();
          Skoda.recorrer(km);
          break;
          
        case 4:
          Skoda.quemarRueda();
          break;
          
        case 5: 
          System.out.println("Ha recorrido con su bicicleta "+BiciMontaña.getKilometrosRecorridos()+" kms.");
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