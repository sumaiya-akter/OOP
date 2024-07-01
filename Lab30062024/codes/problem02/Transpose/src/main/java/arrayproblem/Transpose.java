/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrayproblem;
import java.util.Scanner;
/**
 *
 * @author ANIK
 */
public class Transpose {
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();
        scanner.nextLine(); 

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
        }

        int[][] transposeMatrix = transposeMatrix(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}