<details>
<summary>ENG (English Version)</summary>

# Chapter 8. Java File Input and Output (I/O) and Streams

***

### What Is a Stream?

- A stream is a sequence of data elements that flows between a Java program and an external source or destination, such as files, the keyboard, or the network.
- Streams are unidirectional:  
  - **Input streams** bring data into a Java program.
  - **Output streams** send data out from a Java program.
- Each stream is dedicated to either input or output, not both.

***

### Types of Streams

- **Byte Streams:**  
  - Handle raw binary data, reading and writing one byte at a time.
  - Used for all file types, including binary files, images, and audio.
  - Main classes: `InputStream`, `OutputStream`, `FileInputStream`, `FileOutputStream`.
- **Character Streams:**  
  - Handle character data, reading and writing one character at a time using Unicode.
  - Ideal for text files.
  - Main classes: `Reader`, `Writer`, `FileReader`, `FileWriter`, `InputStreamReader`, `OutputStreamWriter`.

***

### Using Streams in Java

- Streams connect Java applications to input/output devices or files, allowing sequential data processing.
- Both byte and character streams are part of the `java.io` package.

***

### Reading and Writing Files

- Use character streams for text file operations and byte streams for binary file operations.
- Streams must be properly opened before use and closed afterward to release resources and prevent data loss.
- Character encoding can be specified when reading or writing text files to support various languages.

***

### Buffered Streams

- Buffered streams use an internal buffer to improve I/O performance by minimizing the number of read/write operations.
- Main classes: `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, `BufferedWriter`.
- Especially useful for handling large files or when efficient performance is required.

***

### The File Class

- The `File` class represents files and directories, providing methods to create, delete, rename, and retrieve information about them.
- It manages file metadata but does not perform actual data input or output.

***

### Practical Usage

- Streams and the `File` class are used together for tasks such as copying files, reading user input and saving to files, and listing directory contents.
- Always close streams after use to free system resources and ensure data integrity.

</details>

<details>
<summary>KOR (한국어 버전)</summary>

# 8장. 자바 파일 입출력(I/O)과 스트림

***

### 스트림(Stream)이란?

- 스트림은 자바 프로그램과 외부(파일, 키보드, 네트워크 등) 간에 데이터가 흐르는 통로(연결 고리)임.
- 스트림은 단방향으로만 동작함.  
  - **입력 스트림:** 외부에서 프로그램으로 데이터가 들어옴.
  - **출력 스트림:** 프로그램에서 외부로 데이터가 나감.
- 하나의 스트림은 입력 또는 출력 중 한 방향만 담당함.

***

### 스트림의 종류

- **바이트 스트림:**  
  - 1바이트씩 바이너리(이진) 데이터를 읽고 씀.
  - 모든 파일(바이너리, 이미지, 오디오 등)에 사용.
  - 주요 클래스: `InputStream`, `OutputStream`, `FileInputStream`, `FileOutputStream`
- **문자 스트림:**  
  - 유니코드 기반으로 1문자씩 문자 데이터를 읽고 씀.
  - 텍스트 파일에 적합함.
  - 주요 클래스: `Reader`, `Writer`, `FileReader`, `FileWriter`, `InputStreamReader`, `OutputStreamWriter`

***

### 자바에서 스트림 사용

- 스트림은 자바 애플리케이션과 입출력 장치(파일, 콘솔 등)를 연결해 순차적 데이터 처리를 가능하게 함.
- 바이트/문자 스트림 모두 `java.io` 패키지에 포함됨.

***

### 파일 읽기/쓰기

- 텍스트 파일은 문자 스트림, 바이너리 파일은 바이트 스트림으로 처리함.
- 스트림은 사용 전 반드시 열고, 사용 후에는 반드시 닫아야 자원 누수와 데이터 손실을 방지할 수 있음.
- 문자 인코딩을 지정해 다양한 언어의 텍스트 파일을 읽고 쓸 수 있음.

***

### 버퍼 스트림

- 버퍼 스트림은 내부 버퍼를 사용해 입출력 성능을 높임(읽기/쓰기 작업 횟수 최소화).
- 주요 클래스: `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, `BufferedWriter`
- 대용량 파일 처리나 성능이 중요한 경우에 특히 유용함.

***

### File 클래스

- `File` 클래스는 파일과 디렉터리를 표현하며, 생성, 삭제, 이름 변경, 정보 조회 등의 메서드를 제공함.
- 파일의 메타데이터만 관리하며, 실제 데이터 입출력은 수행하지 않음.

***

### 실용적 활용

- 스트림과 `File` 클래스를 함께 사용해 파일 복사, 사용자 입력 저장, 디렉터리 목록 출력 등 다양한 작업을 수행함.
- 스트림 사용 후에는 반드시 닫아 시스템 자원을 해제하고 데이터 무결성을 보장해야 함.

</details>
