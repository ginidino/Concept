# Exercise4

## Exercise1
Write a program that performs the following operations:   
􏰀 Prompt the user to enter an integer.   
􏰀 Check if the integer is odd or even.   
􏰀 If it is even, output the following message “value is even.”, where ‘value’ is replaced by the value of the integer entered.   
􏰀 If it is odd, output the following message “value is odd.”, where ‘value’ is replaced by the value of the integer entered.   

Your program must include a method with the following signature:
```java
public static boolean isEven(int value)
```
This method returns true if the parameter is an even integer, false if it is odd.

This means that your program will have two methods: the `main` method and the `isEven` method. Your main method will call the isEven method with the parameter listed. Your `main` method will then output the result.

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

## Exercise2
Write a program that performs the following operations:   
􏰀 Prompt the user to input three integers in a single input line. There will be spaces between the integers.   
􏰀 Output the maximum value of the three entered values.   

Your program must include a method with the following signature:
```java
public static int maxOfThree(int value1, int value2, int value3)
```
This method returns the value of the maximum of the three parameters. If more than one value is the maximum, return that value.   

This means that your program will have two methods: the `main` method and the `maxOfThree` method. Your main method will call the `maxOfThree` method with the parameters listed. Your `main` method will then output the result.

Code
```java
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter three integers as a single line of input.");
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		
		int val1 = Integer.parseInt(newStr[0]);
		int val2 = Integer.parseInt(newStr[1]);
		int val3 = Integer.parseInt(newStr[2]);
		
		System.out.println(maxOfThree(val1,val2,val3));
	}

	public static int maxOfThree(int val1, int val2, int val3) {
		if (val1 >= val2 && val1 >= val3) {
			return val1;
		} else if (val2 >= val1 && val2 >= val3) {
			return val2;
		} else if (val3 >= val1 && val3 >= val2) {
			return val3;
		}
		return val1;
	}
}
```
Output
```
Enter three integers as a single line of input.
1 2 3
3
```

## Exercise3
Write a program that performs the following operations:   
􏰀 Prompt the user to enter an integer.   
􏰀 Output the cube of the integer.   

Your program must include a method with the following signature:
```java
public static int cube(int val)
```
You need to write this method. Make the signature exactly as shown above.

This means that your program will have two methods: the `main` method and the `cube` method. Your main method will call the cube method with the parameter. Your `main` method will then output the result. The purpose of the `cube` method should hopefully be clear from its signature. It will receive an integer as a parameter and it will return the cube of that integer, as a integer.

Code
```java
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Input an integer to see its cube: ");
		int num = Integer.parseInt(reader.nextLine());
		
		int result = cube(num);
		System.out.println("Cube of " + num + ": " + result);
	}
	
	public static int cube(int val) {
		return val * val* val;
	}
}
```
Output
```
Input an integer to see its cube: 3
Cube of 3: 27
```

## Exercise4
Write a program that performs the following operations:
- Prompt the user to enter a string.
- Check if that string contains at least one of the following punctuation marks: the exclamation mark (!), the comma (,), the period (.), or the colon (:).
- If the input string contains one of those characters, output a message stating so. 

Your program must include a method with the following signature:
```java
public static boolean contains(String input, char punctuationMark)
```
You need to write this method. Make the signature exactly as shown above.

This method returns true if the string passed as the first parameter contains the character contained in the second parameter. Note that you should not restrict this method to only working with the three characters listed in the above specification.

This means that your program will have two methods: the `main` method and the `contains` method. Your `main` method will call the `contains` method several times with the parameters listed to check each of the punctuation marks listed above. Your `main` method will then output the result.

Code
```java
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a string to check: ");
		String check = reader.nextLine();
		
		if (contains(check, '!') || contains(check, ',') || contains(check, '.') || contains(check, ':')) {
			System.out.println("Input string contains a !, , . or :.");
		} else {
			System.out.println("Input string does not contains a !, , . or :.");
		}
	}
	
	public static boolean contains(String check, char punctuationMark) {
		for (int i = 0; i < check.length(); i++) {
			if (check.charAt(i) == punctuationMark) {
				return true;
			}
		}
		return false;
	}
}
```
Output
```
Enter a string to check: example§:
Input string contains a !, , . or :.
```
```
Enter a string to check: example1
Input string does not contains a !, , . or :.
```

