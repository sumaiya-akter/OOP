/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.ArrayList;
/**
 *
 * @author ANIK
 */
import java.util.ArrayList;

public class Inheritance {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> devices = new ArrayList<>();
        
        Television tv1 = new Television("Samsung", "XYZ123", 1500.0, "Black", 55);
        WashingMachine wm1 = new WashingMachine("LG", "XM456", 800.0, "White", 8);
        Television tv2 = new Television("Walton", "ABC321", 1000.0, "Silver", 42);
        WashingMachine wm2 = new WashingMachine("Singer", "XM789", 700.0, "Red", 7);
        
        // Add objects to the ArrayList
        devices.add(tv1);
        devices.add(wm1);
        devices.add(tv2);
        devices.add(wm2);
        
        System.out.println("List of TVs:");
        for (ElectronicDevice device : devices) {
            if (device instanceof Television) {
                System.out.println(device.toString());
            }
        }
        
        System.out.println();
        System.out.println("List of Washing Machines:");
        for (ElectronicDevice device : devices) {
            if (device instanceof WashingMachine) {
                System.out.println(device.toString());
            }
        }
    }
}