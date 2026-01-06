# Operators in Java

## What is an Operator?

- An operator is a **symbol** that performs an **operation** on one or more operands
- Operators are used to manipulate variables and values

---

## Types of Operators in Java

Java provides the following types of operators:

- Arithmetic Operators
- Relational Operators
- Logical Operators
- Assignment Operators
- Unary Operators
- Bitwise Operators
- Ternary Operator
- instanceof Operator

---

## 1. Arithmetic Operators

Used to perform mathematical operations.

| Operator | Description |
|---------|-------------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus |

```java
int a = 10;
int b = 3;
int sum = a + b;
int mod = a % b;
```
## 2. Relational Operators

- Used to compare two values
- The result of a relational operation is a **boolean** (`true` or `false`)

| Operator | Description |
|----------|-------------|
| `==` | Equal to |
| `!=` | Not equal to |
| `>`  | Greater than |
| `<`  | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

```java
int x = 10;
int y = 20;
boolean result = x < y;
```

## 3. Logical Operators

- Used to combine or manipulate **boolean expressions**
- The result of a logical operation is a **boolean**

| Operator | Description   |
|----------|---------------|
| `&&`     | Logical AND   |
| `\|\|`   | Logical OR    |
| `!`      | Logical NOT   |


```java
boolean a = true;
boolean b = false;

boolean result1 = a && b;
boolean result2 = a || b;
boolean result3 = !a;
```

## 4. Assignment Operators

- Used to **assign values** to variables
- Can also perform an operation and assignment in a **single step**

| Operator | Description |
|----------|-------------|
| `=`  | Assign |
| `+=` | Add and assign |
| `-=` | Subtract and assign |
| `*=` | Multiply and assign |
| `/=` | Divide and assign |
| `%=` | Modulus and assign |

```java
int a = 10;
a += 5;   // a = a + 5
a -= 2;   // a = a - 2
a *= 3;   // a = a * 3
a /= 4;   // a = a / 4
a %= 2;   // a = a % 2
```

## 5. Unary Operators

- Operate on a **single operand**
- Used to modify the value of a variable or a boolean expression

| Operator | Description |
|----------|-------------|
| `+`  | Unary plus |
| `-`  | Unary minus |
| `++` | Increment |
| `--` | Decrement |
| `!`  | Logical NOT |

```java
int a = 5;

int b = +a;   // Unary plus
int c = -a;   // Unary minus

a++;          // Increment
a--;          // Decrement

boolean flag = true;
boolean result = !flag;
```
## 6. Bitwise Operators

- Operate on the **binary representation** of integer values
- Work at the **bit level**
- Applicable to integer types (`byte`, `short`, `int`, `long`)

| Operator | Description |
|----------|-------------|
| `&`      | Bitwise AND |
| `\|`     | Bitwise OR |
| `^`      | Bitwise XOR |
| `~`      | Bitwise NOT |
| `<<`     | Left shift |
| `>>`     | Right shift |
| `>>>`    | Unsigned right shift |

```java
int a = 5;   // 0101
int b = 3;   // 0011

int andResult = a & b;   // 0001 -> 1
int orResult  = a | b;   // 0111 -> 7
int xorResult = a ^ b;   // 0110 -> 6
int notResult = ~a;      // bitwise NOT

int leftShift  = a << 1; // 1010 -> 10
int rightShift = a >> 1; // 0010 -> 2
```
## 7. Ternary Operator

- Also called the **conditional operator**
- Used as a **short form of if–else**
- It is the **only operator with three operands**

### Syntax

```java
condition ? value_if_true : value_if_false;
```
- Example:
```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;
```

## 8. instanceof Operator

- Used to check whether an object belongs to a **specific class or interface**
- Returns a **boolean** value (`true` or `false`)
- Helps in **runtime type checking**

### Example

```java
String str = "Java";
boolean result = str instanceof String;
```
## Important Points

- Operators work on **operands**
- Result depends on the **type of operator**
- **Operator precedence** affects the order of evaluation

