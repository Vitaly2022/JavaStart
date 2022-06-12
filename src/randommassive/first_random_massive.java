package randommassive;

import java.util.Scanner;

public class first_random_massive {
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
        int min, max, summamassive;
        double average;

        min = max = myarray[0];
        summamassive = 0;

        for (int i = 0; i < a; i++) {
            summamassive = summamassive + myarray[i];
            if (myarray[i] < min) min = myarray[i];
            if (myarray[i] > max) max = myarray[i];
        }
        average = summamassive / a;
        System.out.println("Min=" + min);
        System.out.println("Max=" + max);
        System.out.println("Average=" + average);
    }
}
