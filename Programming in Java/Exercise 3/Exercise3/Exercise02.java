package Exercise3;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int MAX_VALUE = 50;
		int[] values = new int[MAX_VALUE];
		int numValue = 0;
		int sum = 0;
		
		System.out.println("Enter a positive integer or zero. Enter a negative number to quit.");
		int num = Integer.parseInt(reader.nextLine());
		
		while (num >= 0 && numValue < MAX_VALUE) {
			values[numValue++] = num;
			num = Integer.parseInt(reader.nextLine());
		}
		
		System.out.println("The values entered were: ");
		
		for (int i = 0; i < numValue; i++) {
			sum += values[i];
		}
		
		double mean = sum / (double) numValue;
		
		System.out.println("The number of the values entered is: " + numValue);
		System.out.println("The sum of the values entered is: " + sum);
		System.out.println("The mean of the values entered is: " + mean);
	}
}