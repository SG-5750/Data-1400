package aritmetikk1;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave10 {
    /*
    Lag et program som leser inn et heltall, alder. 
    Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende : 
    ”Du kan ta førerkortet for bil da du er gammel nok” 
    eller ”Du er for ung til å ta førerkort for bil”. Gjør dette ved bruk to if-setninger.
    */
    public static void main(String[] args) {

        String alder = showInputDialog("Hvor gammel er du? ");
        int alder1 =Integer.parseInt(alder);
        if (alder1 >= 18) {
            System.out.println("Du er gammel nok for førekortet");
            }

        else {
            int årIgjen = 18-alder1;
            showMessageDialog();

               }
            }
        }








