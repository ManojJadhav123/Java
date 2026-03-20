# Constructors in Java

## What is a Constructor?

-## Constructor Basics

- A constructor is a **special method** used to **initialize objects**
- It is called **automatically** when an object is created
- Constructor name must be the **same as the class name**
- It does **not have a return type** (not even `void`)
- Constructors are called **implicitly only once** at the time of object creation
- A constructor is always an **instance member**
- Constructors can be **parameterized**
- Constructors can be **overloaded**
- Constructors **cannot be** `abstract`, `final`, `static`, or `synchronized`
- Any **access modifier** (`private`, `default`, `protected`, `public`) can be used with constructors
---

## Syntax of a Constructor

```java
class ClassName {
    ClassName() {
        // initialization code
    }
}
```
---
## Example

```java
class Student {
int rollNo;
String name;

    Student() {
        rollNo = 101;
        name = "Manoj";
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}
```
### Creating Object (Constructor Call)

```java
Student s1 = new Student();
```
- `Student()` → Constructor is called automatically

---

## Why Constructor ?

## Why Constructor?

- An object is a **real-world entity**, meaning it should represent a **real-world thing**
- To represent a real-world entity correctly, an object must have the **same state** as that entity
- This state is maintained using **instance variables (data members)**

- To make this possible, instance variables must be **initialized with appropriate values**
- Constructors are used to **assign initial values to instance variables**

- Thus, constructors help in creating objects with a **valid and meaningful state**

---

## Types of Constructors

## 1. Default Constructor

- Provided by the **compiler** if no constructor is defined

- Initializes variables with **default values**

---
## 2. No-Argument Constructor

- Constructor with **no parameters**

Defined explicitly by the programmer

```java
class Test {
    Test() {
        System.out.println("No-arg constructor");
    }
}
```

---

## 3. Parameterized Constructor

- Constructor with **parameters**

- Used to initialize objects with specific values

```java
class Student {
    int rollNo;

    Student(int r) {
        rollNo = r;
    }
}
```

---

## Copy Constructor in Java

- A **copy constructor** is a constructor that creates a **new object by copying the values of another object**
- Java does **not provide a built-in copy constructor** like C++
- It must be **defined manually by the programmer**


## Syntax

```java
class ClassName {
    ClassName(ClassName obj) {
        // copy values from obj
    }
}
```
### Example

```java
class Student {
int rollNo;
String name;

    // parameterized constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // copy constructor
    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

class Test {
public static void main(String[] args) {
Student s1 = new Student(101, "Manoj");
Student s2 = new Student(s1);   // copy constructor

        s1.display();
        s2.display();
    }
}
```
- it performs a **shallow copy** by default (copies values, not deep objects)
- Useful when you want to **duplicate objects**

---

## Constructor Overloading

- A class can have **multiple constructors**
- Constructors differ by **number or type of parameters**

```java
class Test {
    Test() {}
    Test(int x) {}
    Test(int x, int y) {}
}
```
---

# Private Constructor and Singleton Class in Java

## Private Constructor

- A constructor declared with the `private` access modifier
- Cannot be accessed **outside the class**
- Prevents **object creation from outside the class**

### Example

```java
class Test {
    private Test() {
        System.out.println("Private Constructor");
    }

    void show() {
        System.out.println("Hello");
    }
}
```
## Why Use Private Constructor?

- To **restrict object creation**
- To implement design patterns like **Singleton**
- To create **utility classes** (only static methods)

---

## Singleton Class

- A class that allows **only one object** to be created
- Ensures a **single instance** throughout the application

### Common Use Cases

- **Configuration**
- **Logging**
- **Database connections**

---

## Implementation of Singleton Class
```java
class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Make constructor private
    private Singleton() {}

    // Step 3: Provide public method to access the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
## Using Singleton Class

```java
class Test {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);   // true
    }
}
```

---

## Design Pattern of Singleton Class

A Singleton class should contain:

- A **private static reference variable** of the same class type
- A **private constructor** to restrict object creation
- A **public static method** that returns the object reference
    - This method creates the object **only if it is not already created**
    - If the object already exists, it returns the **existing instance**
  
---
## Important Points

- Private constructor prevents **direct object creation**
- Only one instance is created and **shared globally**
- `getInstance()` provides controlled access
- Ensures **memory efficiency and consistency**

