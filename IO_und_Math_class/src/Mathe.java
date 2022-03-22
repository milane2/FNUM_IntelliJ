public class Mathe {

    public static double runden(double wert, double stellen){
        wert = Math.floor(wert* Math.pow(10,stellen)+ 0.5);
        wert = wert/ Math.pow(10, stellen);
        return  wert;
    }

}
