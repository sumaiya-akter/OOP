/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arraysum;

/**
 *
 * @author ANIK
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}