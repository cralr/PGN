package Ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 3. Pide un DNI y comprueba que es correcto, será correcto si tiene 9
 * caracteres y la letra es correcta.
 *
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Ejercicio3 {

  private JFrame frame;
  private JTextField textField_dni;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio3 window = new Ejercicio3();
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
  public Ejercicio3() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel label_dni = new JLabel("DNI:");
    label_dni.setBounds(47, 69, 46, 14);
    frame.getContentPane().add(label_dni);
    
    textField_dni = new JTextField();
    textField_dni.setBounds(103, 66, 120, 20);
    frame.getContentPane().add(textField_dni);
    textField_dni.setColumns(10);
    
    JButton button_comprobarDni = new JButton("Comprobar DNI");
    button_comprobarDni.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        comprobarDNI();
      }

      private void comprobarDNI() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni = textField_dni.getText();
        if (dni.length() == 9) {
          int numeroDni = Integer.parseInt(dni.substring(0, 8));
          char letraDni = dni.toUpperCase().charAt(8);
          if (letraDni == letras.charAt(numeroDni % 23)) {
            JOptionPane.showMessageDialog(frame, "El DNI es válido");
          }
        } else {
          JOptionPane.showMessageDialog(frame, "El DNI no es válido", "Error", JOptionPane.ERROR_MESSAGE);
}
      }
      
    });
    button_comprobarDni.setBounds(103, 116, 120, 23);
    frame.getContentPane().add(button_comprobarDni);
  }
}
