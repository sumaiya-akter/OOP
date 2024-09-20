/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ANIK
 */
 public class WashingMachine extends ElectronicDevice {
    private int capacity;

    public WashingMachine(String company, String model, double price, String color, int capacity){
        super(company, model, price, color);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return super.toString() + ", Capacity: " + capacity + " kg"; // Added space before Capacity:
    }
}