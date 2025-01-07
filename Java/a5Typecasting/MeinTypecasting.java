package a5Typecasting;

public class MeinTypecasting {
   public static void main(String[] args) {
    int z1 = 5;
    double z2 = 3.5;
    double summe;
    int summe2;

    //Fall 1
    summe = z1 + z2; //int -> double Umwandlung ->es gibt keinen Informationsverlust -> automatisch
    System.out.println(summe);
    System.out.println(z1);

    //Fall 2
    summe2 = z1 + (int)z2; //Typecasting von double auf int -> Informationsverlust
    System.out.println(summe2);

    //double

    int z3 = 5;
    double z4 = (double) z3; // Typecasting in diesem Fall unnötig
    System.out.println(z4);

    //char

    char buchstabeA = 'A';
    String meinBuchstabe =  new String("abc");
    System.out.println(buchstabeA);
    System.out.println(meinBuchstabe);

   }
}
