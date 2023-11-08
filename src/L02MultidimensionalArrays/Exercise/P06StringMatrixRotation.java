package L02MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine().split("[()]")[1]);
        int angleOfRotation = rotation % 360;

        List<List<Character>> matrix = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            matrix.add(new ArrayList<>());
            for (int i = 0; i < command.length(); i++) {
                matrix.get(matrix.size() - 1).add(command.charAt(i));
            }
            command = scanner.nextLine();
        }

        int longestSequence = findLongestSequence(matrix);
        addEmptyChars(matrix, longestSequence);

        switch (angleOfRotation){
            case 0:
                for (int i = 0; i < matrix.size(); i++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < matrix.get(i).size(); j++) {
                        sb.append(matrix.get(i).get(j));
                    }
                    System.out.println(sb);
                }
                break;
            case 90:
                int col = 0;
                while (col < matrix.get(0).size()){
                    StringBuilder sb = new StringBuilder();
                    int row = matrix.size() - 1;
                    while (row >= 0) {
                        sb.append(matrix.get(row).get(col));
                        row--;
                    }
                    col++;
                    System.out.println(sb);
                }
                break;
            case 180:
                for (int i = matrix.size() - 1 ; i >= 0 ; i--) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = matrix.get(i).size() - 1; j >= 0 ; j--) {
                        sb.append(matrix.get(i).get(j));
                    }
                    System.out.println(sb);
                }
                break;
            case 270:
                int col1 = matrix.get(0).size() - 1;
                while (col1 >= 0){
                    StringBuilder sb = new StringBuilder();
                    int row = 0;
                    while (row < matrix.size()) {
                        sb.append(matrix.get(row).get(col1));
                        row++;
                    }
                    col1--;
                    System.out.println(sb);
                }

                break;
        }



    }

    private static void addEmptyChars(List<List<Character>> matrix, int longestSequence) {
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get(i).size() < longestSequence) {
                int elementsToAdd = longestSequence - matrix.get(i).size();
                for (int j = 0; j < elementsToAdd; j++) {
                    matrix.get(i).add(' ');
                }
            }
        }
    }

    private static int findLongestSequence(List<List<Character>> matrix) {
        int longestSequence = 0;
        for (List<Character> characters : matrix) {
            if (longestSequence < characters.size()) {
                longestSequence = characters.size();
            }
        }
        return longestSequence;
    }
}
