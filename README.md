# Chapter 5. Java Inheritance, Abstract Classes, and Interfaces

---

### Inheritance

- Inheritance allows a subclass to acquire fields and methods from a superclass, promoting code reuse and hierarchical relationships.
- The `extends` keyword is used to declare inheritance.
- Subclasses can override superclass methods to provide specific behavior.
- The `super` keyword is used to access superclass members and constructors.

---

### Method Overriding

- Subclasses can redefine methods from the superclass to change or extend their behavior.
- The `@Override` annotation is used for clarity and error checking.
- Overridden methods must have the same signature as in the superclass.

---

### Abstract Classes and Methods

- An abstract class cannot be instantiated and is meant to be subclassed.
- Declared with the `abstract` keyword.
- Abstract classes can have both abstract methods (without a body) and concrete methods (with a body).
- Abstract methods must be implemented by subclasses.

---

### Interfaces

- An interface defines a contract of methods that implementing classes must provide.
- Declared with the `interface` keyword.
- A class implements an interface using the `implements` keyword and must provide implementations for all interface methods.
- Interfaces support multiple inheritance, allowing a class to implement multiple interfaces.
- From Java 8, interfaces can have default and static methods.

---

### Polymorphism with Inheritance and Interfaces

- Objects can be referenced by variables of their superclass or interface type, enabling flexible code and dynamic method dispatch.
- This supports loose coupling and extensibility in software design.

---

### Type Casting

- Upcasting: Assigning a subclass object to a superclass reference (automatic).
- Downcasting: Casting a superclass reference back to a subclass (requires explicit cast and can throw exceptions if not compatible).

---

### The `final` Keyword in Inheritance

- A `final` class cannot be subclassed.
- A `final` method cannot be overridden.
