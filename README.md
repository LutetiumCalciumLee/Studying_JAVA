<details>
<summary>ENG (English Version)</summary>

# Chapter 3. Java Loops, Arrays, and Exception Handling

***

### Loop Statements

- **for Loop:**  
  Used to repeat a block of code a set number of times. Syntax:  
  `for(initialization; condition; update) { /* statements */ }`  
  You can declare variables inside the loop, sum values, or create infinite loops by omitting the condition.

- **while Loop:**  
  Repeats code as long as the condition is true. The condition is checked before each iteration.  
  Example: Input numbers until a sentinel value (like `-1`) is entered.

- **do-while Loop:**  
  Similar to `while`, but guarantees the code block runs at least once because the condition is checked after the block.

- **Nested Loops:**  
  Loops can be placed inside other loops to handle multi-dimensional data or repeated processes (e.g., printing multiplication tables).

- **continue Statement:**  
  Skips the current iteration and moves to the next loop cycle.

- **break Statement:**  
  Exits the current loop immediately, even if the condition is still true.

***

### Arrays

- **Definition:**  
  Arrays are data structures that store multiple values of the same type, accessible by index (starting at 0).
- **Declaration and Initialization:**  
  Arrays must be declared and then created with a specific size.  
  Example: `int[] arr = new int[5];` or `int[] arr = {1, 2, 3, 4, 5};`
- **Accessing Elements:**  
  Use indices to read or assign values: `arr[0] = 10;`
- **Length:**  
  The `.length` property gives the size of the array.
- **for-each Loop:**  
  Simplifies iterating over arrays:  
  `for(int num : arr) { /* use num */ }`
- **Multi-dimensional Arrays:**  
  Arrays can have two or more dimensions, like `int[][] matrix = new int[3][4];`  
  - Can be rectangular or jagged (rows of different lengths).
- **Returning Arrays from Methods:**  
  Methods can return arrays, and the receiving variable must match the return type.

***

### Exception Handling

- **What is an Exception?**  
  An error that occurs during program execution (e.g., dividing by zero, accessing an array out of bounds, invalid input).
- **try-catch-finally:**  
  Use a `try` block to wrap code that might throw exceptions, `catch` blocks to handle them, and `finally` for code that always runs, regardless of whether an exception occurred.[1][2][3][4][5][6]
- **Common Exceptions:**  
  - `ArithmeticException`: Division by zero.
  - `ArrayIndexOutOfBoundsException`: Invalid array index.
  - `InputMismatchException`: Invalid input type.
  - `NumberFormatException`: Invalid number conversion.
- **Example:**  
  Prompting for input until a valid value is entered, or handling division by zero gracefully.

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 3장. 자바 반복문, 배열, 예외 처리

***

### 반복문

- **for문:**  
  일정 횟수만큼 코드를 반복 실행할 때 사용함. 문법:  
  `for(초기화; 조건; 증감) { /* 실행문 */ }`  
  반복문 내부에서 변수 선언, 합계 계산, 조건 생략 시 무한 반복 등 다양한 활용이 가능함.

- **while문:**  
  조건이 참인 동안 반복 실행함. 반복 전마다 조건을 검사함.  
  예시: `-1`과 같은 종료값이 입력될 때까지 숫자 입력받기.

- **do-while문:**  
  while문과 유사하지만, 조건을 나중에 검사하므로 코드 블록이 최소 한 번은 실행됨.

- **중첩 반복문:**  
  반복문 안에 반복문을 넣어 다차원 데이터 처리나 반복 작업(예: 구구단 출력)에 활용함.

- **continue문:**  
  현재 반복을 건너뛰고 다음 반복으로 이동함.

- **break문:**  
  조건과 상관없이 반복문을 즉시 종료함.

***

### 배열

- **정의:**  
  배열은 같은 타입의 여러 값을 인덱스(0부터 시작)로 접근할 수 있는 자료구조임.
- **선언과 초기화:**  
  배열은 선언 후 크기를 지정해 생성해야 함.  
  예시: `int[] arr = new int[5];` 또는 `int[] arr = {1, 2, 3, 4, 5};`
- **요소 접근:**  
  인덱스를 사용해 값 읽기/저장: `arr[0] = 10;`
- **길이:**  
  `.length` 속성으로 배열 크기 확인 가능함.
- **향상된 for문(for-each):**  
  배열 전체를 간단히 순회할 수 있음:  
  `for(int num : arr) { /* num 사용 */ }`
- **다차원 배열:**  
  2차원 이상 배열 선언 가능(예: `int[][] matrix = new int[3][4];`)  
  - 직사각형 또는 가변(행마다 길이 다름) 배열 모두 가능함.
- **메서드 반환값:**  
  메서드에서 배열을 반환할 수 있으며, 반환 타입과 변수 타입이 일치해야 함.

***

### 예외 처리

- **예외란?**  
  프로그램 실행 중 발생하는 오류(예: 0으로 나누기, 배열 인덱스 초과, 잘못된 입력 등)를 의미함.
- **try-catch-finally:**  
  예외가 발생할 수 있는 코드를 `try` 블록에 작성하고, 예외 발생 시 `catch` 블록에서 처리함. `finally` 블록은 예외 발생 여부와 상관없이 항상 실행됨.[2][3][4][5][6][1]
- **주요 예외 종류:**  
  - `ArithmeticException`: 0으로 나누기
  - `ArrayIndexOutOfBoundsException`: 배열 인덱스 초과
  - `InputMismatchException`: 잘못된 입력 타입
  - `NumberFormatException`: 숫자 변환 오류
- **예시:**  
  올바른 값이 입력될 때까지 반복 입력받기, 0으로 나눌 때 오류를 안전하게 처리하기 등

</details>
