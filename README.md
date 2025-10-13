<details>
<summary>ENG (English Version)</summary>

# Chapter 6. Java Packages, Modules, and Core Utility Classes

***

### Packages and Modules

- **Packages** group related classes and interfaces into a single directory, helping organize code and prevent naming conflicts in large projects.
- Use the `package` statement at the top of a Java file to specify the package a class belongs to.
- Classes from other packages can be used by specifying their full path (e.g., `java.util.Scanner`) or by using the `import` statement at the beginning of the source file.
- Packages can have hierarchical structures, and classes with the same name can exist in different packages.
- **Modules** (introduced in Java 9) are containers that group packages and resources together. Modules are defined by a `module-info.java` file and allow applications to be split into smaller, reusable pieces. This enables custom Java runtime environments, which is especially useful for small or resource-constrained devices.

***

### The Object Class

- All Java classes implicitly inherit from the `Object` class, which provides common methods such as:
  - `equals()`: Compares objects for equality.
  - `toString()`: Returns a string representation of the object.
  - `hashCode()`: Returns a hash code for the object.
  - `getClass()`: Returns the runtime class of the object.

***

### Wrapper Classes

- Java provides wrapper classes for all primitive types (`Integer`, `Double`, `Character`, `Boolean`, etc.) so they can be used as objects.
- Wrapper objects can be created from primitive values or strings, and provide utility methods for parsing and converting between types.
- Auto-boxing and unboxing (Java 1.5+) automatically convert between primitives and their wrapper objects.

***

### String and StringBuffer Classes

- `String` objects represent immutable sequences of characters. Common methods include `length()`, `charAt()`, `substring()`, `concat()`, `replace()`, `split()`, `toLowerCase()`, `toUpperCase()`, and `trim()`.
- String comparison should be done with `equals()` instead of `==`.
- `StringBuffer` is a mutable sequence of characters, allowing efficient string modifications with methods like `append()`, `insert()`, `replace()`, `delete()`, and `setLength()`.

***

### StringTokenizer

- The `StringTokenizer` class is used to split a string into tokens based on delimiter characters, useful for parsing structured data.

***

### Math Class

- The `Math` class provides static methods for mathematical operations such as `abs()`, `ceil()`, `floor()`, `sqrt()`, `pow()`, `random()`, and constants like `PI`.
- Random numbers can be generated using `Math.random()` or the `Random` class.

***

### Calendar Class

- The `Calendar` class (in `java.util`) is used for managing dates and times, allowing you to get, set, and manipulate fields such as year, month, day, hour, minute, and second.
- `Calendar.getInstance()` creates a calendar object set to the current date and time.

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 6장. 자바 패키지, 모듈, 핵심 유틸리티 클래스

***

### 패키지와 모듈

- **패키지**는 관련된 클래스와 인터페이스를 하나의 디렉터리로 묶어 대규모 프로젝트에서 코드 관리와 네이밍 충돌 방지에 도움을 줌.
- 자바 파일의 맨 위에 `package` 문으로 해당 클래스가 속한 패키지를 지정함.
- 다른 패키지의 클래스를 사용할 때는 전체 경로명(예: `java.util.Scanner`)을 명시하거나, 소스 파일 상단에 `import` 문을 사용함.
- 패키지는 계층 구조를 가질 수 있으며, 서로 다른 패키지에 같은 이름의 클래스가 존재할 수 있음.
- **모듈**(Java 9 도입)은 여러 패키지와 리소스를 묶는 컨테이너로, `module-info.java` 파일로 정의함. 모듈은 애플리케이션을 더 작은 단위로 분할해 재사용성을 높이고, 소형/임베디드 환경에 맞는 맞춤형 자바 런타임 구성이 가능함.

***

### Object 클래스

- 모든 자바 클래스는 암묵적으로 `Object` 클래스를 상속받으며, 다음과 같은 공통 메서드를 제공함:
  - `equals()`: 객체 동등성 비교
  - `toString()`: 객체의 문자열 표현 반환
  - `hashCode()`: 객체의 해시코드 반환
  - `getClass()`: 런타임 시 객체의 클래스 정보 반환

***

### 래퍼(Wrapper) 클래스

- 자바는 모든 기본형 타입에 대해 래퍼 클래스를 제공함(`Integer`, `Double`, `Character`, `Boolean` 등). 이를 통해 기본형도 객체처럼 다룰 수 있음.
- 래퍼 객체는 기본값이나 문자열로 생성할 수 있고, 타입 변환 및 파싱 등 다양한 유틸리티 메서드를 제공함.
- 오토박싱/언박싱(Java 1.5+)으로 기본형과 래퍼 객체 간 자동 변환이 지원됨.

***

### String과 StringBuffer 클래스

- `String` 객체는 불변(immutable) 문자 시퀀스를 표현함. 주요 메서드로 `length()`, `charAt()`, `substring()`, `concat()`, `replace()`, `split()`, `toLowerCase()`, `toUpperCase()`, `trim()` 등이 있음.
- 문자열 비교는 `==` 대신 `equals()`로 해야 함.
- `StringBuffer`는 가변(mutable) 문자 시퀀스로, `append()`, `insert()`, `replace()`, `delete()`, `setLength()` 등으로 문자열을 효율적으로 수정할 수 있음.

***

### StringTokenizer

- `StringTokenizer` 클래스는 구분자(delimiter)로 문자열을 분리해 토큰 단위로 나눌 때 사용함. 구조화된 데이터 파싱에 유용함.

***

### Math 클래스

- `Math` 클래스는 `abs()`, `ceil()`, `floor()`, `sqrt()`, `pow()`, `random()` 등 수학 연산용 정적 메서드와 `PI` 같은 상수를 제공함.
- 난수 생성은 `Math.random()` 또는 `Random` 클래스로 가능함.

***

### Calendar 클래스

- `Calendar` 클래스(`java.util` 패키지)는 날짜와 시간 관리에 사용되며, 연, 월, 일, 시, 분, 초 등 필드의 조회/설정/조작이 가능함.
- `Calendar.getInstance()`로 현재 날짜와 시간에 맞는 캘린더 객체를 생성함.

</details>
