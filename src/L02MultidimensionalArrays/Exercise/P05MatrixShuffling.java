package L02MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String [dimensions[0]][dimensions[1]];
        fillMatrix(scanner, matrix);

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (!command.get(0).equals("END")){

            if (command.get(0).equals("swap") && command.size() == 5 && checkIndexes(matrix, command.subList(1, command.size()), dimensions[0])){
                String firstEl = matrix[Integer.parseInt(command.get(1))][Integer.parseInt(command.get(2))];
                String secondEl = matrix[Integer.parseInt(command.get(3))][Integer.parseInt(command.get(4))];

                matrix[Integer.parseInt(command.get(3))][Integer.parseInt(command.get(4))] = firstEl;
                matrix[Integer.parseInt(command.get(1))][Integer.parseInt(command.get(2))] = secondEl;

                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkIndexes(String[][] matrix, List<String> indexes, int rowDimension) {
        Integer[] index = indexes.stream().map(Integer::parseInt).toArray(Integer[]::new);

        for (Integer i : index) {
            if (i < 0){
                return false;
            }
        }
        for (int i = 0; i < index.length; i++) {
            if (i % 2 == 0){
                if (index[i] >= matrix.length){
                    return false;
                }
            } else {
                if (index[i] >= matrix[rowDimension - 1].length){
                    return false;
                }
            }
        }
        return true;
    }

}
