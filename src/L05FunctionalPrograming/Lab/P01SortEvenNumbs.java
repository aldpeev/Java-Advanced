package L05FunctionalPrograming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P01SortEvenNumbs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        IntPredicate isEven = n -> n % 2 == 0;

        String evenNumbs = Arrays.stream(arr).filter(isEven).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        String sorted = Arrays.stream(arr).filter(isEven).sorted().mapToObj(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(evenNumbs);
        System.out.println(sorted);
    }
}
