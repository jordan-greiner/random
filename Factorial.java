package everything;
import java.util.Scanner;

//Author: Jordan J. Greiner
//Date: 3/4/2021
//
//Factorial Finder - The Factorial of a positive integer, n, is defined as the 
//product of the sequence n, n-1, n-2, ...1 and the factorial of zero, 0, is 
//defined as being 1. Solve this using both loops and recursion.
//
//TO DO: should have made this with BigInteger

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println("Enter integer to find a factorial of: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();		
		
		long startTimer1 = System.nanoTime();
		long output1 = loopSolution(num);
		long endTimer1 = System.nanoTime();
		System.out.println("The answer is: " + String.format("%,d", output1));
		System.out.println("Loop factorial took " + (endTimer1 - startTimer1) + " nanoseconds");
		
		long startTimer2 = System.nanoTime();
		long output2 = recursionSolution(num);
		long endTimer2 = System.nanoTime();
		System.out.println("The answer is: " + String.format("%,d", output2));
		System.out.println("Recursion factorial took " + (endTimer2 - startTimer2) + " nanoseconds");
		
		scanner.close();
	}
	
	public static long recursionSolution(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * recursionSolution(num - 1);
		}
	}
	
	public static long loopSolution(int num) {
		long total = 1;
		int loopTimes = num;
		if (num == 0) {
			return 1;
		}
		for (int i = 0; i < loopTimes; i++) {
			total *= num;
			num--;
		}
		return total;		
	}
}
