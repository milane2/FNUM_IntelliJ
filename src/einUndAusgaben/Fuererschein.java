package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuererschein {


    public static void main(String[] args)  throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben is ihr alter in jahren ein");
        String eingabe=br.readLine();

        int alter = Integer.parseInt(eingabe);

        if (alter<14) {
            System.out.println("Du darfst noch nicht Mofa fahren.");
        } else if (alter < 16 && alter >= 14) {
            System.out.println("Du darfst Mofa fahren, aber nicht Moped.");
        } else if (alter <18 && alter >= 16) {
            System.out.println("Du darfst Moped fahren, aber nicht Auto.");
        } else if (alter >= 18) {
            System.out.println("Du darfst Auto fahren.");



        }
    }
}