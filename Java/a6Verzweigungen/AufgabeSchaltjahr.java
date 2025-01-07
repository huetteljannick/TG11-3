package a6Verzweigungen;

import java.util.Scanner;

public class AufgabeSchaltjahr {
    public static void main(String[] args) {
        //EINGABE
        int jahr;
        boolean isSchaltjahr;
        Scanner s = new Scanner(System.in);
        System.out.println("Geben sie das Jahr ein, das sie prüfen wollen:");
        jahr = s.nextInt();
        s.close();

        //VERARBEITUNG
        if (jahr % 400 == 0) {
            isSchaltjahr = true;
        } else if (jahr % 100 == 0){
                isSchaltjahr = false;
        } else if (jahr % 4 == 0) {
                isSchaltjahr = true;
        } else{
                isSchaltjahr = false;
        }
                
        //AUSGABE
        if (isSchaltjahr == true) {
            System.out.printf("Jahr %d ist ein Schaltjahr.",jahr);
        } else{
            System.out.printf("Jahr %d ist kein Schaltjahr.",jahr);
        }
    }
}
