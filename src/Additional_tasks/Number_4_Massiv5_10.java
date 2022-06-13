package Additional_tasks;


import java.util.Arrays;
import java.util.Scanner;

public class Number_4_Massiv5_10 {
    public static void main(String[] args) {
        int n;

        Scanner vvod = new Scanner(System.in);
        n = 4;

        while (n < 5 | n > 10) {
            System.out.println("Input length of massive from 5 to 10:");
            n = vvod.nextInt();
        }

        int[] myarray = new int[n];

        for (int i = 0; i < n; i++) {
            myarray[i] = (int) (Math.random() * 100);
            System.out.print(myarray[i] + " ");
        }
        System.out.println();
        int[] array_chetn = new int[n];
        int c;
        c = 0;
        for (int b = 0; b < n; b++) {
            if (myarray[b] % 2 == 0) {
                array_chetn[c] = myarray[b];
                c++;
            }
        }
        System.out.println();
        if (array_chetn[0]>0) System.out.println(Arrays.toString(array_chetn));
        else System.out.println("There are no even numbers in the array");
    }
}
