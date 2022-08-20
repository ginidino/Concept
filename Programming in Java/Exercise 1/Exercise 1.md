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
