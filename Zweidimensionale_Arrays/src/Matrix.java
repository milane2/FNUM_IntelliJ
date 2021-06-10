import java.io.IOException;

public class Matrix { //eine Matrix ist ein 2-dimensionales Array

    public static void main(String[] args) throws IOException {

        System.out.println("Wie lang soll m sein?");
        int m = IO.readInteger();

        System.out.println("Wie lang soll n sein?");
        int n = IO.readInteger();

//-------------------------------------------------------

        int[][] zahlen =new int[m][n];

        // Erste Schleife ist für die Spalten (m)
        for (int i = 0; i < zahlen.length;i = i + 1){

            // Zweite Schleife ist für die Zeilen (n)
            for (int j = 0; j < zahlen.length;j = j + 1){
                zahlen [i][j] = i - j;
            }
            System.out.println("Eingegeben wurde:");

            for (int i = 0; i < zahlen.length; i++) {
            }
            System.out.println("Eingegeben wurde:");

            for (int j = 0; j < zahlen.length; j++) {

                System.out.println(zahlen[1][1]);
            }
        }
    }
}

//   ----------> (n) (Spalte)
//  |
//  |
//  |
//  v  (m) (Zeilen)
