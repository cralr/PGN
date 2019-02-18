/**
 * 
 */
package Tiempo;

import java.util.Calendar;

/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Tiempo {
//atributos
 Calendar calendario;

 /**
  * Constructor
  */
 public Tiempo() {
   calendario = Calendar.getInstance();
 }

 
 /*
  * Método para sumar horas, minutos y segundos.
  * 
  * @param horas, minutos y segundos pasados por parámetros.
  */

 public void sumarTiempo(int horas, int minutos, int segundos) {
   if (horas > 0 && minutos >0 && segundos>0) {
     calendario.add(Calendar.SECOND, segundos);
     calendario.add(Calendar.MINUTE, minutos);
     calendario.add(Calendar.HOUR_OF_DAY, horas);
   } else {
     System.out.println("Éste apartado es para sumar horas, minutos y segundos.");
   }
 }

 /*
  * Método para sumar horas, minutos y segundos.
  * 
  * @param horas, minutos y segundos pasados por parámetros.
  */

 public void restarTiempo(int horas, int minutos, int segundos) {
   if (horas < 0 && minutos < 0 && segundos < 0) {
     calendario.add(Calendar.SECOND, segundos);
     calendario.add(Calendar.MINUTE, minutos);
     calendario.add(Calendar.HOUR_OF_DAY, horas);
   } else {
     System.out.println("Éste apartado es para restar horas, minutos y segundos.");
   }
 }

 @Override
 public String toString() {
   return calendario.get(Calendar.HOUR_OF_DAY) + "h " + calendario.get(Calendar.MINUTE) + "m "
       + calendario.get(Calendar.SECOND) + "s";
 }

}
