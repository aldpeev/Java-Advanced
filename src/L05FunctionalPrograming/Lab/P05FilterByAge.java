package L05FunctionalPrograming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P05FilterByAge {
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");

            personList.add(new Person(data[0], Integer.parseInt(data[1])));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Person> filterAge = filterByAge(condition, age);
        Consumer<Person> print = printByFormat(format);

        personList.stream().filter(filterAge).forEach(print);
    }

    private static Consumer<Person> printByFormat(String format) {
        switch (format) {
            case "name":
               return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
                throw new IllegalArgumentException("Unknown format" + format);
        }

    }

    private static Predicate<Person> filterByAge(String condition, int age) {
        switch (condition) {
            case "younger":
                return p -> p.age <= age;
            case "older":
                return p -> p.age >= age;
            default:
                throw new IllegalArgumentException("Unknown condition" + condition);
        }
    }
}
