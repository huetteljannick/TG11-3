package a6Verzweigungen;

import java.util.Scanner;

public class Aufgabe {

    public static void main(String[] args) {
        // Eingabe

        Scanner s = new Scanner(System.in);
        System.out.println("Welche Zahl soll geteilt werden?");
        int zahl = s.nextInt();
        System.out.println("Durch welche Zahl soll geteilt werden?");
        int zahl2 = s.nextInt();
        System.out.println("Was ist dein Name?");
        String name = s.next();
        System.out.println("Was ist deine Email-Adresse?");
        String email = s.next();
        s.close();

        // Ausgabe
        System.out.println(AufgabeTeiler(zahl, zahl2));
        System.out.println(Namenlaenge(name));
        System.out.println(Emailpruefer(email));
    }

    // Verarbeitung
    public static String AufgabeTeiler(int zahl, int zahl2) {
        String message;

        if (zahl % zahl2 == 0) {
            message = zahl + " ist durch " + zahl2 + " teilbar.";
        } else {
            message = zahl + " ist nicht durch " + zahl2 + " teilbar.";
        }

        return message;
    }

    public static String Namenlaenge(String name) {
        String message;

        if (name.length() <= 3 || name.length() > 20) {
            message = "Der Name" + name + " passt nicht.";
        } else {
            message = "Hallo " + name;
        }

        return message;
    }

    public static String Emailpruefer(String email) {
        String message;

        if (!email.contains("@")) {
            message = "Es fehlt ein @-Zeichen.";
        } else if (!email.contains(".")) {
            message = "Es fehlt ein Punkt.";
        } else {
            message = "Deine Email-Adresse ist " + email;
        }

        return message;
    }
}