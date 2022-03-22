import java.io.IOException;
import java.util.Random;

public class Wuerfeln {


    public static void main(String[] args) throws IOException {

        do {
        System.out.println("Wie viele Experimente sollen durchgeführt werden? ");
        int anzahlExperimente= IO.readInteger();

        System.out.println("Wie oft soll je durchlauf gewürfelt werden? ");
        int anzahlWuerfe = IO.readInteger();

        int [][] w = new int[anzahlExperimente][anzahlWuerfe];
        int [] b = new int [anzahlExperimente];

        // todo
//int
        fillRandom(w);
        max = ermittelMax(w);
        min = ermittleMin(w);
        summe = berechneSummeElemente(w);
        }
    }
    public static double runden(double wert, double stellen){
        wert = Math.floor(wert* Math.pow(10,stellen)+ 0.5);
        wert = wert/ Math.pow(10, stellen);
        return  wert;
    }
    public static void  fillRandom( int[][] wuerfe){
       for (int i = 0; i < wuerfe.length; i++){
           for(int j = 0; j < wuerfe[i].length; j++){
            wuerfe[i][j] = rand.nextInt(6) +1;
           }

       }

    }
    static  double ermittelMax(double [][]){
        double max = a[0][0];
        for (){

        }
    }
}
// int[*][] ||| int[][*] ---->
// |
// |
// |
// v
