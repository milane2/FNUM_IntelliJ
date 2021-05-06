import java.io.IOException;

public class Maxima {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele Zahlen sollen erfasst werden:");
        int anzahl = IO.readInteger();
        double zahlen[] = new double [anzahl];

        for (int i = 0; i < zahlen.length; i++){
            System.out.print("Werte " + (i+1) +":");
            zahlen[i] = IO.readDouble();
        }
    }
}
