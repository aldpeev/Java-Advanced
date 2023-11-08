package L04FilesAndDirectories.Exercise;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class P06WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Exercises Resources/words.txt"));

        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();

        String[] wordsArr = input.readLine().split(" ");
        for (String word : wordsArr) {
            countMap.put(word, 0);
        }

        BufferedReader textReader = new BufferedReader(new FileReader("Exercises Resources/text.txt"));
        String[] text = textReader.readLine().split(" ");

        for (String word : text) {
            if (countMap.containsKey(word)){
                countMap.put(word, countMap.get(word) + 1);
            }
        }

        PrintWriter output = new PrintWriter(new FileWriter("Exercises Resources/output.txt"));

        countMap.forEach((k,v) -> output.println(k + " - " + v));

        output.close();

    }
}
