package L04FilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P01SumLines {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("Exercises Resources/input.txt"));

        String line = input.readLine();
        while (line != null){

            int sum = 0;
            for (char c : line.toCharArray()) {
                sum += c;
            }
            System.out.println(sum);

            line = input.readLine();
        }
    }
}
