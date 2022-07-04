package DZ;

import java.util.Scanner;

public class Vector {
    int a;

    public static double[] sum(double myarray [], double myarray2 []) {
        double[] sumvect = new double[myarray.length];
        for (int i = 0; i < myarray.length; i++) {
            sumvect[i] = myarray[i] + myarray2[i];
        }
        return sumvect;
    }

    public double[] getVector(int a) {
        double[] myArray = new double[a];
        System.out.println("Enter the elements of the vector:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            myArray[i] = input.nextInt();
        }
        return myArray;
    }


}

