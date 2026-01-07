# if-else Statement in Java

## What is an if-else Statement?

- The `if-else` statement is a **decision control statement**
- It is used to execute one block of code when a condition is **true**
- Executes an alternative block of code when the condition is **false**

---

## Syntax

```java
if (condition) {
    // code executed if condition is true
} else {
    // code executed if condition is false
}
```
```java
int age = 16;

if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

## How it Works

- The condition inside the `if` statement is evaluated
- If the condition is **true**, the `if` block is executed
- If the condition is **false**, the `else` block is executed
- Exactly **one block** is executed

---

## Important Points

- The `else` block is **optional**, but it **cannot exist without an `if` statement**
- An `else` block must always be associated with a corresponding `if`
- Conditions must return a **boolean** value
- Curly braces `{ }` are recommended even for **single statements**
- Improves decision-making logic in programs
