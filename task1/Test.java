package com.el.task1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n---- Calculator ----");
			System.out.println("===================================");
			System.out.println("Choose number type:");
			System.out.println("1. Integer");
			System.out.println("2. Decimal");
			System.out.println("3. Exit");
			System.out.print("Enter Your Choice: ");
			int typeChoice = sc.nextInt();

			if (typeChoice == 3) {
				running = false;
				System.out.println("You choose Exiting the calculator. Thankyou!");
				break;
			}
			System.out.println("====================================");

			System.out.println("Which operation do you want to perform:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			System.out.println("====================================");

			System.out.print("Enter: ");
			

			
			int op = sc.nextInt();

			if (typeChoice == 1) {

				System.out.print("Enter first integer: ");
				int a = sc.nextInt();
				System.out.print("Enter second integer: ");
				int b = sc.nextInt();

				switch (op) {
				case 1 -> System.out.println("Result: " + Calculator.add(a, b));
				case 2 -> System.out.println("Result: " + Calculator.subtract(a, b));
				case 3 -> System.out.println("Result: " + Calculator.multiply(a, b));
				case 4 -> System.out.println("Result: " + Calculator.divide(a, b));
				default -> System.out.println("Invalid operation.");
				}

			} else if (typeChoice == 2) {

				System.out.print("Enter first number: ");
				double a = sc.nextDouble();
				System.out.print("Enter second number: ");
				double b = sc.nextDouble();

				switch (op) {
				case 1 -> System.out.println("Result: " + Calculator.add(a, b));
				case 2 -> System.out.println("Result: " + Calculator.subtract(a, b));
				case 3 -> System.out.println("Result: " + Calculator.multiply(a, b));
				case 4 -> System.out.println("Result: " + Calculator.divide(a, b));
				default -> System.out.println("Invalid operation.");
				}

			} else {
				System.out.println("Invalid number type.");
			}
		}

		sc.close();
	}
}
