package einUndAusgaben;

import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.InputStreamReader ;

public class Notenschema {

    public static void main(String[] args) throws IOException {
        // Buffered Reader erstellen
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        // Frage nach Eingabe stellen
        System.out.println("Wie viel Prozent hast du erreicht?");

        // Eingabe durchführen
        String eingabe=br.readLine();

        // Werte umwandeln (Datentypen)
        // Die Eingabe ist immer ein String
        // sofern gerechnet werden soll oder verglichen werden soll
        // --> umwandeln zu double oder int
        int prozent = Integer.parseInt(eingabe);

        // Irgendwas berechnen
        if (prozent<27) {
            System.out.println("Note 6");
        } else if (prozent < 45) {
            System.out.println("Note 5");
        } else if (prozent < 59) {
            System.out.println("Note 4");
        } else if (prozent < 73) {
            System.out.println("Note 3");
        } else if (prozent < 85) {
            System.out.println("Note 2");
        } else {
            System.out.println("Note 1");
        }

    }

}