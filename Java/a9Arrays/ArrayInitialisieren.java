package a9Arrays;
public class ArrayInitialisieren {
    
    public static void main(String[] args) {
        
        double[] messwerte = new double[10];
        String[] namen = new String[20];

        //Messwerte erfassen
        messwerte[0] = 0.5;


        for (int i = 0; i < messwerte.length; i++) {
            System.out.println(messwerte[i]);

            
        }
    }
}
