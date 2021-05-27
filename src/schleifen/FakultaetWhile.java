package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetWhile {

    public static void main(String[] args) throws IOException {

        // Deklarieren und Insinieren des BuffedReaders.
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        double fakultaet;

        // Eingabe der Zahl.
        System.out.print("Bis zur welcher Zahl soll die Fakultät berechnet werden? ");
        int zahl = Integer.parseInt(br.readLine());

        // Berechnung der Fakultät mit while-Schleife.
        fakultaet = 1;
        int i = 1;
        while(i <= zahl) {
            fakultaet = fakultaet * 1;
            System.out.print("Die Fakultät von " + i +" = " + fakultaet);
            i = i + 1;
        }
    }
}



