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

## Exercise 2
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

## Exercise 3
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

## Exercise 4
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

## Exercise 5
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

## Exercise 6
Write a program that performs the following operations:

- Prompt the user to input a code (as a String) which has the format ‘abxyc’ where a and b are single digits; x and y are alphabetic characters; and c is a single digit.
- The program will then verify that the input code has the correct format. If it has the correct format, the program should output the following message: “code has the correct format” where ‘code’ is replaced by the input code. If the code does not have the correct format, the program should output a message to that effect and should advise the user what is wrong with the code.

Code
```java
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to input a code (as a String) which has the 
		// format ‘abxyc’ where a and b are single digits; x and y are alphabetic characters; and c is a single digit.
		System.out.print("Please enter a code: ");
		String code = reader.nextLine();
		
		char c1 = code.charAt(0);
		char c2 = code.charAt(1);
		char c3 = code.charAt(2);
		char c4 = code.charAt(3);
		char c5 = code.charAt(4);
		
		if (code.length() != 5) {
			System.out.println("Code is not of required length");
		}
		
		if (!(Character.isDigit(c1) && Character.isDigit(c2))) {
			System.out.println("Characters one and two are not digits.");
		} else if (!(Character.isAlphabetic(c3) && Character.isAlphabetic(c4))) {
			System.out.println("Characters three and four are not alphabetic.");
		} else if (!Character.isDigit(c5)) {
			System.out.println("Character five is not a digit.");
		} else {
			System.out.println("Code is correct.");
		}
	}
}
```
Output
```
Please enter a code: 12rd2
Code is correct.
```
```
Please enter a code: ddff2
Characters one and two are not digits.
```
```
Please enter a code: 11332
Characters three and four are not alphabetic.
```
```
Please enter a code: 11ffs
Character five is not a digit.
```

## Exercise 7
Write a program that performs the following operations:
- Prompt the user to enter an amount of currency in GBP (£). The input amount should be in floating point format, with two decimal places representing the pennies. For example, 3.54 means 3 pounds and 54 pence.
- Next prompt the user to choose which currency they wish to convert to. List the the following options:
	- “Enter d to convert to dollars.”
	- “Enter e to convert to euros.”
	- “Enter i to convert to Indonesia Rupiah.”
-  Output the value of the pounds in the selected currency. Use the following currency conversion rates:
	- 1GBP = 1.16 Euro.
	- 1GBP = 1.32 Dollars.
	- 1GBP = 18,687.88 Rupiah.
Add two currencies of your own choice to this program.
> Note: immediately after you have read the floating point value from the keyboard using `Scanner`, you should add this line of code:
```java
in.nextLine();
```
This will ensure that the newline character is removed from the input stream.

Code
```java
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an amount of currency in GBP (£).
		// The input amount should be in floating point format, with two decimal places representing the pennies.
		System.out.print("Enter the GBP you wish to convert: ");
		float gbp = reader.nextFloat();
		
		System.out.println("Enter the currency you wish to convert to: ");
	    System.out.println("Enter d to convert to dollars.");
	    System.out.println("Enter e to convert to euros.");
	    System.out.println("Enter i to convert to rupiah.");
	    
	    reader.nextLine();
	    
	    String currency = reader.nextLine();
	    
	    if (currency.equals("d")) {
	    	float dollar = (float) (gbp * 1.32);
	    	System.out.println("In dollars this is " + dollar);
	    } else if (currency.equals("e")) {
	    	float euro = (float) (gbp * 1.16);
	    	System.out.println("In euros this is " + euro);
	    } else if (currency.equals("i")) {
	    	float rupiah = (float) (gbp * 18687.88);
	    	System.out.println("In rupiah this is " + rupiah);
	    }
	}
}
```
Output
```
Enter the GBP you wish to convert: 100
Enter the currency you wish to convert to: 
Enter d to convert to dollars.
Enter e to convert to euros.
Enter i to convert to rupiah.
d
In dollars this is 132.0
```
```
Enter the GBP you wish to convert: 100
Enter the currency you wish to convert to: 
Enter d to convert to dollars.
Enter e to convert to euros.
Enter i to convert to rupiah.
e
In euros this is 116.0
```
```
Enter the GBP you wish to convert: 100
Enter the currency you wish to convert to: 
Enter d to convert to dollars.
Enter e to convert to euros.
Enter i to convert to rupiah.
i
In rupiah this is 1868788.0
```

## Exercise 8
Write a program that performs the following operations:
- Prompt the user to enter an integer in the range 0 to 20 inclusive. If the user enters an integer that is not in that range the program should quit.
- Output the `*` character the number of times given in the input integer. For example, if the user enters the integer 5, the output will be ‘*****’. If the user enters 9, the output will be ‘*********’.

Code
```java
import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an integer in the range 0 to 20 inclusive.
		// If the user enters an integer that is not in that range the program should quit.
		System.out.print("Input an integer in the range 0 to 20 inclusive: ");
		int num = Integer.parseInt(reader.nextLine());
		
		if (num >= 0 && num <= 20) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
		}
	}
}
```
Output
```
Input an integer in the range 0 to 20 inclusive: 10
**********
```

