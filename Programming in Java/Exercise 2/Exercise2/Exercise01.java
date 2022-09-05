package Exercise2;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		// Prompt the user to enter an integer.
		int num = Integer.parseInt(reader.nextLine());
		
		// Check if the integer is odd or even.
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		} else {
			System.out.println(num + " is odd.");
		}
	}
}