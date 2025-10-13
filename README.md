<details>
<summary>ENG (English Version)</summary>

# Chapter 4. Everything Is an Object: Java OOP Concepts

***

### Objects and Classes

- In Java, everything is modeled as objects, each with its own state (attributes) and behavior (methods).
- Real-world examples: TVs, books, cars, and computers are all objects with unique properties and actions.
- A **class** is a blueprint for creating objects. It defines the structure (fields) and behavior (methods) that its objects (instances) will have.
- Objects are created from classes using the `new` keyword and are called instances.

***

### Encapsulation

- Encapsulation means bundling data (fields) and methods inside a class, hiding the internal details from outside access.
- Only public methods are used to access or modify private data, protecting the object's state and enforcing boundaries.
- In Java, encapsulation is implemented by declaring fields as `private` and providing `public` getter and setter methods.

***

### Inheritance

- Inheritance allows a new class (subclass) to inherit properties and methods from an existing class (superclass), promoting code reuse and hierarchical relationships.
- Subclasses can extend or override the behavior of superclasses.
- Java supports single inheritance for classes, but allows multiple inheritance through interfaces.

***

### Polymorphism

- Polymorphism enables objects to be treated as instances of their parent class, allowing the same method name to behave differently depending on the object.
- Achieved through method overriding (subclass redefines a method) and method overloading (same method name with different parameters).

***

### Constructors

- Constructors are special methods with the same name as the class, used to initialize new objects.
- Java allows multiple constructors (overloading) to provide different ways to create objects.
- The `this` keyword refers to the current object and can be used to distinguish fields from parameters or to call other constructors.

***

### Passing Arguments

- Primitive types are passed by value (a copy is made), so changes inside a method do not affect the original variable.
- Objects and arrays are passed by reference (the reference is copied), so changes inside a method affect the original object or array.

***

### Object Arrays

- Arrays of objects can be created, allowing storage and management of multiple instances of a class.

***

### Method Overloading

- Java allows multiple methods with the same name but different parameter lists within the same class, enabling flexible method usage.

***

### Garbage Collection

- Java automatically manages memory by reclaiming objects that are no longer referenced, freeing developers from manual memory management.

***

### Access Modifiers

- Java uses access modifiers (`public`, `private`, `protected`, and default) to control the visibility and accessibility of classes, fields, and methods.

***

### Static Members

- Static fields and methods belong to the class rather than any instance, allowing shared data or utility methods.
- Static methods cannot access non-static fields or use `this`.

***

### Final Keyword

- The `final` keyword can be used for classes (cannot be subclassed), methods (cannot be overridden), and fields (constants).

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 4장. 모든 것은 객체다: 자바 OOP 개념

***

### 객체와 클래스

- 자바에서는 모든 것을 객체로 모델링하며, 각 객체는 고유한 상태(속성)와 동작(메서드)을 가짐.
- TV, 책, 자동차, 컴퓨터 등 현실 세계의 사물도 고유한 속성과 동작을 가진 객체로 볼 수 있음.
- **클래스**는 객체를 만들기 위한 설계도(청사진)로, 객체(인스턴스)가 가질 속성(필드)과 동작(메서드)을 정의함.
- 객체는 `new` 키워드로 클래스로부터 생성되며, 이를 인스턴스라고 부름.

***

### 캡슐화

- 캡슐화는 데이터(필드)와 메서드를 클래스 내부에 묶고, 내부 구현을 외부에 숨기는 것임.
- 외부에서는 public 메서드만을 통해 private 데이터에 접근하거나 수정할 수 있어, 객체의 상태 보호와 경계 설정이 가능함.
- 자바에서는 필드를 `private`으로 선언하고, `public` getter/setter 메서드를 제공해 캡슐화를 구현함.

***

### 상속

- 상속은 기존 클래스(상위 클래스)의 속성과 메서드를 새로운 클래스(하위 클래스)가 물려받아 코드 재사용과 계층 구조를 구현하는 기능임.
- 하위 클래스는 상위 클래스의 기능을 확장하거나 재정의할 수 있음.
- 자바는 클래스의 단일 상속만 지원하지만, 인터페이스를 통해 다중 상속 효과를 낼 수 있음.

***

### 다형성

- 다형성은 객체를 부모 타입으로 다룰 수 있게 하여, 같은 이름의 메서드가 객체에 따라 다르게 동작하도록 함.
- 메서드 오버라이딩(하위 클래스에서 메서드 재정의)과 오버로딩(같은 이름, 다른 매개변수)으로 구현함.

***

### 생성자

- 생성자는 클래스와 이름이 같고, 객체를 초기화하는 특별한 메서드임.
- 자바는 여러 생성자(오버로딩)를 허용해 다양한 방식으로 객체를 생성할 수 있음.
- `this` 키워드는 현재 객체를 가리키며, 필드와 매개변수 구분 또는 다른 생성자 호출에 사용함.

***

### 인자 전달 방식

- 기본형(primitive)은 값이 복사되어 전달되므로, 메서드 내 변경이 원본에 영향 없음.
- 객체와 배열은 참조(주소)가 복사되어 전달되므로, 메서드 내 변경이 원본에 반영됨.

***

### 객체 배열

- 객체 배열을 생성해 여러 인스턴스를 한 번에 저장하고 관리할 수 있음.

***

### 메서드 오버로딩

- 자바는 같은 이름이지만 매개변수 목록이 다른 여러 메서드를 한 클래스 내에 정의할 수 있음.

***

### 가비지 컬렉션

- 자바는 더 이상 참조되지 않는 객체를 자동으로 메모리에서 해제(가비지 컬렉션)하여 개발자가 직접 메모리 관리를 하지 않아도 됨.

***

### 접근 제어자

- 자바는 `public`, `private`, `protected`, (default) 접근 제어자를 통해 클래스, 필드, 메서드의 접근 범위를 제어함.

***

### static 멤버

- static 필드와 메서드는 인스턴스가 아닌 클래스에 속하며, 모든 객체가 공유하거나 유틸리티 용도로 사용함.
- static 메서드는 인스턴스 필드 접근이나 `this` 사용이 불가함.

***

### final 키워드

- `final`은 클래스(상속 불가), 메서드(오버라이딩 불가), 필드(상수) 선언에 사용함.

</details>
