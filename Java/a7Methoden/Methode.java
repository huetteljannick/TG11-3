package a7Methoden;

public class Methode {
    public static void main(String[] args) {
        leereMethode();
        leereMethode();

        EingabeMethode("Test");
        EingabeMethode("Test2");

        String Ausgabe = AusgabeMethode();
        System.out.println(AusgabeMethode());
    }

    
    public static void leereMethode() {
        System.out.println("Das ist eine Methode.");
    }
    
    public static void EingabeMethode(String Eingabe) {
        System.out.println("Diese Methode hat den Eingabewert: " + Eingabe);
    }

    private static String AusgabeMethode() {
     String Ausgabe = "Ausgabe";
     return Ausgabe;
    }
}
