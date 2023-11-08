package L04FilesAndDirectories.Exercise;

import java.io.*;

public class P03AllCapitals {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("Exercises Resources/input.txt")));
        BufferedWriter output = new BufferedWriter(new FileWriter("Exercises Resources/output.txt"));

        int el = input.read();

        while (el != -1){
            output.write(Character.toUpperCase((char) el));
            el = input.read();
        }

        output.close();

    }
}
