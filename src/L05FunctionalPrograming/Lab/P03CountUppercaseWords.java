package L05FunctionalPrograming.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] resultArr = Arrays.stream(scanner.nextLine().split(" ")).filter(s -> Character.isUpperCase(s.charAt(0))).toArray(String[]::new);

        System.out.println(resultArr.length);
        Arrays.stream(resultArr).forEach(System.out::println);

    }
}
