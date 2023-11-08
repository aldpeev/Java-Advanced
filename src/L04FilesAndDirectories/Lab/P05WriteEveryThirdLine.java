package L04FilesAndDirectories.Lab;

import java.io.*;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("resources/input.txt"));

        PrintWriter output = new PrintWriter(new FileWriter("resources/output.txt"));

        String line = input.readLine();
        int lines = 0;
        while (line != null){
            lines++;
            if (lines % 3 == 0){
                output.println(line);
            }

            line = input.readLine();
        }

        input.close();
        output.close();

    }
}
