package L06DefiningClasses.Exercise.P03SpeedRacing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String[] carData = scanner.nextLine().split(" ");
            cars.put(carData[0], new Car(carData[0],Double.parseDouble(carData[1]), Double.parseDouble(carData[2])));
        }

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] carCommand = command.split(" ");

            Car currentCar = cars.get(carCommand[1]);
            currentCar.drive(Integer.parseInt(carCommand[2]));

            command = scanner.nextLine();
        }

        cars.values().forEach(System.out::println);
    }
}
