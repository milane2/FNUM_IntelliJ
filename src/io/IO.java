package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Liest einen Wahrheitswert von der Konsole ein.
     *
     * @return Der eingelesen Wahrheitswert.
     * @throws IOException
     */
    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe = br.readLine().trim();
            if ((eingabe.equals("1"))
                    || (eingabe.equalsIgnoreCase("j"))
                    || (eingabe.equalsIgnoreCase("ja"))
                    || (eingabe.equalsIgnoreCase("y"))
                    || (eingabe.equalsIgnoreCase("yes"))
                    || (eingabe.equalsIgnoreCase("w"))
                    || (eingabe.equalsIgnoreCase("wahr"))
                    || (eingabe.equalsIgnoreCase("t"))
                    || (eingabe.equalsIgnoreCase("true"))) {
                return true;
            } else if ((eingabe.equals("0"))
                    || (eingabe.equalsIgnoreCase("n"))
                    || (eingabe.equalsIgnoreCase("nein"))
                    || (eingabe.equalsIgnoreCase("no"))
                    || (eingabe.equalsIgnoreCase("f"))
                    || (eingabe.equalsIgnoreCase("falsch"))
                    || (eingabe.equalsIgnoreCase("false"))) {
                return false;
            }
            System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
        }
    }

    //----------------------------------------------------------------------------------------------------------------------

    /**
     * Liest eine Text von der Konsole ein.
     *
     * @return Der eingelesene Text.
     * @throws IOException
     */
    public static String readString() throws IOException {
        return br.readLine();
    }

    //----------------------------------------------------------------------------------------------------------------------

    /**
     * Liest eine Kommazahl von der Konsole ein.
     *
     * @return Eine Kommazahl
     * @throws IOException
     */
    public static double readDouble() throws IOException {
        String text = br.readLine().trim().replace(',', '.');
        double zahl = Double.parseDouble(text);
        return zahl;
    }

    //----------------------------------------------------------------------------------------------------------------------

    /**
     * Liest eine Ganzzahl von der Konsole ein.
     *
     * @return Eine Ganzzahl.
     * @throws IOException
     */
    public static int readInteger() throws IOException {
        String text = br.readLine().trim();
        int zahl = Integer.parseInt(text);
        return zahl;
    }

    //----------------------------------------------------------------------------------------------------------------------

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