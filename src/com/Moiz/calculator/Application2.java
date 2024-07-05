/*
 * File Name: Application2.java
 * Assignment: Lab 1, Exercise C,D,E
 * Completed by: Moiz Bhatti
 * Submission Date: July 4th, 2023
 */



package com.Moiz.calculator;

import java.util.Scanner;

public class Application2 {

	 
	public static void main(String[] args) {
		//this block of code is for command line arguments rather than user input
		if (args.length > 0) {
			String operation = args[0].toLowerCase();
			switch(operation) {
			// different pathways depending on which operand is called in the command line argument
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
				
	// this block of code is for using user input rather than command line arguments
	 else {
		 // asking user for type of operation
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		System.out.println("Enter operation (eg., add, subtract, multiply, divide, factorial):");
		String operation = scanner.next();
		
		/* taking the type of operation the user inputs and asking the numbers they want to use
		 * and calling the method for calculation and returning the result
		 */
		
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

/* This block of code is where all the methods/functions are to do the actual operations
 * They receive double values and return the proper result
 */
	
//method for receiving 2 double numbers and returning the addition
public static double add(double a , double b) {
	return a + b ;
}

//method for receiving a double number and returning the factorial
public static double factorial ( double n ) {
	if ( n <= 1) {
		return 1;
	} else {
		return n * factorial ( n - 1) ;
		 }
	}
	
//method for receiving 2 double numbers and returning the subtraction
public static double subtraction(double a, double b) {
	return a - b;
}

//method for receiving 2 double numbers and returning the multiplication
public static double multiply(double a, double b) {
	return a * b;
}

//method for receiving 2 double numbers and returning the division
public static double divide(double a, double b) {
	return a / b;
	
}

}




