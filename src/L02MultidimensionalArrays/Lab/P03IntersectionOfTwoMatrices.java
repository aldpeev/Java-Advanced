package L02MultidimensionalArrays.Lab;

import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int matrixElements = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = matrixCreator(matrixSize,matrixElements);
        char[][] secondMatrix = matrixCreator(matrixSize,matrixElements);

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    System.out.print("* ");
                } else {
                    System.out.print(firstMatrix[i][j] + " ");
                }

            }
            System.out.println();

        }
    }

    private static char[][] matrixCreator(int matrixSize, int matrixElements) {
        char[][] matrix = new char[matrixSize][matrixElements];
        for (int i = 0; i < matrix.length; i++) {
            String elements = scanner.nextLine().replaceAll("\\s+", "");
            matrix[i] = elements.toCharArray();
        }

        return matrix;
    }
}
