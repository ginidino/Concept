package Exercise2;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int count = 0;
		double sum = 0;
		
		// Prompt the user for a series of positive integers. The user should press enter after each integer is input.
		System.out.println("Enter an integer. Enter a negative number to exit: ");
		int num = Integer.parseInt(reader.nextLine());
		
		while (num >= 0) {
			sum += num;
			count++;
			
			if (num > max) {
				max = num;
			} 
			
			if (num < min) {
				min = num;
			}
			num = Integer.parseInt(reader.nextLine());
		}
		
		System.out.println("Max value: " + max);
	    System.out.println("Min value: " + min);
	    System.out.println("Range: " + (max - min));
	    System.out.println("Mean: " + (double)(sum / count));
	}
}