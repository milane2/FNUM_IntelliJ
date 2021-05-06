import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testaufgabe {



    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie den Wert für p ein:");
        String p = br.readLine();
        double p1 = Double.parseDouble(p);

       System.out.println("Geben sie den Wert für q ein:");
        String q = br.readLine();
        double q1 = Double.parseDouble(q);

        //double d = Math.pow(p/2, 2)-q;
                // Double (p/2)*(p/2)-q;
                // Double (p*p/4)-q;
          //if (d<0) {
          //} //System.out.println("Es existiert keine Lösung.");

          //}    else if (d==0){
          // System.out.println("Doppelte Nullstelle bei X =""Ergebnis");
          //}  //if (d>0) {
       //System.out.println();

    }
}
