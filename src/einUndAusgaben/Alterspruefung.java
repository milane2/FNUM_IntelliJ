package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung  {

    public static void main(String[] args)  throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie ihr Alter ein!");

        String eingabe=br.readLine();

        int alter = Integer.parseInt(eingabe);

        if (alter<18) {
            System.out.println("Du bist noch minderjährig");
        }
        else {
            System.out.println("Du bist schon völljährig");

        }
    }
}
