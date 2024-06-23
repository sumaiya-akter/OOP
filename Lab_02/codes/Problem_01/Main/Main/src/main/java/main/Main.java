/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author Student
 */
public class Main  {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //Create movie objects
        Movie movie1 = new Movie("The Shawshank Redemption", "Frank Darabont", 1994);
        Movie movie2 = new Movie("Inception", "Christopher Nolan", 2010);
        //Display movie details using object methods
        System.out.println("Movie 1 details:");
        movie1.displayMovieDetails();
        System.out.println();

        System.out.println("Movie 2 details:");
        movie2.displayMovieDetails();
        System.out.println();

        // Display total number of movies using class method
        System.out.println("Total number of movies: " + Movie.getTotalMovies());
    }
}