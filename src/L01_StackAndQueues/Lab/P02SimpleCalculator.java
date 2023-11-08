package L01_StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> exprQueue = new ArrayDeque<>();
        String[] exprArr = scanner.nextLine().split("\\s+");

        for (String s : exprArr) {
            exprQueue.offer(s);
        }

        int result= 0;
        while (!exprQueue.isEmpty()) {
           String currentEl = exprQueue.poll();

           if (currentEl.equals("-")){
               result -= Integer.parseInt(exprQueue.poll());
           } else if (currentEl.equals("+")){
               result += Integer.parseInt(exprQueue.poll());
           } else {
               result += Integer.parseInt(currentEl);
           }
        }

        System.out.println(result);
    }
}
