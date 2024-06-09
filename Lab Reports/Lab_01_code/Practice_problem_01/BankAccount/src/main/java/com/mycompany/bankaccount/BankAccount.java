/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

/**
 *
 * @author ANIK
 */
public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount(123456, 1000.0);
        BankAccount account2 = new BankAccount(789012, 500.0);

        // Perform deposit and withdrawal operations
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.displayAccountDetails();

        account2.deposit(1000.0);
        account2.withdraw(300.0);
        account2.displayAccountDetails();
    }
}