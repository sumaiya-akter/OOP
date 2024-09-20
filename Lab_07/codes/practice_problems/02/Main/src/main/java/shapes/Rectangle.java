/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author ANIK
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; // Area = length × width
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // Perimeter = 2(length + width)
    }

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + ", Width: " + width + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
