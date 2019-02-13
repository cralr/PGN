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

public class Coche extends Vehiculo{
  private String color;
  
  public Coche(String color) {
    super();
    setColor(color);
  }
  
   /**
   * Método getter del color
   * @return the color
   */
  public String getColor() {
    return color;
  }



  /**
   * Método setter del color;
   * @param color the color to set
   */
  public void setColor(String color) {
    this.color = color;
  }



  public void quemarRueda() {
    System.out.println("brrrrrr");
  }
}
