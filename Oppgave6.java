package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


 /*
    Lag et program som leser inn et beløp i amerikanske dollar (USD) og
    regner om og skriver ut tilsvarende beløp i norske kroner.
    Benytt dagens valutakurs fra nettet.
    */

public class Oppgave6 {

    
    public static void main(String[] args) {

        Double USD = 11.3;

        String ønsketbeløp =showInputDialog("Hvor mye ønsker du å konvorte? ");
        Double ønsketbeløp1= Double.parseDouble(ønsketbeløp);

        double result = USD * ønsketbeløp1;

        showMessageDialog(null,result);




    }
}
