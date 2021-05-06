import java.io.IOException;

public class Summe {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele Zahlen sollen erfasst werden:");
        int anzahl = IO.readInteger();
        int zahlen[] = new int [anzahl];

        for (int i = 0; i < zahlen.length; i++){
            System.out.print("Werte " + (i+1) +":");
            zahlen[i] = IO.readInteger();
        }
        int anzahlGerande = 0;
        int anzahlUngerande = 0;
        int summeGerande = 0;
        int summeUngerande = 0;

        for (int i = 0; i < zahlen.length; i++){
            if (zahlen[i] % 2 == 0) {
                anzahlGerande++;
                summeGerande = summeGerande + zahlen[i];
            }else{
                summeUngerande = summeUngerande + zahlen[i];
            }
        }
        System.out.println("Gerade Zahlen:");
        System.out.println("Anzahl :"+ anzahlGerande);
        System.out.println("Summe :"+ summeGerande);
        System.out.println("Ungerade Zahlen:");
        System.out.println("Anzahl :"+ anzahlGerande);
        System.out.println("Summe :" + anzahlUngerande );
    }
}