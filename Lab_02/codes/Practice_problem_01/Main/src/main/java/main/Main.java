/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author ANIK
 */
public class Main {
    public static void main(String[] args) {
        // Create three employee objects
        Employee employee1 = new Employee("John Doe", 35, "Manager", 80000.0);
        Employee employee2 = new Employee("Jane Smith", 28, "Developer", 65000.0);
        Employee employee3 = new Employee("Bob Johnson", 42, "Senior Analyst", 75000.0);

        // Display employee details
        employee1.displayEmployeeDetails();
        System.out.println();
        employee2.displayEmployeeDetails();
        System.out.println();
        employee3.displayEmployeeDetails();
        System.out.println();

        // Display the total number of employees
        Employee.displayTotalEmployees();
    }
}