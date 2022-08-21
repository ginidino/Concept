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

## Unary operators
A number of unary operators (which take only one operand) available in Java

|Operator|Function|
|------|---|
|+|Indicates a positive value (the default)|
|-|Negates a numerical value|
|++|Increments a value by 1|
|--|Decrements a value by 1|
|!|Negates a boolean value|

There are prefix and postfix versions of the ++ and -- operator

## Operator precedence review
- The arithmetic operators follow the usual order of precedence followed by their mathematical counterparts.
- The unary operators just introduced, however, have a higher precedence than the arithmetic operators, with the postfix operators introduced having the highest precedence.
- Order of precedence

|Type|Precedence|
|------|---|
|Postfix unary|expr++ expr- -|
|Unary|++expr - -expr +expr -expr !expr|
|Multiplicative|* / %|
|Additive|+ -|

### Example: Unary operators
#### the unary + and unary - operators.
- The unary + simply marks an integral value as positive. It has no other effects so is largely useless.
- The unary - operator negates its operand, which can be a useful operation.
```java
public class UnaryDemo1 {
	public static void main(String[] args) {
		// the default sign is positive
		int i1 = 10;
		
		// this means the same as the previous assignment
		int i2 = +10; int i3 = -1;
		
		// has no effect so i4 = i3
		int i4 = +i3;
		
		// i5 is set to 5
		int i5 = 5;
		
		// i5 is set to -5
		i5 = -i5;
		
		// i6 is set to -5
		int i6 = -(-i5);
		
		System.out.println("i1 = " + i1 + "."); 
		System.out.println("i2 = " + i2 + "."); 
		System.out.println("i3 = " + i3 + "."); 
		System.out.println("i4 = " + i4 + "."); 
		System.out.println("i5 = " + i5 + "."); 
		System.out.println("i6 = " + i6 + ".");
	}
}
```
output
```
i1 = 10.
i2 = 10.
i3 = -1.
i4 = -1.
i5 = -5.
i6 = -5.
```

#### the unary increment (++) and decrement (--). operators.
- The increment operator simply adds one to its operand. The decrement operator subtracts one from its operand.
- They are straightforward but both have a prefix and a postfix version.

- the postfix version evaluates to its existing value which is used in the expression and **then** increments or decrements its operand
- the prefix version first increments or decrements its operand and the new value is used in the expression
```java
public class UnaryDemo2 {
	public static void main(String[] args) {
		int i1 = 2;
        
		// i1 now = 3
        i1++;
        
        int i2 = 5;
        
        //i2 now = 6
        ++i2;
        
        // i3 is set to 3, i1 is set to 4
        int i3 = i1++;
        
        // i4 is set to 4, i3 is set to 4
        int i4 = ++i3;
        
        // i5 is set to ???
        int i5 = ++i4 * 2 + 3;
        
        // i6 is set to ???
        int i6 = i1++ + +i2 - ++i4;
        
        System.out.println("i1 = " + i1 + "."); 
		System.out.println("i2 = " + i2 + "."); 
		System.out.println("i3 = " + i3 + "."); 
		System.out.println("i4 = " + i4 + "."); 
		System.out.println("i5 = " + i5 + "."); 
		System.out.println("i6 = " + i6 + ".");
	}
}
```
- i5 = 5 * 2 + 3 = 13
- i6 = 4 + 6 - 6 = 4

output
```
i1 = 5.
i2 = 6.
i3 = 4.
i4 = 6.
i5 = 13.
i6 = 4.
```

#### negation operator
This negates boolean expressions, which means if its operand is true then it evaluates to false and vice versa.
```java
public class UnaryDemo3 {
	public static void mian(String[] args) {
		boolean b1 = false; 
		boolean b2 = true;
		
		// b1 is now true
		b1 = !b1;
		
		// b1 is now false
		b1 = !b1;
		
		// b2 is false
		b2 = b1;
		
		// b2 is true
		b2 = !b1;
		
		// b2 is ???
		b2 = !(!(!b1));
		
		System.out.println("b1 = " + b1 + ".");
		System.out.println("b2 = " + b2 + ".");
	}
}
```
b2 = !(!(!b1)) = !(!(!flase)) = !(!(true)) = !(!true) = !false = true

output
```
b1 = false.
b2 = true.
```

