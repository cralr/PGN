/**
 * 
 */
package Terminal;

/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Terminal {
  
  
  private String numTelefono;
  private int tiempoLLamada;

  public Terminal(String numero) {
    setNumTelefono(numero);
    this.tiempoLLamada=0;
  }

  /**
   * Método getter del número de teléfono
   * @return the numTelefono
   */
  public String getNumTelefono() {
    return numTelefono;
  }

  /**
   * Método Setter del número de teléfono
   * @param numTelefono the numTelefono to set
   */
  private void setNumTelefono(String numTelefono) {
    this.numTelefono = numTelefono;
  }
  

  /**
   * Método getter del tiempo de llamada
   * @return the tiempoLLamada
   */
  public int getTiempoLLamada() {
    return tiempoLLamada;
  }

  /**
   * * Método setter del tiempo de llamada
   * @param tiempoLLamada the tiempoLLamada to set
   */
  private void setTiempoLLamada(int tiempoLLamada) {
    this.tiempoLLamada = tiempoLLamada;
  }
  
  /**
   * Método llamada entre terminales
   * @param t objeto terminal
   * @param tiempo tiempo empleado en la llamada
   */
  
  public void llamar(Terminal t, int tiempo) {
    this.tiempoLLamada += tiempo; //Acumular el tiempo total que ha hablado con un terminal
    t.tiempoLLamada+=tiempo; //Acumular el tiempo que se le pasa a un terminal como parametro
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "nº "+getNumTelefono()+" - "+getTiempoLLamada()+"s.";
  }
  
  
  
  
  
}
