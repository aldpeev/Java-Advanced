package L04FilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new FileInputStream("resources/input.txt"));

        while (scanner.hasNext()){

            if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }

            scanner.next();
        }
    }
}
