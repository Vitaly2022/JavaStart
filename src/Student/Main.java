package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> Students = new ArrayList<>();
        Students.add("Andrey");
        Students.add("Vasia");
        Students.add("Sasha");
        Students.add("alex");
        Students.add("Petr");
        Students.add("petr");

        System.out.println(Students);
        System.out.println("First Task");
        System.out.print("Input name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        name = name.toLowerCase();
        Students.replaceAll(String::toLowerCase);
        System.out.println(Students);
        Stream<String> str1 = Students.stream();

        String finalName = name;
        System.out.println(str1.
                filter(word -> word.contains(finalName)).
                count());
        System.out.println("Names a:");
        Stream<String> str2 = Students.stream();
        System.out.println(str2.filter(x -> x.startsWith("a")));//разобраться

    }
}