package L03SetsAndMaps.Lab;

import java.util.*;

public class P05AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<Double>> studentsMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");

            String name = command[0];
            double grade = Double.parseDouble(command[1]);

            studentsMap.putIfAbsent(name, new ArrayList<>());
            studentsMap.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> stringListEntry : studentsMap.entrySet()) {
            System.out.print(stringListEntry.getKey() + " -> ");
            stringListEntry.getValue().forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)", stringListEntry.getValue().stream().mapToDouble(Double::doubleValue).sum() / stringListEntry.getValue().size());
            System.out.println();
        }
    }
}
