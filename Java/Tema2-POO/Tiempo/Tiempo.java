package Tiempo;

/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el m�todo toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Tiempo {

  private int horas;
  private int minutos;
  private int segundos;

  /**
   * Constructor
   * 
   * @param horas
   * @param minutos
   * @param segundos
   */
  public Tiempo(int horas, int minutos, int segundos) {
    if (segundos >= 59) {
      minutos += segundos / 60;
      segundos = segundos % 60;
    }
    if (minutos >= 60) {
      horas += minutos / 60;
      minutos = minutos % 60;
    }

    setHoras(horas);
    setMinutos(minutos);
    setSegundos(segundos);
  }

  /**
   * @return the horas
   */
  public int getHoras() {
    return horas;
  }

  /**
   * @param horas the horas to set
   */
  public void setHoras(int horas) {
    this.horas = horas;
  }

  /**
   * @return the minutos
   */
  public int getMinutos() {
    return minutos;
  }

  /**
   * @param minutos the minutos to set
   */
  public void setMinutos(int minutos) {
    this.minutos = minutos;
    while (this.minutos >= 60) {
      this.minutos -= 60;
      this.horas++;
    }
  }

  /**
   * @return the segundos
   */
  public int getSegundos() {
    return segundos;
  }

  /**
   * @param segundos the segundos to set
   */
  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }

  /**
   * Suma 2 rangos de tiempo
   * 
   * @param horas
   * @param minutos
   * @param segundos
   */
  public void sumar(int horas, int minutos, int segundos) {
    this.segundos += segundos;
    while (this.segundos >= 60) {
      this.segundos -= 60;
      this.minutos++;
    }
    this.minutos += minutos;
    while (this.minutos >= 60) {
      this.minutos -= 60;
      this.horas++;
    }
    this.horas += horas;
  }

  /**
   * Suma 2 rangos de tiempo
   * 
   * @param t
   */
  public void sumar(Tiempo t) {
    this.sumar(t.getHoras(), t.getMinutos(), t.getSegundos());
  }

  /**
   * Resta 2 rangos de tiempo
   * 
   * @param horas
   * @param minutos
   * @param segundos
   */
  public void restar(int horas, int minutos, int segundos) {
    this.segundos -= segundos;
    if (this.segundos < 0) {
      this.segundos += 60;
      this.minutos--;
    }
    this.minutos -= minutos;
    if (this.minutos < 0) {
      this.minutos += 60;
      this.horas--;
    }
    this.horas -= horas;
  }

  /**
   * Resta 2 rangos de tiempo
   * 
   * @param t
   */
  public void restar(Tiempo t) {
    this.restar(t.getHoras(), t.getMinutos(), t.getSegundos());
  }

  @Override
  public String toString() {
    return horas + "h " + minutos + "m " + segundos + "s";
  }

}
