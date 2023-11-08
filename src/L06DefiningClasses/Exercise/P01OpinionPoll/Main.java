package L06DefiningClasses.Exercise.P01OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String[] data = scanner.nextLine().split(" ");
            personList.add(new Person(data[0], Integer.parseInt(data[1])));
        }

        personList.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}