## Exerxise5
Write a program that performs the following operations:
- Prompt the user to enter a series of integers as a single line of input. Any number of integers might be entered. There will be a space between each input integer.
- Prompt the user to enter another integer. This will be used as an index into the first series of integers, and will count from 1. If the index is not valid, i.e. it is not in the range 1 to number-of-integers- entered, then the program should quit. Any index value lower than 1 is not valid and if, for example, the user enters a series of 6 integers, any index greater than 6 is not valid.
- Output the sum of the values in the series of integers from the index entered in the second input to the end of the series, inclusive. For example, if the user enters the series of integers 1 20 3 -2 7 and the index 3, the program will output 8 (since 3 + −2 + 7 = 8).

Your program must include a method with the following signature:
```java
public static int sum(int[] values, int index)
```
You need to write this method. Make the signature exactly as shown above.

This method returns the sum of the values in the array from index to the end of the array.

This means that your program will have two methods: the `main` method and the `sum` method. Your `main` method will call the `sum` method with the parameters listed. Your `main` method will then output the result.

Code
```java
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		String num = reader.nextLine();
		
		System.out.println("Now enter an index.");
		int index = Integer.parseInt(reader.nextLine());
		
		String[] newStr = num.split(" ");
		
		if (index >= 1 && index <= newStr.length) {
			int[] value = new int[newStr.length];
			
			for (int i = 0; i < value.length; i++) {
				value[i] = Integer.parseInt(newStr[i]);
			}
			
			int sum = sum(value, index);
			
			System.out.println("The sum from index " + index + " is " + sum + ".");
		} else {
			System.out.println("Invalid index");
		}
	}

	public static int sum(int[] value, int index) {
		int sum = 0;
		
		for (int i = index - 1; i < value.length; i++) {
			sum += value[i];
		}
		
		return sum;
	}
}
```
Output
```
Enter a series of integers on a single line, each separated by a space from the previous.
1 20 3 -2 7
Now enter an index.
3
The sum from index 3 is 8.
```

## Exercisr6
Write a program that performs the following operations:
- Prompt the user to enter a series of positive integers as a single line of input. Any number of integers might be entered. There will be a space between each input integer.
- The program should then output the integers as a set, i.e. with duplicates removed. 
 
Your program must include a method with the following signature:
```java
public static int[] createSet(int[] values)
```
You need to write this method. Make the signature exactly as shown above.

This method returns the set of values in the input array as an array.

This means that your program will have two methods: the `main` method and the `createSet` method. Your `main` method will call the `createSet` method with the parameters listed. Your `main` method will then output the result.

Implementation note: Since you will not know in advance how many items should be in the set, your `createSet` method should create an array that is the same size as the input array to hold the set. Since, in this exercise, the input values will be positive, you can fill this set array with negative values. This means you can define a negative value to mean a value in the set array that is not valid (since, in general, the number of valid elements in the set array will be less than the number of values in the input array).

Code
```java
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a series of integers on a single line, each separated by a space from the previous.");
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		int[] value = new int[newStr.length];
		
		for (int i = 0; i < value.length; i++) {
			value[i] = Integer.parseInt(newStr[i]);
		}
		
		int[] set = createSet(value);
		
		for (int i = 0; i < set.length; i++) {
			if (set[i] >= 0) {
				System.out.print(set[i] + " ");
			}
		}
	}

	public static int[] createSet(int[] value) {
		int[] set = new int[value.length];
		
		for (int i = 0; i < value.length; i++) {
			set[i] = -1;
		}
		
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
		
		return set;
	}
}
```
Output
```
Enter a series of integers on a single line, each separated by a space from the previous.
1 1 2 3 4 4 5 6 2
1 2 3 4 5 6 
```

## Exercise7
Write a program that performs the following operations:   
- Prompt the user to enter a string.   
- Output the character that appears most frequently in the string. If no character appears more frequently than any other, output a message to that effect.   

Your program must include a method with the following signature:
```java
public static int count(String input, char c)
```
This method will count the number of times that the character c appears in the string input.

Code
```java
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
```
Output
```
Enter a string: example
The character 'e' appears most often.
```

## Exercise8
Write a program that performs the following operations:
- Prompt the user to enter a string.
- Prompt the user to enter two characters, on the same line, with no space inbetween the characters.
- Output the string with all instances of the first character entered at the previous operation replaced with the second character entered. For example, if the input string is “Led Zeppelin”, and the two characters are “ ” (space) and “-” (underscore), the output will be “Led_Zeppelin”. This is essentially ‘find and replace’ operation. Note that more than one instance of the character to be replaced might be found in the input.

Your program must include a method with the following signature:
```java
public static String replace(String input, char remove, char replace)
```
This method will take the input string and replace all instances of remove with replace.

Code
```java
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
```
Output
```
Enter a string: apple
Input a character to replace, and its replacement: a_
_pple
```
