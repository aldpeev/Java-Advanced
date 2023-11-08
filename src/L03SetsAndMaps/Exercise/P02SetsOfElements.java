package L03SetsAndMaps.Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        fillSet(firstSet,n[0], scanner);
        fillSet(secondSet,n[1], scanner);

        for (Integer integer : firstSet) {
            for (Integer integer1 : secondSet) {
                if (integer.equals(integer1)){
                    System.out.print(integer + " ");
                }
            }
        }
    }

    private static void fillSet(LinkedHashSet<Integer> firstSet, int n, Scanner scanner) {
        while (n-- > 0){
            int el = scanner.nextInt();
            firstSet.add(el);
        }
    }
}
