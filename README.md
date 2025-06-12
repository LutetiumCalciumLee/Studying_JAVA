# Chapter 2. Java Language Basics

---

### Structure of a Java Program

- A Java program is made up of classes; every program must have at least one class with a `main()` method, which is the entry point for execution.
- The `main()` method is always declared as `public static void main(String[] args)`.
- Code is organized inside curly braces `{}` and each statement ends with a semicolon `;`.
- Comments can be single-line (`//`) or multi-line (`/* ... */`).

---

### Identifiers and Naming Conventions

- Identifiers are names for classes, variables, methods, and constants.
- Must start with a letter, underscore `_`, or dollar sign `$`; cannot start with a digit.
- Cannot use Java reserved keywords or boolean/null literals as identifiers.
- Identifiers are case-sensitive and can be of any length.
- Good naming conventions improve readability: class names start with uppercase, variables and methods with lowercase, and constants are all uppercase.

---

### Data Types

- **Primitive types (8 total):** `boolean`, `char`, `byte`, `short`, `int`, `long`, `float`, `double`
  - Each has a fixed size and range, independent of the CPU or OS.
- **Reference types:** Used for arrays, classes, and interfaces.
- Strings are not primitive types but are handled by the `String` class.

---

### Variables and Declarations

- Variables are named memory locations for storing data.
- Declaration syntax: ` ;`
- Variables can be declared and initialized at the same time.
- Local variables exist only within the method or block where they are declared.

---

### Literals

- Fixed values written directly in code: integers, floating-point numbers, characters, booleans, and strings.
- Integer literals can be decimal, octal (prefix `0`), hexadecimal (prefix `0x`), or binary (prefix `0b`).
- Floating-point literals default to `double` unless marked with `f` or `F` for `float`.
- Character literals are enclosed in single quotes, string literals in double quotes.
- The `null` literal is used for reference types.

---

### Constants

- Declared using the `final` keyword and cannot be changed after initialization.
- Naming convention: all uppercase letters.

---

### Type Conversion

- **Automatic (widening) conversion:** Smaller types are automatically converted to larger types.
- **Explicit (narrowing) conversion:** Larger types can be cast to smaller types, but may lose data.

---

### Operators

- **Arithmetic:** `+`, `-`, `*`, `/`, `%`
- **Assignment:** `=`, `+=`, `-=`, etc.
- **Increment/Decrement:** `++`, `--`
- **Comparison:** `==`, `!=`, `>`, `=`, `>`, `>>>`
- **Ternary (conditional):** `condition ? expr1 : expr2`

---

### Expressions and Statements

- Expressions combine variables, literals, and operators to produce a value.
- Statements perform actions and end with a semicolon.
- Blocks group multiple statements using `{}`.

---

### Control Flow Statements

- **Conditional:** `if`, `if-else`, `switch`
- **Loops:** `for`, `while`, `do-while`
- **Branching:** `break`, `continue`, `return`
- `switch` statements select execution paths based on variable values and support `case` and `default` labels.

---

### User Input

- The `Scanner` class is commonly used to read input from the keyboard, supporting types like `String`, `int`, `double`, and `boolean`.

