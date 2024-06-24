/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.Scanner;
/**
 *
 * @author ANIK
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student 1 ID: ");
        int student1Id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter student 1 name: ");
        String student1Name = scanner.nextLine();
        System.out.print("Enter student 1 major: ");
        String student1Major = scanner.nextLine();
        System.out.print("Enter student 1 GPA: ");
        double student1Gpa = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter student 2 ID: ");
        int student2Id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter student 2 name: ");
        String student2Name = scanner.nextLine();
        System.out.print("Enter student 2 major: ");
        String student2Major = scanner.nextLine();
        System.out.print("Enter student 2 GPA: ");
        double student2Gpa = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter student 3 ID: ");
        int student3Id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter student 3 name: ");
        String student3Name = scanner.nextLine();
        System.out.print("Enter student 3 major: ");
        String student3Major = scanner.nextLine();
        System.out.print("Enter student 3 GPA: ");
        double student3Gpa = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        // Create the student objects
        Student student1 = new Student(student1Id, student1Name, student1Major, student1Gpa);
        Student student2 = new Student(student2Id, student2Name, student2Major, student2Gpa);
        Student student3 = new Student(student3Id, student3Name, student3Major, student3Gpa);

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