package a9Arrays;
public class LottoArray {
    
    public static void main(String[] args) {
        
        //Ein Array für Lottozahlen erstellen und initialisieren
        int[]lottozahlen = {32,16,4,48,10,15};

        //Lottozahl ändern
        lottozahlen[2] = 49 

        //Lottozahlen ausgeben
        ausgabe(lottozahlen);
    }

    private static void ausgabe(int[] lottozahlen) {
        for (int i = 0; i < lottozahlen.length; i++) {
            System.out.println(lottozahlen[i]);
            
        }

    }
}
