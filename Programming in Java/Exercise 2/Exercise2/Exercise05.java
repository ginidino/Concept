package Exercise2;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter three integers.
		System.out.print("Enter an integer: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num3 = Integer.parseInt(reader.nextLine());
		
		// Output the maximum value of the three entered values.
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Maximum number is: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Maximum number is: " + num2);
		} else {
			System.out.println("Maximum number is: " + num3);
		}
	}
}