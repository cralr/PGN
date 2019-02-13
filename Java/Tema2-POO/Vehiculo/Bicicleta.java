/**
 * 
 */
package Vehiculo;

/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreados y kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 * 
 * @author Rafael Miguel Cruz Álvarez
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