# Variables
- `variables`: values that can vary
- The process of creating a variable is called declaring the variable. 
- A variable declaration specifies the type of the variable, its name and, optionally, its initial value.
- The format of a declaration
```
{data type} {name} [ = <initial value> ]{;}
{ } = compulsory;[ ] = optional;<> = a value
```
- In Java you must state the exact data type of the variable you want to create.
- All variables must also have a name.
- The semi-colon marks the end of the statement.

## Variable declarations
```java
public class VariablesDemo1 {
    public static void main (String[] args) {
    	boolean b;
		char c;
		int i;
		float fp;
		double x;
 	}
}
```

## Variable initialisation
In Java, to use variables we must initialise them. Variables are given a value using the assignment operator ‘=’.
```java
public class VariablesDemo2 {
	public static void main(String[] args) {
		boolean b = true;
		char c = ’a’;
		int i = -40003;
		float fp = 0.655f;
		double x = 0.56566522;
	}
}
```

## The assignment operator
The assignment operator is a *binary operator*. This means that it requires two operands.
- the operands: the *lvalue* and the *rvalue*
- The lvalue: the destination of the operation, i.e. the value that will be assigned to
- The rvalue: the source value, i.e. the value that is being used to change the lvalue.
- The assignment operator is an infix operator.
	- This means that it is placed between the operands: lvalue = rvalue.

## Using variables
- Once a variable has been declared (and initialised) it can be used for whichever purpose it was created for.
- Once a variable has been declared, its type is no longer specified when it is used.
- ariables can also be assigned new values.

### Example
```java
public class VariablesDemo3 {
	public static void main(String[] args) {
		// declare two integers and initialise them
		int i1 = 0;
		int i2 = 5;

        // change the value of i1 (no type needed now)
		i1 = 7;
		
		// set i2 to be the same value as i1
		i2 = i1;
		
		// change the value of i1
		i1 = 10;
		
		// print the values of i1 and i2 to the screen
		System.out.println("i1 = " + i1 + "; i2 = " + i2);
	}
}
```
```
i1 = 10; i2 = 7
```
