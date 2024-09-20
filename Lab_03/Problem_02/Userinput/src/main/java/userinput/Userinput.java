/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package userinput;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Userinput {

    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     System.out.print("Enter a string: ");
     String input = scanner.nextLine();
     
     String reversed = reverseString (input);
     System.out.println ("Reversed string: " + reversed );
    }
    public static String reverseString (String input){
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1 ; i>=0 ; i--){
        reversed.append(input.charAt (i));
    }
    return reversed.toString();
    }
}
