# Wrapper Classes in Java


## Why Java is Not a Pure Object-Oriented Language?

- Java is an **object-oriented programming language**, and it is often said that **everything in Java is an object**
- However, Java also supports **primitive data types**  
  (because using objects for simple tasks like **loops or arithmetic calculations** would add unnecessary overhead)

### Example

```java
int x = 10;
```
- Here, `x` is a **primitive variable**, not an object
- You cannot access methods or properties on it like:

```java
x.something   // ❌ not possible
```
- Objects can contain **methods, constructors, and properties**
- Primitive types do **not have methods or object behavior**
- Therefore, primitive types are somewhat **outside the object model**
- They cannot participate in **object-oriented activities directly**
- Because Java contains **primitive data types**, it is **not considered a pure or 100% object-oriented language**
- As a solution to this problem, Java allows primitives to participate in the **object world** using **wrapper classes**
- A **wrapper class** provides an **object representation of a primitive data type**
- There is a corresponding **wrapper class for every primitive data type** in Java
---
## What are Wrapper Classes?

- Wrapper classes are used to **convert primitive data types into objects**
- Wrapper classes are part of the **`java.lang` package**
- They allow primitive values to be used where **objects are required**

---

## Why Wrapper Classes are Needed?

- Java **Collections Framework** works only with **objects**
- To convert primitives into objects
- To perform **utility operations** on primitive values
- To support **autoboxing and unboxing** as wrapper classes are used to convert primitive types into object and vice-versa

---

## Primitive Types and Their Wrapper Classes

| Primitive Type | Wrapper Class |
|----------------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

## Creating Wrapper Objects

### Using Constructor (Deprecated)

```java
Integer a = new Integer(10);
```

> ❌ Not recommended because **wrapper class constructors are deprecated**


### Using `valueOf()` Method (Recommended)

```java
Integer a = Integer.valueOf(10);
```
- `valueOf()` is a **static method** of the **`Integer` class**
- It returns the **object reference of the corresponding wrapper class**
- Basically, this method **creates a wrapper object and returns its reference**
- This is an **explicit conversion** from **primitive to wrapper object** by this method
---
### Using Autoboxing

```java
Integer a = 10;   // primitive → object
```

## Autoboxing

- **Autoboxing** is the automatic conversion of a **primitive data type into its corresponding wrapper object**
- This conversion is performed automatically by the **Java compiler**

```java
int x = 10;
Integer y = x;   // autoboxing
```
---

## Unboxing

- **Unboxing** is the automatic conversion of a **wrapper object into its corresponding primitive data type**
- This conversion is performed automatically by the **Java compiler**

```java
Integer a = 20;
int b = a;   // unboxing
```

### Explicit Conversion and Unboxing

```java
Integer i1 = new Integer(20);

int a = i1.intValue();   // explicit conversion
int b = i1;              // unboxing
```

- `intValue()` is an **instance method** of the **`Integer` wrapper class**
- It returns the **primitive value** stored inside the wrapper object
- This is called **explicit conversion** from **wrapper object to primitive type**
- `int b = i1;` is **unboxing**, where the **compiler automatically converts** the wrapper object to a primitive
---
## Common Wrapper Class Methods
```java
Integer.parseInt("123");       // String → int
Double.parseDouble("10.5");    // String → double
Boolean.parseBoolean("true");  // String → boolean
Character.isDigit('5');        // checks if character is digit
```

---

## Wrapper Classes and Immutability

- Wrapper class objects are **immutable**
- Once created, their **value cannot be changed**

```java
Integer a = 10;
a = 20;   // actually creates a new object
```

---
## Important Points

- Wrapper classes convert **primitive values into objects**
- Used heavily in **collections** and **generics**
- Wrapper objects are **immutable**
- **Autoboxing and unboxing** simplify primitive-object conversion
---

## Operator Overloading in Java

- Java **does not support operator overloading**
- You cannot define custom behavior for operators for user-defined classes

### Example

Assume there is a class `Box` and two objects:

```java
Box b1 = new Box();
Box b2 = new Box();

b1 + b2;   // ❌ Not allowed
b1 > b2;   // ❌ Not allowed
```
- In **C++**, we could have defined the `'+'` operator inside the `Box` class to perform operations on its objects
- However, in **Java**, this is **not possible** because Java does **not support operator overloading for user-defined classes**

> Note: The `+` operator works with **strings** in Java because it is specially handled by the **compiler for string concatenation**, not because Java supports general operator overloading.  
> Also, **wrapper classes** can work with operators due to **autoboxing and unboxing**, which convert between primitives and objects automatically.