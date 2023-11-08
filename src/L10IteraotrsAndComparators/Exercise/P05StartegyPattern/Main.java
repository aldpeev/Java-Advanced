package L10IteraotrsAndComparators.Exercise.P05StartegyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Person> personSetName = new TreeSet<>(new PersonNameComparator());
        TreeSet<Person> personSetAge = new TreeSet<>(new PersonAgeComparator());

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String[] personData = scanner.nextLine().split(" ");
            Person person = new Person(personData[0],Integer.parseInt(personData[1]));

            personSetName.add(person);
            personSetAge.add(person);
        }

        personSetName.forEach(e -> System.out.printf("%s %d%n", e.getName(), e.getAge()));
        personSetAge.forEach(e -> System.out.printf("%s %d%n", e.getName(), e.getAge()));
    }
}
