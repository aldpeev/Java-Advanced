package L05FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbs = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestNumbIndex = e -> {
            int smallest = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < e.size(); i++) {
                if (e.get(i) <= smallest){
                    smallest = e.get(i);
                    index = i;
                }
            }
           return index;
        };

        System.out.println(findSmallestNumbIndex.apply(inputNumbs));
    }
}
