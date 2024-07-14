/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bookcollection;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author ANIK
 */
public class BookCollection {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Book1", "Author1", 2001, "Genre1"));
        bookList.add(new Book("Book2", "Author2", 2002, "Genre2"));
        bookList.add(new Book("Book3", "Author3", 2003, "Genre3"));
        
        System.out.println("Books in ArrayList:");
        for (Book book : bookList) {
            book.displayDetails();
        }

        bookList.remove(1);
        System.out.println("After removal in ArrayList:");
        for (Book book : bookList) {
            book.displayDetails();
        }

        // Using LinkedList
        LinkedList<Book> bookLinkedList = new LinkedList<>();
        bookLinkedList.add(new Book("Book1", "Author1", 2001, "Genre1"));
        bookLinkedList.add(new Book("Book2", "Author2", 2002, "Genre2"));
        bookLinkedList.add(new Book("Book3", "Author3", 2003, "Genre3"));

        System.out.println("Books in LinkedList:");
        for (Book book : bookLinkedList) {
            book.displayDetails();
        }

        bookLinkedList.remove(1);
        System.out.println("After removal in LinkedList:");
        for (Book book : bookLinkedList) {
            book.displayDetails();
        }
    }
}