package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06PredicateForName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        String[] inputNames = scanner.nextLine().split(" ");

        Arrays.stream(inputNames).filter(s -> s.length() <= length).forEach(System.out::println);
    }
}
