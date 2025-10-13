<details>
<summary>ENG (English Version)</summary>

# Chapter 5. Java Inheritance, Abstract Classes, and Interfaces

***

### Inheritance

- Inheritance allows a subclass to acquire fields and methods from a superclass, promoting code reuse and hierarchical relationships.
- The `extends` keyword is used to declare inheritance.
- Subclasses can override superclass methods to provide specific behavior.
- The `super` keyword is used to access superclass members and constructors.

***

### Method Overriding

- Subclasses can redefine methods from the superclass to change or extend their behavior.
- The `@Override` annotation is used for clarity and error checking.
- Overridden methods must have the same signature as in the superclass.

***

### Abstract Classes and Methods

- An abstract class cannot be instantiated and is meant to be subclassed.
- Declared with the `abstract` keyword.
- Abstract classes can have both abstract methods (without a body) and concrete methods (with a body).
- Abstract methods must be implemented by subclasses.
- Abstract classes can have constructors and instance variables, and can provide shared code for related subclasses.

***

### Interfaces

- An interface defines a contract of methods that implementing classes must provide.
- Declared with the `interface` keyword.
- A class implements an interface using the `implements` keyword and must provide implementations for all interface methods.
- Interfaces support multiple inheritance, allowing a class to implement multiple interfaces.
- From Java 8, interfaces can have default and static methods (with bodies), and from Java 9, private methods.
- All fields in interfaces are implicitly public, static, and final.

***

### Polymorphism with Inheritance and Interfaces

- Objects can be referenced by variables of their superclass or interface type, enabling flexible code and dynamic method dispatch.
- This supports loose coupling and extensibility in software design.

***

### Type Casting

- Upcasting: Assigning a subclass object to a superclass reference (automatic and safe).
- Downcasting: Casting a superclass reference back to a subclass (requires explicit cast and can throw exceptions if not compatible).

***

### The `final` Keyword in Inheritance

- A `final` class cannot be subclassed.
- A `final` method cannot be overridden.

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 5장. 자바 상속, 추상 클래스, 인터페이스

***

### 상속

- 상속은 하위 클래스가 상위 클래스의 필드와 메서드를 물려받아 코드 재사용과 계층 구조를 구현하는 기능임.
- `extends` 키워드로 상속을 선언함.
- 하위 클래스는 상위 클래스의 메서드를 오버라이딩(재정의)하여 동작을 변경할 수 있음.
- `super` 키워드로 상위 클래스의 멤버와 생성자에 접근함.

***

### 메서드 오버라이딩

- 하위 클래스는 상위 클래스의 메서드를 재정의하여 동작을 변경하거나 확장할 수 있음.
- `@Override` 애너테이션을 사용해 명확성과 오류 방지 효과를 얻음.
- 오버라이딩 메서드는 상위 클래스와 시그니처(이름, 매개변수, 반환형)가 동일해야 함.

***

### 추상 클래스와 추상 메서드

- 추상 클래스는 인스턴스화할 수 없으며, 상속을 통해 하위 클래스에서 사용함.
- `abstract` 키워드로 선언함.
- 추상 클래스는 추상 메서드(몸체 없는 메서드)와 구체 메서드(몸체 있는 메서드)를 모두 가질 수 있음.
- 추상 메서드는 반드시 하위 클래스에서 구현해야 함.
- 추상 클래스는 생성자와 인스턴스 변수도 가질 수 있으며, 관련 하위 클래스에 공통 코드를 제공함.

***

### 인터페이스

- 인터페이스는 구현 클래스가 반드시 제공해야 하는 메서드의 집합(계약)을 정의함.
- `interface` 키워드로 선언함.
- 클래스는 `implements` 키워드로 인터페이스를 구현하며, 모든 인터페이스 메서드를 반드시 구현해야 함.
- 인터페이스는 다중 상속을 지원하여, 한 클래스가 여러 인터페이스를 구현할 수 있음.
- Java 8부터는 인터페이스에 default, static 메서드(몸체 포함), Java 9부터는 private 메서드도 정의 가능함.
- 인터페이스의 모든 필드는 암묵적으로 public, static, final임.

***

### 상속과 인터페이스를 활용한 다형성

- 객체는 상위 클래스나 인터페이스 타입의 변수로 참조할 수 있어, 유연한 코드와 동적 메서드 호출이 가능함.
- 이를 통해 느슨한 결합과 확장성 있는 소프트웨어 설계가 가능함.

***

### 타입 변환

- 업캐스팅: 하위 클래스 객체를 상위 클래스 참조로 할당(자동, 안전).
- 다운캐스팅: 상위 클래스 참조를 하위 클래스 타입으로 변환(명시적 캐스팅 필요, 호환되지 않으면 예외 발생).

***

### 상속에서의 final 키워드

- `final` 클래스는 상속이 불가함.
- `final` 메서드는 오버라이딩이 불가함.

</details>
