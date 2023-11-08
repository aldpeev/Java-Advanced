package L04FilesAndDirectories.Exercise;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("Exercises Resources/input.txt"));

        PrintWriter output = new PrintWriter(new FileWriter("Exercises Resources/output.txt"));

        Set<Character> vowels = Set.of('a','e','i','o','u');
        Set<Character> punctuation = Set.of('!','.','?',',');

        Map<String,Integer> countMap = new LinkedHashMap<>();
        countMap.put("Vowels", 0);
        countMap.put("Other symbols", 0);
        countMap.put("Punctuation", 0);

        int el = input.read();
        while (el != -1){
            char currentChar = (char) el;

            if (vowels.contains(currentChar)){
                countMap.put("Vowels", countMap.get("Vowels") + 1);
            } else if (punctuation.contains(currentChar)){
                countMap.put("Punctuation", countMap.get("Punctuation") + 1);
            } else if (!Character.isWhitespace(currentChar)){
                countMap.put("Other symbols", countMap.get("Other symbols") + 1);
            }

            el = input.read();
        }

        countMap.forEach((k,v) -> output.println(k + ": " + v));
        output.close();
    }
}
