package aritmetikk1;

import javax.swing.*;

import java.time.Year;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    /*
    Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel): 
    Per Olsen er i dag 32 år. Han er født i 1986. I 2053 er han 67 år og da vil han være pensjonist.
    */
    public static void main(String[] args) {

        String navn  =showInputDialog("Hva heter du?");
        String alder =showInputDialog("Hvor gammel er du?");
        String ønsketår =showInputDialog("Hvilket år ønsker du å bergene fram til? ");

        int alderint = Integer.parseInt(alder);
        int yearNow = Year.now().getValue();
        int fodselår = yearNow - alderint;
        int onsketår = Integer.parseInt(ønsketår);
        int alderiFramTid = onsketår - fodselår;



        String historie = navn + "er i dag " +alder +"om" + ønsketår +"skal" + navn +"være" + alderiFramTid + "år gammel";

        JOptionPane.showMessageDialog(null,historie);




        

        if (alderint >= 65){
            System.out.print("Du er pensjonist ");
        }
        else {
            System.out.print("Du er fortsat tikke ung ");
        }
    }
}

///  This ais a comment
