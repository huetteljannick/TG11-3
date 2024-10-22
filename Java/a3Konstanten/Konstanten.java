/**
* Konstanten
*/
package a3Konstanten;
public class Konstanten {

	//Globale Konstanten / Klassenkonstante	
	public final static int MEINEKLASSEN_KONSTANTE = -1;


	public static void main(String[] args) {
	//Deklaration und Initialisierung
	final int ANZAHL_RAEDER = 4;
		
	//Vorhandene Konstanten auf der Java Bibliothek
	System.out.println("die Zahl Pi:"+Math.PI);		//Konstante PI aus der Klasse Math
	System.out.println("die Euler-zahl:"+Math.E); //Konstante E aus der Klasse Math

	//Zugriff auf Konstante
	System.out.println(ANZAHL_RAEDER);
	
	//Zugriff auf Konstante
	System.out.println(ANZAHL_RAEDER);
	
	//Methode Test aufrufen
	test();
	
	}

	public static void test(){
		System.out.println("Test aufgerufen");
	}
}