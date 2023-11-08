package L02MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());
        Integer[][] matrix = new Integer[dimensions][];

        matrixFill(matrix, scanner);

        System.out.println(Math.abs(primaryDiagonalSum(matrix) - secondaryDiagonalSum(matrix)));

    }

    private static void matrixFill(Integer[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        }
    }

    private static int primaryDiagonalSum (Integer[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

        }
        return sum;
    }

    private static int secondaryDiagonalSum(Integer[][] matrix){
        int sum = 0;
        int i = 0;
        int j = matrix[i].length - 1;

        while (i < matrix.length && j >= 0){
            sum += matrix[i][j];
            i++;
            j--;
        }

        return sum;
    }
}
