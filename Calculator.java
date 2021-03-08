package everything;
import java.util.Scanner;
//
//Author: Jordan J. Greiner
//Date: 3/4/2021
//
//Calculator - A simple calculator to do basic operations. 
//
//TO DO: error handling

public class Calculator {
	public static void main(String[] args) {
		//Scanner set up
		Scanner scanner = new Scanner(System.in);
		//User prompting
		printOptions();
		//Calculation
		String input = scanner.nextLine();
		int output = calculate(input);
		//Print to console
		System.out.println(output == Integer.MIN_VALUE ? "Invalid operation" : output);	
		//Scanner close
		scanner.close();
	}
	
	public static void printOptions() {
		System.out.println("Please input the first number of the calculation \n"
				+ "followed by a space and the operation (a lowercase letter). \n"
				+ "Finally, insert another space and input the last number. \n"
				+ "example: 9 a 3\n"
				+ "*these are integer operations");
		
		System.out.println();
		System.out.println("a - addition\n"
				+ "s - subtraction\n"
				+ "m - multliplication\n"
				+ "d - division\n"
				+ "e - exponent\n"
				+ "r - modulo (remainder)");
		
		System.out.println();
		System.out.println("Enter: ");
	}
	
	public static int calculate(String input) {
		String[] tokens = input.split(" ");
		int firstNum = Integer.valueOf(tokens[0]);
		int secondNum = Integer.valueOf(tokens[2]);
		String operation = tokens[1];
		
		switch(operation) {
		  case "a":
		    return firstNum + secondNum;
		  case "s":
		    return firstNum - secondNum;
		  case "m":
			return firstNum * secondNum;
		  case "d":
			return firstNum / secondNum;
		  case "e":
			return (int)Math.pow(firstNum, secondNum);
		  case "r":
			return firstNum % secondNum;
		  default:
		    return Integer.MIN_VALUE;
		}		
	}
}
