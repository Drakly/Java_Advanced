package MultiDImArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); //[4, 5]
        int rows = dimensions[0]; //брой редове
        int cols = dimensions[1]; //брой колони

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);

        String command = scanner.nextLine();


        while (!"END".equals(command)) {
            String[] commandParts = command.split("\\s+");

            if (validateCommand(commandParts, rows, cols)) {
                int rowFistElement = Integer.parseInt(commandParts[1]);
                int colFirstElement = Integer.parseInt(commandParts[2]);

                int rowSecondElement = Integer.parseInt(commandParts[3]);
                int colSecondElement = Integer.parseInt(commandParts[4]);

                String firstElement = matrix[rowFistElement][colFirstElement];
                String secondElement = matrix[rowSecondElement][colSecondElement];

                matrix[rowFistElement][colFirstElement] = secondElement;
                matrix[rowSecondElement][colSecondElement] = firstElement;

                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();

        }
    }
        private static void printMatrix (String[][]matrix){
            for (String[] row : matrix) {
                for (String element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        private static void fillMatrix (String[][]matrix, Scanner scanner){
            for (int row = 0; row < matrix.length; row++) {
                matrix[row] = (scanner.nextLine().split("\\s+"));

            }
        }


    private static boolean validateCommand(String[] commandParts, int rows, int cols) {
        if (commandParts.length != 5) {
            return false;
        }
        if (!"swap".equals(commandParts[0])) {
            return false;
        }

        int rowFistElement = Integer.parseInt(commandParts[1]);
        int colFirstElement = Integer.parseInt(commandParts[2]);
        int rowSecondElement = Integer.parseInt(commandParts[3]);
        int colSecondElement = Integer.parseInt(commandParts[4]);

        if (rowFistElement >= 0 && rowFistElement < rows && rowSecondElement >= 0 && rowSecondElement < rows
                && colFirstElement >= 0 && colFirstElement < cols && colSecondElement >= 0 && colSecondElement < cols) {
            return true;
        } else {
            return false;
        }
    }
}
