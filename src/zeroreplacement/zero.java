package zeroreplacement;

import java.util.Arrays;
import java.util.Scanner;


public class zero {
    public static void main(String[] args) {
        int[] myarray = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(myarray));

        Scanner vvod = new Scanner(System.in);

        System.out.println("Input number to Delete:");
        int Number = vvod.nextInt();
        int i;
        for (i = 0; i < myarray.length; i++) {
            if (myarray[i] == Number) {
                myarray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(myarray));


    }
}
