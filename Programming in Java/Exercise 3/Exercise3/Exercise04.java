package Exercise3;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	
		int sum = 0;
		double mean = 0;
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		int[] value = new int[newStr.length];
		
		for (int i = 0; i < value.length; i++) {
			value[i] = Integer.parseInt(newStr[i]);
			sum += value[i];
		}
		mean = sum / (double) value.length;
		
		System.out.println("The number of the values entered is: " + value.length);
	    System.out.println("The sum of the values entered is: " + sum);
	    System.out.println("The mean of the values entered is: " + mean);
	}
}