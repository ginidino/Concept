# Exercise4

## Exercise1
Write a program that performs the following operations:
􏰀 Prompt the user to enter an integer.   
􏰀 Check if the integer is odd or even.   
􏰀 If it is even, output the following message “value is even.”, where ‘value’ is replaced by the value of the integer entered.   
􏰀 If it is odd, output the following message “value is odd.”, where ‘value’ is replaced by the value of the integer entered.   
Your program must include a method with the following signature:

Code
```java
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = Integer.parseInt(reader.nextLine());
		
		if (isEven(num)) {
			System.out.println(num +" is even.");
		} else {
			System.out.println(num +" is odd.");
		}
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
```
Output
```
Enter an integer: 4
4 is even.
```
```
Enter an integer: 11
11 is odd.
```
