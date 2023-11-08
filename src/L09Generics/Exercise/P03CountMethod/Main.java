package L09Generics.Exercise.P03CountMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BoxCount<Double> stringBox = new BoxCount<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            stringBox.add(Double.parseDouble(scanner.nextLine()));
        }

        String elementToCompare = scanner.nextLine();
        System.out.println(stringBox.countGreater(Double.parseDouble(elementToCompare)));

    }


}
