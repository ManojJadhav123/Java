# Enhanced for-each Loop in Java

## What is a for-each Loop?

- The **for-each loop** is an **enhanced version of the for loop**
- Introduced in **Java 5**
- Used to iterate over **arrays** and **collections**
- Simplifies code and improves readability

---

## Syntax

```java
for (dataType variable : collection) {
    // code to be executed
}
```
- Example (Array)
```java  
int[] numbers = {1, 2, 3, 4, 5};

for (int num : numbers) {
System.out.println(num);
}
```
- Example (Collection)
```java
List<String> names = List.of("Java", "Python", "C++");

for (String name : names) {
    System.out.println(name);
}
```
## How it Works

- The loop automatically picks **each element** from the collection
- The element is assigned to the **loop variable**
- The loop continues until **all elements** are processed
- No need to manage the **index manually**

---

## Important Points

- Can be used with **arrays** and **Iterable** objects
- Does **not provide index access**
- Cannot modify the **collection structure** during iteration
- Best used for **read-only traversal**

