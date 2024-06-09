/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Student
 */
public class Main {

    public static void main(String[] args) {
        Student  s1 = new Student ();
        s1.id=101;
        s1.name="Sumaiya";
        s1.email="sumaiya.akter1.cse@ulab.edu.bd";
        s1.cgpa=1.00;
        s1.hometown="None";
        
        Student s2= new Student ();
        s2.id=102;
        s2.name="Audhara";
        s2.email="audhara@gmail.com";
        s2.cgpa=3.45;
        s2.hometown="grave";
        
        s1.display();
         
        System.out.println("ID:"+s2.id);
        System.out.println("Name:"+s2.name);
        System.out.println("Email:"+s2.email);
        System.out.println("CGPA:"+s2.cgpa);
        System.out.println("Home Town:"+s2.hometown);
        
               
    }
}
