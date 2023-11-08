package L05FunctionalPrograming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P04AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        UnaryOperator<Double> pricesWithVat = e -> e * 1.2;

        System.out.println("Prices with VAT:");
        for (double v : input) {
            System.out.printf("%.2f%n", pricesWithVat.apply(v));
        }


    }
}
