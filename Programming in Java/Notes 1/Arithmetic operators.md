# Arithmetic operators
- In order to do mathematical operations on variables, we need to use the arithmetic operators.
  > Note that they are all binary operators requiring two *operands*
- The arithmetic operators

|Operator|Function|
|------|---|
|+|Addition|
|-|Subtraction|
|*|Multiplication|
|/|Division|
|%|Modulo (remainder)|

## Operators
- In mathematics, operators have an *order of precedence*.
- Java operators also have an order of precedence but it contains all of the operators, not just the mathematical operators.
- Must consider the order of precedence of all of the operators.

## Order of precedence
- The order of precedence of the arithmetic operators follows their mathematical counterparts.

|Type|Precedence|
|------|---|
|Multiplicative|* / %|
|Additive|+ -|

- The table shows the order of precedence.
- Rows higher up in the table are of higher precedence.
- Within the rows the precedence is the same and expressions involving those operators will be evaluated in left-to-right order.

## Example
### Addition
```java
public class Addition {
	public static void main(String[] args) {
		// i1 is set to 7
		int i1 = 7;
		
		// i1 is now set to 10
		i1 = i1 + 3;
		
		// shorthand for the above (i1 now = 13)
		i1 += 3;
		
		// i2 is set to 33
		int i2 = i1 + i1 + 7;
		
		// i2 is ??? -> i2 = 85
		i2 = i2 + (i2 + i1) + 6;
		
		System.out.println("i2 = " + i2 + ".");
	}
}
```
Question: 
```
What is the value of `i2`? 
i2 = i2 + (i2 + i1) + 6?
```
Answer: 
```
i2 = 33 + (33 + 13) + 6 = 85
```

### Subtraction
```java
public class Subtraction {
	public static void main(String[] args) {
		// i1 is set to 6
		int i1 = 6;
		
		// i1 is now set to 3
		i1 = i1 - 3;
		
		// shorthand for the above (i1 now = 0)
		i1 -= 3;
		
		// i1 is set to 26
		i1 = 30 + 3 - 7;
		
		// i2 is set to 12
		int i2 = i1 - 10 - 4; 
		
		// i2 is ???
		i2 = i2 - 11 + i1 - 6;
		
		System.out.println("i2 = " + i2 + ".");
	}
}
```
Question:  
```
What is the value of `i2`?
i2 = i2 - 11 + i1 - 6?
```
Answer: 
```
i2 = 12 - 11 + 26 - 6 = 21
```

### Multiplication
```java
public class Multiplication {
	public static void main(String[] args) {
		// i1 is set to 12
        int i1 = 2 * 6;
        
        // i1 is set to 24
        i1 = i1 * 2;
        
        // i1 is set to 48
        i1 *= 2;
        
        // i2 is set to ???
        int i2 = i1 * 3 * -2;
        
        System.out.println("i2 = " + i2 + ".");
	}
}
```
Question: 
```
What is the value of `i2`? 
i2 = i2 = i1 * 3 * -2?
```
Answer: i2 = 48 * 3 * -2 = -288


### Division
```java
public class Division {
	public static void main(String[] args) {
		// i1 is set to 25
		int i1 = 50/2;
		
		// i1 is set to 12 (note: integer division)
		i1 = i1 / 2;
		
		// i1 is set to 6
		i1 /= 2;
		
		// i2 is set to??
		int i2 = 60 / i1 / 2;
		
		System.out.println("i2 = " + i2 + ".");
		
		// i3 is set to ???
		int i3 = 12 / 0;
		
		System.out.println("i3 = " + i3 + ".");
	}
}
```
Question: 
```
What is the value of `i2` and `i3`?  
i2 = i2 = 60/i1/2?
i3 = 12/0?
```
Answer: 
```
i2 = 60 / 6 / 2 = 5
i3 = `Exception in thread "main" java.lang.ArithmeticException: / by zero`
```
> cannot divide by zero. The result is `undefined`.
> In this case, have raised an exception.

### Modulo (remainder)
```java
public class Modulo {
	public static void main(String[] args) {
		// i1 is set to 6
        int i1 = 20 / 3;
        
        // i2 is set to 2
        int i2 = 20 % 3;
        
        // i1 is set to 12
        i1 = i1 * i2;
        
        // i1 is set to 0
        i1 = i1 % 2;
        
        // i2 is set to ???
        i2 = 30 + 10 % 3;
        
        System.out.println("i2 = " + i2 + ".");
	}
}
```
Question: 
```
What is the value of `i2`?  
i2 = 30 + 10 % 3?
```
Answer: 
```
i2 = 30 + 1(remainder of 10 % 3 is 1) = 31
```

### Precedence
This program demonstrates the effects of the order of precedence with the arithmetic operators.
```java
public class Precedence {
	public static void main(String[] args) {
		// i1 is set to ???
		int i1 = 10 + 5 * 2 / 4 - 1;
		
		System.out.println("i1 = " + i1 + ".");
		
		// i2 is set to ???
		int i2 = 100 - 5 * 3 - 1 + 11 / 3;
		
		System.out.println("i2 = " + i2 + ".");
	}
}
```
Question: 
```
What is the value of `i1` and `i2`? 
i1 = 10 + 5 * 2 / 4 - 1?
i2 = 100 - 5 * 3 - 1 + 11 / 3?
```
Answer: 
```
i1 = 10 + 5 * 2 / 4 - 1
   = 10 + 10 / 4 - 1
   = 10 + 2 - 1
   = 12 - 1
   = 11
    
i2 = 100 - 5 * 3 - 1 + 11 / 3
   = 100 - 15 - 1 + 11 / 3
   = 100 - 15 - 1 + 3
   = 85 - 1 + 3
   = 84 + 3
   = 87       
```

### Integer division
```java
public class ArithmeticDemo7 {
	public static void main(String[] args) {
		float f1 = 10 / 3;
		System.out.println("f1 = " + f1 + ".");
	}
}
```
output
```
f1 = 3.0
```
- the the two operands of the division operator are given as integer literals (10 and 3).
- the division operator applied will be the integer division operation.
- If the result of this operation has a fractional part, it will simply be truncated. No rounding occurs.

### Floating point division
In order for them to be treated as floating point numbers, one of them must be explicitly denoted a floating point number.
```java
public class ArithmeticDemo8 {
	public static void main(String[] args) {
		float f1 = 10.0f / 3;
		
		System.out.println("f1 = " + f1 + ".");
	}
}
```
output
```
f1 = 3.3333333.
```

## Arithmetic with floating point types
- Other complications arise with floating point types.
- when using the arithmetical operators with the floating point types: *float* and *double*.
- `float`type is stored in 32 bits
- `double` type is stored in 64 bits
- > The finite number of bits used to represent these types means that some values cannot be represented.
- -> The format used for these types is referred to as the IEEE754 format.

> With the arithmetic operators we may simply see an ‘incorrect’ result.

### Example
Question : What will the output of this program be?
```java
public class ArithmeticDemo9 {
	public static void main(String[] args) {
		float f1 = 100.0f * 3.33333f;
		
		System.out.println("f1 = " + f1 + ".");
	}
}
```
My expected output is 
```
f1 = 333.333.
```
but, the output when run the program
```
f1 = 333.33298.
```
- This result arises from the fact that the IEEE754 representation of floating point values means that not all values can be represented.
- This is a difference of 333.333 - 333.33298 = 0.00002.
- This is the `error`.







