/**
 * 
 */
package EjercicioExamen;

import java.util.Calendar;

/**
 * Ejercicio del examen en el que usando la clase calendar, hay que sumar dias
 * a una fecha, restar días a una fecha y comparar fechas.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Mes {

  // atributos
  Calendar fecha;

  // Constructor
  public Mes() {
    fecha = Calendar.getInstance();
  }

  /*
   * Método para sumar días a la fecha
   * 
   * @param dia Es el número de días a sumar.
   */

  public void sumarDias(int dia) {
    if (dia > 0) {
      fecha.add(Calendar.DAY_OF_MONTH, dia);
    } else {
      System.out.println("Éste apartado es para sumar días.");
    }
  }

  /*
   * Método para restar días a la fecha
   * 
   * @param dia Es el número de días a restar.
   */

  public void restarDias(int dia) {
    if (dia < 0) {
      fecha.add(Calendar.DAY_OF_MONTH, dia);
    } else {
      System.out.println("Éste apartado es para restar días.");
    }
  }

  @Override
  public String toString() {
    return fecha.get(Calendar.DATE) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR) + ".";
  }

}
