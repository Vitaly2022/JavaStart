package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        int[][][] myarray = new int[5][5][5];
        Scanner input = new Scanner(System.in);
        System.out.println("Input number:");

        int number = input.nextInt();

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                for (int z = 0; z < 5; z++) {
                    myarray[x][y][z] = (int) (Math.random() * 100);
                }
            }
        }

        for (int x = 0; x < 5; x++) {
            System.out.println();
            for (int y = 0; y < 5; y++) {
                System.out.println();
                for (int z = 0; z < 5; z++) {
                    System.out.print(myarray[x][y][z] + " ");
                }
            }
        }

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                for (int z = 0; z < 5; z++) {
                    myarray[x][y][z] = myarray[x][y][z] + number;
                }
            }
        }

        System.out.println("New array:");
        for (int x = 0; x < 5; x++) {
            System.out.println();
            for (int y = 0; y < 5; y++) {
                System.out.println();
                for (int z = 0; z < 5; z++) {
                    System.out.print(myarray[x][y][z] + " ");
                }
            }
        }


    }
}
