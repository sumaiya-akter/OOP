/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author ANIK
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateTotalSalary() {
        return getSalary() + bonus; // Total salary includes bonus
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: $" + bonus + ", Total Salary: $" + calculateTotalSalary();
    }
}