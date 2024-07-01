/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrayobjects;

/**
 *
 * @author ANIK
 */
public class ArrayOfObjects {

    public static void main(String[] args) {
        Book[]books = new Book [3];
        books[0]=new Book ("Book 1", "Author 1", "2020", "Fiction");
         books[1]=new Book ("Book 2", "Author 2", "2018", "Thriller");
          books[2]=new Book ("Book 3", "Author 3", "2015", "Mystery");
        System.out.println("Initial Book Details:");
        for (Book book : books) {
            book.displayDetails();
        }
        books[1] = null ;
        System.out.println("Book Details after Removing an Object:");
        for (Book book:books){
            if(book!=null){
                book.displayDetails();
            }
        }
    }
}
