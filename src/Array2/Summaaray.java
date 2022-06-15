package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Summaaray {
    public static void main(String[] args) {

        int[][] myarray = new int[3][3];

        int summa =0;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                myarray[x][y] = (int) (Math.random() * 10);
                summa+=myarray[x][y];
            }
        }
        System.out.println(Arrays.deepToString(myarray));
        System.out.print("Summa array="+summa);
    }
}
