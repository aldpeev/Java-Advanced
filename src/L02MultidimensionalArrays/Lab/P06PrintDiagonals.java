package L02MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }


        int row = 0;
        int col = 0;
        while (row < matrix.length) {
            System.out.print(matrix[row][col] + " ");
            row++;
            col++;
        }
        System.out.println();

        int rowSecond = matrix.length - 1;
        int colSecond = 0;
        while (rowSecond >= 0){
            System.out.print(matrix[rowSecond][colSecond] + " ");
            rowSecond--;
            colSecond++;
        }
        System.out.println();
    }
}
