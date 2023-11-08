package L13FinalExam.P02;

import java.util.Scanner;

public class Main {
    private static int col;
    private static int row;
    private static String[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        matrix = new String[matrixSize][];

        String[] directions = scanner.nextLine().split(", ");

        fillMatrixAndSetRowAndCol(scanner);

        int hazelnuts = 0;

        boolean isBreak = false;


        for (int i = 0; i < directions.length; i++) {
            matrix[col][row] = "*";

            switch (directions[i]){
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

            if (isOutOfBounds(matrixSize)){
                System.out.println("The squirrel is out of the field.");
                isBreak = true;
                break;
            }


            if (matrix[col][row].equals("h")){
                hazelnuts++;
                if (hazelnuts >= 3){
                    System.out.println("Good job! You have collected all hazelnuts!");
                    isBreak = true;
                    break;
                }
            }

            if (matrix[col][row].equals("t")){
                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                isBreak = true;
                break;

            }

            matrix[col][row] = "s";
        }

        if (!isBreak){
            System.out.println("There are more hazelnuts to collect.");
        }

        System.out.printf("Hazelnuts collected: %d%n", hazelnuts);


    }

    private static void fillMatrixAndSetRowAndCol(Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("");

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("s")){
                    col = i;
                    row = j;
                }
            }
        }
    }

    private static boolean isOutOfBounds(int matrixSize) {
        return row < 0 || row >= matrixSize || col < 0 || col >= matrixSize;
    }

}
