package com.example.calculatorapp;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.println("Welcome to the Calculator App!");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        try {
            double result = calculator.calculate(num1, num2, operator);
            System.out.println("The result is: " + result);
        } catch (InvalidOperationException e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}
