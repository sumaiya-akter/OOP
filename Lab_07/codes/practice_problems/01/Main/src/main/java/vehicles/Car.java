/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author ANIK
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, double price, String color, int numberOfDoors) {
        super(brand, model, price, color);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numberOfDoors;
    }
}