package EjercicioExamen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Test para probar la clase Mes.
 *
 * @author Rafael Miguel Cruz �lvarez
 * @version 1.0
 */

public class TestMes {
   public static void main(String[] args) throws ParseException {
    Scanner entrada = new Scanner (System.in);
    int opcion;
    Date fecha = null;
  
    do {
      //Menu para elegir una opci�n
      System.out.println("----Menu Mes----");
      System.out.println("1�)Introducir Fecha.");
      System.out.println("2�)Sumar d�as.");
      System.out.println("3�)Restar d�as.");
      System.out.println("4�)Mostrar fechas.");
      System.out.println("5�)Comparar fechas.");
      System.out.println("6�)Terminar.");
    
      System.out.println("Introduzca una opci�n entre 1 y 5: ");
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
            System.out.println("Introduce el n�mero de d�as a sumar a la fecha");
            int dia=entrada.nextInt();
            f1.sumarDias(dia);
            System.out.println();
          break;
        case 3:
            System.out.println("Introduce el n�mero de d�as a restar a la fecha");
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
 * M�todo para sumar d�as a la fecha
 * 
 * @param dia Es el n�mero de d�as a sumar.
 */
/*
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
/*
public void restarDias(int dia) {
  if (dia < 0) {
    fecha.add(Calendar.DAY_OF_MONTH, dia);
  } else {
    System.out.println("�ste apartado es para restar d�as.");
  }
}*/