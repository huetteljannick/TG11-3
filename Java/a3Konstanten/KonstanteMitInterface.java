package a3Konstanten;
public class KonstanteMitInterface implements Physik {

	public static void main(String[] args) {
	
	//Kraftberechnung
	//Eingabe
	double kraft; 		//kg * m/s^2
	double masse=15;	//Einheit in kg
	
	//VERARBEITUNG
	kraft = masse * ERDFALLBESCHLEUNIGUNG;
	
	//AUSGABE
	System.out.println("Kraft:"+kraft+" N");
	System.out.println(LADUNG_ELEKTRON+" C");

	}
}