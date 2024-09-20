/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package employees;
import java.util.ArrayList;
/**
 *
 * @author ANIK
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating Manager objects
        Manager manager1 = new Manager("Alice", 101, 80000.00, 10000.00);
        Manager manager2 = new Manager("Bob", 102, 90000.00, 12000.00);

        // Creating Engineer objects
        Engineer engineer1 = new Engineer("Charlie", 201, 70000.00, 5000.00);
        Engineer engineer2 = new Engineer("Diana", 202, 75000.00, 7000.00);

        // Adding employees to the ArrayList
        employees.add(manager1);
        employees.add(manager2);
        employees.add(engineer1);
        employees.add(engineer2);

        // Displaying employee information
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}