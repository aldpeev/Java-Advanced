package L05FunctionalPrograming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String evenOrOdd = scanner.nextLine();

        Predicate<Integer> isValid = getIsEvenOrOdd(evenOrOdd);

        for (int i = input[0]; i <= input[1]; i++) {
            if (isValid.test(i)){
                System.out.print(i + " ");
            }

        }
    }

    private static Predicate<Integer> getIsEvenOrOdd(String evenOrOdd) {
        switch (evenOrOdd) {
            case "even":
                return n -> n % 2 == 0;
            case "odd":
                return n -> n % 2 != 0;
            default:
                throw new IllegalArgumentException(evenOrOdd);

        }
    }
}
