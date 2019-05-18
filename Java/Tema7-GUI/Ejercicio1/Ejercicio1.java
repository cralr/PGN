package Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 1. Calcular el perímetro y área de un rectángulo dada su base y su altura.
 * 
 * Componentes gráficos:
 * 
 * Etiquetas. 
 * Cajas de texto para base y altura. 
 * Botón para calcular. 
 * Caja de texto resultado.
 * 
 * No utilizar asistente.
 *
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Ejercicio1 {

  public static void main(String[] args) {
  
    rectangulo rectangulo1=new rectangulo();
    rectangulo1.setVisible(true);
    rectangulo1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}

class rectangulo extends JFrame{
  
  public rectangulo() {
    super("Ejercicio1");
    setSize(400, 300);
    setResizable(false);
    setLayout(new FlowLayout());
    Container cp = getContentPane();
    cp.add(new JLabel("Base :"));
    JTextField base = new JTextField(30);
    cp.add(base);
    cp.add(new JLabel("Altura :"));
    JTextField altura = new JTextField(30);
    cp.add(altura);
    JButton botonCalcular = new JButton("Calcular Perímetro");
    cp.add(botonCalcular);
    JTextField resultado = new JTextField(30);

    botonCalcular.addActionListener(new BotonCalcular(base,altura,resultado));
    
    cp.add(new JLabel ("Resultado:"));
    cp.add(resultado);

  }
}

class BotonCalcular implements ActionListener {
  private JTextField cuadroBase;
  private JTextField cuadroAltura;
  JTextField cajaResultado;
  
  public BotonCalcular(JTextField cuadroBase,JTextField cuadroAltura,JTextField cajaResultado) {
    this.cuadroBase = cuadroBase;
    this.cuadroAltura=cuadroAltura;
    this.cajaResultado=cajaResultado;
  }

  public void actionPerformed(ActionEvent e) {
    int base = Integer.parseInt(cuadroBase.getText());
    int altura = Integer.parseInt(cuadroAltura.getText());
    int perimetro = (2*(base+altura));
    cajaResultado.setText(Integer.toString(perimetro));
  }
}

