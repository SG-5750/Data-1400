package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
    /*
    Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen. 
    Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte: 
    ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”
    Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f", omkretsen); for å få 2 desimaler.
    */
    
    public static void main(String[] args) {

        double π = 3.14d;
        int konstandleddet = 2;

        String r = showInputDialog("Hva er øsnket radiusen?");
        double radius =Double.parseDouble(r);

        double omkrets = konstandleddet * π * radius;
        String omkretsMedToDesimaler = String.format("%.2f", omkrets);

        showMessageDialog(null, "Omkretsen av en sirkel med " + radius + " som radius blir " +
                omkretsMedToDesimaler);



        
    }
}
