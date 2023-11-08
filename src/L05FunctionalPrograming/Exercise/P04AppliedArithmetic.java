package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        String command = scanner.nextLine();
        while (!command.equals("end")){

            Predicate<String> isPrintCommand = e -> e.equals("print");

            if (isPrintCommand.test(command)){
                System.out.println(Arrays.stream(input).map(String::valueOf).collect(Collectors.joining(" ")));
            } else {
                UnaryOperator<Integer> arithmeticOperations = operate(command);
                input = Arrays.stream(input).map(arithmeticOperations).toArray(Integer[]::new);
            }

            command = scanner.nextLine();
        }

    }

    private static UnaryOperator<Integer> operate(String command) {

        switch (command){
            case "add":
                return e -> e + 1;
            case "multiply":
                return  e -> e * 2;
            case "subtract":
                return  e -> e - 1;
            default:
                throw new IllegalArgumentException(command);
        }
    }
}
