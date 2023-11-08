package L03SetsAndMaps.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Double,Integer> map = new LinkedHashMap<>();

        double[] numbs = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (double number : numbs) {
            map.putIfAbsent(number, 0);
            map.put(number, map.get(number) + 1);
        }

        map.forEach((key,value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
