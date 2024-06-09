/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author ANIK
 */
public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Create Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.0, 4.0);

        // Display perimeter and area
        System.out.println("Rectangle 1:");
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        System.out.println("Area: " + rect1.calculateArea());

        System.out.println("\nRectangle 2:");
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        System.out.println("Area: " + rect2.calculateArea());
    }
}