package String050722;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input string:");
        String Str1 = input.nextLine();
        System.out.println("Task 1");
        String S1;
        int b = 0;
        String[] ArrayWord = Str1.split("-");

        for (int i = 0; i < ArrayWord.length; i++) {
            S1 = "";
            char[] word = ArrayWord[i].toCharArray();

            for (int c = 0; c < word.length; c++) {
                if (Character.isDigit(word[c]) == true) S1 = S1 + word[c];//не цифра
            }
            if ((S1.length() == 4) && (b < 2)) {
                System.out.print(S1);
                b = b + 1;
            }
        }
        System.out.println();

        System.out.println("Task2");

        char[] array = Str1.toCharArray();
        for (int d = 0; d < array.length; d++) {
            if (Character.isAlphabetic(array[d])) { //не буква
                array[d] = '*';
            }
            System.out.print(array[d]);
        }
        System.out.println();

        System.out.println("Task3");

        System.out.println(Str1);
        S1 = Str1.toLowerCase();

        char[] ArrayWord2 = S1.toCharArray();
        S1 = "";
        for (int i = 0; i < ArrayWord2.length; i++) {
            if (ArrayWord2[i] == '-') {
                ArrayWord2[i] = '/';
                S1 = S1 + ArrayWord2[i];
            }
            if (Character.isAlphabetic(ArrayWord2[i]) == true) S1 = S1 + ArrayWord2[i];
        }
        StringBuilder sb = new StringBuilder(S1);
        for (int i = 1; i < sb.length(); i++) {
            if ((sb.charAt(i) == '/') && (sb.charAt(i - 1) == '/')) sb.deleteCharAt(i - 1);
        }
        System.out.println(sb);

        System.out.println("Task 4");

        System.out.println(Str1);
        S1 = Str1.toUpperCase();
        char[] ArrayWord3 = S1.toCharArray();
        S1 = "";
        for (int i = 0; i < ArrayWord3.length; i++) {
            if (ArrayWord3[i] == '-') {
                ArrayWord3[i] = '/';
                S1 = S1 + ArrayWord3[i];
            }
            if (Character.isAlphabetic(ArrayWord3[i]) == true) S1 = S1 + ArrayWord3[i];
        }

        StringBuilder sb1 = new StringBuilder(S1);
        for (int i = 1; i < sb1.length(); i++) {
            if ((sb1.charAt(i) == '/') && (sb1.charAt(i - 1) == '/')) sb1.deleteCharAt(i - 1);
        }
        System.out.println(sb1);

        System.out.println("Task 5");
        System.out.println(Str1);
        int abc = Str1.indexOf("abc");
        int ABC = Str1.indexOf("ABC");

        if ((abc == -1) & (ABC == -1)) System.out.println("Symbol abc not found");
        else System.out.println("Symbol abc is found");


    }
}
