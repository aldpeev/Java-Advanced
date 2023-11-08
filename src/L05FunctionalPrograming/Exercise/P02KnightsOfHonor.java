package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(s -> System.out.println("Sir " + s));
    }
}
