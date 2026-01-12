# switch Statement in Java

## What is a switch Statement?

- The `switch` statement is a **decision control statement**
- It is used to execute one block of code from **multiple choices**
- It is an alternative to long `if-else-if` ladders

---

## Syntax

```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // default code
}
```
- Example :
```java
int day = 3;

switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
default:
System.out.println("Invalid day");
}
```

## How it Works

- The `switch` expression is evaluated **once**
- The value is **directly matched** with `case` values  
  (it is not evaluated like multiple conditions in `if-else`)
- When a matching `case` is found, its corresponding block is executed
- If the `break` statement is **not added**, execution continues to the **next cases**  
  (this behavior is called **fall-through**)
- The `break` statement exits the `switch` block
- If no `case` matches, the `default` block is executed (if present)

---

## Important Points

- `break` prevents **fall-through**
- The `default` block is **optional**
- `switch` works with:
    - `byte`, `short`, `int`, `char`
    - `String` (Java 7+)
    - `enum`
- `case` values must be **constant expressions**
- Duplicate `case` values are **not allowed**

