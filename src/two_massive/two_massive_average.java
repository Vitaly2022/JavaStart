package two_massive;

import java.util.Arrays;

public class two_massive_average {
    public static void main(String[] args) {
        int myarray[] = new int[5];
        int myarray2[] = new int[5];
        int sum_ar, sum_ar2;

        sum_ar = 0;
        sum_ar2 = 0;

        for (int i = 0; i < 5; i++) {
            myarray[i] = (int) (Math.random() * 100);
            sum_ar = sum_ar + myarray[i];
            myarray2[i] = (int) (Math.random() * 100);
            sum_ar2 = sum_ar2 + myarray2[i];
        }
        double average, average2;

        average = sum_ar / 5.0;
        average2 = sum_ar2 / 5.0;

        System.out.println(Arrays.toString(myarray));
        System.out.println("Summa massive1=" + sum_ar);
        System.out.println("Average massive1=" + average);
        System.out.println();
        System.out.println(Arrays.toString(myarray2));
        System.out.println("Summa massive2=" + sum_ar2);
        System.out.println("Average massive2=" + average2);
        System.out.println();
        if (average > average2) System.out.println("Average massive 1>massive2");
        if (average < average2) System.out.println("Average massive 2>massive1");
        if (average == average2) System.out.println("Average massive1 = Average 2");
    }
}
