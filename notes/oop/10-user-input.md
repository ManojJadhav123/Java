# User Input in Java

## What is User Input?

- User input allows a program to **receive data from the user during program execution**
- Java provides several ways to take input from the user
- The most commonly used class for user input is **`Scanner`**

---

## Using Scanner Class

- The `Scanner` class is part of the **`java.util` package**
- It is used to read input from different sources such as:
    - Keyboard
    - Files
    - Strings

- A `Scanner` breaks its input into **tokens** using a **delimiter pattern**
- By default, the delimiter matches **whitespace**
- The resulting tokens can then be **converted into different data types** using the various `next` methods

### Import Statement

```java
import java.util.Scanner;
```
---
## Creating a Scanner Object

```java
Scanner sc = new Scanner(System.in);
```
- `System.in` refers to the **standard input stream (keyboard)**

---
## Example Program

```java
import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```
---
## Common Scanner Methods

| Method | Description | Checking Method |
|------|-------------|----------------|
| `next()` | Reads a **single word** | `hasNext()` |
| `nextLine()` | Reads an **entire line** | `hasNextLine()` |
| `nextInt()` | Reads an **integer** | `hasNextInt()` |
| `nextDouble()` | Reads a **double value** | `hasNextDouble()` |
| `nextFloat()` | Reads a **float value** | `hasNextFloat()` |
| `nextLong()` | Reads a **long value** | `hasNextLong()` |
| `nextShort()` | Reads a **short value** | `hasNextShort()` |
| `nextByte()` | Reads a **byte value** | `hasNextByte()` |
| `nextBoolean()` | Reads a **boolean value** | `hasNextBoolean()` |
---

## Important Points

- `Scanner` must be **imported from `java.util` package**
- `System.in` is used for **keyboard input**
- Different methods are used for **different data types**
- It is recommended to **close the `Scanner` object after use**

```java
sc.close();
```
