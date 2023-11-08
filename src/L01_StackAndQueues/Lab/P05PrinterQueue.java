package L01_StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        ArrayDeque<String> printQueue = new ArrayDeque<>();
        while (!command.equals("print")){

            switch (command){
                case "cancel":
                    if (printQueue.isEmpty()){
                        System.out.println("Printer is on standby");
                    } else {

                        System.out.printf("Canceled %s%n", printQueue.poll());
                    }
                    break;
                default:
                    printQueue.offer(command);
                    break;
            }

            command = scanner.nextLine();
        }

        for (String s : printQueue){
            System.out.println(s);
        }
    }
}
