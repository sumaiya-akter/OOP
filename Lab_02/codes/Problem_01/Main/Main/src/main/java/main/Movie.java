/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ANIK
 */
public class Movie {
    // Class variables
    private static int totalMovies = 0;

    // Object variables
    private String title;
    private String director;
    private int year;

    // Parameterized constructor
    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
        totalMovies++;
    }

    // Object methods
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
    }

    // Class method
    public static int getTotalMovies() {
        return totalMovies;
    }
}