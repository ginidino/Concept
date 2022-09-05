package Exercise2;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		/*
		 * Prompt the user to enter a proposed password.
		 * Output whether the password is of the required ‘strength’, i.e. is valid. A valid password has the the following characteristics:
		 * – It must contain at least 8 characters and at most 12 characters. 
		 * – It must contain at least one upper case letter. 
		 * – It must contain at least one lower case letter.
		 * – It must contain at least one digit.
		 * – It can (optionally) contain an underscore ( ).
		 * – It must contain no other non-alphabetic character or digit.
		 * If the password is not valid, the program must print out at least one reason why that is the case.
		 */
		
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter your password: ");
		String password = reader.nextLine();
		
		if (password.length() < 8 || password.length() > 12) {
			System.out.println("Password is not of the correct length.");
		} else {
			int upper = 0;
			int lower = 0;
			int under = 0;
			int digit = 0;
			
			for (int i = 0; i < password.length(); i++) {
				char check = password.charAt(i);
				
				if (Character.isUpperCase(check)) {
					upper++;
				} else if (Character.isLowerCase(check)) {
					lower++;
				} else if (Character.isDigit(check)) {
					digit++;
				} else if (check == '_') {
					under++;
				}
			}
			if ((upper + lower + digit + under) < password.length()) {
			    System.out.println("Password contains invalid characters.");
			}
			else if (under > 1) {
			    System.out.println("Password contains more than one underscore.");
			}
			else if (digit == 0) {
			    System.out.println("Password does not contain a digit.");
			}
			else if (lower == 0) {
			    System.out.println("Password does not contain a lower case character.");
			}
			else if (upper == 0) {
				System.out.println("Password does not contain an upper case character.");
			} else {
	             System.out.println("Password is valid.");
			}
		}
	}
}