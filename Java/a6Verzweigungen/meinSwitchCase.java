package a6Verzweigungen;

public class meinSwitchCase {

    public static void main(String[] args) {
        int auswahl = -1;

        switch (auswahl) {
            case 0: 
            case 1: 
                System.out.println("auswahl = 0 oder 1");
                break;
        
            default:
                System.out.println("Es wurde keine Auswahl getroffen");
                break;
        }
        System.out.println("Programmende");
    }
}