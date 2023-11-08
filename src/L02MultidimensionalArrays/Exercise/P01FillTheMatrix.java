package L02MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fillingMethod = scanner.nextLine().split(", ");

        switch (fillingMethod[1]) {
            case "A":
                printMatrix(matrixFillA(Integer.parseInt(fillingMethod[0])));
                break;
            case "B":
                printMatrix(matrixFillB(Integer.parseInt(fillingMethod[0])));
                break;
        }
    }

    private static int[][] matrixFillB(int n) {
        int[][] matrix = new int[n][n];

        int num = 1;

        int row = 0;
        int col = 0;
        while (col < matrix.length){
            if (row > 0) {
                while (row > 0){
                    matrix[row - 1][col] = num;
                    num++;
                    row--;
                }
            } else {
                while (row < matrix.length){
                    matrix[row][col] = num;
                    num++;
                    row++;
                }
            }
            col++;
        }

        return matrix;
    }

    private static int[][] matrixFillA(int n) {
        int[][] matrix = new int[n][n];

        int num = 1;

        int col = 0;
        while (col < matrix.length) {
            int row = 0;
            while (row < matrix.length) {
                matrix[row][col] = num;
                num++;
                row++;
            }
            col++;
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
