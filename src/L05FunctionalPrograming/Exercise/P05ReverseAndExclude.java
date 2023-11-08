package L05FunctionalPrograming.Exercise;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        input = input.stream().filter(i -> i % n != 0).collect(Collectors.toList());


        Collections.reverse(input);

        input.forEach(e -> System.out.print(e + " "));

    }
}
