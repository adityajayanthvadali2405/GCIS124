package unit01;

import java.util.Arrays;

public class Miscellany {
    public static int[] squares (int n) {
        int[] squares = new int [n];
        for (int index = 0; index < squares.length; index++) {
            squares [index] = index * index;
        }
        return squares;
    }

    public static int[][] multiplicationTable (int rows, int cols) {
        int table[][] = new int [rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                table [row][col] = (row + 1) * (col + 1);
            }
        }
        return table;
    }

    public static void main (String[] args) {
        System.out.println (Arrays.toString (squares (10)));
        int [][] table = multiplicationTable (10, 10);
        for (int row = 0; row < table.length; row++) {
            System.out.println (Arrays.toString (table[row]));
        }
    } 
}
