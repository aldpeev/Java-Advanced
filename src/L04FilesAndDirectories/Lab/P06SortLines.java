package L04FilesAndDirectories.Lab;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class P06SortLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("resources/input.txt");
        PrintWriter output = new PrintWriter(new FileWriter("resources/output.txt"));


        Stream<String> lines = Files.lines(path);

        lines.sorted().forEach(output::println);

        output.close();
    }
}
