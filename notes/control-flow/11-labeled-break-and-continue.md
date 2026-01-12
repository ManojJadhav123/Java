# Labeled break and continue in Java

## What are Labeled Statements?

- Java allows **labels** to be attached to loops
- Labels are used with `break` and `continue`
- Helpful when working with **nested loops**

---

## Syntax

```java
labelName:
loop {
    // statements
}
```
### Labeled break

- Used to **exit a specific outer loop**
- Control jumps **outside the labeled loop**

- Example
```java
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            continue outer;
        }
        System.out.println("i = " + i + ", j = " + j);
    }
}
```
## How it Works (Labeled continue)

- When `continue outer;` is encountered
- The current iteration of the **outer loop** ends
- The **next iteration** of the outer loop starts

---

## Important Points

- Labels are **identifiers followed by a colon (`:`)**
- Can be used **only with loops**
- Improve control in **nested loops**
- Overuse can **reduce code readability**
