/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

/**
 *
 * @author ANIK
 */
public class Movie {
    private String title;
    private String genre;
    private String leadActor;
    private String director;
    private int releaseYear;
    private double rating;
    private String review;

    // Constructor
    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;

        if (rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }

    // Method to display movie details
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
    }

    public static void main(String[] args) {
        // Create Movie objects
        Movie movie1 = new Movie("The Shawshank Redemption", "Drama", "Tim Robbins", "Frank Darabont", 1994, 9.2);
        Movie movie2 = new Movie("The Godfather", "Crime", "Marlon Brando", "Francis Ford Coppola", 1972, 9.2);

        // Display movie details
        movie1.displayMovieDetails();
        System.out.println();
        movie2.displayMovieDetails();
    }
}