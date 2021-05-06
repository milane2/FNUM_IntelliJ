import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LK_Milane {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        double anfangsmenge;
        double zerfall;
        int jahr;

        boolean weiter;

        System.out.println("Bitte Menge in mg angeben:");
        anfangsmenge = readdouble();

        System.out.println("Bitte Zerfallsrate pro Jahr eingeben:");
        zerfall = readdouble();

        System.out.println("Bitte Zeitspanne in Jahren eingeben");
        jahr = readInt();

        double endmenge = anfangsmenge - zerfall;

        System.out.println("Jahr" + "\t" + jahr);
        System.out.println("Menge am Jahresanfang" + "\t" + anfangsmenge);
        System.out.println("Zerfall" + "\t" + zerfall );
        System.out.println("Menge am Jahresende" + "\t" + endmenge);

        if(endmenge < anfangsmenge / 2 ){
            System.out.print(endmenge +"***");
        }
            System.out.println("Möchten sie den Vorgang wiederholen?");

            //if(1 = true ,2 = false){
           // }
    }
    public static double readdouble() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort = br.readLine().replace(',', '.').trim();
        Double zahl = Double.parseDouble(antwort);
        return zahl;
        //return Double.parseDouble(br.readLine().replace (',' , '.') .trim()) ;
    }


    public static int readInt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // br.readLine(); = String antwort = Integer antwort
        // Integer zahl = Integer.parseInt(antwort);
        //return zahl;
        return Integer.parseInt(br.readLine().trim());  }





    }