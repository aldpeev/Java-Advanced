package L01_StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> sitesStack = new ArrayDeque<>();

        String current = "";

        String command = scanner.nextLine();
        while (!command.equals("Home")) {

            if (command.equals("back")){
                if (sitesStack.isEmpty()){
                    System.out.println("no previous URLs");
                } else {
                    current = sitesStack.peek();
                    System.out.println(sitesStack.pop());
                }
            } else {
                if (current.equals("")) {
                    current = command;
                } else {
                    sitesStack.push(current);
                    current = command;
                }

                System.out.println(command);
            }

            command = scanner.nextLine();
        }
    }
}
