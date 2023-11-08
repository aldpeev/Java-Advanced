package L02MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commandLine = scanner.nextLine().split(" ");

        int row = Integer.parseInt(commandLine[0]);
        int col = Integer.parseInt(commandLine[1]);

        String[][] matrix = new String[row][col];
        
        char startingChar = 'a';

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                StringBuilder sb = new StringBuilder();

                sb.append(startingChar);
                sb.append((char) (startingChar + j));
                sb.append(startingChar);

                matrix[i][j] = String.valueOf(sb);
            }
            startingChar ++;
        }

        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] arr : matrix) {
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

}
