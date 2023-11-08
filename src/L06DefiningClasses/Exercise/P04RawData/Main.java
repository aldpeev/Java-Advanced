package L06DefiningClasses.Exercise.P04RawData;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String[] carsData = scanner.nextLine().split(" ");

            Engine engine = new Engine(Integer.parseInt(carsData[1]), Integer.parseInt(carsData[2]));
            Cargo cargo = new Cargo(Integer.parseInt(carsData[3]),carsData[4]);
            Tires tires = new Tires();

            cars.add(new Car(carsData[0], engine, tires, cargo));

            int startIndex = 5;
            for (int i = 0; i < 4; i++) {
                Tire tire = new Tire(Double.parseDouble(carsData[startIndex + i]),Integer.parseInt(carsData[startIndex + i + 1]));
                tires.addTire(tire);
                startIndex++;
            }

        }

        String command = scanner.nextLine();
        if (command.equals("fragile")){
            cars.stream().filter(Car::isFragileType).forEach(e -> System.out.println(e.getModel()));
        } else {
            cars.stream().filter(Car::isFlamableType).forEach(e -> System.out.println(e.getModel()));
        }
    }
}
