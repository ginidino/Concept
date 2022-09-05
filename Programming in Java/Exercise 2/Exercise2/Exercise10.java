package Exercise2;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter a positive integer.
		System.out.print("Enter an integer: ");
		int num = Integer.parseInt(reader.nextLine());
		
		while (true) {
			// Continue with the above operations until the user enters a negative integer or zero.
			if (num < 0) {
				System.out.println("exit");
				break;
			}
			
			// Check if the integer is odd or even.
			if (num % 2 != 0) {
				System.out.println(num + " is odd.");
			} else {
				System.out.println(num + " is even.");
			}
			System.out.println();
			
			System.out.print("Enter an integer: ");
			num = Integer.parseInt(reader.nextLine());
		}
	}
}