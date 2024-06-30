package com.example.calculatorapp;

public class Calculator {

    public double calculate(double num1, double num2, char operator) throws InvalidOperationException {
        switch (operator) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                throw new InvalidOperationException("Invalid operator: " + operator);
        }
    }

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private double divide(double num1, double num2) throws InvalidOperationException {
        if (num2 == 0) {
            throw new InvalidOperationException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

//mobile commit test 3