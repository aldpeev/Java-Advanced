package L09Generics.Exercise.P01GenericBox;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(new GenericBox<>(number));
        }
    }
}
