package Exercise2;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		/*
		 * Prompt the user for a series of strings. The user should press enter after each string is input.
		 * If the user enters the string “quit”, the program should output the following information, and then quit:
		 * – The total number of ‘*’ symbols input in all strings.
		 * 	- For example, if the user has entered “ian*”, doris” and “gu**itar”, the program will output 3.
		 */
		Scanner reader = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Enter a String. Type ’quit’ to quit.");
		
		while (true) {
			String word = reader.nextLine();
			
			if (word.equals("quit")) {
				break;
			}
			
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == '*') {
					count++;
				}
			}
		}
		System.out.println("Number of * symbols: " + count);
	}
}