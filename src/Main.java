package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("d:/Vit/test.txt"))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] arr = lines.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
    }


}
