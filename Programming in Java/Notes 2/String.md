# String
`String`: a sequence of characters

- A String can be created simply by placing a sequence of valid characters between ‘speech marks’. 
- Strings:
```
“David Bowie” 
“123644” 
“£$$/*” 
“3.142”
“ 0 0 0”
```
- A lot of the `System.out.println()` statements that have used so far have involved Strings declared in this manner.
- The above `Strings` are *string literals*, i.e. constants
- Declare String variables
```java
public class StringDemo1 {
	public static void main(String[] args) {
		// a declaration. This String cannot be used yet.
		String s1;
		
		// now it can (initialised to the empty string)
		s1 = "";
	}
}
```
- Java does not allow us to use variables that have not been initialised
- At line 7 of this fragment, the String is given a value.
  - In this case it is given the value ‘empty string’.
  - An empty string consists of two sets of speech marks with no other character in between them.
- Some other String variables being created:
```java
String s3 = "143";
String s4 = "%^0))";
String s5 = "Hacker";
String s6 = "Dog";
String s7 = "T.";
String s8 = "3.142";
String s9 = "String s8 contains the value of PI to three d.p. as a String";
```

## String concatenation
`concatenation`: join Strings together

- String concatenation is such a common operation that in Java an overloaded operator has been provided to simplify it
- The ‘+’ operator (addition) is used for this operation.
  - This means that ‘+’ has been given a different meaning for Strings.
- If two Strings are concatenated, a new String is created that contains all of the characters from the first String followed by all of the characters from the second one.
```java
String s5 = "Hacker";
String s6 = "Dog";
String s7 = "T.";

String s10 = s5 + " " + s7 + " " + s6;
```
Output
```
Hacker T. Dog
```
```java
String s11 = "4" + "6";
```
Output
```
46
```
- The value of String s11 will be “46” not 10
- A String is not a number and ‘+’ means something different for Strings.

## String operations
Some useful String operations
☐ Finding the length of a String (the number of characters in the String).   
☐ Extracting a substring from a String.      
☐ Finding the starting position of a substring within a String, including the position of a particular character.   
☐ Getting the character at a particular position in a String.   
☐ Checking if two strings are equal.

- In order to use these operations, must use methods.

## String length
The String class allows us to easily find out how many characters are in a String.
```java
public class StringDemo2 {
	public static void main(String[] args) {
		  String s = "David Bowie";
	    int slen = s.length();
	    System.out.println("The String is " + slen + " characters long.");
	}
}
```
Output
```
The String is 11 characters long.
```
- The line of code shows the method that is used to find the length of a String
  - how many characters it contains
- s is a String
- To find out the length of the String -> use a method in the String class called `length()`.
- use that is to type the variable name followed by the period character (‘dot’) followed by the method name.
```java
int slen = s.length();
```

## Substring
- The substring operation enables you to create a String that consists of part of another *String*.
- In the *String* class the methods that can do this are all called `substring()`.
- All of these methods take parameters.

## Example1
- code fragment:
```java
public class StringDemo3 {
	public static void main(String[] args) {
		String s = "David Bowie";
		String fname = s.substring(0, 5);
		System.out.println("First name is: " + fname);
	}
}
```
- Output
```
First name is: David
```
```java
String fname = s.substring(0, 5);
```
- This version of the substring() method receives two parameters.
	- They are listed in the brackets.
- These parameters give the method *information* about what you want it to do.
- The first parameter (listed first) means the position of the character to start at when creating the substring.
- The second parameter means the position to end the substring at (+1).
- Thus, if start counting at zero, and count 5 places you will reach the space character that is between the words “David” and “Bowie”.
- The space character itself will not be included in the substring, 
	- i.e. only positions 0, 1, 2, 3 and 4 will be included.

## Example2
Another version of the substring() method that offers the convenience of only requiring one parameter.
```java
public class StringDemo4 {
	public static void main(String[] args) {
		String s = "David Bowie";
		String lname = s.substring(6);
        	System.out.println("Last name is: " + lname);
	}
}
```
- Output
```
Last name is:  Bowie
```
- If use this version of the method, it will be assumed that you want to create a substring that runs up to the end of the String.

- Thus, the parameter passed to this version of the `substring()` method specifies the start position of the substring only. 
- The end position will be assumed to be the end of the string.

## indexOf()
The indexOf() method will return the position (an integer) of the `first` instance of the character that it receives as a parameter.

- Example
	- it will return the position in the String of the space character
```java
public class StringDemo5 {
	public static void main(String[] args) {
		String s = "David Bowie";
		int spacePos = s.indexOf(' ');
	    	System.out.println("The space character is in position: " + spacePos);
	}
}
```
- Output
```
The space character is in position:  5
```
- The code fragments are not particularly *robust*.
- The code will not work **unless** used with a first name that has exactly 5 characters.

## indexOf() and substring()
This version of the program → to find any first name
```java
public class StringDemo6 {
	public static void main(String[] args) {
		String s = "David Bowie";
		int spacePos = s.indexOf(' ');
		String fname = s.substring(0, spacePos);
		System.out.println("First name is " + fname);
	}
}
```
Output
```
First name is David
```

This version of the program → Find last name
```java
public class StringDemo6a {
	public static void main(String[] args) {
		String s = "David Bowie";
		int spacePos = s.indexOf(' ');
		String fname = s.substring(spacePos + 1);
		System.out.println("Last name is " + fname);
	}
}
```
Output
```
Last name is Bowie
```

## charAt()
The `charAt()` method allows you to find out which character is at a particular position
- This method has one parameter
	- an integer that specifies the location in the String you are interested in
```java
public class StringDemo7 {
	public static void main(String[] args) {
		String s = "David Bowie";
		char c1 = s.charAt(0); // D
	        char c2 = s.charAt(4); // d 
	    
	    	System.out.println(c1);
	   	System.out.println(c2);
	}
}
```
output
```
D
d
```
> Notice that the character is returned as a char not as a String

## Equality of Strings
```java
public class StringDemo8 {
	public static void main(String[] args) {
		String s1 = "David Bowie";
		String s2 = "David Bowie";
		
		String ss1 = s1.substring(0,5);
		String ss2 = s2.substring(0,5);
		
		System.out.println(ss1);
		System.out.println(ss2);
		
		boolean b1 = (ss1 == ss2);
		
		System.out.println("b1 is " + b1);
	}
}
```
- After outputting the two substrings, this program will output ‘false’
- The problem is the use of the equality operator `==`
```java
boolean b1 = (ss1 == ss2);
```
- This expression: ss1==ss2 is comparing two String variables.
- It is not comparing the actual strings that they contain.

```java
String s1 = "David Bowie";
```
- It creates a variable called s1 and it also creates a string “David Bowie”.
- These two things are different.
- s1 is referencing the string “David Bowie” but it is not the same thing as that string.
- String class has a method that enables us to get around this problem. → `equals()`

## equals()
```java
public class StringDemo9 {
	public static void main(String[] args) {
		String s1 = "David Bowie";
		String s2 = "David Bowie";
		
		String ss1 = s1.substring(0,5);
		String ss2 = s2.substring(0,5);
		
		System.out.println(ss1);
		System.out.println(ss2);
		
		boolean b1 = (ss1.equals(ss2));
		
		System.out.println("b1 is " + b1);
	}
}
```
- The version of the program on the previous example(StringDemo8) uses the equals() method.
- This means that the two Strings being referenced will be compared, not the variables.
- The Strings are equal so the output will be ‘true’.
