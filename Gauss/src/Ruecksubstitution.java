import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ruecksubstitution {

    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele Gleichungen sollen erfasst werden: ");
        int anzahlGleichungen= IO.readInteger();//ermittelnDimension();

        double a [][] = new double[anzahlGleichungen+1][anzahlGleichungen+1];
        double b [] = new double[anzahlGleichungen + 1];
        double x [] = new double[anzahlGleichungen + 1];
        double wert = 0;
        double stellen = 0;

        boolean weiter = false;
        do {
        // Eingabe
        eingabe(a, b);
        // Ausgabe
        ausgabe(a, b);
        //runden
        runden(wert,stellen);
        //Rücksubstituieren
        ruecksubstituieren(a, b, x);
        //Ergebnis
        ergebnis(x);
        //korrigieren(a, b)
            System.out.println("Soll das Programm erneut ablaufen? /j = Ja/ ");
            weiter = readBoolean();

        } while (weiter == true);
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
    private static void ruecksubstituieren(double[][] a, double[] b, double[] x) {
        double summe;

        for(int i =a.length -1 ; i >= 0; i--){
            summe =0;
            for (int k = i+1; k < a[i].length; k++) {
                summe = summe + a[i][k] * x[k];
            }
            x[i] = (b[i] - summe) / a[i][i];
        }
    }
    public static double runden(double wert, double stellen){
        wert = Math.floor(wert * Math.pow(10, stellen) + 0.5);
        wert = wert / Math.pow(10, stellen);
        return  wert;
    }
    private static void ergebnis(double[] x) {
        System.out.println(("\nDie Ergebnisse lauten: "));
        for (int i = 1 ; i < x.length; i++){
            System.out.println("x[" +i+ "] ="+ x[i]);
        }
    }
    private static void ausgabe(double[][] a, double[] b) {
        for (int i = 1; i < a.length; i++) {
            for (int k= 1; k < a[i].length; k++){
                System.out.print(a[i][k] + "   ");
            }
            System.out.println("|    " + b[i]);
        }
    }
    private static void eingabe(double[][] a, double[] b) throws IOException {
        for (int i = 1; i < a.length; i++) {
            for (int k= 1; k < a[i].length; k++){
                System.out.println("Geben Sie den Koeffizienten a"+ i + k + " ein: ");
                a[i][k]= IO.readDouble();
            }
            System.out.println("Geben Sie den Koeffizienten b" + i + "  ein: ");
            b[i] = IO.readDouble();
        }
    }
}