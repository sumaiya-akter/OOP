/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package userinput;
import java.util.Scanner;
/**
 *
 * @author ANIK
 */
public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee 1 name: ");
        String employee1Name = scanner.nextLine();
        System.out.print("Enter employee 1 age: ");
        int employee1Age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter employee 1 designation: ");
        String employee1Designation = scanner.nextLine();
        System.out.print("Enter employee 1 salary: ");
        double employee1Salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter employee 2 name: ");
        String employee2Name = scanner.nextLine();
        System.out.print("Enter employee 2 age: ");
        int employee2Age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter employee 2 designation: ");
        String employee2Designation = scanner.nextLine();
        System.out.print("Enter employee 2 salary: ");
        double employee2Salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter employee 3 name: ");
        String employee3Name = scanner.nextLine();
        System.out.print("Enter employee 3 age: ");
        int employee3Age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter employee 3 designation: ");
        String employee3Designation = scanner.nextLine();
        System.out.print("Enter employee 3 salary: ");
        double employee3Salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        // Create the employee objects
        Employee employee1 = new Employee(employee1Name, employee1Age, employee1Designation, employee1Salary);
        Employee employee2 = new Employee(employee2Name, employee2Age, employee2Designation, employee2Salary);
        Employee employee3 = new Employee(employee3Name, employee3Age, employee3Designation, employee3Salary);

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