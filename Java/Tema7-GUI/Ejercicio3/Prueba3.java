package Ejercicio3;

import java.util.Scanner;

public class Prueba3 {

  public static void main(String[] args) {
    double dinero=0;
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
      if(dinero>=500) {
      billete500++;
      dinero-=500;
    }else if(dinero>=200) {
      billete200++;
      dinero-=200;
    } 
    else if(dinero>=100) {
      billete100++;
      dinero-=100;
      }
    else if(dinero>=50) {
      billete50++;
      dinero-=50;
      }
    else if(dinero>=20) {
      billete20++;
      dinero-=20;
      }
    else if(dinero>=10) {
      billete10++;
      dinero-=10;
      }
    else if(dinero>=5) {
      billete5++;
      dinero-=5;
      }
    else if(dinero>=2) {
      moneda2++;
      dinero-=2;
      }
    else if(dinero>=1) {
      moneda1++;
      dinero-=1;
      }
    else if(dinero>=0.5) {
      moneda50++;
      dinero-=0.5;
      }
    else if(dinero>=0.2) {
      moneda20++;
      dinero-=0.2;
      }
    else if(dinero>=0.1) {
      moneda10++;
      dinero-=0.1;
      }
    else if(dinero>=0.05) {
      moneda05++;
      dinero-=0.05;
      }
    else if(dinero>=0.02) {
      moneda02++;
      dinero-=0.02;
      }
    else if(dinero>=0.01) {
      moneda01++;
      dinero-=0.01;
      }
    }
    /**
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
    */
    
  }

}
