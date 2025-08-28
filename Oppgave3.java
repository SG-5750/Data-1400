package aritmetikk1;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    /*
    Lag et program som regner ut arealet av et rektangel.
    Programmet skal lese inn lengden og bredden på rektangelet.
    Regn så ut arealet og skriver ut svaret på følgende måte:
    ”Et rektangel med bredde 20 cm og lengde 40 cm har et areal på 800 cm”.
    */
    public static void main(String[] args) {

        String bredden = showInputDialog("Skriv inn bredden målt i cm");
        String lengden = showInputDialog("Skriv inn lengden målt i cm");

        int breddenint =Integer.parseInt(bredden);
        int lengdenint =Integer.parseInt(lengden);
        int arealet = breddenint * lengdenint;

        {

        showInternalMessageDialog(null,"rektanglen som har bredden " + bredden + " og lengden " + lengden + " har følgende areal: "+ arealet);
        }
       
    }
}
