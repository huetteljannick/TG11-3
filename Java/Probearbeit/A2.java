package Probearbeit;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        //Eingabe
        double punkteMax;
        double punkteErreicht;
        double note;

        Scanner s = new Scanner(System.in);
        System.out.println("Maximale Punktanzahl:");
        punkteMax = s.nextDouble();
        System.out.println("Erreichte Punktanzahl");
        punkteErreicht = s.nextDouble();
        s.close();

        //Verarbeitung

        note = -5/punkteMax * punkteErreicht + 6;

        //Ausgabe
        System.out.println("Erreichte Punkte:\t"+punkteErreicht);
        System.out.println("Maximale Punktanzahl:\t"+punkteMax);
        System.out.println("Note:\t"+ note);

    }
}
