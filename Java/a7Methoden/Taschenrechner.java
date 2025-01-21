package a7Methoden;

import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[] args) {
        // Eingabe
        Scanner s = new Scanner(System.in);
        System.out.print("Bitte geben sie die erste Zahl ein:\t");
        double zahl1 = s.nextDouble();
        System.out.print("Bitte geben sie die zweite Zahl ein:\t");
        double zahl2 = s.nextDouble();
        s.close();

        Ausgabe(zahl1, zahl2, '+', addiere(zahl1, zahl2));
        Ausgabe(zahl1, zahl2, '-', subtrahiere(zahl1, zahl2));
        Ausgabe(zahl1, zahl2, '*', multipliziere(zahl1, zahl2));
        Ausgabe(zahl1, zahl2, '/', dividiere(zahl1, zahl2));
      }
   //Verarbeitung
    public static double addiere(double zahl1, double zahl2) {
       double ergebnis = zahl1 + zahl2;
       return ergebnis;
    }

    public static double subtrahiere(double zahl1, double zahl2) {
       double ergebnis = zahl1 - zahl2;
       return ergebnis;
    }

    public static double multipliziere(double zahl1, double zahl2) {
       double ergebnis = zahl1 * zahl2;
       return ergebnis;
    }

    public static double dividiere(double zahl1, double zahl2) {
       double ergebnis = zahl1 / zahl2;
       return ergebnis;
    }

    public static void Ausgabe(double zahl1, double zahl2, char Rechenzeichen, double Ergebnis){
      System.out.printf("%f %s %f = %f\n", zahl1,Rechenzeichen, zahl2, Ergebnis);
    }

}