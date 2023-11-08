package L03SetsAndMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> emailBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")){

            String email = scanner.nextLine();

            String[] emailElements = email.split("\\.");
            String emailEnding = emailElements[emailElements.length - 1].toLowerCase();

            if (!emailEnding.equals("uk") && !emailEnding.equals("com") && !emailEnding.equals("us")){
                emailBook.put(input, email);
            }

            input = scanner.nextLine();
        }

        emailBook.forEach((k,v) -> System.out.printf("%s -> %s%n", k, v));
    }
}
