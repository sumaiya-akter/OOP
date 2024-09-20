/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author ANIK
 */
public class Engineer extends Employee {
    private double projectBonus;

    public Engineer(String name, int id, double salary, double projectBonus) {
        super(name, id, salary);
        this.projectBonus = projectBonus;
    }

    @Override
    public double calculateTotalSalary() {
        return getSalary() + projectBonus; // Total salary includes project bonus
    }

    @Override
    public String toString() {
        return super.toString() + ", Project Bonus: $" + projectBonus + ", Total Salary: $" + calculateTotalSalary();
    }
}