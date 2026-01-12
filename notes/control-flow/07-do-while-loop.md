# do-while Loop in Java

## What is a do-while Loop?

- The `do-while` loop is an **iterative control statement**
- It executes the loop body **at least once**
- The condition is checked **after** the loop body executes

---

## Syntax

```java
do {
    // code to be executed
} while (condition);
```
- Example :
```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```
## How it Works

- The loop body executes **first**
- After execution, the **condition is evaluated**
- If the condition is **true**, the loop repeats
- If the condition is **false**, the loop stops
- Guarantees **at least one execution**

---

## Important Points

- Semicolon `;` after `while (condition)` is **mandatory**
- Useful when the loop body must execute **at least once**
- Risk of an **infinite loop** if the condition never becomes false
