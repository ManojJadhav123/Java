# Data Types in Java

## What is a Data Type?

- A data type specifies the **type of data** a variable can hold
- It determines the **size**, **range**, and **operations** allowed on data
- Java is a **strongly** and **statically typed** language, so data types must be declared explicitly

---
## Static Typing vs Dynamic Typing

### Statically Typed Language (Java)

- Data type of a variable is **checked at compile time**
- Variable data type must be **declared explicitly**
- Type of a variable **cannot change** once declared
- Errors are detected **before program execution**
- Provides better **performance** and **type safety**, since the **type and nature of data** to be stored in a variable are decided at compile time

**Example (Java):**
```java
int x = 10;
// x = "hello";  // ❌ compile-time error
```
### Dynamically Typed Language (Python, JavaScript)

- Data type of a variable is checked at **runtime**
- No need to declare the data type explicitly
- Type of a variable can **change during execution**
- Errors may appear **while the program is running**
- More **flexible**, but **less type-safe**

**Example (Python):**
```python
x = 10
x = "hello"  # valid
```

## Types of Data Types in Java

Java data types are divided into two categories:

- **Primitive Data Types**
- **Non-Primitive (Reference) Data Types**

---
## Data Types Tree

![JShell Example](../assets/data-types-tree.png)

---

## Primitive Data Types

- Primitive data types store **simple values** directly in memory
- They are **predefined in the compiler** as they are **keywords**

### 1. byte

- Size: **1 byte** (8 bits)
- Range: **-128 to 127**

---

### 2. short

- Size: **2 bytes** (16 bits)
- Range: **-32,768 to 32,767**

---

### 3. int

- Size: **4 bytes** (32 bits)
- Range: **-2³¹ to 2³¹ − 1**
- Default integer data type

---

### 4. long

- Size: **8 bytes** (64 bits)
- Range: **-2⁶³ to 2⁶³ − 1**
- Requires `L` or `l` suffix

---

### 5. float

- Size: **4 bytes** (32 bits)
- Used for decimal values
- Requires `f` or `F` suffix

---

### 6. double

- Size: **8 bytes** (64 bits)
- Default data type for decimal values

---

### 7. char

- Size: **2 bytes** (16 bits)
- Stores a single character
- Uses **Unicode** representation

---

### 8. boolean

- The size of `boolean` is **implementation dependent**, as the exact size is **not defined in the official Java documentation**
- Conceptually, a `boolean` requires only **1 bit** to represent `true` or `false`, which is why many references mention **1 bit**
- The actual memory usage depends on the **JVM implementation** to optimize memory usage internally
- A `boolean` stores only **true** or **false**
- In Java, **true is not equal to 1** and **false is not equal to 0**, unlike some other programming languages

## Default Values of Primitive Data Types

| Data Type | Default Value |
|-----------|---------------|
| byte      | 0             |
| short     | 0             |
| int       | 0             |
| long      | 0L            |
| float     | 0.0f          |
| double    | 0.0           |
| char      | '\u0000'      |
| boolean   | false         |

---

## Non-Primitive Data Types

- Store **references** to objects
- Created using **classes**
- Also called **reference data types**

**Examples:**
```java
String name = "Java";
int[] numbers = {1, 2, 3};
Student s = new Student();
```
- Non-primitive data types can be created with the help of **primitive data types**
- Non-primitive data types are represented as **classes** in Java
- `String` is a **class**, therefore `String` is a **non-primitive data type**
- You can define your own **class** and create a **custom data type**

---
# Two Types of Variables

![JShell Example](../assets/variable%20types.jpg)

---
## Other important things

- In **C++**, `Student s1;` creates an **object** directly
- In **Java**, `Student s1;` does **not** create an object
- In Java, `Student s1;` only declares a **reference variable**
- The actual object is created only when `new` keyword is used

```java
Student s1;          // reference variable
s1 = new Student();  // object creation
```

![reference and null](../assets/reference-and-null.jpg)


- `null` can be stored **only in reference variables**
- It indicates that the reference variable is **not pointing to any object**
- Primitive data types **cannot** store `null`
```java
int x = null // error
Student s1 = null; // correct
```



