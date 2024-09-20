/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package books;
import java.util.ArrayList;
/**
 *
 * @author ANIK
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Creating FictionBook objects
        FictionBook fiction1 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "Classic");
        FictionBook fiction2 = new FictionBook("1984", "George Orwell", 8.99, "Dystopian");

        // Creating NonFictionBook objects
        NonFictionBook nonFiction1 = new NonFictionBook("Sapiens", "Yuval Noah Harari", 14.99, "History");
        NonFictionBook nonFiction2 = new NonFictionBook("Educated", "Tara Westover", 12.99, "Memoir");

        // Adding books to the ArrayList
        books.add(fiction1);
        books.add(fiction2);
        books.add(nonFiction1);
        books.add(nonFiction2);

        // Displaying book information and performing actions
        for (Book book : books) {
            book.displayDetails();
            if (book instanceof FictionBook) {
                ((FictionBook) book).performAction();
            } else if (book instanceof NonFictionBook) {
                ((NonFictionBook) book).performAction();
            }
            System.out.println(); // For better readability
        }
    }
}