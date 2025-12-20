<details>
<summary>ENG (English Version)</summary>

# Chapter 1. Computers, Software, and the Evolution of Java



### Computers and Software

- Computers come in many forms: mainframes, PCs, tablets, smartphones, and embedded systems.
- Software (apps) runs on these devices, providing diverse functionality.



### Programming Languages

- **Machine Language:**  
  The lowest-level language, written in binary (0s and 1s), directly executed by the CPU.
- **Assembly Language:**  
  Uses mnemonic codes (e.g., ADD, SUB, MOVE) to represent machine instructions more readably.
- **High-Level Languages:**  
  Designed for humans to read and write complex logic and data structures. Examples include Pascal, Basic, C/C++, Java, and C#. These may be procedural or object-oriented.



### Evolution of Programming Languages

- Programming languages have progressed from machine and assembly language to human-friendly, high-level languages, enabling more complex applications and data management.



### Compilation

- Source code is compiled into machine code that computers can execute.
- Each language has a unique compilation process and file extensions—Java: `.java` → `.class`; C: `.c` → `.obj` → `.exe`.



### WORA (Write Once, Run Anywhere)

- Java programs are compiled to platform-neutral bytecode that runs in the Java Virtual Machine (JVM).
- This allows Java applications to run on any system with a compatible JVM, enabling cross-platform execution.
- The JVM interprets bytecode at runtime, delivering consistency across various systems and hardware.



### Java Development and Execution Environment

- Java source is compiled into bytecode (`.class`), loaded and executed by the JVM as needed.
- Unlike C/C++, Java dynamically loads classes and does not require static linking of all code.
- Java programs start from the `main()` method of a class.



### Java Editions and Distribution

- **Java SE (Standard Edition):** Desktop and server applications.
- **Java ME (Micro Edition):** Resource-constrained platforms like mobile and embedded devices.
- **Java EE (Enterprise Edition):** Large-scale, multi-user, enterprise systems.



### Java API and Packages

- The Java API includes a vast library of prebuilt classes packaged with the JDK.
- Classes are grouped in packages, organizing functionality and preventing naming conflicts.
- Developers can also create custom packages.



### Modularity in Java (Java 9+)

- Java 9 introduced modular programming, improving organization, minimizing runtime overhead, and supporting IoT environments.



### Java Development Tools

- The JDK provides tools such as `javac` (compiler), `java` (runtime), `javadoc` (documentation generator), `jar` (archive manager), and `javap` (disassembler).
- IDEs like Eclipse offer comprehensive development environments for editing, compiling, debugging, and project management.



### Java Application Types

- **Desktop Applications:** Standalone apps run on PCs with a JRE.
- **Servlet Applications:** Java programs run on web servers, often accessing databases and external services.
- **Mobile Applications:** Android apps are primarily developed in Java, but with a distinct runtime (Dalvik/ART).



### Key Features of Java

- **Platform Independence:** Executes anywhere a JVM is available.
- **Object-Oriented:** Encapsulation, inheritance, polymorphism.
- **Automatic Memory Management:** Garbage collection relieves manual memory management.
- **Safety and Security:** Strong type checking; no pointers.
- **Multithreading:** Native support for concurrent programming.
- **Rich Libraries:** Extensive APIs for diverse tasks.
- **Performance:** JIT (Just-In-Time) compiler for fast execution.



### Global Usage and Popularity

- Java remains one of the most popular and widely used programming languages worldwide, essential for desktop, server, and mobile app development.

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 1장. 컴퓨터, 소프트웨어, 그리고 자바의 진화



### 컴퓨터와 소프트웨어

- 컴퓨터는 메인프레임, PC, 태블릿, 스마트폰, 임베디드 시스템 등 다양한 형태로 존재함.
- 소프트웨어(앱)는 이러한 장치에서 동작하며, 다양하고 풍부한 기능을 제공함.



### 프로그래밍 언어의 종류

- **기계어:**  
  CPU가 직접 이해하는 0과 1의 이진 코드로 작성된 가장 낮은 수준의 언어임.
