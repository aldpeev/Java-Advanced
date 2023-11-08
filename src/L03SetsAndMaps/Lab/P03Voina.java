package L03SetsAndMaps.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeque = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondDeque = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 50; i > 0; i--) {

            Integer firstCard = firstDeque.iterator().next();
            Integer secondCard = secondDeque.iterator().next();

            firstDeque.remove(firstCard);
            secondDeque.remove(secondCard);

            if (firstCard > secondCard){
                firstDeque.add(firstCard);
                firstDeque.add(secondCard);

            } else if (secondCard > firstCard){
                secondDeque.add(firstCard);
                secondDeque.add(secondCard);
            }

            if (firstDeque.isEmpty() || secondDeque.isEmpty()){
                break;
            }
        }

        if (firstDeque.size() > secondDeque.size()){
            System.out.println("First player win!");
        } else if (firstDeque.size() < secondDeque.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }
}
