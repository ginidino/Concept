package Exercise4;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String word = reader.nextLine();
		
		System.out.print("Input a character to replace, and its replacement: ");
		String removeReplace = reader.nextLine();
		
		char remove = removeReplace.charAt(0);
		char replace = removeReplace.charAt(1);
		
		System.out.println(replace(word, remove, replace));
	}

	public static String replace(String word, char remove, char replace) {
		String output = "";
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != remove) {
				output += word.charAt(i);
			} else {
				output += replace;
			}
		}
		return output;
	}
}