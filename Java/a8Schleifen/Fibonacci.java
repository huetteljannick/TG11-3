package a8Schleifen;

public class Fibonacci {
    public static void main(String[] args) {
        int limit = 10;
        int[] zahlen = getFibonacci(limit);
        for (int i=0; i < zahlen.length; i++){
            System.out.println(zahlen[i]);
        }
    }

    public static int[] getFibonacci(int limit) {
       int[] zahlen = new int[limit];
       zahlen[0] = 0;
       zahlen[1] = 1;
       for (int n = 2; n < zahlen.length; n++) {
        zahlen[n] = zahlen[n-2] + zahlen[n-1];
       }
       return zahlen;
    }
}
