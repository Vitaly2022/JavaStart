package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {

        String[][] myarray = new String[8][8];

        String white, black, sred;

        for (int x = 0; x < 8; x++) {
            System.out.println();
            white = "B";
            black = "W";
            if (x % 2 != 0) {
                white = "W";
                black = "B";
            }
            for (int y = 0; y < 8; y++) {
                if (y % 2 != 0) myarray[x][y] = white;
                else myarray[x][y] = black;
                System.out.print(myarray[x][y]+" ");
            }
        }
        //System.out.println(Arrays.deepToString(myarray));
    }
}
