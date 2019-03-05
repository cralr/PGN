package Terminal;

import java.text.DecimalFormat;

/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una
 * tarifa que puede ser "rata", "mono" o "bisonte". El coste por minuto es de 6,
 * 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que el total tarificado
 * aparezca con dos decimales, puedes utilizar DecimalFormat. Contenido del main
 *
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */


public class Movil extends Terminal{

  private String tarifa;
  private double totalTarifa;
  
  public Movil(String numero,String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.totalTarifa = 0;
  }
  
  @Override
  public void llamar(Terminal t, int tiempo) {
    super.llamar(t, tiempo);
    double minutos = (double) tiempo/60;
    
    switch (this.tarifa) {
      case "rata":
        this.totalTarifa += minutos*0.06;
        break;
      case "mono":
        this.totalTarifa+=minutos*0.12;
        break;
      case "bisonte":
        this.totalTarifa+=minutos*0.30;
        break;
    }
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    DecimalFormat formateador = new DecimalFormat("0.00");
    return super.toString()+" - tarificados "+formateador.format(this.totalTarifa)+" euros";
  }
  
  
  
}
