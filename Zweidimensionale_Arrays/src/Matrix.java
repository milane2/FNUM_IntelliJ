import java.io.IOException;

public class Matrix { //eine Matrix ist ein 2-dimensionales Array

    public static void main(String[] args)  {
        int[][] zahlenReihen = new int[10][10];
        createArray(zahlenReihen);
    }
    private static void createArray(int[][] zahlenReihen) {
    }
    //-----------------------------------------------------------------------------------------------------------------------
    public static int[][] readIntArray2Dim() throws IOException {

        System.out.println("Nennen sie die Anzahl an Zeilen: ");
        int zeilen = IO.readInteger();

        System.out.println("Nennen sie die Anzahl an Spalten: ");
        int spalten = IO.readInteger();

        int[][] matrix = new int[zeilen][spalten];

        // Erste Schleife ist für die Spalten (m)
        for (int m = 0; m < matrix.length; m++) {
            // Zweite Schleife ist für die Zeilen (n)
            for (int n = 0; n < matrix.length; n++) {
                System.out.print("Zeile " + (m + 1) + ", Spalte " + ": ");
                matrix[m][n] = IO.readInteger();
            }
        }
        return matrix;
    }
    //----------------------------------------------------------------------------------------------------------------------
    public static void readIntArray2Dim(int[][] matrix){
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix.length; n++) {
                System.out.print("Zeile " + (m + 1) + ", Spalte " + ": ");
                System.out.print(matrix[m][n]);
            }
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------
    public static void printtIntArray2DimAsMatrix(int[][] matrix){
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix.length; n++) {
                System.out.print(matrix[m][n]);

                if (n < matrix[m].length - 1) {
                    System.out.print(", ");
                }
                else {
                    System.out.print("");
                }
            }
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------------
//   ----------> (n) (Spalte)
//  |
//  |
//  |
//  v  (m) (Zeilen)