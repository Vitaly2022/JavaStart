package Additional_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int a = vvod.nextInt();

        int myarray[] = new int[a];

        for (int i = 0; i < a; i++) {
            myarray[i] = (int) (Math.random() * 100);
            System.out.print(myarray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a; i++) {
            if (i % 2 != 0) myarray[i] = 0;
            System.out.print(myarray[i] + " ");
        }
    }
}
