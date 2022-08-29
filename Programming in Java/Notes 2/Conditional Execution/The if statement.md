# The if statement
The if statement allows to perform some actions if a condition is true.
- format of the if statement
```java
if (boolean-expression-is-true)
  then-consequence;
```
- Like other statements, the if statement is terminated by a semicolon.

### Example: if-statements
```java
import java.util.Scanner;

public class ControlDemo1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer greater than 100.");
		
		int num = reader.nextInt();
		
		if (num > 100) 
			System.out.println("Well done!");
	}
}
```
Output
```
Please enter an integer greater than 100.
120
Well done!
```
This listing shows two runs of the program
1. the integer entered is less than 100 hence no output is produced
    - The code in the if statement is skipped 
2. an integer greater than 100 is entered therefore the code in the if statement is executed

## Example: if-statements
```java
import java.util.Scanner;

public class ControlDemo2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer greater than 100.");
		
		int num = reader.nextInt();
		
		if (num > 100) 
			System.out.println("Well done!");
		System.out.println("Bad luck!");
	}
}
```
output1
```
Please enter an integer greater than 100.
80
Bad luck!
```
output2
```
Please enter an integer greater than 100.
130
Well done!
Bad luck!
```
- This listing again shows two runs of the program (output1 and output2) 
- In run one the program appears to be doing what we want but in the second the flaw is revealed. 
- The second output line is `always` produced.

## The if-else statement
format of the if-else statement
```java
if (boolean-expression-is-true)
  then-consequent;
else what-to-do-if-the-expression-is-false;
```
- With the if-else statement, we can include a statement that will only be executed if the condition is false. 
  - place it in the else clause.\

### Example: if-else
```java
import java.util.Scanner;

public class ControlDemo3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer greater than 100.");
		
		int num = reader.nextInt();
		
		if (num > 100) 
			System.out.println("Well done!");
		else 
			System.out.println("Bad luck!");
		
	}
}
```
output1
```
Please enter an integer greater than 100.
80
Bad luck!
```
output2
```
Please enter an integer greater than 100.
120
Well done!
```

### Example: if-statements
```java
import java.util.Scanner;

public class ControlDemo4 {
	public static void main(String[] args) {
		boolean answerCorrect = false;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer greater than 100.");
		
		int num = reader.nextInt();
		
		if (num > 100) 
			System.out.println("Well done!"); 
			answerCorrect = true;
		
		if (answerCorrect) 
			System.out.println("You have reached level 5.");
	}
}
```
Output1
```
Please enter an integer greater than 100.
101
Well done!
You have reached level 5.
```
Output2
```
Please enter an integer greater than 100.
77
You have reached level 5.
```
- This is an incorrect result.
- This is because the boolean value answerCorrect is set to true whatever the truth of the condition in the if statement because the if statement ends at the first semicolon.
- Only one ’line of code’ can appear in an if statement unless a *block* is created.
