import java.io.IOException;

public class Gauss1 {



    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele Gleichungen sollen erfasst werden: ");
        int anzahlGleichungen= IO.readInteger();

        double b [] = new double[anzahlGleichungen + 1];
        double a [][] = new double[anzahlGleichungen+1][anzahlGleichungen+1];

        // Eingabe
        eingabe(a, b);

        // Ausgabe
        ausgabe(a, b);
    }

    private static void ausgabe(double[][] a, double[] b) {
        for (int i = 1; i < a.length; i++) {
            for (int k= 1; k < a[i].length; k++){
                System.out.print(a[i][k] + "   ");
            }
            System.out.println("|     " + b[i]);
        }
    }

    private static void eingabe(double[][] a, double[] b) throws IOException {
        for (int i = 1; i < a.length; i++) {
            for (int k= 1; k < a[i].length; k++){
                System.out.println("Geben Sie den Koeffizienten a"+ i + k + " ein: ");
                a[i][k]= IO.readDouble();
            }
            System.out.println("Geben Sie den Koeffizienten b" + i + " ein: ");
            b[i] = IO.readDouble();
        }
    }
}