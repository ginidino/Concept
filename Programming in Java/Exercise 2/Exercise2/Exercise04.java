package Exercise2;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter their age (as an integer). 
		System.out.print("Please enter your age: ");
		int age = Integer.parseInt(reader.nextLine());
		
		if (age > 0) {
			// If the input age is less than 18, print out a message stating that the user is too young.
			// If the input age is between 18 and 50 inclusive, print out a message stating that the user may proceed.
			// If the input age is 51 or greater, output a message stating that the user is too old.
			if (age < 18) {
				System.out.println("You are too young.");
			} else if (age >= 18 && age <= 50) {
				System.out.println("You may proceed.");
			} else {
				System.out.println("You are too old.");
			}
		}
	}
}