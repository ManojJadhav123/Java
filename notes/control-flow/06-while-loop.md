# while Loop in Java

## What is a while Loop?

- The `while` loop is an **iterative control statement**
- Used to execute a block of code **as long as a condition remains true**
- Best suited when the number of iterations is **not known in advance**

---

## Syntax

```java
while (condition) {
    // code to be executed
}
```
- Example :
```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```
## How it Works

- The condition is checked **before each iteration**
- If the condition is **true**, the loop body executes
- After executing the body, control goes back to the condition
- The loop stops when the condition becomes **false**

---

## Important Points

- If the condition is **false initially**, the loop body will **not execute even once**
- The loop variable must be **updated inside the loop** to avoid infinite loops
- Commonly used when the loop depends on **external input or conditions**

## Example: Infinite while Loop
```java
while (true) {
    System.out.println("Infinite Loop");
}
```
