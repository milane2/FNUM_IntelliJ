package einUndAusgaben;

import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;

public class Versetzungsordnung{



    public static void main(String[] args) throws IOException {

        // Buffered Reader erstellen
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));

        // Frage nach Eingabe stellen
        System.out.println("Wie viele sechsen hast du?");

        // Eingabe durchführen
        String a=br.readLine();
        String b=br.readLine();


        // Werte umwandeln (Datentypen)
        int sechsen = Integer.parseInt(a);
        int fuenfen = Integer.parseInt(b);
        // Irgendwas berechnen
        if (sechsen>1||sechsen==1 && fuenfen ==1||fuenfen> 1) {
            System.out.println("Probejahr nicht bestanden!");
        } else if (sechsen ==1 && fuenfen==1 || fuenfen == 3) {
            System.out.println("Nicht versetzt!");
        } else {
            System.out.println("Alles in Lot!");

        }

    }

}