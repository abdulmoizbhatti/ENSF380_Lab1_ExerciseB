/*
 * File Name: Application2.java
 * Assignment: Lab 1, Exercise C,B,E
 * Completed by: Moiz Bhatti
 * Submission Date: July 4th, 2023
 */



package com.Moiz.calculator;

import java.util.Scanner;

public class Application2 {

	
	public static void main(String[] args) {
		if (args.length > 0) {
			String operation = args[0].toLowerCase();
			switch(operation) {
			case "add":
				if(args.length == 3) {
					double addnum1= Double.parseDouble(args[1]);
					double addnum2= Double.parseDouble(args[2]);
					System.out.println("Result: " + add(addnum1, addnum2));
				} else {
					System.out.println("Error, invalid number of arguements.");
				}
				break;
			case "substract":
				if(args.length == 3) {
					double subnum1= Double.parseDouble(args[1]);
					double subnum2= Double.parseDouble(args[2]);
					System.out.println("Result: " + subtraction(subnum1, subnum2));
				} else {
					System.out.println("Error, invalid number of arguements.");
				}
				break;
			case "multiply":
				if(args.length == 3) {
					double multiplynum1= Double.parseDouble(args[1]);
					double multiplynum2= Double.parseDouble(args[2]);
					System.out.println("Result: " + multiply(multiplynum1, multiplynum2));
				} else {
					System.out.println("Error, invalid number of arguements.");
				}
				break;
			case "divide":
				if(args.length == 3) {
					double divnum1= Double.parseDouble(args[1]);
					double divnum2= Double.parseDouble(args[2]);
					if(divnum2 != 0) {
						System.out.println("Result: " + divide(divnum1, divnum2));
					} else {
						System.out.println("Error: Cannot divide by 0.");
					}}else {
					System.out.println("Error, invalid number of arguements.");
				}
				break;
			case "factorial":
				if(args.length == 2) {
					double number = Double.parseDouble(args[1]);
					System.out.println("Result: " + factorial(number));
					
				} else {
					System.out.println("Error, invalid number of arguements.");
				}
				break;
			default:
				System.out.println("Error: Invalid operation.");
				}
			}
				
			
	 else {
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		System.out.println("Enter operation (eg., add, subtract, multiply, divide, factorial):");
		String operation = scanner.next();
		
		switch (operation.toLowerCase()) {
		case "add":
			System.out.println("Enter the first operand:");
			double addnum1 = scanner.nextDouble();
			System.out.println("Enter the second operand:");
			double addnum2 = scanner.nextDouble();
			System.out.println("Result : " + add(addnum1 ,addnum2));
			break ;
		case "factorial":
			System.out.println("Enter a number:");
			double number = scanner.nextDouble();
			System.out.println("Result: " + factorial(number));
			break ;
		case "subtract":
			System.out.println("Enter the first operand:");
			double subnum1 = scanner.nextDouble();
			System.out.println("Enter the second operand:");
			double subnum2 = scanner.nextDouble();
			System.out.println("Result: " + subtraction(subnum1 ,subnum2));
			break ;
		case "multiply":
			System.out.println("Enter the first operand:");
			double multiplynum1 = scanner.nextDouble();
			System.out.println("Enter the second operand:");
			double multiplynum2 = scanner.nextDouble();
			System.out.println("Result: " + multiply(multiplynum1 ,multiplynum2));
			break ;
		case "divide":
			System.out.println("Enter the first operand:");
			double divnum1 = scanner.nextDouble();
			System.out.println("Enter the second operand:");
			double divnum2 = scanner.nextDouble();
			if(divnum2 != 0) {
				System.out.println("Result: " + divide(divnum1, divnum2));
			} else {
				System.out.println("Error, cannot divide by 0.");
			}
			break;
		default:
			System.out.println("Error: Invalid operation.");
			}
		
	
		if(scanner != null) {
			scanner.close();
		}
	}
	
}
	
public static double add(double a , double b) {
	return a + b ;
}
		
public static double factorial ( double n ) {
	if ( n <= 1) {
		return 1;
	} else {
		return n * factorial ( n - 1) ;
		 }
	}
	
public static double subtraction(double a, double b) {
	return a - b;
}

public static double multiply(double a, double b) {
	return a * b;
}

public static double divide(double a, double b) {
	return a / b;
	
}

}




