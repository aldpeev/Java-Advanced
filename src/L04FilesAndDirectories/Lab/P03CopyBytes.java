package L04FilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P03CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream("resources/input.txt");

        int streamEl = stream.read();

        while (streamEl != -1){

            boolean isSpace = streamEl == 32;
            boolean isNewLine = streamEl == 10;

            if (isSpace){
                System.out.print(" ");
            } else if (isNewLine){
                System.out.println();
            } else {
                System.out.print(streamEl);
            }

            streamEl = stream.read();
        }
    }
}
