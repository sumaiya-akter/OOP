/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author ANIK
 */
public class Main  {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, "Red", 25000);
        Car car2 = new Car("Honda", "Accord", 2021);
        
        car1.displayCarInfo();
        car2.displayCarInfo();
        
        System.out.println("Hello World!");
        
        car1.changeCar("Yellow");
        car2.changeCar("Blue", 30000);
        
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}