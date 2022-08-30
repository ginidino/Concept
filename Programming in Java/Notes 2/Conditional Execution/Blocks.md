# Blocks
`Blocks` contain lines of code that are somehow related to each other.
- Blocks of code have already been used in the example programs so far.
  - The definition of a class must be contained in a block and the `main` method must also be contained in a block. 
  - Blocks are defined by a start brace and end brace { }.
  - Blocks are a bit like *paragraphs* in a natural language.

- if statements and if-else statements can use blocks in order to allow more than one line of code to be included in the statement.

### Example
```java
import java.util.Scanner;

public class ControlDemo4 {
	public static void main(String[] args) {
		boolean answerCorrect = false;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer greater than 100.");
		
		int num = reader.nextInt();
		
		if (num > 100) {
			System.out.println("Well done!"); 
			answerCorrect = true;
		}
		
		if (answerCorrect) {
			System.out.println("You have reached level 5.");
		}
	}
}
```
- In addition to the blocks defining the class and the main method, there are now blocks defining the extent of the two `if statements`.
- The first `if statement` will now work correctly since the two lines of code in the statement will only be executed if the condition is `true`.
- Note that, strictly speaking, the block defined for the second `if statement` is unnecessary since it only contains one line of code.
