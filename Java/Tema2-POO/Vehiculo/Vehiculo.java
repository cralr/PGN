/**
 * 
 */
package Vehiculo;

/**
 * Crea la clase Vehiculo, as� como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreados y kilometrosTotales, as� como el atributo de instancia
 * kilometrosRecorridos. Crea tambi�n alg�n m�todo espec�fico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un men�
 * como el que se muestra a continuaci�n:
 *
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
public abstract class Vehiculo {
  
  //atributos de la clase
  private static int vehiculosCreados=0;
  private static int kilometrosTotales=0;
  
  //M�todos de la clase 
  
  /**
   * M�todo de la clase que devolver� el total de kil�metros recorridos
   * @return kilometrosTotales kil�metros total recorridos
   */
  public static int getKilometrosTotal() {
    return Vehiculo.kilometrosTotales;
    }
  
  //atributos de las instancias
  
  private int kilometrosRecorridos;
  
  //Constructor de la clase
  
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }
  
  /**
   * Getter del constructor
   * @return kilometrosRecorridos
   */
  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

   /**
    * M�todo para obtener el total de km de cada veh�culo por separado (coche u bicicleta) y el total de km de los veh�culos.
    * @param kilometros N�mero de km introducidos por teclado.
    */
  public void recorrer(int kilometros) {
    this.kilometrosRecorridos+=kilometros;
    Vehiculo.kilometrosTotales +=kilometros;
  }
  
  
  
}
