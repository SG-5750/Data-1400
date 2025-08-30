package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {
    /*
    Lag et program som regner om fra fahrenheit til celsius. Les inn verdien for fahrenheit 
    og regn ut tilsvarende celsius med følgende formel: C = (F-32)/1.8. 
    Skriv så ut resultatet i Celsius.
    */
    public static void main(String[] args) {
        String F = showInputDialog("Skriv inn temp i fahrenheit");
        Double F2= Double.parseDouble(F);

        String celsius = String.valueOf((F2-32)/1.8);
        Double celsius2 = Double.parseDouble(celsius);

        showMessageDialog(null, celsius2 );

    }
}
