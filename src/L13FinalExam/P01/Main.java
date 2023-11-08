package L13FinalExam.P01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> timeQueue = new ArrayDeque<>();
        ArrayDeque<Integer> taskStack = new ArrayDeque<>();

        String input = scanner.nextLine();
        Arrays.stream(input.split(" ")).map(Integer::parseInt).forEach(timeQueue::offer);
        input = scanner.nextLine();
        Arrays.stream(input.split(" ")).map(Integer::parseInt).forEach(taskStack::push);

        int dvd = 0;
        int td = 0;
        int brd = 0;
        int yrd = 0;

        while (!timeQueue.isEmpty() && !taskStack.isEmpty()){
            int firstEl = timeQueue.peek();
            int secondEl = taskStack.peek();

            int result = firstEl * secondEl;

            if (result <= 240){
                timeQueue.poll();
                taskStack.pop();
            } else {
                timeQueue.offer(timeQueue.poll());
                taskStack.push(taskStack.pop() - 2);
            }

            if (result <= 60){
                dvd++;
            } else if (result <= 120){
                td++;
            } else if (result <= 180){
                brd++;
            } else if (result <= 240){
                yrd++;
            }
        }

        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");

//        Darth Vader Ducky: 1
//        Thor Ducky: 3
//        Big Blue Rubber Ducky: 1
//        Small Yellow Rubber Ducky: 1

        System.out.printf("Darth Vader Ducky: %d%n",dvd);
        System.out.printf("Thor Ducky: %d%n", td);
        System.out.printf("Big Blue Rubber Ducky: %d%n", brd);
        System.out.printf("Small Yellow Rubber Ducky: %d%n", yrd);
    }
}
