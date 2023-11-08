package L01_StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nameChildren = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque <String> childrenQueue = new ArrayDeque<>();

        Arrays.stream(nameChildren).forEach(childrenQueue::offer);

        while (childrenQueue.size() > 1){
            for (int i = 1; i < n ; i++) {
                childrenQueue.offer(childrenQueue.poll());
            }
            System.out.printf("Removed %s%n", childrenQueue.poll());
        }
        System.out.println("Last is " + childrenQueue.poll());
    }
}
