# if-else-if Ladder in Java

## What is if-else-if Ladder?

- The `if-else-if` ladder is a **decision control statement**
- It is used to check **multiple conditions**
- Conditions are evaluated **from top to bottom**
- The first condition that evaluates to **true** gets executed

---

## Syntax

```java
if (condition1) {
    // code block 1
} else if (condition2) {
    // code block 2
} else if (condition3) {
    // code block 3
} else {
    // default code block
}
```

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```
## How it Works

- Conditions are evaluated **one by one** from top to bottom
- As soon as a condition becomes **true**, its block is executed
- Remaining conditions are **skipped**
- If none of the conditions are true, the `else` block is executed (if present)

---

## Important Points

- Multiple `else if` blocks are allowed
- Only **one block** executes in the entire ladder
- The `else` block is **optional**, but must come **at the end**
- Conditions must return a **boolean** value
- Order of conditions matters for **correct results**
