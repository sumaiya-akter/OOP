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

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter for designation
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[] args) {
        // Example usage
        Employee employee = new Employee();
        employee.setName("Alice Johnson");
        employee.setId(101);
        employee.setSalary(75000.00);
        employee.setDesignation("Software Engineer");

        // Displaying employee details
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Designation: " + employee.getDesignation());
    }
}