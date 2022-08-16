# Compilation and Execution

## From program to execution
```
Hello.java → javac(compiler) → Hello.class → java(interpreter) → Hello world!   
                                                     ↑
                                           standard class library
```
1. process our sample program with the `javac` compiler 
2. create a class file
3. execute with an `interpreter` (`java`)
4. print a message   

In this tiny program, pre-supplied programs from the standard class library actually do most of the work.


## Typical sequence
- Put the program in one or more files
- *Compile the file with a Java compiler*
- *Execute the program by invoking a Java interpreter*

Precise details on how to prepare and run this program differ from one implementation of Java to another.    

## numerous variations
- There are numerous variations on this process. 
  - systems in which the compiler, rather than producing a `.class` file for input to an interpreter, produce a machine-language or *executable* file that the hardware of your machine can execute directly.
- The interpreter in many Java implementations produces machine code from `.class` files “just in time” for it to be executed when needed
