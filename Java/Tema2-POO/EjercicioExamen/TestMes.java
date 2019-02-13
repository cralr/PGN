package EjercicioExamen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Test para probar la clase Mes.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class TestMes {
   public static void main(String[] args) throws ParseException {
    Scanner entrada = new Scanner (System.in);
    int opcion;
    Date fecha = null;
  
    do {
      //Menu para elegir una opción
      System.out.println("----Menu Mes----");
      System.out.println("1º)Introducir Fecha.");
      System.out.println("2º)Sumar días.");
      System.out.println("3º)Restar días.");
      System.out.println("4º)Mostrar fechas.");
      System.out.println("5º)Comparar fechas.");
      System.out.println("6º)Terminar.");
    
      System.out.println("Introduzca una opción entre 1 y 5: ");
      opcion = entrada.nextInt();
    
    
      switch(opcion) {
        case 1:
            System.out.println("Ingrese la fecha de modo(dd/mm/aaaa)");
            String fechaString = entrada.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fecha = sdf.parse(fechaString);
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fecha);
          break;
        /*case 2:
            System.out.println("Introduce el número de días a sumar a la fecha");
            int dia=entrada.nextInt();
            f1.sumarDias(dia);
            System.out.println();
          break;
        case 3:
            System.out.println("Introduce el número de días a restar a la fecha");
            dia=entrada.nextInt();
            f1.restarDias(dia);
            System.out.println();
          break;*/
        case 4:
          System.out.println(fecha);
          break;
        case 5:
          
        break;
        default:
          System.out.println("Fin del Programa");
      }
    }while(opcion!=5);
   }
}

/*
 * Método para sumar días a la fecha
 * 
 * @param dia Es el número de días a sumar.
 */
/*
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
/*
public void restarDias(int dia) {
  if (dia < 0) {
    fecha.add(Calendar.DAY_OF_MONTH, dia);
  } else {
    System.out.println("Éste apartado es para restar días.");
  }
}*/