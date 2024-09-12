/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ANIK
 */
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String diagnosis; // Added diagnosis field

    public Appointment(Doctor doctor, Patient patient, String date, String diagnosis) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.diagnosis = diagnosis;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void saveAppointment() {
        String appointmentDetails = "Doctor: " + doctor.getName() + ", Patient: " + patient.getName() + ", Date: " + date + ", Diagnosis: " + diagnosis;
        
        // Specify the relative path to the appointments.txt file
        String filePath = "appointments.txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(appointmentDetails);
            writer.newLine();
            System.out.println("Appointment saved successfully."); // Confirmation message
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace for debugging
            System.out.println("Error saving appointment: " + e.getMessage());
        }
    }
}
