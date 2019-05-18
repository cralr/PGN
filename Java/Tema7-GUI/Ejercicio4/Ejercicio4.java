package Ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 4. Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de
 * forma "ideal"; es decir, con el menor número de billetes y monedas posibles.
 * 
 * Componentes gráficos:
 * 
 * Etiquetas. Caja de texto para introducir dinero a cambiar. Cajas de texto
 * para billetes y monedas. Botón para calcular.
 * 
 * Opcional: sustituir la etiqueta de cada billete y moneda por su imagen.
 *
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */

public class Ejercicio4 {

  private JFrame frame;
  private JTextField textField_dinero;
  private JTextField textField_billete500;
  private JTextField textField_billete200;
  private JTextField textField_billete100;
  private JTextField textField_billete50;
  private JTextField textField_billete20;
  private JTextField textField_billete10;
  private JTextField textField_billete5;
  private JTextField textField_moneda2;
  private JTextField textField_moneda1;
  private JTextField textField_moneda50;
  private JTextField textField_moneda20;
  private JTextField textField_moneda10;
  private JTextField textField_moneda05;
  private JTextField textField_moneda02;
  private JTextField textField_moneda01;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio4 window = new Ejercicio4();
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
  public Ejercicio4() {
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
    
    JLabel lblDinero = new JLabel("Dinero: ");
    lblDinero.setBounds(81, 14, 46, 14);
    frame.getContentPane().add(lblDinero);
    
    textField_dinero = new JTextField();
    textField_dinero.setBounds(145, 11, 107, 20);
    frame.getContentPane().add(textField_dinero);
    textField_dinero.setColumns(10);
    
    JLabel lblBillete500 = new JLabel("Billete 500: ");
    lblBillete500.setBounds(25, 68, 86, 14);
    frame.getContentPane().add(lblBillete500);
    
    textField_billete500 = new JTextField();
    textField_billete500.setBounds(81, 65, 86, 20);
    frame.getContentPane().add(textField_billete500);
    textField_billete500.setColumns(10);
    
    JLabel lblBillete200 = new JLabel("Billete 200: ");
    lblBillete200.setBounds(25, 89, 86, 14);
    frame.getContentPane().add(lblBillete200);
    
    textField_billete200 = new JTextField();
    textField_billete200.setColumns(10);
    textField_billete200.setBounds(81, 86, 86, 20);
    frame.getContentPane().add(textField_billete200);
    
    JLabel lblBillete100 = new JLabel("Billete 100: ");
    lblBillete100.setBounds(25, 117, 86, 14);
    frame.getContentPane().add(lblBillete100);
    
    JLabel lblBillete50 = new JLabel("Billete 50: ");
    lblBillete50.setBounds(25, 142, 86, 14);
    frame.getContentPane().add(lblBillete50);
    
    textField_billete100 = new JTextField();
    textField_billete100.setColumns(10);
    textField_billete100.setBounds(81, 114, 86, 20);
    frame.getContentPane().add(textField_billete100);
    
    textField_billete50 = new JTextField();
    textField_billete50.setColumns(10);
    textField_billete50.setBounds(81, 142, 86, 20);
    frame.getContentPane().add(textField_billete50);
    
    JLabel lblBillete20 = new JLabel("Billete 20: ");
    lblBillete20.setBounds(25, 167, 86, 14);
    frame.getContentPane().add(lblBillete20);
    
    textField_billete20 = new JTextField();
    textField_billete20.setColumns(10);
    textField_billete20.setBounds(81, 167, 86, 20);
    frame.getContentPane().add(textField_billete20);
    
    JLabel lblBillete10 = new JLabel("Billete 10: ");
    lblBillete10.setBounds(25, 192, 86, 14);
    frame.getContentPane().add(lblBillete10);
    
    JLabel lblBillete5 = new JLabel("Billete 5: ");
    lblBillete5.setBounds(25, 217, 86, 14);
    frame.getContentPane().add(lblBillete5);
    
    JLabel lblMoneda2 = new JLabel("Moneda 2: ");
    lblMoneda2.setBounds(177, 68, 86, 14);
    frame.getContentPane().add(lblMoneda2);
    
    JLabel lblMoneda1 = new JLabel("Moneda 1:");
    lblMoneda1.setBounds(177, 89, 86, 14);
    frame.getContentPane().add(lblMoneda1);
    
    JLabel lblMoneda50 = new JLabel("Moneda 0.5:");
    lblMoneda50.setBounds(177, 117, 86, 14);
    frame.getContentPane().add(lblMoneda50);
    
    textField_billete10 = new JTextField();
    textField_billete10.setColumns(10);
    textField_billete10.setBounds(81, 192, 86, 20);
    frame.getContentPane().add(textField_billete10);
    
    textField_billete5 = new JTextField();
    textField_billete5.setColumns(10);
    textField_billete5.setBounds(81, 214, 86, 20);
    frame.getContentPane().add(textField_billete5);
    
    textField_moneda2 = new JTextField();
    textField_moneda2.setColumns(10);
    textField_moneda2.setBounds(256, 65, 86, 20);
    frame.getContentPane().add(textField_moneda2);
    
    textField_moneda1 = new JTextField();
    textField_moneda1.setColumns(10);
    textField_moneda1.setBounds(256, 89, 86, 20);
    frame.getContentPane().add(textField_moneda1);
    
    textField_moneda50 = new JTextField();
    textField_moneda50.setColumns(10);
    textField_moneda50.setBounds(256, 114, 86, 20);
    frame.getContentPane().add(textField_moneda50);
    
    JLabel lblMoneda20 = new JLabel("Moneda 0.2:");
    lblMoneda20.setBounds(177, 145, 86, 14);
    frame.getContentPane().add(lblMoneda20);
    
    JLabel lblMoneda10 = new JLabel("Moneda 0.1:");
    lblMoneda10.setBounds(177, 167, 86, 14);
    frame.getContentPane().add(lblMoneda10);
    
    textField_moneda20 = new JTextField();
    textField_moneda20.setColumns(10);
    textField_moneda20.setBounds(256, 139, 86, 20);
    frame.getContentPane().add(textField_moneda20);
    
    textField_moneda10 = new JTextField();
    textField_moneda10.setColumns(10);
    textField_moneda10.setBounds(256, 164, 86, 20);
    frame.getContentPane().add(textField_moneda10);
    
    JLabel lblMoneda05 = new JLabel("Moneda 0.05:");
    lblMoneda05.setBounds(177, 192, 86, 14);
    frame.getContentPane().add(lblMoneda05);
    
    JLabel lblMoneda02 = new JLabel("Moneda 0.02:");
    lblMoneda02.setBounds(177, 217, 86, 14);
    frame.getContentPane().add(lblMoneda02);
    
    JLabel lblMoneda01 = new JLabel("Moneda 0.01:");
    lblMoneda01.setBounds(177, 242, 86, 14);
    frame.getContentPane().add(lblMoneda01);
    
    textField_moneda05 = new JTextField();
    textField_moneda05.setColumns(10);
    textField_moneda05.setBounds(256, 189, 86, 20);
    frame.getContentPane().add(textField_moneda05);
    
    textField_moneda02 = new JTextField();
    textField_moneda02.setColumns(10);
    textField_moneda02.setBounds(256, 214, 86, 20);
    frame.getContentPane().add(textField_moneda02);
    
    textField_moneda01 = new JTextField();
    textField_moneda01.setColumns(10);
    textField_moneda01.setBounds(256, 239, 86, 20);
    frame.getContentPane().add(textField_moneda01);
    
    JButton btnCambioDinero = new JButton("Cambio Dinero");
    btnCambioDinero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cambioDinero();
      }

