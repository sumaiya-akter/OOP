/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinput;
import java.util.Scanner;
/**
 *
 * @author ANIK
 */
public class Employee {
    // Class variables
    private static String companyName = "Acme Inc.";
    private static String companyAddress = "123 Main St, Anytown USA";
    private static int totalEmployees = 0;

    // Object variables
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Parameterized constructor
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        totalEmployees++;
    }

    // Object method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
    }

    // Class method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }
}