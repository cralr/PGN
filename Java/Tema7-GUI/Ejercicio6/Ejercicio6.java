package Ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

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
  private JTextField textField_palabra;
  private JTextField textField_palabrasEncontradas;

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
    frame.getContentPane().setLayout(null);
    
    JLabel labelFichero = new JLabel("Fichero: ");
    labelFichero.setBounds(44, 34, 113, 14);
    frame.getContentPane().add(labelFichero);
    
    JFileChooser jfcFichero1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfcFichero1.setDialogTitle("Seleccione un fichero...");
    
    JButton boton_fichero = new JButton("Seleccionar Fichero");
    boton_fichero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        int returnValue = jfcFichero1.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfcFichero1.getSelectedFile().getPath() != null)
            boton_fichero.setText("Seleccionado");
      }
    });
    boton_fichero.setBounds(100, 30, 174, 23);
    frame.getContentPane().add(boton_fichero);
    
    JLabel labelPalabra = new JLabel("Palabra: ");
    labelPalabra.setBounds(44, 85, 84, 14);
    frame.getContentPane().add(labelPalabra);
    
    textField_palabra = new JTextField();
    textField_palabra.setBounds(102, 82, 172, 20);
    frame.getContentPane().add(textField_palabra);
    textField_palabra.setColumns(10);
    
    JButton boton_buscar = new JButton("Buscar");
    boton_buscar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          if (textField_palabra.getText() != null && jfcFichero1.getSelectedFile().getPath() != null)
            buscarPalabra(jfcFichero1.getSelectedFile().getPath(), textField_palabra.getText());
          else
            JOptionPane.showMessageDialog(frame, "Introduce la palabra y fichero a buscar.");
        } catch (NullPointerException e1) {
          JOptionPane.showMessageDialog(frame, "Introduce la palabra y el fichero a buscar.", "Error",
              JOptionPane.ERROR_MESSAGE);
          } catch (IOException e1) {
          e1.printStackTrace();
        }
      }
      private void buscarPalabra(String path, String palabra) throws IOException {
        try {
          BufferedReader leer = new BufferedReader(new FileReader(path));
          
          int contador=0;
          String linea = "";
          String contenidoLinea = "";

          while (linea != null) {
            contenidoLinea = linea;
            linea = leer.readLine();
            if (contenidoLinea.equals(palabra)) {
              contador++;
            }
          }

          leer.close();
          textField_palabrasEncontradas.setText(palabra + " se repite " + contador + " veces.");

        } catch (FileNotFoundException | IndexOutOfBoundsException ioe) {
          JOptionPane.showMessageDialog(frame, "No se ha encontrado el fichero", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
          JOptionPane.showMessageDialog(frame, "No se ha podido leer el fichero.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
          JOptionPane.showMessageDialog(frame, "Introduce la palabra a buscar.", "Error", JOptionPane.ERROR_MESSAGE);
          {
          }
        }
      }
    });
    boton_buscar.setBounds(145, 129, 91, 23);
    frame.getContentPane().add(boton_buscar);
    
    textField_palabrasEncontradas = new JTextField();
    textField_palabrasEncontradas.setBounds(100, 179, 174, 20);
    frame.getContentPane().add(textField_palabrasEncontradas);
    textField_palabrasEncontradas.setColumns(10);
  }
}
