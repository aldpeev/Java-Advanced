package L12ExamPrep02.P02;

import java.util.Scanner;

public class Main {
    private static int col;
    private static int row;
    private static String[][] matrix;
    private static int flowers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        matrix = new String[matrixSize][];
        fillMatrixAndSetRowAndCol(scanner);

        String command = scanner.nextLine();
        while (!command.equals("End")){
            movePlayer(command, matrixSize);

            if (isOutOfBounds(matrixSize)){
                System.out.println("The bee got lost!");
                break;
            }

            command = scanner.nextLine();
        }

        if (flowers >= 5){
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowers);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - flowers);
        }

        printMatrix();

    }

    private static void fillMatrixAndSetRowAndCol(Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("");

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("B")){
                    col = i;
                    row = j;
                }
            }
        }
    }

    private static void printMatrix() {
        for (String[] row : matrix) {
            System.out.println(String.join("",row));
        }
    }

    private static void movePlayer(String command, int matrixSize) {
        matrix[col][row] = ".";

        switch (command){
            case "up":
                col--;
                break;
            case "down":
                col++;
                break;
            case "left":
                row--;
                break;
            case "right":
                row++;
                break;
        }

        if (!isOutOfBounds(matrixSize)){
            if (matrix[col][row].equals("f")){
                flowers++;
            }

            if (matrix[col][row].equals("O")){
                movePlayer(command,matrixSize);
            }

            matrix[col][row] = "B";
        }
    }

    private static boolean isOutOfBounds(int matrixSize) {
        return row < 0 || row >= matrixSize || col < 0 || col >= matrixSize;
    }
}
