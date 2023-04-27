package opgave;

import java.lang.reflect.Array;

public class Main {
    private int findMax(int[][] matrix){
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //Make me a matrix with 5 arrays
        int[][] matrix = new int[5][];
        //Fill the arrays with 5 elements
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[5];
        }
        //Fill the arrays with random numbers
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) (Math.random() * 100);
            }
        }
        //Print the matrix
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        //Print the max
        System.out.println("Max: " + new Main().findMax(matrix));




    }
}
