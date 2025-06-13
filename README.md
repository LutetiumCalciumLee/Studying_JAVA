# Chapter 7. Java Collections and Generics

---

### What Is a Collection?

- A collection is a container for storing multiple objects (elements), allowing dynamic resizing and easy management of insertion, deletion, and searching.
- Collections overcome the limitations of fixed-size arrays by automatically adjusting their size and shifting elements as needed.

---

### Collections and Generics

- Java collections use generics to enforce type safety, allowing only specific object types in a collection.
- Generics enable classes and methods to operate on various data types while providing compile-time type checking and reducing runtime errors.
- Wrapper classes (like `Integer`, `Double`) are used for primitive types, as collections cannot store primitives directly.

---

### Major Collection Classes

- **Vector:**
  - A growable array that stores objects and automatically manages capacity.
  - Supports methods like `add()`, `get()`, `remove()`, `size()`, and `clear()`.
  - Elements can be inserted, deleted, or accessed by index.
  - Thread-safe but less efficient than `ArrayList` in single-threaded contexts.
- **ArrayList:**
  - Implements a resizable array, similar to `Vector` but not synchronized.
  - Provides fast random access and flexible insertion/removal.
  - Common methods include `add()`, `get()`, `remove()`, `size()`, `contains()`, and `clear()`.
- **HashMap:**
  - Stores key-value pairs for fast lookup, insertion, and deletion.
  - Keys must be unique; values can be duplicated.
  - Common methods: `put()`, `get()`, `remove()`, `containsKey()`, `containsValue()`, `keySet()`, and `size()`.
- **LinkedList:**
  - Implements a doubly-linked list, allowing efficient insertion and removal at both ends.
  - Can be used as a list, stack, or queue.

---

### Iterators

- Iterators (`Iterator`) provide a way to traverse collections sequentially without exposing their internal structure.
- Key methods: `hasNext()`, `next()`, and `remove()`.
- Enhanced for-loops (`for-each`) can also be used for iteration.

---

### Collections Utility Class

- The `Collections` class provides static methods for operations such as sorting, reversing, searching, and finding min/max values in collections.

---

### Creating Generic Classes and Methods

- Generic classes and methods allow you to define reusable code that works with any object type.
- Syntax: `class MyClass { ... }` and ` void myMethod(T param) { ... }`
- Generics improve code safety and eliminate the need for explicit type casting.
