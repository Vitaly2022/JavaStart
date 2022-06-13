package Additional_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Number7_bubble_sort {
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

        for (int i = myarray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myarray[j] > myarray[j + 1]) {
                    int min = myarray[j + 1];
                    myarray[j + 1] = myarray[j];
                    myarray[j] = min;
                }
            }
        }
        System.out.println(Arrays.toString(myarray));

    }
}
