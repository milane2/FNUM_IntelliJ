import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kino {

    public static void main(String[] args) throws IOException {
        String[][] saal = erzeugeSaal();
        boolean weiter = false;
        do {
            anzeigenSaal(saal);
            System.out.println();
            System.out.println("1.Reservieren "+"\n" + "2.Stonieren");
            System.out.println("Welche Anwendung soll ausgeführt werden: ");
            int auswahl1 = IO.readInteger();
            saal = auswahl(saal, auswahl1);

            // ja für weiter ; nein für stop
            System.out.println("Soll das Programm erneut ablaufen?");
            weiter = readBoolean();

        } while (weiter == true);
    }

    private static String[][] auswahl(String[][] saal,int auswahl1) throws IOException {

        if(auswahl1==1) {
            return reservierenPlatz(saal);
        } else {
            return stonierePlatz(saal);
        }
    }

    private static String[][] stonierePlatz(String[][] saal) throws IOException {
        System.out.print("Welcher Platz soll storniert werden: ");
        System.out.println();
        System.out.println("Reihe: ");
        int reihe = IO.readInteger();

        System.out.println("Platz: ");
        int platz = IO.readInteger();
        saal[reihe][platz] = "O";

        anzeigenSaal(saal);
        return saal;
    }

    private static void anzeigenSaal(String[][] saal) {
        for (int m = 0; m < saal.length; m++) {
            for (int n = 0; n < saal[m].length; n++) {
                System.out.print(saal[m][n] + "\t");
            }
            System.out.println();
        }
    }

    private static String[][] reservierenPlatz(String[][] saal) throws IOException {
        System.out.print("Welcher Platz soll reserviert werden: ");

        System.out.println();

        System.out.println("Reihe: ");
        int reihe = IO.readInteger();

        System.out.println("Platz: ");
        int platz = IO.readInteger();
        saal[reihe][platz] = "X";

        anzeigenSaal(saal);
        return saal;
    }

    public static String[][] erzeugeSaal() throws IOException {
        System.out.println("Nennen sie die Anzahl an Reihen: ");
        int reihen = IO.readInteger();

        System.out.println("Nennen sie die Anzahl an Sitze pro Reihe: ");
        int sitzProReihe = IO.readInteger();

        String[][] sitze = new String[reihen][sitzProReihe];

        for (int m = 0; m < sitze.length; m++) {
            for (int n = 0; n < sitze[m].length; n++) {
                sitze[m][n] = "O";
            }
        }
        return sitze;
    }

    public static boolean readBoolean() throws IOException {
        String booanswer = readString();

        if ((booanswer.equalsIgnoreCase("ja") || booanswer.equalsIgnoreCase("j")|| booanswer.equalsIgnoreCase("1"))) {
            return true;
        } else {
            return false;
        }
    }
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
    public static boolean readBoolean2() throws IOException {
        String booanswer = readString();

        if ((booanswer.equalsIgnoreCase("ja") || booanswer.equalsIgnoreCase("j")|| booanswer.equalsIgnoreCase("1"))) {
            return true;
        } else {
            return false;
        }
    }
}