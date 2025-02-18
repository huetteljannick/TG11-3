package a9Arrays;

public class RotiereArray {
    public static void main(String[] args) {

        int[][] array = initArray();
        ausgabeArray(array);
        System.out.println();
        rotiereArray(array);

    }

    public static int[][] initArray() {
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[1][0] = 2;
        array[2][0] = 3;
        array[0][1] = 4;
        array[1][1] = 5;
        array[2][1] = 6;
        array[0][2] = 7;
        array[1][2] = 8;
        array[2][2] = 9;

        return array;
        
    }


    public static void ausgabeArray(int[][] array) {

        for (int zeile = 0; zeile < array.length; zeile++) {
            for (int spalte = 0; spalte < array[0].length; spalte++) {
                
                System.out.print(array[spalte][zeile] + "\t");

            }
            System.out.println();
        }
    }
    
    public static void rotiereArray(int[][] array) {
        for (int zeile = 0; zeile < array.length; zeile++) {
            for (int spalte = array[0].length-1; spalte >= 0; spalte--) {
                
                System.out.print(array[zeile][spalte] + "\t");

            }
            System.out.println();
        }
    }
}
