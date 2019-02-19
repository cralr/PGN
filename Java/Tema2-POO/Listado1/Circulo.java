/**
 * 
 */
package Listado1;
//miauuuuuuuuuuuuuuuuuu
import javax.swing.JOptionPane;

/**
 *
 * 2. Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * 
 * Un círculo puede crecer: Aumenta su radio. Un círculo puede menguar:
 * Decrementa su radio. Un círculo me devuelve su área si se la pido. Un círculo
 * me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros. Ocupo un
 * área de 0.7853981633974483 metros cuadrados” (método toString())
 * 
 * 4. Modifica la clase Círculo para que cuando el radio se convierta a 0 el
 * círculo reaccione y diga con una caja de texto gráfica “Soy un mísero punto
 * sin área” usando la clase JOptionPane del paquete javax.swing. Podéis ver
 * este vídeo: https://youtu.be/F_48qh3BcDs
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Circulo {

  //atributos
  private double radio;
  
  //Constructor
  public Circulo(double radio) {
    setRadio(radio);
  }

  
  private void setRadio(double radio) {
    this.radio = radio;
    if (radio<0) {
      System.out.println("El radio no puede ser negativo, se le asigna 1.");
      this.radio=1;
    }
    else if(radio==0) {
      System.out.println(JOptionPane.showInputDialog("Soy un mísero punto sin área"));
    }
  }
  
  public double getRadio() {
    return radio;
  }

  public double getArea() {
    return Math.PI*Math.pow(radio, 2);
  }
  
  public void incrementar(int num){
    //this.radio= radio + num;
    setRadio(getRadio()+num);
  }
  
  public void decrementar(int num){
    //this.radio = radio - num;
    setRadio(getRadio()-num);
  }

  @Override
  public String toString() {
    return "Soy un Circulo de radio "+getRadio()+" metros. Ocupo un área de "+getArea()+" metros cuadrados.";
  }
}
