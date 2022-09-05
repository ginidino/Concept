package Exercise2;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to input a code (as a String) which has the 
		// format ‘abxyc’ where a and b are single digits; x and y are alphabetic characters; and c is a single digit.
		System.out.print("Please enter a code: ");
		String code = reader.nextLine();
		
		char c1 = code.charAt(0);
		char c2 = code.charAt(1);
		char c3 = code.charAt(2);
		char c4 = code.charAt(3);
		char c5 = code.charAt(4);
		
		if (code.length() != 5) {
			System.out.println("Code is not of required length");
		}
		
		if (!(Character.isDigit(c1) && Character.isDigit(c2))) {
			System.out.println("Characters one and two are not digits.");
		} else if (!(Character.isAlphabetic(c3) && Character.isAlphabetic(c4))) {
			System.out.println("Characters three and four are not alphabetic.");
		} else if (!Character.isDigit(c5)) {
			System.out.println("Character five is not a digit.");
		} else {
			System.out.println("Code is correct.");
		}
	}
}