package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] arr = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        Function<Integer[],Integer> smallestNumb = a -> Arrays.stream(a).mapToInt(e -> e).min().getAsInt();

        System.out.println(smallestNumb.apply(arr));
    }
}
