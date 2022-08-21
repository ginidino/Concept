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
