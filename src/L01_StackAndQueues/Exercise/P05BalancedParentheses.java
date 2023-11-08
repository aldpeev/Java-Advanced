package L01_StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < input.length() / 2; i++) {
            stack.push(String.valueOf(input.charAt(i)));
        }

        for (int i = input.length() / 2; i < input.length(); i++) {
            queue.offer(String.valueOf(input.charAt(i)));
        }

        boolean isMirrored = true;
        for (int i = 0; i < stack.size(); i++) {
            String stackValue = stack.pop();
            String queueValue = queue.poll();

            if (stackValue.equals("{") && !queueValue.equals("}")) {
                isMirrored = false;
            } else if (stackValue.equals("[") && !queueValue.equals("]")) {
                isMirrored = false;
            } else if (stackValue.equals("(") && !queueValue.equals(")")) {
                isMirrored = false;
            }
        }

        if (isMirrored) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
