package einUndAusgaben;

public class Tausch {

	public static void main(String[] args) {

		//--------------------------
		int a = 5;
		int b =  3;

		System.out.println("Vor dem Tausch:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Ausgabe der Werte im Tausch
		int c = a ;
		a =  b ;
		b = c ;

		//----------------------------------------
		System.out.println("Nach den Tausch:");
		System.out.println("a = " + a);
		System.out.println("b = " + c);
	}
}