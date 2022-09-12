
# Exercise 3

## Exercise1
Write a program that performs the following operations:
- Prompt the user to enter a series of positive integers. The user will press the enter key after each integer has been input. A maximum of 10 integers will be input. No more than 10 entries should be allowed. If the user enters a negative number the program should quit and print out the following information:
  - All of the numbers that were entered, on a single line, each number separated by a space from the previous one.

Code
```java
public class Exercise01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int MAX_VALUE = 10;
		int[] values = new int[MAX_VALUE];
		int numValue = 0;
		
		System.out.println("Enter a positive integer or zero. Enter a negative number to quit.");
		int num = Integer.parseInt(reader.nextLine());
		
		while (num >= 0 && numValue < MAX_VALUE) {
			values[numValue++] = num;
			num = Integer.parseInt(reader.nextLine());
		}
		
		System.out.println("The values entered were: ");

		for (int i = 0; i < numValue; i++) {
			System.out.print(values[i] + " ");
		}
	}
}
```
Output
```
Enter a positive integer or zero. Enter a negative number to quit.
1
2
3
4
5
6
7
8
9
0
-1
The values entered were: 
1 2 3 4 5 6 7 8 9 0 
```

## Exercise2
Write a program that performs the following operations:
- Prompt the user to enter a series of positive integers. The user will press the enter key after each integer has been input. A maximum of 50 integers will be input. No more than 50 entries should be allowed. If the user enters a negative number the program should quit and print out the following information:
  - All of the numbers that were entered, on a single line, each number separated by a space from the previous one.
  - The count of the integers entered.
  - The sum of the integers entered.
  - The mean of the integers entered.

Code
```java
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int MAX_VALUE = 50;
		int[] values = new int[MAX_VALUE];
		int numValue = 0;
		int sum = 0;
		
		System.out.println("Enter a positive integer or zero. Enter a negative number to quit.");
		int num = Integer.parseInt(reader.nextLine());
		
		while (num >= 0 && numValue < MAX_VALUE) {
			values[numValue++] = num;
			num = Integer.parseInt(reader.nextLine());
		}
		
		System.out.println("The values entered were: ");
		
		for (int i = 0; i < numValue; i++) {
			sum += values[i];
		}
		
		double mean = sum / (double) numValue;
		
		System.out.println("The number of the values entered is: " + numValue);
		System.out.println("The sum of the values entered is: " + sum);
		System.out.println("The mean of the values entered is: " + mean);
	}
}
```
Output
```
Enter a positive integer or zero. Enter a negative number to quit.
1
2
3
4
5
6
7
8
9
0
-1
The values entered were: 
The number of the values entered is: 10
The sum of the values entered is: 45
The mean of the values entered is: 4.5
```
## Exercis3
Write a program that performs the following operations:
- Prompt the user to enter a series of strings. The user will press the enter key after each string has been input. A maximum of 10 strings will be input. No more than 10 entries should be allowed. If the user enters the string “quit”, the program should quit and print out the following information:
  - All of the strings that were entered, each one on a separate line. – The number of strings entered.
  - The length of the longest string entered.
  - The length of the shortest string entered.

Code
```java
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int NUM_STRINGS = 10;
		String[] numString = new String[NUM_STRINGS];
		int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int count = 0;
	    
	    System.out.println("Enter a String. Type ’quit’ to quit.");
	    String word = reader.nextLine();
	    
	    while (!word.equals("quit") && count < NUM_STRINGS) {
	    	numString[count++] = word;
	    	
	    	if (word.length() > max) {
	    		max = word.length();
	    	} else if (word.length() < min) {
	    		min = word.length();
	    	}
	    	
	    	word = reader.nextLine();
	    }
	    System.out.println();
	    
	    for (int i = 0; i < count; i++) {
	    	System.out.println(numString[i]);
	    }
	    
	    System.out.println("Number of strings entered: " + count);
	    System.out.println("Max string length: " + max);
	    System.out.println("Min string length: " + min);
	}
}
```
Output
```
Enter a String. Type ’quit’ to quit.
example
level
output
exercise
leicester
university
store
wallet
quit

example
level
output
exercise
leicester
university
store
wallet
Number of strings entered: 8
Max string length: 10
Min string length: 5
```

## Exercise4
Write a program that performs the following operations:
- Prompt the user to enter a series of integers as a single line of input. Any number of integers might be entered. There will be a space between each input integer.
- When the input line has been entered, output the following information:
  - The count of the integers entered.
  - The sum of the integers entered.
  - The mean of the integers entered.

Code
```java
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	
		int sum = 0;
		double mean = 0;
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		int[] value = new int[newStr.length];
		
		for (int i = 0; i < value.length; i++) {
			value[i] = Integer.parseInt(newStr[i]);
			sum += value[i];
		}
		mean = sum / (double) value.length;
		
		System.out.println("The number of the values entered is: " + value.length);
	    System.out.println("The sum of the values entered is: " + sum);
	    System.out.println("The mean of the values entered is: " + mean);
	}
}
```
Output
```
Enter a series of integers on a single line, each separated by a space from the previous.
1 2 3 4 5 6 7 8 9 0
The number of the values entered is: 10
The sum of the values entered is: 45
The mean of the values entered is: 4.5
```

## Exercise5
