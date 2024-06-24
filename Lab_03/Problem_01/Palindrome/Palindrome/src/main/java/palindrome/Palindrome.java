/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package palindrome;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print( "Enter a number: ");
        int number = input.nextInt ();
        if (isPalindrome(number)){
            System.out.println ("The number is a palindrome.");
        }else {
            System.out.println ("The number is not a palindrome.");
        }
        input.close();
        }
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverseNumber = 0;
        while (number != 0){
            int reminder = number % 10 ;
            reverseNumber =  reverseNumber * 10 + reminder ;
            number /= 10;
           
        }
        return originalNumber == reverseNumber ;
    }
}
