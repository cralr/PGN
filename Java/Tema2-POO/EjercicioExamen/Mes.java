/**
 * 
 */
package EjercicioExamen;

import java.util.Calendar;

/**
 * Ejercicio del examen en el que usando la clase calendar, hay que sumar dias
 * a una fecha, restar d�as a una fecha y comparar fechas.
 * 
 * @author Rafael Miguel Cruz �lvarez
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
   * M�todo para sumar d�as a la fecha
   * 
   * @param dia Es el n�mero de d�as a sumar.
   */

  public void sumarDias(int dia) {
    if (dia > 0) {
      fecha.add(Calendar.DAY_OF_MONTH, dia);
    } else {
      System.out.println("�ste apartado es para sumar d�as.");
    }
  }

  /*
   * M�todo para restar d�as a la fecha
   * 
   * @param dia Es el n�mero de d�as a restar.
   */

  public void restarDias(int dia) {
    if (dia < 0) {
      fecha.add(Calendar.DAY_OF_MONTH, dia);
    } else {
      System.out.println("�ste apartado es para restar d�as.");
    }
  }

  @Override
  public String toString() {
    return fecha.get(Calendar.DATE) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR) + ".";
  }

}
