# Chapter 8. Java File Input and Output (I/O) and Streams

---

### What Is a Stream?

- A stream is a sequence of data elements that flows between a Java program and an external source or destination, such as files, the keyboard, or the network.
- Streams are unidirectional:  
  - **Input streams** bring data into a Java program.
  - **Output streams** send data out from a Java program.
- Each stream is dedicated to either input or output, not both.

---

### Types of Streams

- **Byte Streams:**  
  - Handle raw binary data, reading and writing one byte at a time.
  - Used for all file types, including binary files, images, and audio.
  - Main classes: `InputStream`, `OutputStream`, `FileInputStream`, `FileOutputStream`.
- **Character Streams:**  
  - Handle character data, reading and writing one character at a time using Unicode.
  - Ideal for text files.
  - Main classes: `Reader`, `Writer`, `FileReader`, `FileWriter`, `InputStreamReader`, `OutputStreamWriter`.

---

### Using Streams in Java

- Streams connect Java applications to input/output devices or files, allowing sequential data processing.
- Both byte and character streams are part of the `java.io` package.

---

### Reading and Writing Files

- Use character streams for text file operations and byte streams for binary file operations.
- Streams must be properly opened before use and closed afterward to release resources and prevent data loss.
- Character encoding can be specified when reading or writing text files to support various languages.

---

### Buffered Streams

- Buffered streams use an internal buffer to improve I/O performance by minimizing the number of read/write operations.
- Main classes: `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, `BufferedWriter`.
- Especially useful for handling large files or when efficient performance is required.

---

### The File Class

- The `File` class represents files and directories, providing methods to create, delete, rename, and retrieve information about them.
- It manages file metadata but does not perform actual data input or output.

---

### Practical Usage

- Streams and the `File` class are used together for tasks such as copying files, reading user input and saving to files, and listing directory contents.
- Always close streams after use to free system resources and ensure data integrity.
