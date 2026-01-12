# Classes and Objects in Java

## What is a Class?

- A class is a **description of an object**
- A class is a **blueprint or template** used to create objects
- It defines:
    - **Properties** (variables / fields)
    - **Behaviors** (methods)
- A class does **not occupy memory** by itself
- A class is a way to achieve **encapsulation**
- Class can be compared to a **common noun** (e.g., Student, Car)

---

## Syntax of a Class

```java
class ClassName {
    // variables
    // methods
}
```
- Example of a Class
```java
class Student {
    int rollNo;
    String name;

    void display() {
        System.out.println(rollNo + " " + name);
    }
}
```
## What is an Object?

- An object is a **real-world entity**
- It is an **instance of a class**
- An object **occupies memory**
- Objects are created at **runtime**
- Object == **Proper Noun**

---

## Creating an Object

```java
Student s1 = new Student();
```
- `Student` → **Class name**
- `s1` → **Reference variable**
- `new` → Allocates memory in the **heap**
- `Student()` → **Constructor call**

## Accessing Class Members

```java
s1.rollNo = 101;
s1.name = "Manoj";
s1.display();
```

## Memory Representation

- Object is stored in **heap memory**
- Reference variable is stored in **stack memory**
- Reference variable points to the **object in heap**

---
| Class                | Object              |
| -------------------- | ------------------- |
| Blueprint            | Instance            |
| No memory allocation | Occupies memory     |
| Logical entity       | Physical entity     |
| Declared once        | Can create multiple |

---
## Important Points

- One class can have **multiple objects**
- Objects interact using **methods**
- Changes in one object do **not affect** another
- `new` keyword is mandatory for **object creation** in Java
