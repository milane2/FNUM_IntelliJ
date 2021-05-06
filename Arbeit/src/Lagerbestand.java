import java.io.IOException;

public class Lagerbestand {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie viel unterschiedliche Artikel haben sie im Lager:");
        int anzahl = IO.readInteger();

        System.out.println("Erfassen Sie die einzelnen Artikelbezeichnungen:");
        String artikel[] = new String[anzahl];
        for (int i = 0; i < artikel.length; i++) {
            artikel[i] = IO.readString();
        }
        double preis[] = new double[anzahl];
        System.out.println("Erfassen Sie jetzt den Einzelpreis jedes Artikels:");
        for (int i = 0; i < preis.length; i++) {
            System.out.println("Preis des Artikels " +"'"+  artikel[i] + "'"+":");
            preis[i] = IO.readDouble();
        }
        System.out.println("Erfassen Sie jetzt die Anzahl der einzelnen Artikels:");
        int menge[] = new int[anzahl];
        for (int i = 0; i < menge.length; i++) {
            System.out.println("Menge des Artikels '" +  artikel[i] + "':");
            menge[i] = IO.readInteger();
        }
        int gesamtMenge = 0;
        double gesamtWert = 0.0;
        for (int i = 0; i < menge.length; i++) {
            gesamtMenge = gesamtMenge + menge[i];
            gesamtWert = gesamtWert + menge[i] * preis[i];
        }
        System.out.println("In ihrem Lager befinden sich insgesamt " + gesamtMenge + " Artikel im Wert von "+ gesamtWert + "€" );
    }
}
/* https://github.com/milane2/Fnum.git