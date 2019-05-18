package Ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * 6. Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero.
 * 
 * Componentes gráficos:
 * 
 * Etiquetas. 
 * Fichero a comprobar. 
 * Caja de texto con resultado. 
 * Botón calcular.
 *
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Ejercicio6 {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio6 window = new Ejercicio6();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ejercicio6() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
