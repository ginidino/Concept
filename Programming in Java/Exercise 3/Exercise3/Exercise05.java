package Exercise3;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		int[] value = new int[newStr.length];
		
		for (int i = 0; i < value.length; i++) {
			value[i] = 5 * Integer.parseInt(newStr[i]);
		}
		
		for (int i = value.length - 1; i >= 0; i--) {
			System.out.print(value[i] + " ");
		}
	}
}