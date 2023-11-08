package L02MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowFirst = dimensions[0];
        int colFirst = dimensions[1];

        int[][] firstMatrix = readingMatrix(rowFirst, colFirst);

        dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowSecond = dimensions[0];
        int colSecond = dimensions[1];

        int[][] secondMatrix = readingMatrix(rowSecond, colSecond);

        System.out.println(areEqual(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length){
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    return false;
                }
            }

        }

        return true;
    }

    private static int[][] readingMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }

}
