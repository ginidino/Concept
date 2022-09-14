package Exercise3;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		int[] value = new int[newStr.length];
		
		for (int i = 0; i < value.length; i++) {
			value[i] = Integer.parseInt(newStr[i]);
		}
		
		boolean checkDuplicates = false;
		int count = 0;
		
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length; j++) {
				if (i != j) {
					if (value[i] == value[j]) {
						checkDuplicates = true;
					}
				}
			}
			if (checkDuplicates) {
				count++;
				checkDuplicates = false;
			}
		}
		
		System.out.println("There are " + count + " duplicate numbers in the input.");
		System.out.println("There are " + (value.length - count) + " distinct numbers in the input.");
	}
}