/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package person;

/**
 *
 * @author ANIK
 */
public class Person  {
    private String name;
    private int age;
    private String gender;
    private String address;

    // Constructor with all parameters
    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this(name, age, "Unknown", "Unknown");
    }

    // Constructor with name
    public Person(String name) {
        this(name, 0, "Unknown", "Unknown");
    }

    // Method to display person information
    public void displayPersonInfo() {
        System.out.println("Person Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
    }

    // Method to change address
    public void changeAddress(String address) {
        this.address = address;
    }

    // Method to change age and address
    public void changeAgeAndAddress(int age, String address) {
        this.age = age;
        this.address = address;
    }

    // Main method for testing
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "Female", "123 Main St");
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie");

        person1.displayPersonInfo();
        person2.displayPersonInfo();
        person3.displayPersonInfo();

        // Changing address and age for person1
        person1.changeAddress("456 Elm St");
        person1.changeAgeAndAddress(31, "456 Elm St");

        System.out.println("\nUpdated Information for Person 1:");
        person1.displayPersonInfo();
    }
}
