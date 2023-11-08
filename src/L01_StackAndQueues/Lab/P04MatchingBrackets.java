package L01_StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> indexesStack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '('){
                indexesStack.push(i);
            }

            if (expression.charAt(i) == ')'){
                int startIndex = indexesStack.pop();
                System.out.println(expression.substring(startIndex, i + 1));
            }
        }
    }
}
