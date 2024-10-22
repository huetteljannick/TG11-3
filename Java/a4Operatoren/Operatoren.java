package a4Operatoren;
public class Operatoren {

	
	public static void main(String[] args) {
		//Eingabe
		double z1 =11;
		double z2 =2;
		int a = 9;	//1001
		int b = 7; //0111
		++z1; //erhöhe z um 1 is gleich wie z=z+1

		//Verarbeitung
		double sum = z1+z2; //Plusoperator
		double dif = z1-z2;	//Minusoperator
		double mul = z1*z2;		//Multiplikationsoperator
		double div = z1/z2;		//Divisionsoperator
		double modulo = z1 % z2; //Rest einer Division
		int und = a&b; //Binäre Und-Verknüpfung
		int zweiR = a>>2; //Bitshift um 2 stellen nach rechts
	
		//Ausgabe
		System.out.println(z1+"+"+z2+"="+sum);
		System.out.println(z1+"-"+z2+"="+sum);
		System.out.println(z1+"*"+z2+"="+sum);
		System.out.println(z1+"/"+z2+"="+sum);
		System.out.println(z1+"%"+z2+"="+modulo);
		System.out.println(z1+"&"+z2+"="+und);
		System.out.println(z1+">>2"+"="+zweiR);
	}
}