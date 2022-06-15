package Array2;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[][] myarray = new int[5][5];

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                myarray[x][y] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(myarray));

        for (int k = 0; k < 5; k++) {
            for (int x = 4; x > 0; x--) {
                for (int j = 0; j < x; j++) {
                    if (myarray[k][j] > myarray[k][j + 1]) {
                        int max = myarray[k][j];
                        myarray[k][j] = myarray[k][j + 1];
                        myarray[k][j + 1] = max;
                    }
                }
            }
        }
     System.out.println(Arrays.deepToString(myarray));
    }
}
