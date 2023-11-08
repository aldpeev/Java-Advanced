package L10IteraotrsAndComparators.Exercise.P02StackIterator;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> commandList = Arrays.stream(scanner.nextLine().split("[ ,]+")).collect(Collectors.toList());
        commandList.remove(0);

        ArrayDeque<Integer> dataStack = new ArrayDeque<>();
        commandList.stream().map(Integer::parseInt).forEach(dataStack::push);

        Stack stack = new Stack(dataStack);

        String command = scanner.nextLine();
        while (!command.equals("END")){
            stack.pop();
            command = scanner.nextLine();
        }

        if (!stack.isEmpty()){
            stack.forEach(System.out::println);
            stack.forEach(System.out::println);
        }

    }
}
