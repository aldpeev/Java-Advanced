package L11ExamPrep01.P01OS_Planning;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> tasks = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> thread = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int taskToKill = Integer.parseInt(scanner.nextLine());

        while (taskToKill != tasks.get(tasks.size() - 1)) {
            Integer currentThread = thread.get(0);
            Integer currentTask = tasks.get(tasks.size() - 1);

            if (currentThread >= currentTask) {
                tasks.remove(currentTask);
            }
            thread.remove(currentThread);
        }

        System.out.printf("Thread with value %d killed task %d%n", thread.get(0) ,taskToKill);
        thread.forEach(e -> System.out.print(e + " "));


    }
}
