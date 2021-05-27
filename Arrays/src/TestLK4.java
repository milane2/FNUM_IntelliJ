import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLK4 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        boolean weiter = false;
        do {
            double[] a = einlesen();
            ausgeben(a);
            double summe = ermittelnSumme(a);
            double produkt = ermittelnProdukt(a);
            ausgebenErgebnis(summe, produkt);

            System.out.println("Soll das Programm erneut ablaufen?");
            weiter = readBoolean();
        } while (weiter == true);
    }

    private static void ausgebenErgebnis(double summe, double produkt){
        System.out.println("Die Summe ist :\t"+runden(summe,2));
        System.out.println("Die Produkt ist :\t"+ runden(produkt,2));
    }

    public static double runden(double wert, int nachkommastellen) {
        return Math.round(wert * Math.pow(10, nachkommastellen)) / Math.pow(10, nachkommastellen);
    }

    private static double ermittelnSumme(double[]a) {
        double summe=0;
        for (int i = 0; i < a.length;i++){
            summe = summe+   a[i];
        }
        return summe;
    }

    private static double ausgeben(double[] a){
        System.out.println("Sie haben die Werte: ");
        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]);
        }
        return 0;
    }

    private static double ermittelnProdukt(double[]a) {
        double produkt = 1;
        for (int i = 0; i < a.length; i++) {
            produkt = produkt * a[i] ;
        }
        return produkt;
    }

    private static double[] einlesen() throws IOException {
        System.out.println("Gib die Anzahl der einlesbaren Zahlen an:");
        int s = readInteger();
        double a[] = new double[s];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Gib Zahl "+(i+1)+ " ein");
            a[i] = readDouble();
        }
        return a;
    }

    public static int readInteger() throws IOException {
        int intput = Integer.parseInt(br.readLine());
        int intput1 = intput;
        return intput1;
    }

    public static double readDouble() throws IOException {
        double input = Double.parseDouble(br.readLine());
        return input;
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
}