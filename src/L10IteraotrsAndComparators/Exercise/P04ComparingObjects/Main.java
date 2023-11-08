package L10IteraotrsAndComparators.Exercise.P04ComparingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("END")){

            personList.add(new Person(command[0], Integer.parseInt(command[1]), command[2]));
            command = scanner.nextLine().split(" ");
        }

        int index = Integer.parseInt(scanner.nextLine());

        Person nthPerson = personList.get(index - 1);

        int countEqual = (int) personList.stream().filter(e -> e.compareTo(nthPerson) == 0).count();

        if (countEqual == 1){
            System.out.println("No matches");
        } else{
            System.out.print(countEqual + " ");
            System.out.print(personList.stream().filter(e -> e.compareTo(nthPerson) != 0).count() + " ");
            System.out.print(personList.size());
        }


    }
}
