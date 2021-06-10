import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    //String

    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort = br.readLine();
        return antwort;
    }
    //Int

    public static int readInt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // br.readLine(); = String antwort = Integer antwort
        // Integer zahl = Integer.parseInt(antwort);
        //return zahl;
        return Integer.parseInt(br.readLine().trim());
    }
    //Double

    public static double readdouble() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort = br.readLine().replace(',', '.').trim();
        Double zahl = Double.parseDouble(antwort);
        return zahl;
        //return Double.parseDouble(br.readLine().replace (',' , '.') .trim()) ;
    }

        public static boolean readboolean() throws IOException {
            BufferedReader input = new BufferedReader(new InputStreamReader().trim)
            while (true) {
                String tmpEingabe = input.readLine().trim();
                if (tmpEingabe != null) {
                    if ((tmpEingabe.equals("1"))
                            ||(tmpEingabe.equalsIgnoreCase("j"))
                            ||(tmpEingabe.equalsIgnoreCase("ja"))
                            ||(tmpEingabe.equalsIgnoreCase("y"))
                            ||(tmpEingabe.equalsIgnoreCase("yes"))
                            ||(tmpEingabe.equalsIgnoreCase("w"))
                            ||(tmpEingabe.equalsIgnoreCase("wahr"))
                            ||tmpEingabe.equalsIgnoreCase("t"))
                            ||(tmpEingabe.equalsIgnoreCase("true"))) {
                        return true;
                    } else if ((tmpEingabe.equals(""))
                            ||(tmpEingabe.equalsIgnoreCase("n"))
                            ||(tmpEingabe.equalsIgnoreCase("nein"))
                            ||(tmpEingabe.equalsIgnoreCase("no"))
                            ||(tmpEingabe.equalsIgnoreCase("f"))
                            ||(tmpEingabe.equalsIgnoreCase("falsch"))
                            ||(tmpEingabe.equalsIgnoreCase("false"))) {
                        return false;
                    }
                }
                System.out.print("Ungültige Eingabe. Bitte erneut versuchen:");
            }
        }
}