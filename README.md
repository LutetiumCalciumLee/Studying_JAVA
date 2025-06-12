# Chapter 4. Everything Is an Object: Java OOP Concepts

---

### Objects and Classes

- In Java, everything is modeled as objects, each with its own state (attributes) and behavior (methods).
- Real-world examples: TVs, books, cars, and computers are all objects with unique properties and actions.
- A **class** is a blueprint for creating objects. It defines the structure (fields) and behavior (methods) that its objects (instances) will have.
- Objects are created from classes using the `new` keyword and are called instances.

---

### Encapsulation

- Encapsulation means bundling data (fields) and methods inside a class, hiding the internal details from outside access.
- Only public methods are used to access or modify private data, protecting the object's state and enforcing boundaries.
- In Java, encapsulation is implemented by declaring fields as `private` and providing `public` getter and setter methods.

---

### Inheritance

- Inheritance allows a new class (subclass) to inherit properties and methods from an existing class (superclass), promoting code reuse and hierarchical relationships.
- Subclasses can extend or override the behavior of superclasses.
- Java supports single inheritance for classes, but allows multiple inheritance through interfaces.

---

### Polymorphism

- Polymorphism enables objects to be treated as instances of their parent class, allowing the same method name to behave differently depending on the object.
- Achieved through method overriding (subclass redefines a method) and method overloading (same method name with different parameters).

---

### Constructors

- Constructors are special methods with the same name as the class, used to initialize new objects.
- Java allows multiple constructors (overloading) to provide different ways to create objects.
- The `this` keyword refers to the current object and can be used to distinguish fields from parameters or to call other constructors.

---

### Passing Arguments

- Primitive types are passed by value (a copy is made), so changes inside a method do not affect the original variable.
- Objects and arrays are passed by reference (the reference is copied), so changes inside a method affect the original object or array.

---

### Object Arrays

- Arrays of objects can be created, allowing storage and management of multiple instances of a class.

---

### Method Overloading

- Java allows multiple methods with the same name but different parameter lists within the same class, enabling flexible method usage.

---

### Garbage Collection

- Java automatically manages memory by reclaiming objects that are no longer referenced, freeing developers from manual memory management.

---

### Access Modifiers

- Java uses access modifiers (`public`, `private`, `protected`, and default) to control the visibility and accessibility of classes, fields, and methods.

---

### Static Members

- Static fields and methods belong to the class rather than any instance, allowing shared data or utility methods.
- Static methods cannot access non-static fields or use `this`.

---

### Final Keyword

- The `final` keyword can be used for classes (cannot be subclassed), methods (cannot be overridden), and fields (constants).
