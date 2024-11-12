package a4Operatoren;

import java.util.Scanner;

public class Eingabe {

    public static void main(String[] args) {

        //Von der Klasse Scanner wird ein Objekt sc erstellt.
        Scanner sc = new Scanner(System.in);

        //Kommazahl einlesen
        System.out.println("Kommazahl eingeben:");
        double fkz = sc.nextDouble();

        //Ganze Zahl einlesen
        System.out.println("Ganze Zahl eingeben");
        int gz = sc.nextInt();

        //Text einlesen
        System.out.println("Dein Name:");
        String name = sc.next();

        System.out.println(fkz);
        System.out.println(gz);
        System.out.println(name);
        

    }
    
}
