import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FestesArray {

    public static void main(String[] args) throws IOException {
        double a[] = new double[5];
        BufferedReader tastatur = new BufferedReader( new InputStreamReader(System.in));

        for (int i = 0; i < a.length;i++){
            System.out.print("Bitte "+(i+1)+" . Zahl erfassen: ");
            a[i] = Double.parseDouble(tastatur.readLine().replace(",",","));
        }

        System.out.println("Die erfasste Zahlen lauten");
        for (int i =0; i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}