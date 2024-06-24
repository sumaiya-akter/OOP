/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ANIK
 */
public class Student {
    // Class variable
    private static String university = "University of Technology";

    // Object variables
    private int id;
    private String name;
    private String department;
    private double cgpa;

    // Parameterized constructor
    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++;
    }

    // Object method to display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    // Class variable to keep track of total students
    private static int totalStudents = 0;

    // Class method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }
}