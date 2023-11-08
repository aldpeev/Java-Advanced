package L10IteraotrsAndComparators.Exercise.P03Froggy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(", ");

        Lake numbLake = new Lake(command);

        System.out.println(String.join(", ", numbLake));
    }
}
