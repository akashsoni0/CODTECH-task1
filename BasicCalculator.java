package com.akash.demo;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter the first number: ");
				double num1 = scanner.nextDouble();

				System.out.print("Enter the second number: ");
				double num2 = scanner.nextDouble();

				System.out.print("Choose an operation (+, -, *, /): ");
				char operation = scanner.next().charAt(0);

				double result;

				switch (operation) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					if (num2 != 0) {
						result = num1 / num2;
					} else {
						System.out.println("Error: Cannot divide by zero.");

						return;
					}
					break;
				default:
					System.out.println("Error: Invalid operation.");
					return;
				}

				System.out.println("Result: " + result);
			}
		}
	}
}
