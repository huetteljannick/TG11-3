package a8Schleifen;

public class Fibonacci {
    public static void main(String[] args) {
        //Limit
        int limit = 10;
        int[] zahlen = getFibonacci(limit);
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
        //Endwert
        int endwert = 100;
        printFibonacci(endwert);

    }

    public static int[] getFibonacci(int limit) {
        int[] zahlen = new int[limit];
        zahlen[0] = 0;
        zahlen[1] = 1;
        for (int n = 2; n < zahlen.length; n++) {
            zahlen[n] = zahlen[n - 2] + zahlen[n - 1];
        }
        return zahlen;
    }

    public static void printFibonacci(int endwert) {
        int a = 0;
        int b = 1;
        System.out.printf("Fibonacci Reihenfolge: %d, %d", a, b);
        while (b < endwert) {
            int next = a + b;
            if (next > endwert) {
                break;
            }
            System.out.printf(", %d", next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
