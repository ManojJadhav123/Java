# First Java Program

## Creating a Java Program

- Java programs are written in files with the `.java` extension
- The file name must match the **class name**
- Every Java program must have at least one **class**
- Program execution starts from the `main` method

---

## Hello World Program

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
## Understanding the Program

- `class HelloWorld`
  - Defines a class named `HelloWorld`

- `public static void main(String[] args)`
  - Entry point of the Java program

- `System.out.println()`
  - Prints output to the console

---

## Compiling the Program

- Java source code must be compiled before execution
- Use the Java compiler:

```bash
javac HelloWorld.java
```

## Running the Program

- Use the Java launcher to run the program:
```bash
java HelloWorld
```
---
## Important Points

- Java is a **case-sensitive** language
- Java statements are terminated with `;`
- Traditionally, to write even the smallest Java program, you must define a **class**
- From Java 21 (preview), Java allows programs without explicitly defining a class
- Java does not support **non-member functions**

---
## Explanation of Each Keyword

### `class`
- Used to declare a class
- A class is a blueprint for objects
- All Java code must be written inside a class (standard Java programs)

---

### `HelloWorld`

- Name of the class
- The class name must match the file name (`HelloWorld.java`)
- This allows the JVM to locate the class containing the `main` method
- Class names follow the **PascalCase** naming convention

---

### `public`
- Access modifier
- Makes the class or method accessible from anywhere
- JVM must be able to access the `main` method, so it is `public`

---

### `static`
- Belongs to the class, not to objects
- Allows JVM to call the `main` method without creating an object
- Memory is allocated once at class loading time

---

### `void`
- Return type of the method
- Indicates that the method does not return any value

---

### `main`
- Name of the method
- Acts as the entry point of the Java program
- JVM starts execution from this method

---

### `String[]`
- Array of `String` objects
- Used to store command-line arguments

---

### `args`
- Name of the parameter
- Holds command-line arguments passed to the program

---

### `System`
- Predefined class in `java.lang` package
- Provides access to system-level resources

---

### `out`

- `out` is a **reference variable** declared as a **static member** inside the `System` class
- `out` is **not** an instance of the `System` class
- It refers to an object of type **`PrintStream`**, which is used to send output to the console


---

### `println`
- Method of the `PrintStream` class
- Prints output to the console and moves the cursor to the next line

---

### `"Hello"`
- String literal
- Text to be printed on the console

---

### `;` (Semicolon)
- Statement terminator in Java
- Indicates the end of a statement

---

### `{ }` (Curly Braces)
- Define the start and end of a block
- Used for classes, methods, and control blocks

---
### Naming Convention Usage

- **camelCase**
    - Used to name **variables**, **reference variables**, and **methods**

- **PascalCase**
    - Used to name **classes** and **interfaces** in Java

- **snake_case**
    - Mostly used in **C / C++** to name identifiers


