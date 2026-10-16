package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Step 1:
// Java application calculator
// Their name
// Their hours worked (a floating point number)
// Their pay rate (a floating point number)
// Calculate their gross pay
// Display the employee's name and gross pay

        String employeeName = getEmployeeName(scanner);
        double hoursWorked = getDouble(scanner, "Enter your hours worked: ");
        double payRate = getDouble(scanner, "Enter your pay rate: ");

        double grossPay = calculateGrossPay(hoursWorked, payRate);

        displayResults(employeeName,grossPay);

        scanner.close();

    }
    public static String getEmployeeName(Scanner scanner) {
        System.out.println("Enter your name: ");
        String employeeName = scanner.nextLine();
        return employeeName;
    }

    public static double getDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);
        double hoursWorked = scanner.nextDouble();
        return hoursWorked;
    }

    public static double calculateRegularHours(double hoursWorked) {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked;

        }
    }

    public static double calculateOvertimeHours(double hoursWorked) {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;

        }
    }
    //I am going to separate the regular time and the overtime ( Standard is 40 hours )

    public static double calculateGrossPay(double hoursWorked, double payRate) {
        double regularHours = calculateRegularHours(hoursWorked);
        double overtimeHours = calculateOvertimeHours(hoursWorked);

        // Calculating the gross pay to the overtime hours (standard 1.5 for overtime hours)
        double regularPay = regularHours * payRate;
        double overtimePay = overtimeHours * payRate * 1.5;

        double grossPay = regularPay + overtimePay;

        return regularHours + overtimeHours;

    }
        // The output results
    public static void displayResults(String employeeName, double grossPay, double total) {
        System.out.println("Employee: " + employeeName);
        System.out.printf("Gross pay: $%.2f%n", grossPay);

    }
}

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