# Inheritance in Java

## What is Inheritance?

- Inheritance is a mechanism where one class **acquires the properties and behaviors** of another class
- It helps in **code reusability**
- It represents an **IS-A relationship**

Example:
- Dog **is-a** Animal

---

## Syntax

```java
class Parent {
    // properties and methods
}

class Child extends Parent {
    // additional properties and methods
}
```
- `extends` is a keyword
- Base Class = SuperClass = ParentClass
- Derived Class = Subclass = ChildClass
---
## Example

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // own method
    }
}
```

---

## Benefits of Inheritance

- Promotes **code reusability**
- Reduces **code duplication**
- Improves **code maintainability**
- Supports **method overriding** for runtime polymorphism
- Enables **hierarchical classification** of classes
- Makes code more **organized and structured**
- Allows **extension of existing functionality** without modifying original code
- Helps in achieving **abstraction and polymorphism**

---

## Types of Inheritance in Java
### 1. Single Inheritance
- One class inherits from another

```java
class A {}
class B extends A {}
```

---

### 2. Multilevel Inheritance
- A class inherits from a class which itself is inherited from another class

```java
class A {}
class B extends A {}
class C extends B {}
```
---

### 3. Hierarchical Inheritance
- Multiple classes inherit from the same parent class

```java
class A {}
class B extends A {}
class C extends A {}
```
 ### ❌ Multiple Inheritance (Not Supported with Classes)
- Java does **not support multiple inheritance using classes**
- A class cannot extend more than one class

```java
// Not allowed
class C extends A, B {}
```
---
## Why Multiple Inheritance is Not Supported?
- To avoid **ambiguity (Diamond Problem)**
- To maintain **simplicity and clarity**

---
### Inheritance with Interfaces
- Java supports multiple inheritance using **interfaces**

```java
interface A {}
interface B {}

class C implements A, B {}
```
---

### super Keyword
- Used to refer to **parent class members**
- Used to call **parent constructor**

```java
class A {
    A() {
        System.out.println("Parent constructor");
    }
}

class B extends A {
    B() {
        super();  // calls parent constructor
        System.out.println("Child constructor");
    }
}
```
---

### Method Overriding
- Child class can **override** parent class methods
- Same method name, same parameters

```java
class A {
    void show() {
        System.out.println("Parent");
    }
}

class B extends A {
    void show() {
        System.out.println("Child");
    }
}
```
---

### Constructor and Inheritance (Execution Flow)
Parent constructor is called **before child constructor**
- `super()` is **implicitly added by compiler**

```java
class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B constructor");
    }
}
```
Output :

```
A constructor
B constructor
```
---

## Important Points

- Inheritance promotes **code reuse**
- Child class can access:
    - `public`
    - `protected`
- `private` members are **not accessible directly**
- Java supports:
    - Single inheritance
    - Multilevel inheritance
    - Hierarchical inheritance
- Multiple inheritance is supported via **interfaces only**
- Constructor execution follows **parent → child order**
- Method overriding enables **runtime polymorphism**