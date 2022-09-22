package Exercise4;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String word = reader.nextLine();
		
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < word.length(); i++) {
			int countChar = count(word, word.charAt(i));
			
			if (countChar > max) {
				max = countChar;
				index = i;
			}
		}
		
		if(max==1){
			System.out.println("No character is more frequent than any other.");
		} else {
			System.out.println("The character " + "'" + word.charAt(index) + "'" + " appears most often.");
		}
	}

	public static int count(String word, char c) {
		int num = 0;
		
		for (int i =  0; i < word.length(); i++) {
			if (word.charAt(i) == c) {
				num++;
			}
		}
		return num;
	}
}