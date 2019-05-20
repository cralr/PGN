package Ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;

/**
 * 
 * 5. Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de
 * los primeros dos ficheros mezcladas, es decir, la primera línea será del
 * primer fichero, la segunda será del segundo fichero, la tercera será la
 * siguiente del primer fichero, etc.
 * 
 * Componentes gráficos:
 * 
 * Etiquetas. 
 * Fichero origen y destino. 
 * Botón para ejecutar la acción. 
 * Caja de texto con el contenido del fichero destino no editable.
 * 
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Ejercicio5 extends JFrame {

  private JPanel contentPane;
  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio5 frame = new Ejercicio5();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Ejercicio5() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblFichero1 = new JLabel("Fichero 1:");
    lblFichero1.setBounds(53, 53, 76, 14);
    contentPane.add(lblFichero1);

    JLabel labelFichero2 = new JLabel("Fichero 2:");
    labelFichero2.setBounds(53, 104, 76, 14);
    contentPane.add(labelFichero2);

    JFileChooser jfcFichero1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfcFichero1.setDialogTitle("Seleccione un fichero...");

    JButton button_fichero1 = new JButton("Seleccione un fichero");
    button_fichero1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        int returnValue = jfcFichero1.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfcFichero1.getSelectedFile().getPath() != null)
            button_fichero1.setText("Seleccionado");
      }
    });
    button_fichero1.setBounds(139, 49, 151, 23);
    contentPane.add(button_fichero1);

    JFileChooser jfcFichero2 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfcFichero2.setDialogTitle("Seleccione un fichero...");

    JButton button_fichero2 = new JButton("Seleccione un fichero");
    button_fichero2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int returnValue = jfcFichero2.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfcFichero2.getSelectedFile().getPath() != null)
            button_fichero2.setText("Seleccionado");
      }
    });
    button_fichero2.setBounds(139, 100, 151, 23);
    contentPane.add(button_fichero2);

    JButton btnNewButton = new JButton("Guardar nuevo Fichero");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          BufferedReader br1 = new BufferedReader(new FileReader(jfcFichero1.getSelectedFile().getPath()));
          BufferedReader br2 = new BufferedReader(new FileReader(jfcFichero2.getSelectedFile().getPath()));
          BufferedWriter bw = new BufferedWriter(new FileWriter("Ejercicio5.txt"));
          Vector<String> escritura = new Vector<String>();

          String linea = "";
          while (linea != null) {
            linea = br1.readLine();
            if (linea != null)
              escritura.addElement(linea);

            linea = br2.readLine();
            if (linea != null)
              escritura.addElement(linea);
          }

          for (String s : escritura) {
            bw.write(s + "\n");
          }

          br1.close();
          br2.close();
          bw.close();

          JOptionPane.showMessageDialog(frame, "Fichero guardado con éxito");

        } catch (IOException | NullPointerException ioe) {
          JOptionPane.showMessageDialog(frame, "No ha seleccionado todos los ficheros.", "Error",
              JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    btnNewButton.setBounds(139, 161, 167, 23);
    contentPane.add(btnNewButton);
  }
}
