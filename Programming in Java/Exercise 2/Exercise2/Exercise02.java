package Exercise2;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		// Prompt the user to enter an integer.
		int num = Integer.parseInt(reader.nextLine());
		
		System.out.print("Please enter another integer: ");
		// Prompt the user to enter another integer.
		int num2 = Integer.parseInt(reader.nextLine());
		
		if (num * num2 < 100) {
			System.out.println("The product of the two numbers " + num * num2 + " is less than 100.");
		} else {
			System.out.println("The product of the two numbers " + num * num2 + " is greater than 100.");
		}
	}
}