package L03SetsAndMaps.Lab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> numberplateSet = new LinkedHashSet<>();

        String[] command = scanner.nextLine().split(", ");
        while(!command[0].equals("END")){

            if (command[0].equals("IN")){
                numberplateSet.add(command[1]);
            } else {
                numberplateSet.remove(command[1]);
            }

            command = scanner.nextLine().split(", ");
        }

        System.out.println(numberplateSet.isEmpty()? "Parking Lot is Empty" : String.join(System.lineSeparator(), numberplateSet));

    }
}
