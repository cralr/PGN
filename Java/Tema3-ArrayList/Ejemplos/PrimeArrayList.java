package Ejemplos;

import java.util.ArrayList;

public class PrimeArrayList {
  
  public static void main(String[] args) {
    
    ArrayList<String> color = new ArrayList<String>();
    
    System.out.println("Nº de elementos: "+color.size());
    
    System.out.println("Añadimos 3 colores.");
    color.add("rojo");
    color.add("verde");
    color.add("azul");
    
    System.out.println("Nº de elementos: "+color.size());

    System.out.println("Añadimos 1 color más.");
    color.add("blanco");
    
    System.out.println("Nº de elementos: "+color.size()+"\n");
    System.out.println("Estos son los colores: \n" +color);

    System.out.println("\nEl elemento que hay en la posición 0 es: "+ color.get(0));
    System.out.println("El elemento que hay en la posición 3 es: "+ color.get(3)+"\n");

    //Cambiar elementos de posición.
    System.out.println("Cambio de posición entre el color rojo y blanco.");
    int posBlanco = color.indexOf("blanco");
    int posRojo = color.indexOf("rojo");
    color.set(posBlanco, "rojo");
    color.set(posRojo, "blanco");
    System.out.println(color);
  }
    
}
