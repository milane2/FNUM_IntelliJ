import java.io.IOException;

public class VariablesArray {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie viel Werte möchten sie eingeben?");

        int anzahlWerte = IO.readInteger();
        double[] werte = new double[anzahlWerte];

        for (int i = 0; i < werte.length; i++){
            System.out.print("Werte " + (i+1) +":");
            werte[i] = IO.readDouble();

        }

        System.out.println("Eingegeben wurde:");
        for (int i = 0; i < werte.length; i++);{
       System.out.println(werte[1]);
        }
    }
}
