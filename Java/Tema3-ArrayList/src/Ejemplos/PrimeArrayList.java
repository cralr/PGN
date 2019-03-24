package Ejemplos;

import java.util.ArrayList;

public class PrimeArrayList {
  
  public static void main(String[] args) {
    
    ArrayList<String> color = new ArrayList<String>();
    
    System.out.println("N� de elementos: "+color.size());
    
    System.out.println("A�adimos 3 colores.");
    color.add("rojo");
    color.add("verde");
    color.add("azul");
    
    System.out.println("N� de elementos: "+color.size());

    System.out.println("A�adimos 1 color m�s.");
    color.add("blanco");
    
    System.out.println("N� de elementos: "+color.size()+"\n");
    System.out.println("Estos son los colores: \n" +color);

    System.out.println("\nEl elemento que hay en la posici�n 0 es: "+ color.get(0));
    System.out.println("El elemento que hay en la posici�n 3 es: "+ color.get(3)+"\n");

    //Cambiar elementos de posici�n.
    System.out.println("Cambio de posici�n entre el color rojo y blanco.");
    int posBlanco = color.indexOf("blanco");
    int posRojo = color.indexOf("rojo");
    System.out.println(posBlanco);
    color.set(posBlanco, "rojo");
    color.set(posRojo, "blanco");
    System.out.println(color);
  }
    
}
