package Exercise1;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Prompt the user to enter an integer.
		System.out.print("Enter the number: ");
		int num = reader.nextInt();
		
		// When an integer is input, print out the value of the integer multiplied by 10.
		System.out.println("the value of the integer multiplied by 10. : " + num * 10);
	}
}