package L03SetsAndMaps.Exercise;

import java.util.HashMap;
import java.util.Scanner;

public class P05PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")){
            String[] data = input.split("-");

            phonebook.put(data[0], data[1]);

            input = scanner.nextLine();
        }

        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")){
            if (phonebook.containsKey(searchName)){
                System.out.printf("%s -> %s%n",searchName, phonebook.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }
            searchName = scanner.nextLine();
        }
    }
}
