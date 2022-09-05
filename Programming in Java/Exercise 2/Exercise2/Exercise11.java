package Exercise2;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an integer.
		// If the integer is positive (or zero), the program should output the square of that number
		// If the number is negative the program should quit.
		while (true) {
			System.out.print("Enter an integer: ");
			int num = Integer.parseInt(reader.nextLine());
			
			if (num < 0) {
			    System.out.println("Quitting.");
				break;
			}
			
			if (num >= 0) {
				System.out.println(num * num);
				System.out.println();
			}
		}
	}
}