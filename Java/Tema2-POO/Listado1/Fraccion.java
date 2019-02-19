/**
 * 
 */
package Listado1;

/**
 * Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador. 
 * Obtener la fracción. 
 * Obtener y modificar numerador y denominador. No se puede dividir por cero. 
 * Obtener resultado de la fracción(número real). 
 * Multiplicar la fracción por un número. 
 * Multiplicar, sumar y restar fracciones. 
 * Simplificar la fracción.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Fraccion {
  
  //atributos
  private double numerador;
  private double denominador;
  
  /**
   * Constructor de la clase Fraccion
   * @param numerador
   * @param denominador
   */
  
  public Fraccion(double numerador, double denominador) {
    setNumerador(numerador);
    setDenominador(denominador);
  }
  
  /**
   * Método getter del numerador
   * @return numerador 
   */
  public double getNumerador() {
    return numerador;
  }
  
  /** 
   * Método setter para numerador
   * @param numerador
   */
  public void setNumerador(double numerador) {
    this.numerador = numerador;
  }
  
  /**
   * Método getter del denominador
   * @return numerador 
   */
  public double getDenominador() {
    return denominador;
  }
  
  /**
   * Método setter del denominador en el que controlamos que el denominador no sea 0.
   * @param denominador
   */
  public void setDenominador(double denominador) {
    this.denominador = denominador;
    if (denominador == 0) {
      System.out.println("El denominador no puede ser 0, se le asigna 1.");
      this.denominador = 1;
    }
    else {
      this.denominador=denominador;
    }
  }
  
  /**
   * Método para obtener el valor real de la fracción
   * @return el valor del real
   */
  public double obtenerReal() {
    return this.numerador/this.denominador;
  }
  
  /**
   * Método para multiplicar la fracción por un número entero 
   * @param num numero entero a multiplicar
   */
  public void multiplicarPorEntero(int num) {
    this.numerador = numerador*num;
    this.denominador = denominador * 1;
    
  }
  
  /**
   * Multiplicar dos fracciones 
   * @param fraccion1 
   * @param fraccion2
   */
  public Fraccion  multiplicarFracciones(Fraccion fraccion1, Fraccion fraccion2) {
    double n; 
    double d;
    n=fraccion1.getNumerador()* fraccion2.getNumerador();
    d=fraccion1.getDenominador()* fraccion2.getDenominador();
    Fraccion fraccion3 = new Fraccion(n,d);
    return fraccion3;
    
  }
  
  /**
   * Sumar dos fracciones
   * @param fraccion1 
   * @param fraccion2
   * @return resultado de la resta de las fracciones
   */
  public String sumar(Fraccion fraccion1, Fraccion fraccion2) {
    double auxNum = fraccion1.getNumerador() * fraccion2.getDenominador();
    double auxDen = fraccion2.getNumerador() * fraccion1.getDenominador();
    double auxDivisor = fraccion1.getDenominador() * fraccion2.getDenominador();
    return ("La suma de las fracciones es: "+(int)(auxNum + auxDen) + "/" + (int)auxDivisor);
  }
  
  /**
   * Restar dos fracciones
   * @param fraccion1 
   * @param fraccion2
   * @return resultado de la resta de las fracciones
   */
  public String restar(Fraccion fraccion1, Fraccion fraccion2) {
    double auxNum = fraccion1.getNumerador() * fraccion2.getDenominador();
    double auxDen = fraccion2.getNumerador() * fraccion1.getDenominador();
    double auxDivisor = fraccion1.getDenominador() * fraccion2.getDenominador();
    return ("La resta de las fracciones es: "+(int)(auxNum - auxDen) + "/" + (int)auxDivisor);
  }
  
  /**
   * Método para hallar el mcd de una fracción
   * @return divisor
   */
  public int hallarMcd() {
    int dividendo=(int) this.numerador;
    int divisor=(int) this.denominador;
    while(dividendo%divisor!=0) {
      int resto = dividendo%divisor;
      dividendo=divisor;
      divisor=resto;
    }
    
    return divisor;
  }
  
  /**
   * Método que simplifica la fracción haciendo llamada al método hallarMCD
   */
  public void simplificarFraccion() {
    int mcd=hallarMcd();
    this.numerador/=mcd;
    this.denominador/=mcd;
  }
  
  @Override
  public String toString() {
    return "La Fracción es: " +(int) this.numerador + "/" + (int)this.denominador;
  }
}
