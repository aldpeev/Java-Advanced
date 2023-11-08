package L04FilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "resources/input.txt";

        FileInputStream stream = new FileInputStream(path);

        FileOutputStream output = new FileOutputStream("resources/output.txt");

        Set<Character> symbols = Set.of(',', '.', '!', '?');

        int streamEl = stream.read();
        while (streamEl != -1) {
            char streamChar = (char) streamEl;
            if (!symbols.contains(streamChar)) {
                output.write(streamChar);
            }

            streamEl = stream.read();
        }
    }
}
