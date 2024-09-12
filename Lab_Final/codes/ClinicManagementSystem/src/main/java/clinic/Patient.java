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
public class Patient {
    private String name;
    private String contact;
    private List<Appointment> appointments; // List to store appointments

    public Patient(String name, String contact) {
        this.name = name;
        this.contact = contact;
        this.appointments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}