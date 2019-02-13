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
 * @author Rafael Miguel Cruz �lvarez
 * @version 1.0
 */

public class Bicicleta extends Vehiculo{
  private String tipoFrenos;
  
  public Bicicleta(String frenos) {
    super();
    this.tipoFrenos=frenos;
  }
  
  public void hacerCaballito() {
    System.out.println("Mira como levanto la bicicleta");
  }
}