package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(System.out::println);
    }
}
