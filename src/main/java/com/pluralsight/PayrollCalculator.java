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










// Step 2:
// Ensure all your changes are committed and pushed to GitHub
// Send your repository URL to your instructor







    }
}