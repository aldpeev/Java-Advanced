package L01_StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] command = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] elementsForStack = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(elementsForStack).limit(command[0]).forEach(stack::push);

        for (int i = 0; i < command[1]; i++) {
            stack.pop();
        }

        if (stack.contains(command[2])){
            System.out.println("true");
        } else if (!stack.isEmpty()) {
            System.out.println(Collections.min(stack));
        } else {
            System.out.println(0);
        }
    }
}
