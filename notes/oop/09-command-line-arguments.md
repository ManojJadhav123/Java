# Command Line Arguments in Java

## What are Command Line Arguments?

- Command line arguments are **arguments passed to a Java program at the time of execution**
- They are received by the **`main()` method**
- These arguments are stored in the **`String[] args` array**

---

## Syntax of `main` Method

```java
public static void main(String[] args)
```
- `args` is an **array of strings**
- Each command line argument is stored as a **separate element** in this array
---
## Example Program

```java
class Test {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
```
### Compile

```bash
 javac Test.java
```
### Run
```bash
 java Test Hello Java
```
### Output
```bash
 Hello
 Java
```
---
## Important Points

- Command line arguments are **always received as strings**
- They must be **converted** if a different data type is required
- The number of arguments passed can be checked using **`args.length`**
---

## Example with conversion
```java
class Add {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a + b);
    }
}
```

### Run
```bash
 java Add 10 20
 ```
 
### Output
```bash
 30
```
---
## Advantages of Command Line Arguments

- Allow programs to receive **input without user interaction**
- Useful for **automation and scripting**
- Widely used in **batch processing**