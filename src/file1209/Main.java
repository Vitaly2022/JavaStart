package file1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input path:");
        Scanner input = new Scanner(System.in);
        String p_file = input.nextLine();

        List<String> lines = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(p_file))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(lines); //сортируем

        for (int i = 0; i < lines.size(); i++) { //выводим сортировку
            System.out.println(lines.get(i));
        }
        //stream.sorted().forEach(b-> System.out.println(b));//можно было и стримом
        System.out.println();
        Stream<String> stream = lines.stream();
        long female = stream.filter(word -> word.contains("female")).count();
        long male = lines.size() - female;
        System.out.println("Female=" + female);
        System.out.println("Male=" + male);

        String[] wordsArray = lines.toArray(new String[lines.size()]);
        int count = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            String str = wordsArray[i];
            str = str.replaceAll("[^\\d]", "");//удаляем все кроме цифр
            int v30 = Integer.parseInt(str);
            if (v30 > 30) count++;
        }
        System.out.println("People >30 = " + count);

        File myObj = new File(p_file);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else
            System.out.println("Failed to delete the file.");


        try {
            File myObj2 = new File(p_file);
            if (myObj2.createNewFile()) {
                System.out.println("File created: " + myObj2.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter(p_file);
            myWriter.write(String.valueOf(lines));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}