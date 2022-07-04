package DZ;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;
import java.util.Scanner;

import static DZ.Vector.sum;

public class Main {
    public static void main(String[] args) {

        int a =0;
        while ((a!=2 && a!=3)) {
            System.out.println("Press key [2] if x2-Vector");
            System.out.println("Press key [3] if x3-Vector:");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            if (a!=2 && a!=3) {System.out.println("Wrong choice. Reinput Vector!");};
        }

        Vector vectx = new Vector();

        System.out.println("Input 1 vector x" + a);
        double[] arr1 = vectx.getVector(a);
        System.out.println("Input 2 vector x" + a);
        double[] arr2 = vectx.getVector(a);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        double x3[] = sum(arr1, arr2);
        System.out.print("Sum vector= ");
        System.out.println(Arrays.toString(x3));

    }
}
