package Exercise4;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a string to check: ");
		String check = reader.nextLine();
		
		if (contains(check, '!') || contains(check, ',') || contains(check, '.') || contains(check, ':')) {
			System.out.println("Input string contains a !, , . or :.");
		} else {
			System.out.println("Input string does not contains a !, , . or :.");
		}
	}
	
	public static boolean contains(String check, char punctuationMark) {
		for (int i = 0; i < check.length(); i++) {
			if (check.charAt(i) == punctuationMark) {
				return true;
			}
		}
		return false;
	}
}