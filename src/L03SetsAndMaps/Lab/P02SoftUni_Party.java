package L03SetsAndMaps.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> partySet = new TreeSet<>();

        String command = scanner.nextLine();
        while  (!command.equals("PARTY")){
            partySet.add(command);
            command = scanner.nextLine();
        }

        String removingGuests = scanner.nextLine();
        while (!removingGuests.equals("END")){
            partySet.remove(removingGuests);
            removingGuests = scanner.nextLine();
        }

        System.out.println(partySet.size());
        partySet.forEach(System.out::println);
    }
}
