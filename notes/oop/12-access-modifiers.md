# Access Modifiers in Java

## What are Access Modifiers?

- Access modifiers are **keywords used to control the visibility (accessibility)** of classes, methods, variables, and constructors
- They help enforce **encapsulation and data hiding**
- They define **where a member can be accessed from**

---

## Types of Access Modifiers

Java provides **four types of access modifiers**:

1. `private`
2. `default` (no keyword, means absence of other three modifiers)
3. `protected`
4. `public`

---

# Access Modifiers For Members (methods,variables)

## 1. private

- Accessible **only within the same class**
- Cannot be accessed from **outside the class**

```java
class Test {
    private int x = 10;

    void show() {
        System.out.println(x);
    }
}
```
### 2. Default (Package-Private)

- **No keyword** is used
- Accessible **within the same package only**

```java
class Test {
    int x = 10;   // default access
}
```
### 3. protected

- Accessible within:
    - The **same package**
    - **Subclasses (child classes)** in other packages
```java
class Test {
    protected int x = 10;
}
```

### 4. public

- Accessible **from anywhere**
- No **access restriction**
```java
public class Test {
    public int x = 10;
}
```
---
## Accessibility Table For Members (methods,variables)

| Modifier | Same Class | Same Package | Subclass (Other Package) | Other Packages |
|----------|------------|--------------|---------------------------|----------------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |


---
# Access Modifiers for Classes

- There are **only two possibilities** for a top-level class in Java:
    - `public` class
    - **default** class (no modifier)

- `private` and `protected` **cannot be applied to top-level classes**
but can be applied to **inner classes** (classes defined inside another class)
- There can be **only one public class in a single Java file**

- The **name of the Java file must be the same as the name of the public class**

Example:

```java
public class Test {
}
```
File name:
`Test.java`

- Only a **public class** can be accessed **directly from outside the package**
---
## Important Points

- `private` members are accessible **only inside the class**
- `default` access works **within the same package**
- `protected` allows access in **subclasses**
- `public` allows access **everywhere**
- Access modifiers are used to implement **encapsulation**
