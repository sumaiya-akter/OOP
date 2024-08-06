/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package employee;

/**
 *
 * @author ANIK
 */
public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor with all parameters
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Constructor with name and id
    public Employee(String name, int id) {
        this(name, id, 0.0, "Unknown");
    }

    // Constructor with name
    public Employee(String name) {
        this(name, 0, 0.0, "Unknown");
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: $" + this.salary);
        System.out.println("Designation: " + this.designation);
    }

    // Method to update salary
    public void updateSalary(double salary) {
        this.salary = salary;
    }

    // Method to update designation
    public void updateDesignation(String designation) {
        this.designation = designation;
    }

    // Method to update both salary and designation
    public void updateSalaryAndDesignation(double salary, String designation) {
        this.salary = salary;
        this.designation = designation;
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 75000, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie");

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();

        // Updating salary and designation for emp1
        emp1.updateSalary(80000);
        emp1.updateDesignation("Senior Software Engineer");

        System.out.println("\nUpdated Information for Employee 1:");
        emp1.displayEmployeeInfo();
    }
}