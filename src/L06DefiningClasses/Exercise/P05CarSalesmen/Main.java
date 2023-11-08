package L06DefiningClasses.Exercise.P05CarSalesmen;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engineMap = new LinkedHashMap<>();
        List<Car> carList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        fillEngineMap(n,engineMap,scanner);

        int m = Integer.parseInt(scanner.nextLine());
        fillCarList (m, carList, scanner, engineMap);

        carList.forEach(System.out::println);

    }

    private static void fillCarList(int n, List<Car> carList, Scanner scanner, Map<String,Engine> engineMap) {
        while (n-- > 0){
            String[] data = scanner.nextLine().split(" ");
            String engineModel = data[1];

            //"{Model} {Engine} {Weight} {Color}",

            Car currentCar = null;

            switch (data.length) {
                case 4:
                    currentCar = new Car(data[0], engineMap.get(engineModel), Integer.parseInt(data[2]), data[3]);
                    break;
                case 3:
                    if (isNumber(data[2])) {
                        currentCar = new Car(data[0], engineMap.get(engineModel), Integer.parseInt(data[2]));
                    } else {
                        currentCar = new Car(data[0], engineMap.get(engineModel), data[2]);
                    }
                    break;
                case 2:
                    currentCar = new Car(data[0], engineMap.get(engineModel));
                    break;
            }

            carList.add(currentCar);

        }
    }

    private static boolean isNumber(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static void fillEngineMap(int n, Map<String,Engine> engineMap, Scanner scanner){
        while (n-- > 0) {
            String[] data = scanner.nextLine().split(" ");
            //"{Model} {Power} {Displacement} {Efficiency}".

            Engine currentEngine = null;

            switch (data.length) {
                case 4:
                    currentEngine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
                    break;
                case 3:
                    if (isNumber(data[2])) {
                        currentEngine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    } else {
                        currentEngine = new Engine(data[0], Integer.parseInt(data[1]), data[2]);
                    }
                    break;
                case 2:
                    currentEngine = new Engine(data[0], Integer.parseInt(data[1]));
                    break;
            }

            engineMap.put(data[0], currentEngine);
        }
    }


}
