# break and continue Statements in Java

## break Statement

- The `break` statement is used to **terminate a loop or switch statement**
- Control immediately exits the loop or switch block
- Commonly used to stop execution when a condition is met

### Syntax

```java
break;
```
- Example (Loop)
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println(i);
}
```
## continue Statement
- The `continue` statement is used to **skip the current iteration**
- Control jumps to the **next iteration** of the loop
- Useful when a specific condition needs to be **ignored**

## Syntax
```java
continue;
```
- Example (Loop)
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}

```
## How it Works

- `break` exits the loop **completely**
- `continue` skips **only the current iteration**
- Loop execution resumes based on the **loop condition**

---

## Important Points

- `break` can be used in **loops** and **switch statements**
- `continue` is used **only inside loops**
- Overusing these statements may **reduce code readability**
