package Exercise1;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an integer.
		System.out.print("Enter the first number: ");
		int num1 = reader.nextInt();
		
		// Prompt the user to enter another integer.
		System.out.print("Enter the second number: ");
		int num2 = reader.nextInt();
		
		// Output the sum of the two integers.
		System.out.println("The sum of the two numbers is: " + (num1 + num2));
		
		// Output the product of the two integers.
		System.out.println("The product of the two numbers is: " + (num1 * num2));
	}
}
