package L12ExamPrep02.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstBox = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondBox = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> claimedItems = new ArrayList<>();

        while (!firstBox.isEmpty() && !secondBox.isEmpty()){
            Integer firstItem = firstBox.get(0);
            Integer secondItem = secondBox.get(secondBox.size() - 1);
            int sumItems = firstItem + secondItem;

            if (sumItems % 2 == 0){
                claimedItems.add(sumItems);
                firstBox.remove(0);
            } else {
                firstBox.add(firstBox.size(), secondItem);
            }
            secondBox.remove(secondBox.size() - 1);



        }

        if (firstBox.isEmpty()){
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        int sumClaimedItems = claimedItems.stream().mapToInt(Integer::intValue).sum();

        if ( sumClaimedItems >= 100){
            System.out.printf("Your loot was epic! Value: %d%n", sumClaimedItems);
        } else {
            System.out.printf("Your loot was poor... Value: %d%n", sumClaimedItems);
        }


    }
}
