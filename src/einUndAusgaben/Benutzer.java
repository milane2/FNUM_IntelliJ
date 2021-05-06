package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {

	public static void main(String[] args) throws IOException {

		// Dekladieren und Initialisieren 
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		// Eingabe des Vor- und Nachname
		System.out.println("Wie ist dein Vorname?");
		String vorname =  br. readLine();
		System.out.println("Wie ist dein Nachname?");
		String nachname = br. readLine();


		// Ausgabe der Begrüssung

		System.out.println(" Hallo " + vorname + " " + nachname + ": "  );


	}
}