# Exercise2

## Exercise 1
Write a program that performs the following operations:
```
􏰀 Prompt the user to enter an integer.
􏰀 Check if the integer is odd or even.
􏰀 If it is even, output the following message “value is even.”, where ‘value’ is replaced by the value of the integer entered.
􏰀 If it is odd, output the following message “value is odd.”, where ‘value’ is replaced by the value of the integer entered.
```
Code
```java
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		// Prompt the user to enter an integer.
		int num = Integer.parseInt(reader.nextLine());
		
		// Check if the integer is odd or even.
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		} else {
			System.out.println(num + " is odd.");
		}
	}
}
```
Output
```
Enter an integer: 3
3 is odd.
```
```
Enter an integer: 6
6 is even.
```

## Exercise2
Write a program that performs the following operations:
```
􏰀 Prompt the user to enter an integer.
􏰀 Prompt the user to enter another integer.
􏰀 Check if the product of the two integers is less than 100. If it is, output a suitable message.
```
Code
```java
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		// Prompt the user to enter an integer.
		int num = Integer.parseInt(reader.nextLine());
		
		System.out.print("Please enter another integer: ");
		// Prompt the user to enter another integer.
		int num2 = Integer.parseInt(reader.nextLine());
		
		if (num * num2 < 100) {
			System.out.println("The product of the two numbers " + (num * num2) + " is less than 100.");
		} else {
			System.out.println("The product of the two numbers " + (num * num2) + " is greater than 100.");
		}
	}
}
```
Output
```
Enter an integer: 3
Please enter another integer: 6
The product of the two numbers 18 is less than 100.
```
```
Enter an integer: 12
Please enter another integer: 52
The product of the two numbers 624 is greater than 100.
```

## Exercise3
Write a program that performs the following operations:
```
􏰀 Prompt the user to enter three integers.
􏰀 Check if the sum of the first two integers is equal to the value of the third integer.
􏰀 If it is not true that the sum of the first two integers is equal to the value of the third integer, output a suitable message.
􏰀 If it is true, output a message with the following format: 
  - “input1 and input2 are a number bond of input3”, where you replace ‘input1’, ‘input2’ and ‘input3’ with the three entered values. 
  - For example, if the user enters the numbers 4, 6 and 10, the output would be “4 and 6 are a number bond of 10”.
```
Code
```java
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter three integers.
		System.out.print("Enter an integer: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num3 = Integer.parseInt(reader.nextLine());
		
		if (num1 + num2 != num3) {
			System.out.println("The sum of first number (" + num1 + ") and second number (" + num2 + ") is not equal to the third. (" + num3 + ")");
		} else {
			System.out.println("The sum of first number (" + num1 + ") and second number (" + num2 + ") is equal to the third. (" + num3 + ")");
		}
	}
}
```
Output
```
Enter an integer: 4
Enter an integer: 5
Enter an integer: 6
The sum of first number (4) and second number (5) is not equal to the third. (6)
```
```
Enter an integer: 5
Enter an integer: 6
Enter an integer: 11
The sum of first number (5) and second number (6) is equal to the third. (11)
```

## Exercise4
Write a program that performs the following operations:
```
􏰀 Prompt the user to enter their age (as an integer). This value should not be negative. If the user enters a negative age, the program should end.
􏰀 If the input age is less than 18, print out a message stating that the user is too young.
􏰀 If the input age is between 18 and 50 inclusive, print out a message stating that the user may proceed.
􏰀 If the input age is 51 or greater, output a message stating that the user is too old.
```
Code
```java
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter their age (as an integer). 
		System.out.print("Please enter your age: ");
		int age = Integer.parseInt(reader.nextLine());
		
		if (age > 0) {
			// If the input age is less than 18, print out a message stating that the user is too young.
			// If the input age is between 18 and 50 inclusive, print out a message stating that the user may proceed.
			// If the input age is 51 or greater, output a message stating that the user is too old.
			if (age < 18) {
				System.out.println("You are too young.");
			} else if (age >= 18 && age <= 50) {
				System.out.println("You may proceed.");
			} else {
				System.out.println("You are too old.");
			}
		}
	}
}
```
Output
```
Please enter your age: 14
You are too young.
```
```
Please enter your age: 25
You may proceed.
```
```
Please enter your age: 57
You are too old.
```

## Exercise5
Write a program that performs the following operations:
```
􏰀 Prompt the user to input three integers.
􏰀 Output the maximum value of the three entered values.
```
Code
```java
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter three integers.
		System.out.print("Enter an integer: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter an integer: ");
		int num3 = Integer.parseInt(reader.nextLine());
		
		// Output the maximum value of the three entered values.
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Maximum number is: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Maximum number is: " + num2);
		} else {
			System.out.println("Maximum number is: " + num3);
		}
	}
}
```
Output
```
Enter an integer: 5
Enter an integer: 2
Enter an integer: 1
Maximum number is: 5
```
```
Enter an integer: 4
Enter an integer: 8
Enter an integer: 3
Maximum number is: 8
```
```
Enter an integer: 1
Enter an integer: 7
Enter an integer: 9
Maximum number is: 9
```
