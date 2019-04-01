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
   public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int opcion;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
    Calendar calendario1 = Calendar.getInstance();
    Calendar calendario2 = Calendar.getInstance();
    int diaSumRes;
    String fecha="";
    
    do {
      mostrarMenu();
      System.out.println("Introduzca una opción entre 1 y 5: ");
      opcion = entrada.nextInt();
    
    
      switch(opcion) {
        case 1:
            calendario1 = Verifica();
            fecha=sdf.format(calendario1.getTime());
          break;
        case 2:
            if (fecha == "") {
              System.out.println("No hay fecha, introduzca una.");
            }
            else {
              System.out.println("Introduce los días a sumar.");
              diaSumRes = entrada.nextInt();
              calendario1.add(Calendar.DATE, diaSumRes);
              System.out.println("La fecha es: "+ sdf.format(calendario1.getTime()));
            }
          break;
        case 3:
          if (fecha == "") {
            System.out.println("No hay fecha, introduzca una.");
          }
          else {
            System.out.println("Introduce los días a restar.");
            diaSumRes = entrada.nextInt();
            calendario1.add(Calendar.DATE, -diaSumRes);
            System.out.println("La fecha es: "+ sdf.format(calendario1.getTime()));
          }
          break;
        case 4:
          if (fecha == "") {
            System.out.println("No hay fecha, introduzca una.");
          }else {
            System.out.println("Comparamos dos fechas: La guardada y la introducida.");
            calendario2 = Verifica();
            
            if (calendario1.compareTo(calendario2)>0){
                System.out.println("La fecha guardada es mayor que la introducida.");
            }else {
                System.out.println("La fecha guardada es menor que la introducida.");
            }
          }
          break;
        case 5:
            if (fecha == "") {
              System.out.println("No hay Fecha, introduzca una.");
            }else {
              System.out.println("La fecha guardada es: " + sdf.format(calendario1.getTime()));
            }
        break;
        default:
          System.out.println("Fin del Programa");
      }
    }while(opcion!=5);
   }


  public static void mostrarMenu() {
    //Menu para elegir una opción
    System.out.println("----Menu Mes----");
    System.out.println("1º)Introducir Fecha.");
    System.out.println("2º)Sumar días.");
    System.out.println("3º)Restar días.");
    System.out.println("4º)Comparar Fechas.");
    System.out.println("5º)Mostrar fechas.");
    System.out.println("6º)Terminar.");
  }
  
  public static Calendar Verifica() {
    Scanner s = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calendario = Calendar.getInstance();
    String fecha;
    String verifica;
    
    do {
        System.out.println("Introduzca la fecha: ");        
        fecha = s.nextLine();
        calendario= obtenerFecha(fecha);
        verifica = sdf.format(calendario.getTime());
        
        if (!fecha.equals(verifica)) {
          System.out.println("Fecha mal introducida");
        }
        }while(!fecha.equals(verifica));
    return calendario;
  }
  
  public static Calendar obtenerFecha(String Fecha) {
    Calendar calendario = Calendar.getInstance();
    String[] parts;
    int d,m,y;
    
    if (Fecha.contains("/") && Fecha.length()==10) {
      parts = Fecha.split("/");
      d = Integer.parseInt(parts[0]);
      m = Integer.parseInt(parts[1]);
      y = Integer.parseInt(parts[2]);
      
      switch (m) {
      case 1:
        calendario.set(y, Calendar.JANUARY, d);
        break;
      case 2:
        calendario.set(y, Calendar.FEBRUARY, d);
        break;
      case 3:
        calendario.set(y, Calendar.MARCH, d);
        break;
      case 4:
        calendario.set(y, Calendar.APRIL, d);
        break;
      case 5:
        calendario.set(y, Calendar.MAY, d);
        break;
      case 6:
        calendario.set(y, Calendar.JUNE, d);
        break;
      case 7:
        calendario.set(y, Calendar.JULY, d);
        break;
      case 8:
        calendario.set(y, Calendar.AUGUST, d);
        break;
      case 9:
        calendario.set(y, Calendar.SEPTEMBER, d);
        break;
      case 10:
        calendario.set(y, Calendar.OCTOBER, d);
        break;
      case 11:
        calendario.set(y, Calendar.NOVEMBER, d);
        break;
      case 12:
        calendario.set(y, Calendar.DECEMBER, d);
        break;
      default:
        calendario.set(0, 0, 0);
        break;
      }
    }else {
      calendario.set(0, 0, 0);
    }
    return calendario;
  }
  
  
  
  
  
}