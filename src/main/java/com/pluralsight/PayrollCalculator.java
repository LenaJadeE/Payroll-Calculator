package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

// Step 1:
// Java application calculator
// Their name
// Their hours worked (a floating point number)
// Their pay rate (a floating point number)
// Calculate their gross pay
// Display the employee's name and gross pay

        System.out.println("Enter your name: ");
        String employeeName = scanner.nextLine();

        System.out.println("Enter your hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.println("Enter your pay rate: ");
        double payRate = scanner.nextDouble();

        //I am going to separate the regular time and the overtime ( Standard is 40 hours )
        double regularHours;
        double overtimeHours;

        if (hoursWorked > 40) {
            regularHours = 40;
            overtimeHours = hoursWorked;
        } else {
            regularHours = hoursWorked;
            overtimeHours =0;
        }

        // Calculating the gross pay to the overtime hours (standard 1.5 for overtime hours)
        double regularPay = regularHours * payRate;
        double overtimePay = overtimeHours * payRate * 1.5;
        double grossPay = regularPay + overtimePay;

        // The output results
        System.out.println("Employee: " + employeeName);
        System.out.printf("Gross pay: $%.2f%n", grossPay);

        scanner.close();

// Step 2:
// Ensure all your changes are committed and pushed to GitHub
// Send your repository URL to your instructor

// EXERCISE 2
// In this exercise you will refactor the code from your previous payroll calculator exercise.
// Refactoring is the process of updating existing code and breaking it into smaller methods to make it more modular and easier to maintain.
// Before you start making changes: make a plan to consider how you will break up your code.
// Use your notebook to diagram your plan.
// Talk to the people in your breakout room to discuss ideas about how you might do it.

// Step 1
// Code your changes
// When you finish, we will get together as a class and examine some of the different approaches people used.

// Step 2:
// Ensure all your changes are committed and pushed to GitHub
// Send your repository URL to your instructor


    }
}