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
