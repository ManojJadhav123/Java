# Packages and import in Java

## What is a Package?

- Packages are simply a way to **organize files into different directories**
- Organization is based on **functionality, usability, and category**
- Files in one **package (directory)** usually have a **different functionality** from those in another package
- For example:
    - Classes in **`java.io`** deal with **input/output operations**
    - Classes in **`java.net`** provide functionality related to **networking**
- A **package** is a namespace that groups related **classes and interfaces**
- It helps in **organizing large programs**
- Prevents **name conflicts**
- Improves **code reusability and maintainability**
- Make **collaboration easier among developers**
---

## Types of Packages in Java

### 1. Built-in Packages

- Packages provided by **Java API**
- Examples:

```java
java.lang
java.util
java.io
java.sql
```
### Example Usage

```java
import java.util.Scanner;
```
---
### 2. User-defined Packages

- Packages created by the **programmer**

### Example

```java
package mypackage;

class Test {
    public void show() {
        System.out.println("Hello from package");
    }
}
```

---

## How to Create a Package

### 1. Using the `package` Keyword

- A package is created using the `package` statement
- It must be written at the **top of the Java source file**

### Example

```java
package mypackage;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello from mypackage");
    }
}
```
---
### 2.Compile the Program
- Use the `-d` option to **create the package directory structure**

```bash
javac -d . Test.java
```
- The `-d` option tells the **compiler to create the required directory structure**
- A folder named **`mypackage`** will be created automatically

### Directory Structure Created
mypackage/
Test.class

### 3. Run the Program

```bash
java mypackage.Test
```
- Use the fully qualified class name to run the program

---
## What is `import`?

- `import` is used to **access classes from another package**
- It allows you to use classes **without writing their full package name**

### Example without `import`

```java
java.util.Scanner sc = new java.util.Scanner(System.in);
```
### Example with `import`

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```
---

## Importing a Single Class

```java
import java.util.Scanner;
```
---

## Importing an entire package

```java
import java.util.*;
```
- `*` imports **all classes** of the package
- It does **not import sub-packages**
---
## Default Package

- If no `package` statement is defined, the class belongs to the **default package**

```java
class Test {
}
```
---

## Public Class Rules in Java

- A Java source file can contain **multiple classes**
- However, there can be **only one public class** in a single Java file  
  (minimum **zero**, maximum **one**)

- The **file name must be the same as the public class name**

Example:

```java
public class Test {
}
```
- File name:
```java
Test.java
```

- If there is **no public class**, the file name can be **any valid name**
- If a class contains the **`main()` method**, that class is usually considered the **main class**
- Typically, the **main class is declared as `public`**

---
## Important Points

- `package` statement must appear **at the top of the file**
- `import` statement must come **after the package statement**
- Classes in the **same package do not require `import`**
- `java.lang` package is **imported automatically**
- The `package` statement must be the **first statement** in the file
- The **directory structure must match the package name**
- Use `-d` while compiling to **create the package folder automatically**