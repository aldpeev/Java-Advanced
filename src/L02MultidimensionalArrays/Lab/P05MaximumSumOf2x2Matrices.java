package L02MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2x2Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        String[][] result = new String[2][2];

        for (int i = 0; i < matrix.length - 1 ; i ++) {
            for (int j = 0; j < matrix[i].length - 1; j ++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    result = new String[][]{{String.valueOf(matrix[i][j]), String.valueOf(matrix[i][j + 1])},
                            {String.valueOf(matrix[i + 1][j]), String.valueOf(matrix[i + 1][j + 1])}
                    };
                }
            }
        }

        for (String[] strings : result) {
            System.out.println(String.join(" ", strings));
        }
        System.out.println(maxSum);

    }
}
