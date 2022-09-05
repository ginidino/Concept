package Exercise2;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		/* 
		 * Prompt the user for a series of strings. The user should press enter after each string is input.
		 * If the user enters the string “quit”, the program should output the following information, and then quit:
		 * – The mean length of the strings entered. 
		 * – The length of the longest string entered. 
		 * – The length of the shortest string entered. 
		 */
		int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int count = 0;
	    double sum = 0;
		
		System.out.println("Enter a String. Type ’quit’ to quit.");
		
		while(true) {
			String word = reader.nextLine();
			
			sum += word.length();
			count++;
			
			if (word.equals("quit")) {
				System.out.println("exit");
				break;
			}
			
			if (word.length() > max) {
				max = word.length();
			}
			
			if (word.length() < min) {
				min = word.length();
			}
		}
		System.out.println();
		
		System.out.println("Max string length: " + max);
	    System.out.println("Min string length: " + min);
	    System.out.println("Mean string length: " + (sum / count));
	}
}