/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ANIK
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    // Constructor with all parameters
    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price; // Initialize price
    }

    // Constructor with default color and price
    public Car(String make, String model, int year) {
        this(make, model, year, "Unknown", 0.0);
    }

    public void displayCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Price: $" + this.price);
    }

    public void changeCar(String color) {
        this.color = color;
    }

    public void changeCar(String color, double price) {
        this.color = color;
        this.price = price; // Update price as well
    }
}