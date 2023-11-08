package L09Generics.Exercise.P02GenericSwapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<String>> boxList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            boxList.add(new Box<>(scanner.nextLine()));
        }

        int[] swapCommand = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        swap(boxList,swapCommand[0],swapCommand[1]);


        boxList.forEach(System.out::print);

    }

    public static <T> void swap (List<T> list, int index1, int index2){
        if (isIndexValid(index1,list) && isIndexValid(index2, list)){
            T elementToSwap = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, elementToSwap);
        }

    }

    private static <T> boolean isIndexValid(int index, List<T> list) {
        return index >= 0 && index < list.size();
    }
}
