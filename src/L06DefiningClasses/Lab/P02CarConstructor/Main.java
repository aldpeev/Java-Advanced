package L06DefiningClasses.Lab.P02CarConstructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n -- > 0){
            String[] inputData = scanner.nextLine().split(" ");

           if (inputData.length == 3){
               cars.add(new Car(inputData[0], inputData[1], Integer.parseInt(inputData[2])));
           } else {
               cars.add(new Car(inputData[0]));
           }

        }

        cars.forEach(System.out::println);
    }
}
