/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vehicles;
import java.util.ArrayList;
/**
 *
 * @author ANIK
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Creating Car objects
        Car car1 = new Car("Toyota", "Camry", 24000.00, "Red", 4);
        Car car2 = new Car("Honda", "Civic", 22000.00, "Blue", 4);

        // Creating Motorcycle objects
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", "Street 750", 15000.00, "Black", true);
        Motorcycle motorcycle2 = new Motorcycle("Yamaha", "MT-07", 8000.00, "Gray", false);

        // Adding vehicles to the ArrayList
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(motorcycle1);
        vehicles.add(motorcycle2);

        // Displaying vehicle information
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}