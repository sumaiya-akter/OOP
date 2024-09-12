/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author ANIK
 */
public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String name) {
        super(name, "General Practitioner");
    }

    @Override
    public void displayAvailability() {
        System.out.println(getName() + " is available for walk-in patients.");
    }
}