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
        // Create three student objects
        Student student1 = new Student(1, "John Doe", "Computer Science", 3.8);
        Student student2 = new Student(2, "Jane Smith", "Electrical Engineering", 3.6);
        Student student3 = new Student(3, "Bob Johnson", "Mechanical Engineering", 3.9);

        // Display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        student3.displayStudentDetails();
        System.out.println();

        // Display the total number of students
        Student.displayTotalStudents();
    }
}