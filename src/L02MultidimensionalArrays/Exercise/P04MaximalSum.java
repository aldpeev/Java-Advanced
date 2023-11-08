package L02MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = makeArray(scanner)[0];
        int[][] matrix = new int[matrixSize][];
        matrixFill(matrix, scanner);

        System.out.println("Sum = " + maximalSum3x3MatrixOfOtherMatrix(matrix)[0]);
        
        int endingRow = maximalSum3x3MatrixOfOtherMatrix(matrix)[1];
        int endingCol = maximalSum3x3MatrixOfOtherMatrix(matrix)[2];

        for (int i = endingRow - 2; i <= endingRow; i++) {
            for (int j = endingCol - 2; j <= endingCol ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void matrixFill(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = makeArray(scanner);
        }
    }

    private static int[] makeArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[] maximalSum3x3MatrixOfOtherMatrix(int[][] matrix) {

        int biggestSum = Integer.MIN_VALUE;
        int biggestI = 0;
        int biggestJ = 0;

        int i = 2;
        while (i < matrix.length) {
            int j = 2;
            while (j < matrix[i].length) {
                int currentSum = matrix[i][j] + matrix[i][j - 1] + matrix[i][j - 2]
                        + matrix[i - 1][j] + matrix[i - 1][j - 1] + matrix[i - 1][j - 2]
                        + matrix[i - 2][j] + matrix[i - 2][j - 1] + matrix[i - 2][j - 2];
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;
                    biggestI = i;
                    biggestJ = j;
                }
                j++;
            }
            i++;
        }

        return new int[]{biggestSum, biggestI, biggestJ};
    }

}
