/**
 * 
 */
package Vehiculo;

/**
 * Crea la clase Vehiculo, as� como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreados y kilometrosTotales, as� como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
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
 *Elige una opción (1-8):
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public abstract class Vehiculo {
  
  //atributos de la clase
  private static int vehiculosCreados=0;
  private static int kilometrosTotales=0;
  
  //M�todos de la clase 
  
  /**
   * Método de la clase que devuelve el total de kilómetros recorridos
   * @return kilometrosTotales kilómetros total recorridos
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
    * M�todo para obtener el total de km de cada vehículo por separado (coche u bicicleta) y el total de km de los vehículos.
    * @param kilometros Número de km introducidos por teclado.
    */
  public void recorrer(int kilometros) {
    this.kilometrosRecorridos+=kilometros;
    Vehiculo.kilometrosTotales +=kilometros;
  }
  
  
  
}
