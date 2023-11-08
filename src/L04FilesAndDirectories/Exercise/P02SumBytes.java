package L04FilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Exercises Resources/input.txt"));

        String line = input.readLine();
        long sum = 0;
        while (line != null){

            for (char c : line.toCharArray()) {
                sum += c;
            }

            line = input.readLine();
        }

        System.out.println(sum);
    }
}
