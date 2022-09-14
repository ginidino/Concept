package Exercise3;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int MAX_VALUE = 10;
		int[] values = new int[MAX_VALUE];
		int numValue = 0;
		
		System.out.println("Enter a positive integer or zero. Enter a negative number to quit.");
		int num = Integer.parseInt(reader.nextLine());
		
		while (num >= 0 && numValue < MAX_VALUE) {
			values[numValue++] = num;
			num = Integer.parseInt(reader.nextLine());
		}
		
		System.out.println("The values entered were: ");

		for (int i = 0; i < numValue; i++) {
			System.out.print(values[i] + " ");
		}
	}
}