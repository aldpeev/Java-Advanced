package L11ExamPrep01.P02ReVolt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        int commands = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[sizeMatrix][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("");
        }

        int col = 0;
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("f")) {
                    col = i;
                    row = j;
                }
            }
        }


        boolean isWin = false;
        for (int i = 0; i < commands; i++) {
            String command = scanner.nextLine();

            matrix[col][row] = "-";

            int[] position = playerMove(command, col, row, sizeMatrix);
            int tempCol = position[0];
            int tempRow = position[1];

            if (matrix[tempCol][tempRow].equals("B")) {
                position = playerMove(command, tempCol, tempRow, sizeMatrix);
                col = position[0];
                row = position[1];
            } else if (matrix[tempCol][tempRow].equals("-")) {
                col = tempCol;
                row = tempRow;
            } else if (matrix[tempCol][tempRow].equals("F")){
                isWin = true;
                col = tempCol;
                row = tempRow;
            }
            matrix[col][row] = "f";

            if (isWin){
                break;
            }

        }

        System.out.println(isWin ? "Player won!" : "Player lost!");
        for (String[] strings : matrix) {
            System.out.println(String.join("", strings));
        }
    }

    private static int[] playerMove(String command, int col, int row, int sizeMatrix) {
        switch (command) {
            case "up":
                col = negativeMovement(col, sizeMatrix);
                break;
            case "down":
                col = positiveMovement(col, sizeMatrix);
                break;
            case "left":
                row = negativeMovement(row, sizeMatrix);
                break;
            case "right":
                row = positiveMovement(row, sizeMatrix);
                break;
        }
        return new int[]{col, row};
    }

    public static int negativeMovement(int locationMatrix, int sizeMatrix) {
        locationMatrix--;
        if (locationMatrix < 0) {
            locationMatrix = sizeMatrix - 1;
        }
        return locationMatrix;
    }

    public static int positiveMovement(int locationMatrix, int sizeMatrix) {
        locationMatrix++;

        if (locationMatrix >= sizeMatrix) {
            locationMatrix = 0;
        }
        return locationMatrix;
    }

}
