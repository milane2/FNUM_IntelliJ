import java.io.IOException;

public class Bubblesort {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele Zahlen sollen sortiert werden:");
        int anzahl = IO.readInteger();
        int[] s = new int[anzahl];

        for (int i = 0; i < s.length; i++) {
            s[i] = IO.readInteger();
        }
    }
}