      private void cambioDinero() {
        
        double dinero = Double.parseDouble(textField_dinero.getText());
            
        int billete500=0;
        int billete200=0;
        int billete100=0;
        int billete50=0;
        int billete20=0;
        int billete10=0;
        int billete5=0;
        int moneda2=0;
        int moneda1=0;
        int moneda50=0;
        int moneda20=0;
        int moneda10=0;
        int moneda05=0;
        int moneda02=0;
        int moneda01=0;
        
        while(dinero>0) {
          while(dinero-500>=0) {
            dinero-=500;
            billete500++;
          }
          while(dinero-200>=0) {
            dinero-=200;
            billete200++;
          }
          while(dinero-200>=0) {
            dinero-=200;
            billete200++;
          }
          while(dinero-100>=0) {
            billete100++;
            dinero-=100;
            }
          while(dinero-50>=0) {
            billete50++;
            dinero-=50;
            }
          while(dinero-20>=0) {
            billete20++;
            dinero-=20;
            }
          while(dinero-10>=0) {
            billete10++;
            dinero-=10;
            }
          while(dinero-5>=0) {
            billete5++;
            dinero-=5;
            }
          while(dinero-2>=0) {
            moneda2++;
            dinero-=2;
            }
          while(dinero-1>=0) {
            moneda1++;
            dinero-=1;
            }
          while(dinero-0.5>=0) {
            moneda50++;
            dinero-=0.5;
            }
          while(dinero-0.2>=0) {
            moneda20++;
            dinero-=0.2;
            }
          while(dinero-0.1>=0) {
            moneda10++;
            dinero-=0.1;
            }
          while(dinero-0.05>=0) {
            moneda05++;
            dinero-=0.05;
            }
          while(dinero-0.02>=0) {
            moneda02++;
            dinero-=0.02;
            }
          while(dinero-0.01>=0) {
            moneda01++;
            dinero-=0.01;
            }
        }
        textField_billete500.setText(Integer.toString(billete500));
        textField_billete200.setText(Integer.toString(billete200));
        textField_billete100.setText(Integer.toString(billete100));
        textField_billete50.setText(Integer.toString(billete50));
        textField_billete20.setText(Integer.toString(billete20));
        textField_billete10.setText(Integer.toString(billete10));
        textField_billete5.setText(Integer.toString(billete5));
        textField_moneda2.setText(Integer.toString(moneda2));
        textField_moneda1.setText(Integer.toString(moneda1)); 
        textField_moneda50.setText(Integer.toString(moneda50));
        textField_moneda20.setText(Integer.toString(moneda20));
        textField_moneda10.setText(Integer.toString(moneda10));
        textField_moneda05.setText(Integer.toString(moneda05));
        textField_moneda02.setText(Integer.toString(moneda02));
        textField_moneda01.setText(Integer.toString(moneda01));
        
       }
      
    });
    btnCambioDinero.setBounds(145,39,112,23);
    frame.getContentPane().add(btnCambioDinero);
    
    
  }
}
