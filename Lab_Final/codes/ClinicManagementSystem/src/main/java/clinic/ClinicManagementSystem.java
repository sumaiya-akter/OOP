/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clinic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ANIK
 */
public class ClinicManagementSystem {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public ClinicManagementSystem() {
        // Sample doctors
        doctors.add(new GeneralPractitioner("Dr. Smith"));
        doctors.add(new Specialist("Dr. Johnson"));
    }

    public void registerPatient(String name, String contact) {
        patients.add(new Patient(name, contact));
        System.out.println("Patient registered successfully: " + name);
    }

    public void addDoctor(String name, String specialization) {
        doctors.add(new Specialist(name)); // You can modify to add different types of doctors
        System.out.println("Doctor added successfully: " + name);
    }

    public void viewDoctors() {
        System.out.println("Available Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
            doctor.displayAvailability();
        }
    }

    public void bookAppointment() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        
        System.out.print("Enter patient contact: ");
        String patientContact = scanner.nextLine();
        
        // Check if the patient already exists
        Patient patient = null;
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(patientName)) {
                patient = p; // Reuse existing patient
                break;
            }
        }

        // If the patient does not exist, register them
        if (patient == null) {
            patient = new Patient(patientName, patientContact);
            registerPatient(patientName, patientContact);
        }

        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();

        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String appointmentDate = scanner.nextLine();

        System.out.print("Enter diagnosis: ");
        String diagnosis = scanner.nextLine();

        Doctor selectedDoctor = null;
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(doctorName)) {
                selectedDoctor = doctor;
                break;
            }
        }

        if (selectedDoctor != null) {
            Appointment appointment = new Appointment(selectedDoctor, patient, appointmentDate, diagnosis);
            appointment.saveAppointment();
            patient.addAppointment(appointment); // Add appointment to patient's list
            selectedDoctor.addAppointment(appointment); // Add appointment to doctor's list
            System.out.println("Appointment booked for " + patientName + " with " + doctorName + " on " + appointmentDate);
        } else {
            System.out.println("Doctor not found.");
        }
    }

    public void showAppointments() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name to view appointments: ");
        String patientName = scanner.nextLine();

        Patient selectedPatient = null;
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(patientName)) {
                selectedPatient = patient;
                break;
            }
        }

        if (selectedPatient != null) {
            System.out.println("Appointments for " + selectedPatient.getName() + ":");
            for (Appointment appointment : selectedPatient.getAppointments()) {
                System.out.println("Date: " + appointment.getDate() + ", Doctor: " + appointment.getDoctor().getName() + ", Diagnosis: " + appointment.getDiagnosis());
            }
        } else {
            System.out.println("Patient not found.");
        }
    }

    public void showDoctorAppointments() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter doctor's name to view their appointments: ");
        String doctorName = scanner.nextLine();

        Doctor selectedDoctor = null;
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(doctorName)) {
                selectedDoctor = doctor;
                break;
            }
        }

        if (selectedDoctor != null) {
            System.out.println("Appointments for " + selectedDoctor.getName() + ":");
            for (Appointment appointment : selectedDoctor.getAppointments()) {
                System.out.println("Date: " + appointment.getDate() + ", Patient: " + appointment.getPatient().getName() + ", Diagnosis: " + appointment.getDiagnosis());
            }
        } else {
            System.out.println("Doctor not found.");
        }
    }

    public static void main(String[] args) {
        ClinicManagementSystem system = new ClinicManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Clinic Management System ---");
            System.out.println("1. View Available Doctors");
            System.out.println("2. Book an Appointment");
            System.out.println("3. Show Patient Appointments");
            System.out.println("4. Show Doctor Appointments");
            System.out.println("5. Add a Doctor");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.viewDoctors();
                    break;
                case 2:
                    system.bookAppointment();
                    break;
                case 3:
                    system.showAppointments();
                    break;
                case 4:
                    system.showDoctorAppointments();
                    break;
                case 5:
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter doctor specialization: ");
                    String specialization = scanner.nextLine();
                    system.addDoctor(doctorName, specialization);
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}