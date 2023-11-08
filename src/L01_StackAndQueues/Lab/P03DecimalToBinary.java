package L01_StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (num != 0) {
            stack.push(num % 2);
            num /= 2;
        }

       while (!stack.isEmpty()){
           System.out.print(stack.pop());
       }
    }
}
