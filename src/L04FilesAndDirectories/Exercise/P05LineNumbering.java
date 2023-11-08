package L04FilesAndDirectories.Exercise;

import java.io.*;

public class P05LineNumbering {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("Exercises Resources/inputLineNumbers.txt"));

        PrintWriter output = new PrintWriter(new FileWriter("Exercises Resources/output.txt"));

        String line = input.readLine();
        int count = 1;
        while (line != null){
            output.printf("%d. %s%n", count, line);

            count++;
            line = input.readLine();
        }

        input.close();
        output.close();


    }
}
