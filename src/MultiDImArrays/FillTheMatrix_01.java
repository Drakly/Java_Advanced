package MultiDImArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] params = scanner.nextLine().split(", ");
        int dimm  = Integer.parseInt(params[0]);
        String pattern  = params[1];


        int [][] matrix = new int[dimm][dimm];


        for (int row = 0; row < matrix.length; row++) {
            StringBuilder sb = new StringBuilder();;
            for (int col = 0; col < matrix[row].length; col++) {
                sb.append(matrix[row][col])
                        .append(" ");

            }
            System.out.println(sb.toString().trim());
        }
        printMultiDimArray(matrix);
    }

    public static void printMultiDimArray(int[][] array ) {
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();;
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col])
                        .append(" ");

            }
            System.out.println(sb.toString().trim());
        }
    }
    public static void printMultiDimArrayV2(int[][] array ) {
        for (int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]).replaceAll("\\[],", ""));
        }
    }
}
