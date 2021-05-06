package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wiederholungen {
    public static void main(String[] args) throws IOException {
        String jon;
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Erste Zahl eingeben");
            String input = br.readLine();
            double zahl1 = Double.parseDouble(input);

            System.out.println("Zweite Zahl eingeben");
            String input2 = br.readLine();
            double zahl2 = Double.parseDouble(input2);

            System.out.println(zahl1 + zahl2);
            System.out.println(zahl1 - zahl2);
            System.out.println(zahl1 * zahl2);
            System.out.println(zahl1 / zahl2);
            System.out.println(Math.pow(zahl1, zahl2));

            System.out.println("soll noch eine rechnung ausgeführt werden? ja oder nein");

             jon = br.readLine();

        }while(jon.equalsIgnoreCase("ja"));
    }
}