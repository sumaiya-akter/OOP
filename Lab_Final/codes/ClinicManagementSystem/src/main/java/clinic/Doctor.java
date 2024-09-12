/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ANIK
 */
public abstract class Doctor {
    private String name;
    private String specialization;
    private List<Appointment> appointments; // List to store appointments

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public abstract void displayAvailability();
}