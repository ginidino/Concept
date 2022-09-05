package Exercise2;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter three integers.
		System.out.print("Enter an integer: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num3 = Integer.parseInt(reader.nextLine());
		
		if (num1 + num2 != num3) {
			System.out.println("The sum of first number (" + num1 + ") and second number (" + num2 + ") is not equal to the third. (" + num3 + ")");
		} else {
			System.out.println("The sum of first number (" + num1 + ") and second number (" + num2 + ") is equal to the third. (" + num3 + ")");
		}
	}
}