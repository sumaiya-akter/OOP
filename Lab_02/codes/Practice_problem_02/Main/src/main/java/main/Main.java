/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author ANIK
 */
public class Main {
    public static void main(String[] args) {
        // Create three book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book3 = new Book("1984", "George Orwell", 1949);

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