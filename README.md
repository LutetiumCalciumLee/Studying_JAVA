# Chapter 6. Java Packages, Modules, and Core Utility Classes

---

### Packages and Modules

- **Packages** group related classes and interfaces into a single directory, helping manage code organization and prevent naming conflicts in large projects.
- Classes from other packages can be used by specifying their full path or by using the `import` statement at the beginning of the source file.
- The `package` statement at the top of a Java file specifies the package to which the class belongs.
- Packages can have hierarchical structures, and classes with the same name can exist in different packages.
- **Modules** (introduced in Java 9) are containers that group packages and resources together. They enable applications to be split into smaller, reusable pieces and allow for custom Java runtime environments, especially useful for small or resource-constrained devices.

---

### The Object Class

- All Java classes implicitly inherit from the `Object` class, which provides common methods such as:
  - `equals()`: Compares objects for equality.
  - `toString()`: Returns a string representation of the object.
  - `hashCode()`: Returns a hash code for the object.
  - `getClass()`: Returns the runtime class of the object.

---

### Wrapper Classes

- Java provides wrapper classes for all primitive types (`Integer`, `Double`, `Character`, `Boolean`, etc.) to allow them to be used as objects.
- Wrapper objects can be created from primitive values or strings, and provide utility methods for parsing and converting between types.
- Auto-boxing and unboxing (Java 1.5+) automatically convert between primitives and their wrapper objects.

---

### String and StringBuffer Classes

- `String` objects represent immutable sequences of characters. Common methods include `length()`, `charAt()`, `substring()`, `concat()`, `replace()`, `split()`, `toLowerCase()`, `toUpperCase()`, and `trim()`.
- String comparison should be done with `equals()` instead of `==`.
- `StringBuffer` is a mutable sequence of characters, allowing efficient string modifications with methods like `append()`, `insert()`, `replace()`, `delete()`, and `setLength()`.

---

### StringTokenizer

- The `StringTokenizer` class is used to split a string into tokens based on delimiter characters, useful for parsing structured data.

---

### Math Class

- The `Math` class provides static methods for mathematical operations such as `abs()`, `ceil()`, `floor()`, `sqrt()`, `pow()`, `random()`, and constants like `PI`.
- Random numbers can be generated using `Math.random()` or the `Random` class.

---

### Calendar Class

- The `Calendar` class (in `java.util`) is used for managing dates and times, allowing you to get, set, and manipulate fields such as year, month, day, hour, minute, and second.
- `Calendar.getInstance()` creates a calendar object set to the current date and time.
