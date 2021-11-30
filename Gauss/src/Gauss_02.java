import java.io.IOException;

public class Gauss_02 {


    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele Gleichungen sollen erfasst werden: ");
        int anzahlGleichungen = IO.readInteger();


        double a[][] = new double[anzahlGleichungen + 1][anzahlGleichungen + 1];
        double b[] = new double[anzahlGleichungen + 1];
        double x[] = new double[anzahlGleichungen + 1];

        boolean ok = false;
        // Eingabe
        eingabe(a, b);

        // Ausgabe
        ausgabe(a, b);

        //korrigieren(a, b);
        //ruecksubstituieren(a,b,x);
        // ergebnis(x);
        // eingabe1();
    }

    //  private static void eingabe1(char seite) {
    //  if (seite== 1) {
    //    return true;
    //   } else {
    //      return false;
    //    }
    //   }

    private static void korrigieren() throws IOException {

        //   System.out.println("Sind alle Koeffizienten korrekt erfasst: ");
//        boolean ok = IO.readBoolean();
//        do {
//            System.out.println(" Wollen Sie die Koeffizienten der linken(l) oder rechten Seite ändern");
//

    }


    private static void ausgabe(double[][] a, double[] b) {
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < a[i].length; k++) {
                System.out.print(a[i][k] + "   ");
            }
            System.out.println("|     " + b[i]);
        }
    }

    private static void eingabe(double[][] a, double[] b) throws IOException {
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < a[i].length; k++) {
                System.out.println("Geben Sie den Koeffizienten a" + i + k + " ein: ");
                a[i][k] = IO.readDouble();
            }
            System.out.println("Geben Sie den Koeffizienten b" + i + " ein: ");
            b[i] = IO.readDouble();
        }
    }
}



//System.out.println("Sind alle Koeffizienten OK? Ja/Nein")