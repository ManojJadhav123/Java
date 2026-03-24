# Initialization Blocks in Java

## What are Initialization Blocks?

- A block without a name inside a class is called an **initialization block**
- Initialization blocks are used to **initialize instance variables**
- They execute **automatically** when an object is created
- They run **before the constructor**
- Also called **Instance Initialization Blocks (IIB)**

---

## Syntax

```java
{
    // initialization code
}
```
---
## Example

```java
class Test {
    int x;

    {
        x = 10;
        System.out.println("Initialization Block");
    }

    Test() {
        System.out.println("Constructor");
    }
}
```
## Output
```java
Initialization Block
Constructor
```
---
## Execution Mechanism (Important Concept)

- You can write **multiple initialization blocks** in a class
- The **compiler combines all initialization blocks**
- This combined code is placed at the **beginning of each constructor**
- Since the code is placed inside constructors:
    - It executes **every time an object is created**
  
---

## Execution Order

1. Initialization Block
2. Constructor  

---
## Why Initialization Blocks are Used?

- Used to initialize the **common part of multiple constructors**
- Helps avoid **code duplication**
- Ensures **consistent initialization logic** across all constructors

---

## Important Points

- Executes **every time an object is created**
- Runs **before the constructor**
- Multiple initialization blocks are allowed
- Executed in the **order they appear in the class**
- Code is internally placed inside **constructors by the compiler**

# Static Block in Java

## What is a Static Block?

- A static block is a block of code that is declared using the `static` keyword
- It is used to **initialize static variables**
- It executes **only once**
- Runs when the **class is loaded into memory**
- Static block is used to initialize static variables or to perform **class-specific tasks**

---

## Syntax

```java
static {
    // static initialization code
}
```
---
## Example

```java
class Test {
    static int x;

    static {
        x = 100;
        System.out.println("Static Block Executed");
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
```
## Output

```java
Static Block Executed
100
```

## Execution Mechanism

- Static block runs when the **class is loaded by JVM**
- It executes **only once**, regardless of how many objects are created
- There is **no direct way to call a static block**
- It executes **automatically when the class is loaded into memory**
- You can define **multiple static blocks** in a class
- The **compiler combines multiple static blocks into one**
- If multiple static blocks are present, they execute in the **order they appear**

---

## Execution Order (Overall)

1. Static Block
2. Initialization Block
3. Constructor

---

## Why Static Blocks are Used?

- To initialize **static variables**
- To perform **one-time setup tasks**
- To perform **class-specific initialization logic**
- To load **resources or configurations**

---

## Important Points

- Static blocks execute **only once**, when the class is **initialized (not just loaded)**
- Class initialization happens when the class is **first actively used**
- Active use includes:
    - Creating an object of that class
    - Accessing static variables of that class
    - Calling static methods of that class

- Static block executes **at the point of first use of that class**, not necessarily before `main`
- Static blocks execute **before any static method (including `main`) of that same class is invoked**
- Static block execution is **class-specific**, not program-wide

- There is **no direct way to call a static block**
- Cannot access **instance variables directly**
- Can access only **static members directly**

- Multiple static blocks are allowed and execute in the **order they appear**