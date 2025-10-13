<details>
<summary>ENG (English Version)</summary>

# Chapter 7. Java Collections and Generics

***

### What Is a Collection?

- A collection is a container for storing multiple objects (elements), allowing dynamic resizing and easy management of insertion, deletion, and searching.
- Collections overcome the limitations of fixed-size arrays by automatically adjusting their size and shifting elements as needed.
- Java's Collection Framework provides standardized interfaces (List, Set, Map, Queue) and classes (ArrayList, LinkedList, HashMap, etc.) for various data structures and algorithms.

***

### Collections and Generics

- Java collections use generics to enforce type safety, allowing only specific object types in a collection.
- Generics enable classes and methods to operate on various data types while providing compile-time type checking and reducing runtime errors.
- Wrapper classes (like `Integer`, `Double`) are used for primitive types, as collections cannot store primitives directly.

***

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

***

### Iterators

- Iterators (`Iterator`) provide a way to traverse collections sequentially without exposing their internal structure.
- Key methods: `hasNext()`, `next()`, and `remove()`.
- Enhanced for-loops (`for-each`) can also be used for iteration.

***

### Collections Utility Class

- The `Collections` class provides static methods for operations such as sorting, reversing, searching, and finding min/max values in collections.

***

### Creating Generic Classes and Methods

- Generic classes and methods allow you to define reusable code that works with any object type.
- Syntax: `class MyClass<T> { ... }` and `<T> void myMethod(T param) { ... }`
- Generics improve code safety and eliminate the need for explicit type casting.

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 7장. 자바 컬렉션과 제네릭

***

### 컬렉션이란?

- 컬렉션은 여러 객체(요소)를 저장하는 컨테이너로, 동적으로 크기가 변하며 삽입, 삭제, 탐색을 쉽게 관리할 수 있음.
- 컬렉션은 고정 크기 배열의 한계를 극복하며, 필요에 따라 크기를 자동 조정하고 요소를 이동시킴.
- 자바 컬렉션 프레임워크는 다양한 자료구조와 알고리즘을 표준화된 인터페이스(List, Set, Map, Queue)와 클래스(ArrayList, LinkedList, HashMap 등)로 제공함.

***

### 컬렉션과 제네릭

- 자바 컬렉션은 제네릭을 사용해 타입 안전성을 보장하며, 특정 타입의 객체만 저장할 수 있음.
- 제네릭은 클래스와 메서드가 다양한 데이터 타입에서 동작하도록 하면서 컴파일 시 타입 검사를 통해 런타임 오류를 줄임.
- 컬렉션에는 기본형을 직접 저장할 수 없으므로, `Integer`, `Double` 등 래퍼 클래스를 사용함.

***

### 주요 컬렉션 클래스

- **Vector:**
  - 크기가 자동으로 늘어나는 배열 구조로 객체를 저장함.
  - `add()`, `get()`, `remove()`, `size()`, `clear()` 등 다양한 메서드 제공.
  - 인덱스로 요소 접근, 삽입, 삭제 가능.
  - 스레드 안전하지만 단일 스레드 환경에서는 `ArrayList`보다 비효율적임.
- **ArrayList:**
  - 크기가 가변적인 배열을 구현하며, `Vector`와 유사하지만 동기화되지 않음.
  - 빠른 임의 접근과 유연한 삽입/삭제 지원.
  - 주요 메서드: `add()`, `get()`, `remove()`, `size()`, `contains()`, `clear()` 등.
- **HashMap:**
  - 키-값 쌍으로 데이터를 저장하며, 빠른 탐색, 삽입, 삭제가 가능함.
  - 키는 중복 불가, 값은 중복 허용.
  - 주요 메서드: `put()`, `get()`, `remove()`, `containsKey()`, `containsValue()`, `keySet()`, `size()` 등.
- **LinkedList:**
  - 양방향 연결 리스트로, 양쪽 끝에서의 삽입/삭제가 효율적임.
  - 리스트, 스택, 큐 등 다양한 용도로 활용 가능함.

***

### 이터레이터(Iterator)

- 이터레이터(`Iterator`)는 컬렉션 내부 구조를 노출하지 않고 순차적으로 요소를 탐색할 수 있게 해줌.
- 주요 메서드: `hasNext()`, `next()`, `remove()`
- 향상된 for문(`for-each`)도 반복에 사용 가능함.

***

### Collections 유틸리티 클래스

- `Collections` 클래스는 정렬, 역순, 검색, 최소/최대값 찾기 등 다양한 컬렉션 연산을 위한 정적 메서드를 제공함.

***

### 제네릭 클래스와 메서드 정의

- 제네릭 클래스와 메서드는 어떤 타입에도 재사용 가능한 코드를 작성할 수 있게 해줌.
- 문법: `class MyClass<T> { ... }`, `<T> void myMethod(T param) { ... }`
- 제네릭은 코드의 안전성을 높이고, 명시적 타입 캐스팅을 줄여줌.

</details>
