package a4Operatoren;

import java.util.Scanner;

public class Getraenkeautomat{

	public static void main(String[] args){

	//Eingabe
	//Deklaration
	double Preis = 1.77;
	double Kosten;
	double Betrag = 9.99;
	double Rueckgeld;
	int Anzahl = 5;
	int ZweiEuro, EinEuro, FuenfzigCent, ZwanzigCent, ZehnCent, FuenfCent, ZweiCent, EinCent = 0; 
	double RueckgeldInCent = 0;
	
	//Input
	Scanner sc = new Scanner(System.in);
	System.out.println("Preis eines Getränks: ");
	Preis = sc.nextDouble();
	System.out.println("Anzahl der Getränke: ");
	Anzahl = sc.nextInt();
	System.out.println("Betrag der gezahlt wird: ");
	Betrag = sc.nextDouble();
	
	//Verarbeitung

	Kosten = Preis * Anzahl;
	Rueckgeld = Betrag - Kosten;
	//Rückgeld in Cent umrechnen
	RueckgeldInCent = Rueckgeld * 100;
	//Anzahl der 2€  Münzen
	ZweiEuro = (int)RueckgeldInCent / 200;
	RueckgeldInCent = RueckgeldInCent % 200;
	EinEuro = (int)RueckgeldInCent / 100;
	RueckgeldInCent = RueckgeldInCent % 100;
	FuenfzigCent = (int)RueckgeldInCent / 50;
	RueckgeldInCent = RueckgeldInCent % 50;
	ZwanzigCent = (int)RueckgeldInCent / 20;
	RueckgeldInCent = RueckgeldInCent % 20;
	ZehnCent = (int)RueckgeldInCent / 10;
	RueckgeldInCent = RueckgeldInCent % 10;
	FuenfCent = (int)RueckgeldInCent / 5;
	RueckgeldInCent = RueckgeldInCent % 5;
	ZweiCent = (int)RueckgeldInCent / 2;
	RueckgeldInCent = RueckgeldInCent % 2;
	EinCent = (int)RueckgeldInCent / 1;

	//Ausgabe

	System.out.println("Kosten: " + Kosten + "€" );
	System.out.println("Rueckgeld: " + Rueckgeld + "€ ");
	System.out.printf("\n 2 €  Münzen: " + ZweiEuro + "\n ");
	System.out.println("1 Euro Münzen:" + EinEuro);
	System.out.println("50 Cent Münzen:" + FuenfzigCent);
	System.out.println("20 Cent Münzen:" + ZwanzigCent);
	System.out.println("10 Cent Münzen:" + ZehnCent);
	System.out.println("5 Cent Münzen:" + FuenfCent);
	System.out.println("2 Cent Münzen:" + ZweiCent);
	System.out.println("1 Cent Münzen:" + EinCent);
	}

}
