import java.io.IOException;

public class Ruecksubstitution02 {

    public static void main(String[] args) throws IOException {
        int anzahlGleichungen= IO.readInteger();

        double a [][] = new double[anzahlGleichungen+1][anzahlGleichungen+1];
        double b [] = new double[anzahlGleichungen + 1];
        double x [] = new double[anzahlGleichungen + 1];
        double q =0;


        //-------------------------------------------------------------
        for (int i = 1; i <= anzahlGleichungen; i++) {
            for (int j= i+1; j <= anzahlGleichungen; j++){

                if (a[i][i] != 0) {
                    return true;
                } else {
                    return false;
                }

                for (int k= i; k <= anzahlGleichungen; k++){
                    a[j][k] = a[j][k] + a[i][k]*q;

                }
                b[j] = b[j] + b[i] *q;
            }
        }
    }
}