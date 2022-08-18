# Java
One of the key motivations for the creation of the Java was the desire to be able to run the same program on multiple platforms

## Creating a Java program
- the software developer writes Java source code. This is essentially a text file.
- Write a Java program, the programmer must write at least one structure called a `class`
- The class contains the program
- For the class to represent a program, it must contain a method called `main`

## A ‘Hello, World’ program in Java
```java
public class HelloWorld {
    public static void main (String[] args) {
       System.out.println("Hello, World.");
    }
}
```
- output
```
Hello, World
```

## Analysing the ‘Hello, World’ program
```java
public class HelloWorld {
    public static void main (String[] args) {
       System.out.println("Hello, World.");
    }
}
```
- This is a *program*
- It contains a single *class*
- The class is called HelloWorld
- The class contains a single method called main
- For a class to be a program it must have a main method. 
- In this simple program, the main method does only one thing. 
- It prints “HelloWorld” to the screen. 
- The closing brace (}) that appears on line 4 signifies the end of the program. 
- The program will stop executing at that point.

## Data types
- At its most basic, a program consists of `data` and `operations` on that data.
- Data comes in various types
  - In Java there are two broad categories of data types: *primitive types* and *reference types*

- Each primitive data type can hold a particular type of value
  - ex) integers, floating point numbers, characters
- Primitive data types in Java have a range
  - the range of values the type can hold
-  Most of the primitive data types hold numerical data although there is a type for holding Boolean values (true and false) and a type for holding Unicode characters.

## Primitive data types in Java
|Type|Contains|Size (bits)|Range|
|-----|---|---|---|
|boolean|true or false|1|N/A|
|char|Unicode character|16|\u0000 to \uffff|
|byte|signed integer|8|-128 to 127|
|short|signed integer|16|-32768 to 32767|
|int|signed integer|32|-2,147,483,648 to 2,147,483,647|
|long|signed integer|64|-9,223,372,036,854,775,808 to 9 ,223,372,036,854,775,807|
|float|IEEE754 floating point|32|1.40129846432481707e-45 to 3.40282346638528860e+38|
|double|IEE754 floating point|64|4.94065645841246544e-324 to 1.79769313486231570e+308|





