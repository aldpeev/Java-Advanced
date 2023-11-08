package L05FunctionalPrograming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.*;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> parsing = Integer::parseInt;

        String[] input = scanner.nextLine().split(", ");

        int sum = 0;

        for (String s : input) {
            sum += parsing.apply(s);
        }

        System.out.printf("Count = %d%n", input.length);
        System.out.printf("Sum = %d%n", sum);


    }
}
