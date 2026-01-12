# for Loop in Java

## What is a for Loop?

- The `for` loop is an **iterative control statement**
- Used to execute a block of code **a fixed number of times**
- Best suited when the number of iterations is **known in advance**

---

## Syntax

```java
for (initialization; condition; update) {
    // code to be executed
}
```
- Example :
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
## How it Works

- **Initialization** is executed **once** at the beginning
- **Condition** is checked **before every iteration**
- If the condition is **true**, the loop body executes
- **Update** runs **after each iteration**
- The loop stops when the condition becomes **false**

---

## Important Points

- All three parts are **optional**, but **semicolons are mandatory**
- Variables declared inside the loop are **local to the loop**
- **Infinite loops** can occur if the condition never becomes false
- Multiple variables can be **initialized and updated** in a `for` loop

## Example with Multiple Variables
```java
for (int i = 1, j = 5; i <= j; i++, j--) {
    System.out.println(i + " " + j);
}
```