package com.el.task1;

public class Calculator {

	// Method Overloding concept used here.

	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static double subtract(double a, double b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Error: Division by zero not Possible!");
			return 0;
		}
		return a / b;
	}

	public static double divide(double a, double b) {
		if (b == 0.0) {
			System.out.println("Error: Division by zero not possible!");
			return Double.NaN;
		}
		return a / b;
	}

}
