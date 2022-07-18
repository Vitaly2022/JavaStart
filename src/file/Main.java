package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input path:");
        Scanner input = new Scanner(System.in);
        String p_file=input.nextLine();

        List<String> lines = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(p_file))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] arr = lines.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));

        for (int i=0;i<arr.length; i++){
            if ((MetodSting.find1(arr[i])==1) && (arr[i].length()!=15))
                System.out.println("Строка не начинается с ....");
            else System.out.println("Все норм");
        }
    }


}


