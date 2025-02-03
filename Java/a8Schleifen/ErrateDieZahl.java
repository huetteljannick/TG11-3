package a8Schleifen;

import java.util.Scanner;

public class ErrateDieZahl {
    public static void main(String[] args) {
        int AnzahlVersuche = 0;
        int Loesung = (int) ((Math.random()*100)+1);
        int zahl;
        int diff;
        int diffVorher = 0;
       Scanner s = new Scanner(System.in);
       System.out.println("Geben sie eine Zahl zwischen 1 und 100 ein:");
        do{
            System.out.println("Zahl:");
            zahl = s.nextInt();
            AnzahlVersuche++;
            if(zahl != Loesung){
                diff = Math.abs(Loesung - zahl);
                if (diffVorher != 0 && diffVorher > diff){
                    System.out.println("heißer");
                } else if (diffVorher == 0){
                    diffVorher = diff;
                    continue;
                }
                 else {
                    System.out.println("kälter");
                } 
                diffVorher = diff;
            } else{
                System.out.printf("Du hast die richtige Zahl (%d) erraten. Dafür hast du %d Versuche gebraucht.", Loesung, AnzahlVersuche);
            }
            } while(zahl != Loesung);
        s.close();
    }
}
