# Method Overloading, Overriding, and Method Hiding in Java

---

## Method Name, Signature, and Prototype

### Method Name

- The **name of the method**
- Example: `show`, `add`, `print`

---

### Method Signature

- Method signature = **method name + parameter list**
- Parameter list includes:
    - Number of parameters
    - Type of parameters
    - Order of parameters
- **Return type is NOT part of method signature**

```java
void show(int x)        // signature: show(int)
void show(int x, int y) // signature: show(int, int)
```
---

### Method Prototype
- Method prototype = **method signature + return type**
```
int add(int a, int b)
```
---

## 1. Method Overloading

### What is Method Overloading?

- Defining **multiple methods with the same name**
- Methods must differ in:
    - Number of parameters
    - Type of parameters
    - Order of parameters
- Achieved at **compile time (compile-time polymorphism)**

---

### Rules of Overloading

- Method name must be **same**
- Parameter list must be **different**
- Return type alone **cannot differentiate methods**

```java
int add(int a, int b);
double add(int a, int b); // ❌ Not allowed
```
---
## Types of Overloading

### 1. By Number of Parameters

```java
class Test {
    void show() {}
    void show(int x) {}
}
```
---
### 2. By Data Type

```java
class Test {
    void show(int x) {}
    void show(double x) {}
}
```
---
### 3. By Order of Parameters

```java
class Test {
    void show(int x, double y) {}
    void show(double y, int x) {}
}
```
---

## Overloading with Inheritance
- Overloading can happen **across parent and child classes**
- It depends on **method signature**, not inheritance

```java
class A {
    void show(int x) {
        System.out.println("A: int");
    }
}

class B extends A {
    void show(String s) {
        System.out.println("B: String");
    }
}
```
---
## Overloading + Overriding Together

```java
class A {
    void show(int x) {
        System.out.println("Parent");
    }
}

class B extends A {
    void show(int x) {        // overriding
        System.out.println("Child");
    }

    void show(double x) {     // overloading
        System.out.println("Overloaded");
    }
}
```
---
## Method Resolution Priority

```
1. Exact match
2. Widening (type promotion)
3. Autoboxing
4. Varargs
```
---
## Type Promotion Example

```java
void show(int x) {}
void show(double x) {}

show(10);   // int version
show(10.5); // double version
```
---
## Tricky Cases (Important)

### 1. Ambiguity

```java
void show(int a, double b) {}
void show(double a, int b) {}

show(10, 20); // ❌ ambiguous
```
---
### 2. Autoboxing vs Widening

```java
void show(Integer x) {}
void show(long x) {}

show(10); // prefers widening → long
```
---

### 3. Varargs

```java
void show(int... x) {}
void show(int x) {}

show(10); // exact match preferred
```
---

## Important Points (Overloading)

- Resolved at **compile time**
- Based on **method signature**
- Can occur in:
    - Same class
    - Parent-child classes
- Improves **readability and flexibility**

---

## 2. Method Overriding

### What is Method Overriding?

- Redefining a **parent class method in child class**
- Method signature must be **same**
- Achieved at **runtime (runtime polymorphism)**

---

## Why Method Overriding?

- When a **subclass wants to modify the behavior** of a method defined in the superclass
- The subclass **overrides the superclass method**

- To modify a class → use **inheritance (`extends`)**
- To modify behavior → use **method overriding**

---

## How Overriding Works (Runtime Concept)

- Overridden methods in Java are **dynamically bound**
- This means method calls are resolved at **runtime**
- Therefore, Java does **not require a `virtual` keyword** like C++
- Method execution depends on the **actual object type**, not the reference type

```java
class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

A obj = new B();
obj.show(); // Output: B
```

---

### Rules of Overriding

- Method signature must be **same**
- Return type must be:
    - Same OR
    - Covariant (subclass type)
- Access modifier can be:
    - Same OR
    - More permissive  
      (`private → default → protected → public`)
- Cannot override:
    - `final` methods
    - `static` methods
    - `private` methods
---

### Runtime Behavior

```java
A obj = new B();
obj.show(); // Child version (runtime polymorphism)
```
- Method call depends on **object type**, not reference type

---
### Important Points (Overriding)

- Happens between **parent and child**
- Supports **runtime polymorphism**
- Uses **dynamic method dispatch**
- Access modifier can be:
    - Same OR
    - More permissive

---

## 3. Method Hiding

### What is Method Hiding?

- Occurs when a **static method in parent** is redefined in child
- Method is **hidden**, not overridden

---

### Example

```java
class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}
```
---

### Behavior

```java
A obj = new B();
obj.show(); // A (based on reference type)
```
---

### Important Points (Hiding)
- Applies only to **static methods**
- Resolved at **compile time**
- Depends on **reference type**
- Static methods are **not overridden**

---
## Difference Table

| Feature      | Overloading         | Overriding   | Hiding       |
|--------------|---------------------|--------------|--------------|
| Occurs in    | Same / Parent-Child | Parent-Child | Parent-Child |
| Method Type  | Instance            | Instance     | Static       |
| Signature    | Must differ         | Must be same | Must be same |
| Binding      | Compile-time        | Runtime      | Compile-time |
| Polymorphism | Compile-time        | Runtime      | ❌            |


---
## Final Takeaways

- Overloading → same method name, **different parameters**
- Overriding → **runtime behavior change** (same method, different implementation)
- Hiding → **static method behavior** (not overridden, only hidden)
- Overloading depends on **method signature**
  - Overriding depends on **inheritance + runtime**