package Exercise2;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an integer in the range 0 to 20 inclusive.
		// If the user enters an integer that is not in that range the program should quit.
		System.out.print("Input an integer in the range 0 to 20 inclusive: ");
		int num = Integer.parseInt(reader.nextLine());
		
		if (num >= 0 && num <= 20) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
		}
	}
}