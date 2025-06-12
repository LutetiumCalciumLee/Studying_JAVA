# Chapter 3. Java Loops, Arrays, and Exception Handling

---

### Loop Statements

- **for Loop:**  
  Used for repeating a block of code a set number of times. Syntax:  
  `for(initialization; condition; update) { /* statements */ }`  
  You can declare variables inside the loop, sum values, or create infinite loops by omitting the condition.

- **while Loop:**  
  Repeats code as long as the condition is true. The condition is checked before each iteration.  
  Example: Input numbers until a sentinel value (like `-1`) is entered.

- **do-while Loop:**  
  Similar to `while`, but guarantees the code block runs at least once because the condition is checked after the block.

- **Nested Loops:**  
  Loops can be placed inside other loops to handle multi-dimensional data or repeated processes (e.g., printing multiplication tables).

- **continue Statement:**  
  Skips the current iteration and moves to the next loop cycle.

- **break Statement:**  
  Exits the current loop immediately, even if the condition is still true.

---

### Arrays

- **Definition:**  
  Arrays are data structures that store multiple values of the same type, accessible by index (starting at 0).
- **Declaration and Initialization:**  
  Arrays must be declared and then created with a specific size.  
  Example: `int[] arr = new int;` or `int[] arr = {1, 2, 3, 4, 5};`
- **Accessing Elements:**  
  Use indices to read or assign values: `arr = 10;`
- **Length:**  
  The `.length` property gives the size of the array.
- **for-each Loop:**  
  Simplifies iterating over arrays:  
  `for(int num : arr) { /* use num */ }`
- **Multi-dimensional Arrays:**  
  Arrays can have two or more dimensions, like `int[][] matrix = new int;`
  - Can be rectangular or jagged (rows of different lengths).
- **Returning Arrays from Methods:**  
  Methods can return arrays, and the receiving variable must match the return type.

---

### Exception Handling

- **What is an Exception?**  
  An error that occurs during program execution (e.g., dividing by zero, accessing an array out of bounds, invalid input).
- **try-catch-finally:**  
  Use `try` blocks to wrap code that might throw exceptions, `catch` blocks to handle them, and `finally` for code that always runs.
- **Common Exceptions:**  
  - `ArithmeticException`: Division by zero.
  - `ArrayIndexOutOfBoundsException`: Invalid array index.
  - `InputMismatchException`: Invalid input type.
  - `NumberFormatException`: Invalid number conversion.
- **Example:**  
  Prompting for input until a valid value is entered, or handling division by zero gracefully.

