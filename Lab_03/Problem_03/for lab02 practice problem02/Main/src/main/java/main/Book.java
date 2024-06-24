/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ANIK
 */
public class Book {
    // Class variable
    private static String genre = "Fiction";

    // Object variables
    private String title;
    private String author;
    private int year;

    // Parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        totalBooks++;
    }

    // Object method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    // Class variable to keep track of total books
    private static int totalBooks = 0;

    // Class method to display the total number of books
    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }
}