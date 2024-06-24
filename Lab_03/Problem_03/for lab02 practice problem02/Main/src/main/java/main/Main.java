/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.Scanner;
/**
 *
 * @author ANIK
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book 1 title: ");
        String book1Title = scanner.nextLine();
        System.out.print("Enter book 1 author: ");
        String book1Author = scanner.nextLine();
        System.out.print("Enter book 1 publication year: ");
        int book1Year = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter book 2 title: ");
        String book2Title = scanner.nextLine();
        System.out.print("Enter book 2 author: ");
        String book2Author = scanner.nextLine();
        System.out.print("Enter book 2 publication year: ");
        int book2Year = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter book 3 title: ");
        String book3Title = scanner.nextLine();
        System.out.print("Enter book 3 author: ");
        String book3Author = scanner.nextLine();
        System.out.print("Enter book 3 publication year: ");
        int book3Year = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create the book objects
        Book book1 = new Book(book1Title, book1Author, book1Year);
        Book book2 = new Book(book2Title, book2Author, book2Year);
        Book book3 = new Book(book3Title, book3Author, book3Year);

        // Display book details
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();
        book3.displayBookDetails();
        System.out.println();

        // Display the total number of books
        Book.displayTotalBooks();
    }
}