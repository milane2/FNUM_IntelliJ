import java.io.IOException;

public class Einmal_Eins {

    public static void main(String[] args) throws IOException {
        // int [][] einmal2=  einmal1();
        //writeArray(einmal2);

        int [][] einmal3 =  erzeugeEinMalEins();

        // wähle Zeile
        System.out.println("Nennen sie die Anzahl an Zeilen: ");
        int zeile = IO.readInteger();

        // wähle Spalte
        System.out.println("Nennen sie die Anzahl an Spalten: ");
        int spalte = IO.readInteger();

        // gib Element auf Konsole aus
        int element  = einmal3[zeile -1][spalte -1];
        System.out.print("Ergebnis: ");
        System.out.println(element);
    }

    private static int[][] erzeugeEinMalEins() {
        int[][] matrix = new int[10][10];

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix.length; n++) {
                matrix[m][n] = (n+1) * (m+1);
            }
        }
        return matrix;
    }

    private static void writeArray(int[][] einmal2) {
        for (int m = 0; m < einmal2.length; m++) {
            for (int n = 0; n < einmal2.length; n++) {
                System.out.print(einmal2[m][n] +"\t");
            }
            System.out.println();
        }
    }
    public static int[][] einmal1(){

        int anzahlZeilen = 10;
        int anzahlSpalten = 10;

        int[][] matrix = new int[anzahlZeilen][anzahlSpalten];

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix.length; n++) {
                matrix[m][n] = (n+1) * (m+1);
            }
        }
        return matrix;
    }
}
