package L03SetsAndMaps.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String,Double>> storeMap = new TreeMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Revision")){
            String[] input = command.split(", ");

            String store = input[0];
            String product = input[1];
            double price = Double.parseDouble(input[2]);

            storeMap.putIfAbsent(store, new LinkedHashMap<>());
            storeMap.get(store).put(product,price);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : storeMap.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> entryInner : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entryInner.getKey(), entryInner.getValue());
            }
        }
    }
}
