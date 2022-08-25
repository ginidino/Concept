# Characters
In Java there is also a type for representing *characters*.

- `Character`: a single letter, digit, punctuation mark, or a special control (non-visible) character

## ASCII characters
![ASCII](https://user-images.githubusercontent.com/94044443/186610439-4fb7d0bb-a45c-41af-8fde-2f8600c47018.jpeg)
- Up to the decimal value 31, all of the characters are non-visible control characters.
- These are special values that usually cause a function to be performed 
  - ex) `backspace`, `audible bell`
- The rest of the table is taken up by numeric digits, upper case and lower case letters, punctuation marks, etc.
- This table does not offer support for any languages that do not use the English alphabet.
- There are also many symbols and characters missing.

## Unicode characters
- In order to include the characters from other alphabets, and many other characters, the Unicode standard was created.
- The Unicode standard has various encodings of increasing length but the longer encodings subsume the shorter ones.
- Java uses 16-bit Unicode.
- The lower 8 bits of this encoding are the same as the ASCII values
- Having 16 bits allows a much larger number of characters to be represented
- In Java the character type is called `char`. 
  - It is 16 bits in length.

## Characters
- It is worth noting that character values are just numbers.
- If look at the ASCII table, that the upper-case character ‘A’ has a decimal value of 65.
- As far as the computer is concerned, the value of that character is 65.
- When use the value 65 to represent ‘A’ that is simply our chosen interpretation of the number 65 **`in this context`**.
- characters are actually numbers meaning that `char` is also a numeric type.
