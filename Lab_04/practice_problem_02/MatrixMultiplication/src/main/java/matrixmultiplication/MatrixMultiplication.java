/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matrixmultiplication;

/**
 *
 * @author ANIK
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] b = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        
        int[][] c = multiplyMatrices(a, b);
        
        System.out.println("Product of the matrices:");
        for (int[] row : c) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        return result;
    }
}