/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author ANIK
 */
public class Specialist extends Doctor {
    public Specialist(String name) {
        super(name, "Specialist");
    }

    @Override
    public void displayAvailability() {
        System.out.println(getName() + " requires appointment confirmation.");
    }
}