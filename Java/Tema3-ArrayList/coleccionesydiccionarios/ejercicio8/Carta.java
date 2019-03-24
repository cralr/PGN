package coleccionesydiccionarios.ejercicio8;

/**
 *Clase carta para el ejericio 8.
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class Carta implements Comparable<Carta>{

   private Palo palo;
   private Figura figura;
   
   public Carta(Figura figura, Palo palo) {
     setFigura(figura);
     setPalo(palo);
   }
  
  /**
   * @return the palo
   */
  public Palo getPalo() {
    return palo;
  }
  
  /**
   * @param palo the palo to set
   */
  private void setPalo(Palo palo) {
    this.palo = palo;
  }

  /**
   * @return the figura
   */
  public Figura getFigura() {
    return figura;
  }

  /**
   * @param figura the figura to set
   */
  private void setFigura(Figura figura) {
    this.figura = figura;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Carta [palo=" + palo + ", figura=" + figura + "]";
  }

  @Override
  public int compareTo(Carta carta) {
    if(palo.equals(carta.getPalo())) {
      return figura.compareTo(carta.getFigura());
    }else {
      return palo.compareTo(carta.getPalo());
    }
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((figura == null) ? 0 : figura.hashCode());
    result = prime * result + ((palo == null) ? 0 : palo.hashCode());
    return result;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (figura != other.figura)
      return false;
    if (palo != other.palo)
      return false;
    return true;
  }
  
  
  

}
