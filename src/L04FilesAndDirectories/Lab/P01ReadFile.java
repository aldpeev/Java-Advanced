package L04FilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P01ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "resources\\input.txt";

        FileInputStream fileStream = new FileInputStream(path);

        int streamEl = fileStream.read();
        while (streamEl != -1){

            System.out.print(Integer.toBinaryString(streamEl) + " ");

            streamEl = fileStream.read();
        }
    }
}
