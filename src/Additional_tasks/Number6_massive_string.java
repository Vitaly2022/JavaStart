package Additional_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Number6_massive_string {
    public static void main(String[] args) {
        String[] myarray = new String[5];
        Scanner vvod = new Scanner(System.in);
        int c;
        c = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input " + c + " name:");
            myarray[i] = vvod.nextLine();
            System.out.println(myarray[i]);
            c++;
        }
        System.out.println("Array:");
        System.out.println(Arrays.toString(myarray));
        Arrays.sort(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}
