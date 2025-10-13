<details>
<summary>ENG (English Version)</summary>

# Chapter 2. Java Language Basics

***

### Structure of a Java Program

- A Java program is organized around **classes**; every runnable program must have at least one class containing a `main()` method, which serves as the entry point for execution.
- `main()` is always declared as `public static void main(String[] args)`.
- Code blocks are enclosed in curly braces `{}` and each statement ends with a semicolon `;`.
- Comments can be single-line (`//`) or multi-line (`/* ... */`).

***

### Identifiers and Naming Conventions

- **Identifiers** are names for classes, variables, methods, and constants.
- They must start with a letter, underscore `_`, or dollar sign `$` (never a digit).
- Java reserved keywords, boolean and null literals cannot be used as identifiers.
- Identifiers are case-sensitive and can be of any length.
- Good naming conventions improve readability: Class names start with uppercase, variables and methods use lowercase, constants use ALL CAPS.

***

### Data Types

- **Primitive types (8):** `boolean`, `char`, `byte`, `short`, `int`, `long`, `float`, and `double`.
  - Each type has a fixed size and range, not affected by hardware.
- **Reference types:** Used for arrays, objects (classes), and interfaces.
- `String` is not a primitive but is handled as an object (class).

***

### Variables and Declarations

- Variables are named locations in memory for storing values.
- Declaration syntax: `type name;` (e.g., `int age;`)
- Variables can be declared and initialized together (e.g., `int age = 21;`).
- Local variables exist only within the scope of their defining method or block.

***

### Literals

- Fixed values written directly in the code: integers, floating points, characters, booleans, and strings.
- Integer literals can be:
  - Decimal (e.g., `10`),
  - Octal (prefix `0`, e.g., `012`),
  - Hexadecimal (prefix `0x`, e.g., `0xA3`),
  - Binary (prefix `0b`, e.g., `0b1010`).
- Floating-point literals are `double` by default unless marked with `f` or `F` for `float` (e.g., `3.14f`).
- Character literals use single quotes, string literals use double quotes.
- `null` literal is used only for reference types.

***

### Constants

- Declared with the `final` keyword; value cannot change once assigned.
- Constants use ALL CAPS by naming convention.

***

### Type Conversion

- **Automatic (widening):** Smaller types convert automatically to larger types (e.g., `int` → `long`).
- **Explicit (narrowing):** Larger types can be cast to smaller types (e.g., `double` to `int`), but may cause data loss.

***

### Operators

- **Arithmetic:** `+`, `-`, `*`, `/`, `%`
- **Assignment:** `=`, `+=`, `-=`, etc.
- **Increment/Decrement:** `++`, `--`
- **Comparison:** `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical:** `&&`, `||`, `!`
- **Bitwise:** `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`
- **Ternary (conditional):** `condition ? expr1 : expr2`

***

### Expressions and Statements

- An **expression** combines variables, literals, and operators to produce a value.
- A **statement** performs an action and ends with a semicolon.
- A **block** groups multiple statements inside `{}`.

***

### Control Flow Statements

- **Conditional:** `if`, `if-else`, `switch`
- **Loops:** `for`, `while`, `do-while`
- **Branching:** `break`, `continue`, `return`
- `switch` decides execution based on values, supporting `case` and `default` labels.

***

### User Input

- The `Scanner` class is commonly used to read keyboard input, supporting types like `String`, `int`, `double`, and `boolean`.

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 2장. 자바 언어 기초

***

### 자바 프로그램의 구조

- 자바 프로그램은 **클래스**를 기본 단위로 하며, 실행 가능한 프로그램에는 반드시 `main()` 메서드를 가진 클래스가 하나 이상 포함됨. `main()`이 프로그램의 시작점임.
- 메인 메서드는 항상 `public static void main(String[] args)`로 선언함.
- 코드 블록은 중괄호 `{}`로 묶고, 각 명령문(Statement)은 세미콜론 `;`으로 끝남.
- 주석은 한 줄(`//`) 또는 여러 줄(`/* ... */`)로 작성 가능함.

***

### 식별자와 네이밍 규칙

- **식별자**는 클래스, 변수, 메서드, 상수의 이름임.
- 반드시 영문자, 밑줄(_), 혹은 달러($)로 시작해야 하며 숫자로 시작할 수 없음.
- 자바 키워드 및 불린/널 리터럴은 식별자로 사용할 수 없음.
- 식별자는 대소문자를 구분하고, 길이에는 제한이 없음.
- 좋은 네이밍 관례: 클래스명은 대문자 시작, 변수/메서드는 소문자 시작, 상수는 모두 대문자로 작성함.

***

### 데이터 타입

- **기본형(8가지):** `boolean`, `char`, `byte`, `short`, `int`, `long`, `float`, `double`
  - 각 타입은 고정된 크기와 범위를 가지며, 하드웨어에 영향을 받지 않음.
- **참조형:** 배열, 클래스, 인터페이스 등 객체를 위한 타입임.
- 문자열은 기본형이 아니며, `String` 클래스로 취급됨.

***

### 변수와 선언

- 변수는 데이터를 저장하는 이름이 붙은 메모리 공간임.
- 선언 문법: `타입 변수명;` (예: `int age;`)
- 변수 선언과 동시에 초기화 가능(예: `int age = 21;`).
- 지역 변수는 선언된 메서드 또는 블록 내부에서만 존재함.

***

### 리터럴

- 코드에 직접 작성하는 고정값: 정수, 실수, 문자, 불린, 문자열 등이 있음.
- 정수 리터럴은 10진수, 8진수(0), 16진수(0x), 2진수(0b)로 표현 가능.
- 실수 리터럴은 기본적으로 double로 취급, f/F를 붙이면 float임(예: `3.14f`).
- 문자 리터럴은 작은따옴표, 문자열 리터럴은 큰따옴표 사용함.
- `null` 리터럴은 참조형에서만 사용 가능함.

***

### 상수

- `final` 키워드로 선언하며, 초기화 후 값 변경 불가.
- 상수 이름은 모두 대문자(네이밍 관례).

***

### 타입 변환

- **자동(확장) 변환:** 작은 타입이 큰 타입으로 자동 변환됨(예: `int` → `long`).
- **명시적(축소) 변환:** 큰 타입을 작은 타입으로 변환할 때는 캐스팅이 필요하며(예: `double` → `int`), 데이터 손실이 발생할 수 있음.

***

### 연산자

- **산술:** `+`, `-`, `*`, `/`, `%`
- **대입:** `=`, `+=`, `-=` 등
- **증감:** `++`, `--`
- **비교:** `==`, `!=`, `>`, `<`, `>=`, `<=`
- **논리:** `&&`, `||`, `!`
- **비트:** `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`
- **삼항(조건) 연산:** `조건 ? 값1 : 값2`

***

### 식과 문장

- **식(Expression):** 변수, 리터럴, 연산자를 결합해 값을 생성함.
- **문장(Statement):** 동작을 수행하며 세미콜론으로 종료함.
- **블록:** 여러 문장을 중괄호 `{}`로 묶음.

***

### 흐름 제어문

- **조건문:** `if`, `if-else`, `switch`
- **반복문:** `for`, `while`, `do-while`
- **분기문:** `break`, `continue`, `return`
- `switch` 문은 값에 따라 실행 경로를 고르고, `case`와 `default` 레이블 사용 가능함.

***

### 사용자 입력

- `Scanner` 클래스로 키보드 입력을 받아 다양한 타입(`String`, `int`, `double`, `boolean`)의 값을 읽을 수 있음.

</details>
