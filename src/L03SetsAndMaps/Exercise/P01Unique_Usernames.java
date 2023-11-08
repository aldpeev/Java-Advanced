package L03SetsAndMaps.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P01Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        while (n-- > 0){
            String input = scanner.nextLine();
            set.add(input);
        }

        set.forEach(System.out::println);
    }
}
