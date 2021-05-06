package einUndAusgaben;

public class Niederschlag {

	public static void main(String[] args) {

		// Dekladieren und Intialisieren der Varablen.
		int april = 12;
		int mai = 14;
		int juni  = 8;

		// Ergenis in einem Rechengang bestimmen.
		double ergebnis1 = (april + mai + juni) /3.0;

		// Ergebnis in zwei Rechengeange bestimmen.
		double ergebnis2 = april + mai + juni;
		ergebnis2 = ergebnis2 /3;

		// Ausgabe in konsolen-fenster
		System.out.println("Niederschlag im April   : " + "\t" + april);
		System.out.println("Niederschlag im Mai     : " + "\t" + mai);
		System.out.println("Niederschlag im Juni    : " + "\t" + juni);
		System.out.println("Durchschnitt 1 Schritt  : " + "\t" + ergebnis1);
		System.out.println("Durchschnitt 2 Schritte : " + "\t" + ergebnis2);
	}
}