package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int[] divisible = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        BiPredicate<int[], Integer> isDivisible = (arr, i) -> {
            for (Integer integer : arr) {
                if (i % integer != 0) {
                    return false;
                }
            }

            return true;
        };


        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(divisible, i)) {
                System.out.print(i + " ");
            }
        }
    }
}
