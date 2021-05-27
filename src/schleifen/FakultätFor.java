package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultätFor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bis zu welcher ganzer Zahl soll die Fakultät berechnet werden? ");
        int zahl = Integer. parseInt(br.readLine());

        double fakultaet = 1;
        for (int i =1; i <= zahl;) {
            fakultaet = fakultaet * i;
            System.out.println("Die Fakultät von " + i +" = " + fakultaet);
        }
    }
}
