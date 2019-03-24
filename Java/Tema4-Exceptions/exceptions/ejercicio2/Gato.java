package exceptions.ejercicio2;

/**
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo cual,
 * genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria =
 * garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
 * método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Gato {
  private String color;
  private String raza;
  private String sexo;

  public Gato(String s) {
    this.sexo = s;
  }
  
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public Gato apareaCon(Gato pareja) throws ApareamientoNoPosibleException {
    if (this.sexo.equals(pareja.sexo)) {
      throw new ApareamientoNoPosibleException("No es posible ya que son dos gatos machos.");
    }
    
    String hijo = (int)(Math.random() * 2) ==  0 ? "hembra" : "macho";
    return new Gato(hijo);
  }
  
  @Override
  public String toString() {
    return "Hijo [sexo=" + sexo + "]\n";
}
}
