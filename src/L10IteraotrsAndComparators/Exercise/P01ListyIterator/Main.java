package L10IteraotrsAndComparators.Exercise.P01ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> createCommand = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        createCommand.remove(0);

        ListyIterator listy = new ListyIterator(createCommand);

        String command = scanner.nextLine();
        while (!command.equals("END")){
            switch (command){
                case "Move":
                    System.out.println(listy.move());
                    break;
                case "HasNext":
                    System.out.println(listy.hasNext());
                    break;
                case "Print":
                    listy.print();
                    break;
                case "PrintAll":
                    listy.printAll();
                    break;
            }

            command = scanner.nextLine();
        }


    }
}
