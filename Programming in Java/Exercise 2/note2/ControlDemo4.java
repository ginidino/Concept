package note2;

import java.util.Scanner;

public class ControlDemo4 {
	public static void main(String[] args) {
		boolean answerCorrect = false;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer greater than 100.");
		
		int num = reader.nextInt();
		
		if (num > 100) {
			System.out.println("Well done!"); 
			answerCorrect = true;
		}
		
		if (answerCorrect) {
			System.out.println("You have reached level 5.");
		}
	}
}