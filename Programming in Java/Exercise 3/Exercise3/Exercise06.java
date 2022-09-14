package Exercise3;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		String num = reader.nextLine();
		
		System.out.println("Now enter an index.");
		int index = Integer.parseInt(reader.nextLine());
		
		String[] newStr = num.split(" ");
		
		if (index >= 1 && index <= newStr.length) {
			int[] value = new int[newStr.length];
			
			for (int i = 0; i < value.length; i++) {
				value[i] = Integer.parseInt(newStr[i]);
			}
			
			int sum = 0;
			
			for (int i = index - 1; i < value.length; i++) {
				sum += value[i];
			}
			System.out.println("The sum from index " + index + " is " + sum + ".");
		} else {
			System.out.println("Invalid index");
		}
	}
}