# Nested Loops in Java

## What are Nested Loops?

- A **nested loop** is a loop **inside another loop**
- The **inner loop** executes completely for **each iteration** of the outer loop
- Commonly used for **matrix operations**, **patterns**, and **tables**

---

## Syntax

```java
for (initialization; condition; update) {
    for (initialization; condition; update) {
        // inner loop body
    }
}
```
- Example
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i = " + i + ", j = " + j);
    }
}
```
## How it Works

- The **outer loop** starts first
- For each iteration of the outer loop:
    - The **inner loop** runs from start to end
- After the inner loop finishes, control returns to the **outer loop**
- This process continues until the **outer loop condition** becomes false

---

## Important Points

- The **inner loop** executes more times than the outer loop
- **Time complexity** increases with nested loops
- Be careful to avoid **unnecessary nesting**
- Nested loops can be a **common source of performance issues** if overused

---

## Common Use Cases

- Printing **patterns**
- Working with **2D arrays**
- **Multiplication tables**
- **Grid-based problems**
