package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 2. Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos
 * puntos en el plano. Calcula y muestra la distancia entre ellos.
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

public class Ejercicio2 {

  public static void main(String[] args) {

    punto punto1 = new punto();
    punto1.setVisible(true);
    punto1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}

class punto extends JFrame {

  public punto() {
    super("Ejercicio2");
    setSize(400, 300);
    setLayout(new FlowLayout());
    Container cp = getContentPane();
    cp.add(new JLabel("x1 :"));
    JTextField x1 = new JTextField(10);
    cp.add(x1);
    cp.add(new JLabel("x2 :"));
    JTextField x2 = new JTextField(10);
    cp.add(x2);
    cp.add(new JLabel("y1 :"));
    JTextField y1 = new JTextField(10);
    cp.add(y1);
    cp.add(new JLabel("y2 :"));
    JTextField y2 = new JTextField(10);
    cp.add(y2);
    JButton botonCalcular = new JButton("Calcular Distancia");
    cp.add(botonCalcular);
    JTextField resultado = new JTextField(30);

    botonCalcular.addActionListener(new BotonCalcular(x1,x2,y1,y2,resultado));
    cp.add(new JLabel ("Resultado:"));
    cp.add(resultado);
  }
}

class BotonCalcular implements ActionListener {
  private JTextField cuadroX1;
  private JTextField cuadroX2;
  private JTextField cuadroY1;
  private JTextField cuadroY2;
  JTextField cajaResultado;


  public BotonCalcular(JTextField cuadroX1, JTextField cuadroX2,JTextField cuadroY1,JTextField cuadroY2,JTextField cajaResultado) {
    this.cuadroX1 = cuadroX1;
    this.cuadroX2 = cuadroX2;
    this.cuadroY1 = cuadroY1;
    this.cuadroY2 = cuadroY2;
    this.cajaResultado=cajaResultado;
  }

  public void actionPerformed(ActionEvent e) {
    double x1 = Double.parseDouble(cuadroX1.getText());
    double x2 = Double.parseDouble(cuadroX2.getText());
    double y1 = Double.parseDouble(cuadroY1.getText());
    double y2 = Double.parseDouble(cuadroY2.getText());
    double distancia = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
    cajaResultado.setText(Double.toString(distancia));
  }
}