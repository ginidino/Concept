package Exercise3;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		int[] value = new int[newStr.length];
		
		for (int i = 0; i < value.length; i++) {
			value[i] = Integer.parseInt(newStr[i]);
		}
		
		int[] set = new int[value.length];
		
		for (int i = 0; i < value.length; i++) {
			set[i] = -1;
		}
		
		int count = 0;
		boolean checkDuplicates = false;
		
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length; j++) {
				if (set[j] == value[i]) {
					checkDuplicates = true;
				}
			}
			
			if (!checkDuplicates) {
				set[i] = value[i];
			}
			
			checkDuplicates = false;
		}
		
		for (int i = 0; i < set.length; i++) {
			if (set[i] >= 0) {
				System.out.print(set[i] + " ");
			}
		}
	}
}