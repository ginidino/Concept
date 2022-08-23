# Exercises 1: Data, Variables and Operators

## Exercise 1
Write a program that outputs the result of the following expression:
```
14-3*8/2
```
Code
```java
public class Exercise01 {
	public static void main(String[] args) {
		System.out.println(14 - 3 * 8 / 2);
	}
}
```
Answer
```
14 - 3 * 8 / 2 = 14 - 24 / 2
               = 14 - 12
               = 2

Answer: 2
```

## Exercise 2
Write a program that outputs the result of the following expression:
```
20- -2*5/2
```
Code
```java
public class Exercise02 {
	public static void main(String[] args) {
		System.out.println(20 - -2 * 5 / 2);
	}
}
```
Answer
```
20 - -2 * 5 / 2 = 20 - -10 / 2
                = 20 - -5
                = 20 + 5
                = 25

Answer: 25
```

## Exercise 3
Write a program that outputs the result of the following expression:
```
(2+5)*2*5.0/2
```
Code
```java
public class Exercise03 {
	public static void main(String[] args) {
		System.out.println((2 + 5) * 2 * 5.0 / 2);
	}
}
```
Answer
```
(2 + 5) * 2 * 5.0 / 2 = 7 * 2 * 5.0 / 2
                      = 14 * 5.0 / 2
                      = 70.0 / 2
                      = 35.0

Answer: 35.0
```

## Exercise 4
Write a program that outputs the result of the following expression:
```
!true || true && (false || !false && true)
```
Code
```java
public class Exercise04 {
	public static void main(String[] args) {
		System.out.println(!true || true && (false || !false && true));
	}
}
```
Answer
```
!true || true && (false || !false && true) = false || true && (false || true && true)
                                           = false || true && (false || true)
                                           = false || ture && true
                                           = false || true
                                           = true

Answer: true
```

## Exercise 5
What value will be assigned to d in this code fragment?
```
int a = 5;
int b = 6;
int c = 7;
int d = a + b++ + b;
```
Code
```java
public class Exercise05 {
	public static void main(String[] args) {
	    int a = 5;
	    int b = 6;
	    int c = 7;
	    int d = a + b++ + b;
	    
	    System.out.println("d = " + d);
	}
}
```
Answer
```
a = 5;
b = 6;
c = 7;
d = a + b++ + b
  = 5 + 6 + 7
  = 18

Answer: d = 18
```

## Exercise 6
What value will be assigned to e in this code fragment?
```
int a = 5;
int b = 6;
int c = 7;
int e = ++b - a + ++c + b;
```
Code
```java
public class Exercise06 {
	public static void main(String[] args) {
	    int a = 5;
	    int b = 6;
	    int c = 7;
	    int e = ++b - a + ++c + b;
	    
	    System.out.println("e = " + e);
	}
}
```
Answer
```
a = 5;
b = 6;
c = 7;

e = ++b - a + ++c + b;
  = 7 - 5 + 8 + 7
  = 2 + 8 + 7
  = 10 + 7
  = 17

Answer: e = 17
```

## Exercise 7
What value will be assigned to f in this code fragment?
```
int a = 5;
int b = 6;
int c = 7;
int f = a * b++ - c * b;
```
Code
```java
public class Exercise07 {
	public static void main(String[] args) {
	    int a = 5;
	    int b = 6;
	    int c = 7;
	    int f = a * b++ - c * b;
	    
	    System.out.println("f = " + f);
	}
}
```
Answer
```
a = 5;
b = 6;
c = 7;

f = a * b++ - c * b;
  = 6 * 6 - 7 * 7
  = 36 - 49
  = -19

Answer: f = -19
```

## Exercise 8
What value will be assigned to b1 in this code fragment?
```
int a = 5;
int b = 6;
int c = 7;
boolean b1 = a < --b;
```
Code
```java
public class Exercise08 {
	public static void main(String[] args) {
	    int a = 5;
	    int b = 6;
	    int c = 7;
	    
	    boolean b1 = a < --b;
	    
	    System.out.println("b1 = " + b1);
	}
}
```
Answer
```
a = 5
b = 6
c = 7

b1 = a < --b
   = 5 < --6
   = 5 < 5
   = false

Answer: b1 = false
```

## Exercise 9
What value will be assigned to b2 in this code fragment?
```
int a = 5;
int b = 6;
int c = 7;
boolean b2 = c-- <= ++a +1;

```
Code
```java
public class Exercise09 {
	public static void main(String[] args) {
  	    int a = 5;
	    int b = 6;
	    int c = 7;
	 
	    boolean b2 = c-- <= ++a + 1;
	    
	    System.out.println("b2 = " + b2);
	}
}
```
Answer
```
a = 5
b = 6
c = 7

b2 = c-- <= ++a + 1
   = 7-- <= ++5 + 1
   = 7-- <= 6 + 1
   = 7-- <= 7
   = true

Answer: b2 = true
```

## Exercise 10
What value will be assigned to b3 in this code fragment?
```
int a = 5;
int b = 6;
int c = 7;
c--;
boolean b3 = c == b && a++ < c;
```
Code
```java
public class Exercise10 {
	public static void main(String[] args) {
	    int a = 5;
	    int b = 6;
	    int c = 7;
	 
	    c--;
	    
	    boolean b3 = c == b && a++ < c;
	    
	    System.out.println("b3 = " + b3);
	}
}
```
Answer
```
a = 5
b = 6
c = 7

c-- = 7-- -> from next c, c is 6

b3 = c == b && a++ < c
   = 6 == 6 && 5++ < 6
   = true && true
   = true

Answer: b3 = true
```