- **어셈블리어:**  
  기계 명령어를 ADD, SUB, MOVE 등 의미 있는 기호로 표현해 가독성을 높인 언어임.
- **고급 언어:**  
  인간이 쉽게 읽고 복잡한 논리와 구조를 표현할 수 있도록 설계됨. Pascal, Basic, C/C++, Java, C# 등이 있으며, 절차형 또는 객체 지향일 수 있음.



### 프로그래밍 언어의 진화

- 프로그래밍 언어는 기계어와 어셈블리에서 고급 언어로 발전하며, 더 복잡한 응용 프로그램과 데이터 구조 구현을 가능하게 함.



### 컴파일 과정

- 소스 코드는 기계어로 변환되어 컴퓨터가 실행 가능하게 됨.
- 각 언어별로 컴파일 및 파일 확장자가 다름(예: Java는 `.java` → `.class`, C는 `.c` → `.obj` → `.exe`).



### WORA(한 번 작성하면 어디서든 실행)

- 자바 소스 파일은 플랫폼에 독립적인 바이트코드로 컴파일됨.
- JVM(Java Virtual Machine) 위에서 실행되므로 OS나 하드웨어와 무관하게 동작함.
- JVM이 바이트코드를 해석해 다양한 환경에서 일관된 실행을 보장함.



### 자바 개발 및 실행 환경

- 자바 소스는 바이트코드로 컴파일되어 `.class` 파일로 저장되고, JVM에 의해 필요할 때 동적으로 로드되어 실행됨.
- C/C++와 달리 모든 코드를 하나의 실행 파일로 연결할 필요 없이 클래스별로 동적 로딩됨.
- 프로그램은 클래스의 `main()` 메서드에서 시작함.



### 자바 에디션과 배포 방식

- **Java SE(스탠다드 에디션):** 데스크톱 및 서버용.
- **Java ME(마이크로 에디션):** 모바일, 임베디드 등 자원 제약이 있는 기기에서 활용.
- **Java EE(엔터프라이즈 에디션):** 대규모 다중 사용자, 기업용 애플리케이션에 적용.



### Java API와 패키지

- Java API는 JDK에 포함된 방대한 라이브러리 모음임.
- 클래스들은 관련 기능별로 패키지 단위로 정리되어 있고, 네이밍 충돌 방지에 효과적임.
- 개발자가 직접 패키지를 생성할 수도 있음.



### 자바 9+ 모듈화 기능

- 자바 9부터는 모듈화 프로그래밍이 도입되어 애플리케이션 및 플랫폼을 모듈로 나눠 관리하고, 작은 런타임 환경과 IoT 지원에 적합함.



### 자바 개발 도구

- JDK에는 `javac`(컴파일러), `java`(실행기), `javadoc`(문서 생성기), `jar`(압축 관리), `javap`(디스어셈블러) 등이 포함됨.
- Eclipse 등 IDE는 편집, 컴파일, 디버깅, 프로젝트 관리 기능을 지원함.



### 자바 애플리케이션 종류

- **데스크톱 애플리케이션:** JRE가 설치된 PC에서 독립적으로 실행됨.
- **서블릿 애플리케이션:** 웹 서버에서 실행되어 DB 등과 연동함.
- **모바일 애플리케이션:** 안드로이드 앱은 자바로 개발되나 별도의 런타임(Dalvik/ART) 사용함.



### 자바의 주요 특징

- **플랫폼 독립성:** JVM이 지원되는 모든 시스템에서 동작함.
- **객체 지향:** 캡슐화, 상속, 다형성을 지원함.
- **자동 메모리 관리:** 가비지 컬렉션으로 메모리 수동 관리 부담을 줄임.
- **안전성/보안성:** 엄격한 타입 검사, 포인터 미지원.
- **멀티스레딩:** 병렬 처리에 대한 내장 지원.
- **풍부한 라이브러리:** 광범위한 표준 API 제공.
- **성능:** JIT(즉시 컴파일)로 실행 속도 향상.



### 전세계적 활용과 인기

- 자바는 데스크톱, 서버, 모바일 개발에서 필수 언어로 꾸준히 활용되며, 세계적으로 높은 인기와 점유율을 유지함.

</details>
