import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System .in));


        System.out.print("Geben sie ihre Mathe-Note ein: ");
        String text = br. readLine();
        double matheNote = Double.parseDouble(text.trim().replace(',', '.'));

        System.out.print("Geben sie ihre Informatik-Note ein: ");
        text = br. readLine();
        double infNote = Double.parseDouble(text.trim().replace(',', '.'));

        System.out.print("Geben sie ihre Sport-Note ein: ");
        text = br.readLine();
        double sportNote = Double.parseDouble(text.trim().replace(',', '.'));

        double durchschnitt = (matheNote + infNote + sportNote) /3;

        System.out.print("Ihre Durchschnittsnote beträgt: ");

        // Das muss noch mal überarbeitet werden  Mache es wenn du ein
        // bischen better darin bist
        // dies Zählt für alle Projekte
        {

 }
    }
}