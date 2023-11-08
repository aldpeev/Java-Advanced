package L03SetsAndMaps.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> set = new TreeSet<>();

        while (n-- > 0){
            String[] inputs = scanner.nextLine().split(" ");
            set.addAll(Arrays.asList(inputs));
        }

        set.forEach(e -> System.out.print(e + " "));
    }
}
