package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> people = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Party!")) {
            String[] commandData = command.split(" ");
            Predicate<String> filterPeople = filterPeople(commandData[1], commandData[2]);

            if (commandData[0].equals("Remove")) {
                people = people.stream().filter(filterPeople.negate()).collect(Collectors.toList());
            } else {
                String[] peopleToDouble = people.stream().filter(filterPeople).distinct().toArray(String[]::new);
                doublingPeople (people, peopleToDouble);
            }

            command = scanner.nextLine();
        }

        if (people.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(String.join(", ", people) + " are going to the party!");
        }

    }

    private static void doublingPeople(List<String> people, String[] peopleToDouble) {
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < peopleToDouble.length; j++) {
                if (people.get(i).equals(peopleToDouble[j])){
                    people.add(i, peopleToDouble[j]);
                    i++;
                }
            }
        }
    }

    private static Predicate<String> filterPeople(String commandLetter, String letter) {

        switch (commandLetter) {
            case "StartsWith":
                return s -> s.startsWith(letter);
            case "EndsWith":
                return s -> s.endsWith(letter);
            case "Length":
                return s -> s.length() == Integer.parseInt(letter);
            default:
                throw new IllegalArgumentException(commandLetter);
        }
    }
}
