/**
 * 
 */
package Listado1;

import javax.swing.JOptionPane;

/**
 *
 * 2. Crea la clase �Circulo� en Java que responda al siguiente comportamiento:
 * 
 * Un c�rculo puede crecer: Aumenta su radio. Un c�rculo puede menguar:
 * Decrementa su radio. Un c�rculo me devuelve su �rea si se la pido. Un c�rculo
 * me dice su estado, por ejemplo �Soy un c�rculo de radio 0.5 metros. Ocupo un
 * �rea de 0.7853981633974483 metros cuadrados� (m�todo toString())
 * 
 * 4. Modifica la clase C�rculo para que cuando el radio se convierta a 0 el
 * c�rculo reaccione y diga con una caja de texto gr�fica �Soy un m�sero punto
 * sin �rea� usando la clase JOptionPane del paquete javax.swing. Pod�is ver
 * este v�deo: https://youtu.be/F_48qh3BcDs
 * 
 * @author Rafael Miguel Cruz �lvarez
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
      System.out.println(JOptionPane.showInputDialog("Soy un m�sero punto sin �rea"));
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
    return "Soy un Circulo de radio "+getRadio()+" metros. Ocupo un �rea de "+getArea()+" metros cuadrados.";
  }
}
