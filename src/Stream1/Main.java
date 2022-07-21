package Stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random numbers");

        List<Integer> numbers = new ArrayList<>();

        int i;
        for (i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        Stream <Integer> stream1 = numbers.stream();
        stream1.distinct().forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("EVEN:");
        Stream <Integer> stream2 = numbers.stream();
        stream2.
                filter(b -> b < 17).
                filter(b -> b > 7).
                filter(b -> b % 2 == 0).
                forEach(b -> System.out.print(b + " "));
        System.out.println();
        System.out.println("Multiplication 2=");
        Stream <Integer> stream3 = numbers.stream();
        stream3.
                map(c-> c*2).
                forEach(c -> System.out.print(c + " "));
        System.out.println();
        System.out.println("Sorted");
        Stream <Integer> stream4 = numbers.stream();
        stream4.
                sorted().
                limit(4).
                forEach(c -> System.out.print(c + " "));
        System.out.println();
        System.out.println("Amount");
        Stream <Integer> stream5 = numbers.stream();
        System.out.println(stream5.count());
        System.out.println("Average");
        OptionalDouble average = numbers.stream().mapToInt(e -> e).average();
        if (average.isPresent())
        {
            System.out.print(average.getAsDouble());
        }

    }
}