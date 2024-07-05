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
		boolean running = true;
		Scanner scanner = new Scanner(System.in);
		
		//using while loop to keep programming going until exited
		while(running) {
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
						System.out.println("\nResult: " + factorial(number));
						
					} else {
						System.out.println("Error, invalid number of arguements.");
					}
					break;
				case "power":
	                if (args.length == 3) {
	                    double base = Double.parseDouble(args[1]);
	                    double exponent = Double.parseDouble(args[2]);
	                    System.out.println("Result: " + power(base, exponent));
	                } else {
	                    System.out.println("Error, invalid number of arguments.");
	                }
	                break;
	            case "sqrt":
	                if (args.length == 2) {
	                    double number = Double.parseDouble(args[1]);
	                    System.out.println("Result: " + sqrt(number));
	                } else {
	                    System.out.println("Error, invalid number of arguments.");
	                }
	                break;
	            case "log":
	                if (args.length == 2) {
	                    double number = Double.parseDouble(args[1]);
	                    System.out.println("Result: " + log(number));
	                } else {
	                    System.out.println("Error, invalid number of arguments.");
	                }
	                break;
	            case "log10":
	                if (args.length == 2) {
	                    double number = Double.parseDouble(args[1]);
	                    System.out.println("Result: " + log10(number));
	                } else {
	                    System.out.println("Error, invalid number of arguments.");
	                }
	                break;
	            case "sin":
	                if (args.length == 2) {
	                    double angle = Double.parseDouble(args[1]);
	                    System.out.println("Result: " + sin(angle));
	                } else {
	                    System.out.println("Error, invalid number of arguments.");
	                }
	                break;
	            case "cos":
	                if (args.length == 2) {
	                    double angle = Double.parseDouble(args[1]);
	                    System.out.println("Result: " + cos(angle));
	                } else {
	                    System.out.println("Error, invalid number of arguments.");
	                }
	                break;
	            case "tan":
	                if (args.length == 2) {
	                    double angle = Double.parseDouble(args[1]);
	                    System.out.println("Result: " + tan(angle));
	                } else {
	                    System.out.println("Error, invalid number of arguments.");
	                }
	                break;
	            case "permutation":
                    if (args.length == 3) {
                        int totalElements = Integer.parseInt(args[1]);
                        int selectedElements = Integer.parseInt(args[2]);
                        System.out.println("Result: " + permutation(totalElements, selectedElements));
                    } else {
                        System.out.println("Error, invalid number of arguments.");
                    }
                    break;
				default:
					System.out.println("Error: Invalid operation.");
					
				} 
			break;
		}
				
	// this block of code is for using user input rather than command line arguments
		
		else {
					
		 // asking user for type of operation
		System.out.println("Enter operation (eg., add, subtract, multiply, divide, factorial, power, root, natural log, base-10 log, sin, cosine, tangent, permutation, or 'exit' to quit):");
		String operation = scanner.next();
		
		//exiting the program
		
		if (operation.equalsIgnoreCase("exit")) {
            running = false;
            System.out.println("Exited Program.");
            break;
        }

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
			System.out.println("\nResult: " + factorial(number));
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
		case "power":
            System.out.println("Enter the base:");
            double base = scanner.nextDouble();
            System.out.println("Enter the exponent:");
            double exponent = scanner.nextDouble();
            System.out.println("Result: " + power(base, exponent));
            break;
        case "sqrt":
            System.out.println("Enter the number:");
            double sqrtNumber = scanner.nextDouble();
            System.out.println("Result: " + sqrt(sqrtNumber));
            break;
        case "log":
            System.out.println("Enter the number:");
            double logNumber = scanner.nextDouble();
            System.out.println("Result: " + log(logNumber));
            break;
        case "log10":
            System.out.println("Enter the number:");
            double log10Number = scanner.nextDouble();
            System.out.println("Result: " + log10(log10Number));
            break;
        case "sin":
            System.out.println("Enter the angle in degrees:");
            double sinAngle = scanner.nextDouble();
            System.out.println("Result: " + sin(sinAngle));
            break;
        case "cos":
            System.out.println("Enter the angle in degrees:");
            double cosAngle = scanner.nextDouble();
            System.out.println("Result: " + cos(cosAngle));
            break;
        case "tan":
            System.out.println("Enter the angle in degrees:");
            double tanAngle = scanner.nextDouble();
            System.out.println("Result: " + tan(tanAngle));
            break;
        case "permutation":
            System.out.println("Enter the total number of elements:");
            int totalElements = scanner.nextInt();
            System.out.println("Enter the number of elements to be selected:");
            int selectedElements = scanner.nextInt();
            System.out.println("Result: " + permutation(totalElements, selectedElements));
            break;
		default:
			System.out.println("Error: Invalid operation.");
			}
		}
		}
	
		if(scanner != null) {
			scanner.close();
		}
	
		
	}
	



/* This block of code is where all the methods/functions are to do the actual operations
 * They receive double values and return the proper result
 */
	
//method for receiving 2 double numbers and returning the addition
public static double add(double a , double b) {
	return a + b ;
}

// Factorial calculation with progress display
public static long factorial(double num) {
	if ( num < 0) {
			System . out . println (" Factorial of negative number is undefined .") ;
			return 0;
	}
	return factorialHelper(num ,num ) ;
}

private static long factorialHelper (double originalNum , double num ) {
	if ( num <= 1) {
		System.out.print("\rCalculating factorial: 100%");
		return 1;
}
// Calculate progress and update progress bar
	int progress = ( int ) ((( originalNum - num) / ( double ) originalNum ) * 100);
	System . out . print ("\rCalculating factorial : " + progress + "%") ;
	return (long) (num * factorialHelper ( originalNum , num - 1)) ;
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

//Exponentiation
public static double power ( double base , double exponent ) {
	return Math . pow ( base , exponent ) ;

}


// Square root
public static double sqrt(double number) {
	return Math.sqrt (number);
}

 // Natural logarithm
public static double log(double number) {
	return Math.log(number);
 }

 // Base -10 logarithm
public static double log10(double number) {
	return Math.log10(number);
 }

 // Sine function
public static double sin(double angleDegrees) {
	return Math.sin(Math.toRadians(angleDegrees));
 }

 // Cosine function
public static double cos(double angleDegrees) {
	return Math.cos(Math.toRadians(angleDegrees));
 }

 // Tangent function
public static double tan(double angleDegrees) {
	return Math.tan(Math.toRadians(angleDegrees));
 }


public static long permutation(int totalElements, int selectedElements) {
 if (totalElements < 0) {
     System.out.println("Error: Total number of elements cannot be less than zero.");
     return 0;
 }
 if (selectedElements < 0 || selectedElements > 100) {
     System.out.println("Error: Number of elements to be selected must be between 0 and 100.");
     return 0;
 }
 if (selectedElements > totalElements) {
     System.out.println("Error: Number of selected elements cannot exceed the total number of elements.");
     return 0;
 }
 return permutationHelper(totalElements, selectedElements);
}

private static long permutationHelper(int totalElements, int selectedElements) {
 if (selectedElements == 0) {
     return 1;
 }
 return totalElements * permutationHelper(totalElements - 1, selectedElements - 1);
}

}

