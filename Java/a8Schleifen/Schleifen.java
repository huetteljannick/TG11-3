package a8Schleifen;

import java.util.Scanner;

public class Schleifen {

    public static void main(String[] args) {
        // Gruppe 1 Zählschleife
        ausgabe("For Schleife");
        for (int i = 0; i < 5; i++) {
            System.out.println("i="+i);
        }

 
        // Gruppe 3 While Schleife
        ausgabe("While Schleife");
        int anz = 0;
        int i = 0;
        while (i<30) {
            i = i + ((int) (Math.random() * 6+1));
            anz++;
            System.out.println(anz);
        }

        // Gruppe 2 do-while Schleife
        ausgabe("do while Schleife");
        
        Scanner s = new Scanner(System.in);
        String pwd = "";
        do {
          System.out.print("Passwort:");
          pwd = s.next();
        } while (!pwd.equals("123"));
        System.out.println("Erfolgreich angemeldet");
        s.close();
       
        // Gruppe 4 foreach

    }

    private static void ausgabe(String meldung) {
       System.out.println(); 
       System.out.println(meldung);
       for (int i = 0; i < meldung.length(); i++) {
        System.out.print("-");
       }
       System.out.println();


    }

}
