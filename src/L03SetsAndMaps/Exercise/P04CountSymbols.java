package L03SetsAndMaps.Exercise;

import java.util.*;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Character, Integer> countCharMap = new TreeMap<>();

        String inputText = scanner.nextLine();
        for (char c : inputText.toCharArray()) {
            countCharMap.putIfAbsent(c, 0);
            countCharMap.put(c, countCharMap.get(c) + 1);
        }

        countCharMap.forEach((k,v) -> System.out.printf("%c: %d time/s%n", k, v));
    }
}
