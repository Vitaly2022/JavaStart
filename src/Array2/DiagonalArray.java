package Array2;

import java.util.Arrays;

public class DiagonalArray {
    public static void main(String[] args) {
        int[][] myarray = new int[4][4];

        for (int x = 0; x < 4; x++) {
            System.out.println();
            for (int y = 0; y < 4; y++) {
                myarray[x][y] = (int) (Math.random() * 10);
                System.out.print(myarray[x][y] + " ");
            }
        }

        int d = 0;
        for (int x = 0; x < 4; x++) {
            System.out.println();
            for (int y = 0; y < 4; y++) {

                for (int c = 0; c != d; c++) {
                    System.out.print(" ");
                }
                if (y == 0) System.out.print(myarray[x][d]);
            }

            d++;
        }

        d = 3;
        for (int x = 0; x < 4; x++) {
            System.out.println();
            for (int y = 0; y < 4; y++) {

                for (int c = 0; c != d; c++) {
                    System.out.print(" ");
                }
                if (y == 0) System.out.print(myarray[x][d]);
            }

            d--;
        }

    }
}