## Exercise 11
Write a program that performs the following operations:   
􏰀 Create an integer variable called num1 and initialise it 4.   
􏰀 Create another integer variable called num2 and initialise it 6.   
􏰀 Create another integer variable called num3 and initialise it 3.   
􏰀 Assign the result of summing num1 and num2 to a new integer variable called sum1.   
􏰀 Assign the result of dividing sum1 by num3 to a new float variable called result.   
􏰀 Output the value of result.   

Code
```java
public class Exercise11 {
	public static void main(String[] args) {
		// Create an integer variable called num1 and initialise it 4.
		int num1 = 4;
		
		// Create another integer variable called num2 and initialise it 6.
		int num2 = 6;
		
		// Create another integer variable called num3 and initialise it 3.
		int num3 = 3;
		
		// Assign the result of summing num1 and num2 to a new integer variable called sum1.
		int sum1 = num1 + num2;
		
		// Assign the result of dividing sum1 by num3 to a new float variable called result.
		float result = (float) sum1 / num3;
		
		System.out.println("Sum of num1 and num2 is " + sum1);
		System.out.println("Result of dividing sum1 by num3 is " + result);
	}
}
```
Output
```
Sum of num1 and num2 is 10
Result of dividing sum1 by num3 is 3.3333333
```

## Exercise 12
Write a program that performs the following operations:   
􏰀 Create four floating point variables called val1,val2,val3 and val4.   
􏰀 Initialise them to the values 1, 2, 3, 4, respectively (i.e. val1 = 1, val2 = 2, ...).   
􏰀 Create a new floating point variable called total and set it to the sum of the four variables created above.   
􏰀 Create a new floating point variable called mean and set it to total divided by 4.   
􏰀 Output the value of mean.

Code
```java
public class Exercise12 {
	public static void main(String[] args) {
		// Create four floating point variables called val1,val2,val3 and val4.
		// Initialise them to the values 1, 2, 3, 4, respectively (i.e. val1 = 1, val2 = 2, ...).
		float val1 = 1;
		float val2 = 2;
		float val3 = 3;
		float val4 = 4;
		
		// Create a new floating point variable called total and set it to the sum of the four variables created above.
		float total = val1 + val2 + val3 + val4;
		
		// Create a new floating point variable called mean and set it to total divided by 4.
		float mean = total / 4;
		
		System.out.println("Total of val1, val2, val3 and val4 is " + total);
		System.out.println("Mean is " + mean);
	}
}
```
Output
```
Total of val1, val2, val3 and val4 is 10.0
Mean is 2.5
```

## Exercise 13
Write a program that performs the following operations:   
􏰀 Create five integer variables.   
􏰀 Set the value of the first variable to 1.   
􏰀 Set the value of each subsequent variable to twice (2×) the value of the previous one. For example, the second variable will have the value 2, the third will have the value 4, etc. Use the existing variable names to set these values rather than using constants.   
􏰀 Output the sum of the five variables.   
􏰀 Compute the mean of the five variables and output the result.   

Code
```java
public class Exercise13 {
	public static void main(String[] args) {
		// Create five integer variables
		// Set the value of the first variable to 1
		// Set the value of each subsequent variable to twice (2×) the value of the previous one.
		int val1 = 1;
		int val2 = val1 * 2;
		int val3 = val2 * 2;
		int val4 = val3 * 2;
		int val5 = val4 * 2;
		
		// Output the sum of the five variables.
		int sum = val1 + val2 + val3 + val4 + val5;
		
		// Compute the mean of the five variables and output the result.
		float result = (float) sum / 5;
		
		System.out.println("Sum of five variables is " + sum);
		System.out.println("Maen of five variables is " + result);
	}
}
```
Output
```
Sum of five variables is 31
Maen of five variables is 6.2
```

## Exercise 14
Write a program that performs the following operations:   
􏰀 Prompt the user to enter an integer.   
􏰀 When an integer is input, print out the value of the integer multiplied by 10.   

Code
```java
import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Prompt the user to enter an integer.
		System.out.print("Enter the number: ");
		int num = reader.nextInt();
		
		// When an integer is input, print out the value of the integer multiplied by 10.
		System.out.println("the value of the integer multiplied by 10. : " + num * 10);
	}
}
```
Output
```
Enter the number: 3
the value of the integer multiplied by 10. : 30
```

## Exercise 15
Write a program that performs the following operations:   
􏰀 Prompt the user to enter an integer.   
􏰀 Prompt the user to enter another integer.   
􏰀 Output the sum of the two integers.   
􏰀 Output the product of the two integers.   

Code
```java
import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an integer.
		System.out.print("Enter the first number: ");
		int num1 = reader.nextInt();
		
		// Prompt the user to enter another integer.
		System.out.print("Enter the second number: ");
		int num2 = reader.nextInt();
		
		// Output the sum of the two integers.
		System.out.println("The sum of the two numbers is: " + (num1 + num2));
		
		// Output the product of the two integers.
		System.out.println("The product of the two numbers is: " + (num1 * num2));
	}
}
```
Output
```
Enter the first number: 10
Enter the second number: 3
The sum of the two numbers is: 13
The product of the two numbers is: 30
```
