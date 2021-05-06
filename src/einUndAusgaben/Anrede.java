package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede {
    public static void main(String[] args) throws IOException {
        // Dekladieren und Initialisieren
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));


        System.out.println("Wie ist dein Vorname?");
        String vorname =  br. readLine();
        System.out.println("Wie ist dein Nachname?");
        String nachname = br. readLine();


        // Geschlecht

        System.out.println("Was ist dein Geschlecht? (1=männlich; 2=weiblich; 3=divers");
        String text  =  br. readLine();
        int geschlecht = Integer.parseInt(text);

        // Bedingungen
        if (geschlecht == 1) {
            System.out.println("Hallo Herr " + vorname + " " + nachname + ":" );
        } else if (geschlecht == 2) {
            System.out.println("Hallo Frau "+ vorname + " " + nachname + ":" );
        } else if (geschlecht == 3) {
            System.out.println(" Hallo " + vorname + " " + nachname + ": " );
        } else {
            System.out.println("Du Idiot");
        }

    }
}