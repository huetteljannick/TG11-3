package a6Verzweigungen;

import java.util.Scanner;

public class TageImMonat {

    public static void main(String[] args) {
        //Eingabe
        Scanner s = new Scanner(System.in);
        System.out.println("Geben sie das Jahr ein:");
        int jahr = s.nextInt();
        System.out.println("Geben sie bitte einen Monat ein:");
        String monat = s.next();
        int TageImMonat = 0;
        s.close();

        //Verarbeitung
        switch (monat) {
            case "Januar":
            case "Maerz":
            case "Mai":
            case "Juli":
            case "August":
            case "Oktober":
            case "Dezember":
                TageImMonat = 31;
                break;

            case "April":
            case "Juni":
            case "September":
            case "November":
                TageImMonat = 30;
                break;
            
            case "Februar":
                if (jahr % 400 == 0 || (jahr % 100 != 0 && jahr % 4 == 0)) {
                    TageImMonat = 29;
                } else{
                    TageImMonat = 28;
                }
                break;

            default:
                System.out.println("Es gab einen Fehler. Bitte überprüfen sie ihre Eingabe.");
                break;
        }

        //Ausgabe
        System.out.printf("Der %s %d hat %d Tage.",monat,jahr,TageImMonat);
    }

}