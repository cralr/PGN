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

public class Coche extends Vehiculo{
  private String color;
  
  public Coche(String color) {
    super();
    setColor(color);
  }
  
   /**
   * M�todo getter del color
   * @return the color
   */
  public String getColor() {
    return color;
  }



  /**
   * M�todo setter del color;
   * @param color the color to set
   */
  public void setColor(String color) {
    this.color = color;
  }



  public void quemarRueda() {
    System.out.println("brrrrrr");
  }
}