## Exercise 9
Write a program that performs the following operations:
```
􏰀 For each integer in the range 0 to 100 inclusive, output the value of that integer multiplied by 5.
```
Code
```java
public class Exercise09 {
	public static void main(String[] args) {
		// For each integer in the range 0 to 100 inclusive, output the value of that integer multiplied by 5.
		for (int i = 0; i <= 100; i++) {
			System.out.println(i * 5);
		}
	}
}
```
Output
```
0
5
10
15
20
25
30
35
40
45
50
55
60
65
70
75
80
85
90
95
100
105
110
115
120
125
130
135
140
145
150
155
160
165
170
175
180
185
190
195
200
205
210
215
220
225
230
235
240
245
250
255
260
265
270
275
280
285
290
295
300
305
310
315
320
325
330
335
340
345
350
355
360
365
370
375
380
385
390
395
400
405
410
415
420
425
430
435
440
445
450
455
460
465
470
475
480
485
490
495
500
```

## Exercise 10
Write a program that performs the following operations:

- Prompt the user to enter a positive integer.
- Check if the integer is odd or even.
- If it is even, output the following message “value is even.”, where ‘value’ is replaced by the value of the integer entered.
- If it is odd, output the following message “value is odd.”, where ‘value’ is replaced by the value of the integer entered.

Code
```java
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter a positive integer.
		System.out.print("Enter an integer: ");
		int num = Integer.parseInt(reader.nextLine());
		
		while (true) {
			// Continue with the above operations until the user enters a negative integer or zero.
			if (num < 0) {
				System.out.println("exit");
				break;
			}
			
			// Check if the integer is odd or even.
			if (num % 2 != 0) {
				System.out.println(num + " is odd.");
			} else {
				System.out.println(num + " is even.");
			}
			System.out.println();
			
			System.out.print("Enter an integer: ");
			num = Integer.parseInt(reader.nextLine());
		}
	}
}
```
Output
```
Enter an integer: 10
10 is even.

Enter an integer: 20
20 is even.

Enter an integer: 21
21 is odd.

Enter an integer: 45
45 is odd.

Enter an integer: 34
34 is even.

Enter an integer: -1
exit
```

## Exercise 11
Exercise 11
Write a program that performs the following operations:

- Prompt the user to enter an integer.
- If the integer is positive (or zero), the program should output the square of that number. If the number is negative the program should quit.
- The program should continue prompting the user for an integer until they enter a negative number which ends the program.

Code
```java
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an integer.
		// If the integer is positive (or zero), the program should output the square of that number
		// If the number is negative the program should quit.
		while (true) {
			System.out.print("Enter an integer: ");
			int num = Integer.parseInt(reader.nextLine());
			
			if (num < 0) {
			    System.out.println("Quitting.");
				break;
			}
			
			if (num >= 0) {
				System.out.println(num * num);
				System.out.println();
			}
		}
	}
}
```
Output
```
Enter an integer: 5
25

Enter an integer: 9
81

Enter an integer: 13
169

Enter an integer: -1
Quitting.
```

## Exercise 12

Write a program that performs the following operations:
- Prompt the user for a series of positive integers. The user should press enter after each integer is input.
- If the user enters a negative integer, the program should output the following information about the numbers entered, and then quit:
	- The mean of the values entered.
	- The maximum value entered.
	- The minimum value entered.
	- The range of the values entered.

Code
```java
import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int count = 0;
		double sum = 0;
		
		// Prompt the user for a series of positive integers. The user should press enter after each integer is input.
		System.out.println("Enter an integer. Enter a negative number to exit: ");
		int num = Integer.parseInt(reader.nextLine());
		
		while (num >= 0) {
			sum += num;
			count++;
			
			if (num > max) {
				max = num;
			} 
			
			if (num < min) {
				min = num;
			}
			num = Integer.parseInt(reader.nextLine());
		}
		
		System.out.println("Max value: " + max);
	    System.out.println("Min value: " + min);
	    System.out.println("Range: " + (max - min));
	    System.out.println("Mean: " + (double)(sum / count));
	}
}
```
Output
```
Enter an integer. Enter a negative number to exit: 
4
7
9
2
5
23
-1
Max value: 23
Min value: 2
Range: 21
Mean: 8.333333333333334
```

## Exercise 13
Exercise 13
Write a program that performs the following operations:   
􏰀 Prompt the user for a series of strings. The user should press enter after each string is input.   
􏰀 If the user enters the string “quit”, the program should output the following information, and then quit:   
- The mean length of the strings entered.
- The length of the longest string entered.
- The length of the shortest string entered.

Code
```java
import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		/* 
		 * Prompt the user for a series of strings. The user should press enter after each string is input.
		 * If the user enters the string “quit”, the program should output the following information, and then quit:
		 * – The mean length of the strings entered. 
		 * – The length of the longest string entered. 
		 * – The length of the shortest string entered. 
		 */
		int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int count = 0;
	    double sum = 0;
		
		System.out.println("Enter a String. Type ’quit’ to quit.");
		
		while(true) {
			String word = reader.nextLine();
			
			sum += word.length();
			count++;
			
			if (word.equals("quit")) {
				System.out.println("exit");
				break;
			}
			System.out.println();
			
			if (word.length() > max) {
				max = word.length();
			}
			
			if (word.length() < min) {
				min = word.length();
			}
		}
		System.out.println("Max string length: " + max);
	    System.out.println("Min string length: " + min);
	    System.out.println("Mean string length: " + (sum / count));
	}
}
```
Output
```
Enter a String. Type ’quit’ to quit.
example
level
exercise
integer
string
quit
exit

Max string length: 8
Min string length: 5
Mean string length: 6.166666666666667
```
