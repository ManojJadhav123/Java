# Memory Management in Java

## What is Memory Management?

- Memory management is the process of **allocating and deallocating memory**
- Java handles memory management **automatically**
- Developers do not need to manually allocate or free memory

---

## Why Memory Management is Important?

- Efficient use of memory
- Prevents memory leaks
- Improves application performance
- Ensures program stability

---

## JVM Memory Areas

Java memory is divided into the following areas:

### 1. Heap Memory

- Stores **objects** and **instance variables**
- Shared among all threads
- Memory is allocated at **runtime**
- Managed by the **Garbage Collector**

```java
Student s = new Student(); // object stored in heap
```
---
### 2. Stack Memory

- Stores **method calls**, **local variables**, and **reference variables**
- Each thread has its **own stack**
- Memory is **allocated and deallocated automatically**
- Faster than **heap memory**

```java
void show() {
    int x = 10;   // local variable stored in stack
}
```
---
### 3. Method Area (Class Area)

- Stores **class-level data**
- Includes:
    - **Class metadata**
    - **Static variables**
    - **Method bytecode**
- Shared among **all threads**

---

### 4. Program Counter (PC) Register

- Stores the address of the **currently executing instruction**
- Each thread has its **own PC register**

---

### 5. Native Method Stack

- Used to execute **native methods** (written in C/C++)
- Supports execution of **non-Java code**

---
## Object Creation Flow
```java
Student s = new Student();
```
- Class is loaded into the **method area**
- Memory for the object is allocated in the **heap**
- Reference variable is created in the **stack**
- Reference variable points to the **object in the heap**

---

## Garbage Collection (GC)

- The **Garbage Collector (GC)** is a part of the **JVM**
- Its job is to **release memory** of **unreferenced objects** from the **heap**
- Java follows **automatic memory management**

---

## Automatic Garbage Collection

- Automatic Garbage Collection is the process of:
    - Scanning the **heap memory**
    - Identifying which objects are **in use**
    - Identifying which objects are **no longer referenced**
    - Deleting the **unused objects**
- Objects with **no active references** are eligible for GC
- Garbage Collection runs **automatically in the background**
- Developers **cannot force** garbage collection execution

---

## Memory Leak in Java

- Occurs when objects are **no longer used but still referenced**
- Prevents **garbage collection**
- Leads to **excessive memory usage**

---

## Important Points

- Java follows **automatic memory management**
- Objects are stored in the **heap**
- References and local variables are stored in the **stack**
- Garbage Collector **does not release memory of reference variables**
- It only releases the **memory occupied by objects** in the **heap**
- Reference variables stored in the **stack** are removed automatically when their **scope ends**
- Static data is stored in the **method area**
- GC helps prevent **memory leaks**, but cannot eliminate them completely
- Poor reference handling can still cause **memory leaks**
- Garbage Collection improves application **performance and stability**
- Understanding memory helps write **efficient and bug-free code**


## Garbage Collection Phases

### Step 1: Marking

- Marking is the process of identifying **objects that are no longer in use**
- During this phase, **all objects in the heap are scanned**
- Objects that are **reachable (in use)** are marked
- Objects that are **not reachable** are considered unused
- This process can be **time-consuming**, especially for large heap sizes

---

### Step 2: Normal Deletion

- In this phase, **unreferenced (unused) objects are removed** from the heap
- The **memory allocator** keeps track of the freed memory spaces
- These free memory locations are reused for **new object allocations**

### Step 3: Deletion with Compacting

- In addition to deleting unused objects, the GC also performs **compacting**
- Referenced (live) objects are **moved together**
- This removes **memory fragmentation**
- Frees up a **large contiguous block of memory**
- This ensures that a **contiguous block of memory** is created, which can be **efficiently used for future allocations**
- Improves future **memory allocation efficiency**
