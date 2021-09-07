import java.io.IOException;

public class Lieferungen {

    public static void main(String[] args) {

    }
    // public static int[][] erzeugeTabelle() throws IOException {
    //int[][] tabelle1 = new int[4][3];
    // System.out.print("Januar\t "+"Kunde1\t "+"Kunde2\t "+"Kunde3\t ");
    // System.out.print("Artikel1\n "+"Artikel2\n "+"Artikel\n "+"Artikel\n");
//String Artikel= "Artikel1\n "+"Artikel2\n "+"Artikel3\n "+"Artikel4\n";
    //return Artikel;
    //}


    public static int[][] monatfebruar() throws IOException {

        System.out.println(": ");
        int zeilen = IO.readInteger();

        System.out.println(": ");
        int spalten = IO.readInteger();

        int[][] februar = new int[zeilen][spalten];


        for (int m = 0; m < februar.length; m++) {
            for (int n = 0; n < februar.length; n++) {
                System.out.print("Zeile " + (m + 1) + ", Spalte " + ": ");
                februar[m][n] = IO.readInteger();
            }
        }
        return februar;
    }
}
//}