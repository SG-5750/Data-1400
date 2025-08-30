package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave7 {
    /*
    Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza. 
    Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver. 
    Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren. 
    Skriv ut resultatet på følgende form: 
    ”Dersom man er 4 personer og har 3 pizzaer med 6 slices pr pizza får hver person 4 slices og 2 blir til overs”.
    */
    public static void main(String[] args) {

        String antallPizza = showInputDialog("Hvor mange pizza er bestilit?");
        String antallpersoner = showInputDialog("Hvor mange personer er invitert?");

        int antallPizza1 = Integer.parseInt(antallPizza);
        int antallPersoner1 = Integer.parseInt(antallpersoner);
        int antallSlices = antallPizza1 * 6;
        int rest = antallSlices % antallPersoner1;
        int fordeling = (antallSlices-rest)/antallPersoner1;

        showMessageDialog(null, "Det skal være " + fordeling + " antall for hver person");


       
    }
}



// Antall pizza
// Antall slices
// Antall personer
