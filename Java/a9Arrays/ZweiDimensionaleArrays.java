package a9Arrays;

public class ZweiDimensionaleArrays {
    public static void main(String[] args) {

        String[][] stundenplan = initStundenplan();
        ausgabeStundenplan(stundenplan);

    }

    public static String[][] initStundenplan() {
        String[][] stundenplan = new String[10][6];
        stundenplan = leererStundenplan(stundenplan);

        stundenplan[0][0] = "Zeit";
        stundenplan[1][0] = "7:55 - 8:40";
        stundenplan[2][0] = "8:40 - 9:25";
        stundenplan[3][0] = "9:40 - 10:25";
        stundenplan[4][0] = "10:25 - 11:10";
        stundenplan[5][0] = "11:30 - 12:15";
        stundenplan[6][0] = "12:15 - 13:00";
        stundenplan[7][0] = "13:00 - 13:45";
        stundenplan[8][0] = "13:45 - 14:30";
        stundenplan[9][0] = "14:30 - 15:15";
        

        stundenplan[0][1] = "Mo";
        stundenplan[0][2] = "Di";
        stundenplan[0][3] = "Mi";
        stundenplan[0][4] = "Do";
        stundenplan[0][5] = "Fr";

        stundenplan[3][1] = "It-Gpe";
        stundenplan[4][1] = "It-Gpel";
        stundenplan[5][1] = "It-Gpel";
        stundenplan[6][1] = "It-Gpel";

        stundenplan[1][2] = "Ggk";
        stundenplan[2][2] = "Ggk";
        stundenplan[3][2] = "It-ti";
        stundenplan[4][2] = "It-ti";
        stundenplan[5][2] = "Reli";
        stundenplan[6][2] = "Reli";

        stundenplan[1][3] = "Wil";
        stundenplan[2][3] = "Wil";
        stundenplan[3][3] = "sot";
        stundenplan[4][3] = "sot";
        stundenplan[5][3] = "ph";
        stundenplan[6][3] = "ph";
        stundenplan[8][3] = "inf";
        stundenplan[9][3] = "inf";

        stundenplan[1][4] = "e";
        stundenplan[2][4] = "e";
        stundenplan[3][4] = "mat";
        stundenplan[4][4] = "mat";
        stundenplan[5][4] = "d";

        stundenplan[1][5] = "mat";
        stundenplan[2][5] = "mat";
        stundenplan[3][5] = "d";
        stundenplan[4][5] = "d";
        stundenplan[5][5] = "ch";
        stundenplan[6][5] = "ch";

        return stundenplan;
    }


    public static void ausgabeStundenplan(String[][] stundenplan) {

        for (int i = 0; i < stundenplan.length; i++) {
            for (int j = 0; j < 6; j++) {
                
                System.out.print(stundenplan[i][j] + "\t");

                if (i == 0 && j == 0){
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }

    public static String[][] leererStundenplan(String[][] stundenplan) {

        for (int zeile = 0; zeile < stundenplan.length; zeile++) {
            for (int spalte = 0; spalte < stundenplan[0].length; spalte++) {
                
                stundenplan[zeile][spalte] = "-";

            }
        }
        return stundenplan;
    }
}
