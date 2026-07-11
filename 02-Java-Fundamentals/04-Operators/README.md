# Operators in Java

## 🔹 What are Operators in Java?

Operators are special symbols used to perform operations on variables and values.

👉 Example:

```java
int a = 10 + 5;   // + is an operator
```

---

## 🔹 Types of Operators in Java

```text
Operators
 ├── Arithmetic
 ├── Relational (Comparison)
 ├── Logical
 ├── Assignment
 ├── Unary
 ├── Bitwise
 └── Ternary
```

---

## 🔸 1. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning | Example |
|----------|---------|---------|
| + | Addition | `a + b` |
| - | Subtraction | `a - b` |
| * | Multiplication | `a * b` |
| / | Division | `a / b` |
| % | Modulus (Remainder) | `a % b` |

### Example

```java
int a = 10, b = 3;

System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

---

## 🔸 2. Relational (Comparison) Operators

Used to compare values → result is `true` or `false`.

| Operator | Meaning |
|----------|---------|
| == | Equal to |
| != | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal to |
| <= | Less than or equal to |

### Example

```java
System.out.println(10 > 5); // true
```

---

## 🔸 3. Logical Operators

Used with boolean values.

| Operator | Meaning |
|----------|---------|
| && | Logical AND |
| \|\| | Logical OR |
| ! | Logical NOT |

### Example

```java
boolean a = true;
boolean b = false;

System.out.println(a && b); // false
```

---

## 🔸 4. Assignment Operators

Used to assign values.

| Operator | Example | Meaning |
|----------|---------|---------|
| = | `a = 5` | Assign |
| += | `a += 2` | `a = a + 2` |
| -= | `a -= 2` | `a = a - 2` |
| *= | `a *= 2` | `a = a * 2` |
| /= | `a /= 2` | `a = a / 2` |

---
## 🔸 5. Unary Operators

Work on one operand.

| Operator | Meaning |
|----------|---------|
| + | Positive |
| - | Negative |
| ++ | Increment |
| -- | Decrement |
| ! | Logical NOT |

### Example

```java
int x = 5;

x++;

System.out.println(x); // 6
```

---

## 🔸 6. Bitwise Operators

Operate on binary bits.

| Operator | Meaning |
|----------|---------|
| & | AND |
| \| | OR |
| ^ | XOR |
| ~ | NOT |
| << | Left Shift |
| >> | Right Shift |

### Example

```java
int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b); // 0001 → 1
```

---

## 🔸 7. Ternary Operator

Shortcut for `if-else`.

### Syntax

```java
condition ? value1 : value2;
```

### Example

```java
int a = 10, b = 20;

int max = (a > b) ? a : b;
```

---

## 🔹 Operator Precedence (Simple Idea)

👉 Some operators run before others.

```text
Highest Priority

*, /, %

↓

+, -

Lowest Priority
```

---

## 🔹 Quick Summary

- Arithmetic → Math
- Relational → Compare values
- Logical → True/False logic
- Assignment → Assign values
- Unary → Single operand
- Bitwise → Binary operations
- Ternary → Short form of if-else

---

## 🔹 Example Programs

The following Java programs are available in this folder.

### 📄 ArithmeticOperatorsDemo.java

Demonstrates:

- Addition
- Subtraction
- Multiplication
- Division
- Modulus

---

### 📄 RelationalOperatorsDemo.java

Demonstrates:

- Equality and inequality
- Greater than / Less than
- Greater than or equal to
- Less than or equal to

---

### 📄 LogicalOperatorsDemo.java

Demonstrates:

- Logical AND
- Logical OR
- Logical NOT

---

### 📄 AssignmentOperatorsDemo.java

Demonstrates:

- Assignment operator
- Compound assignment operators

---

### 📄 UnaryOperatorsDemo.java

Demonstrates:

- Increment
- Decrement
- Unary plus
- Unary minus
- Logical NOT

---

### 📄 BitwiseOperatorsDemo.java

Demonstrates:

- Bitwise AND
- Bitwise OR
- Bitwise XOR
- Bitwise NOT
- Left Shift
- Right Shift

---

### 📄 TernaryOperatorDemo.java

Demonstrates:

- Ternary operator
- Finding the maximum of two numbers
- Replacing simple if-else statements

---

## 🔹 How to Execute

Compile all programs:

```bash
javac *.java
```

Or compile individual programs:

```bash
javac ArithmeticOperatorsDemo.java
javac RelationalOperatorsDemo.java
javac LogicalOperatorsDemo.java
javac AssignmentOperatorsDemo.java
javac UnaryOperatorsDemo.java
javac BitwiseOperatorsDemo.java
javac TernaryOperatorDemo.java
```

Run any program:

```bash
java ArithmeticOperatorsDemo
java RelationalOperatorsDemo
java LogicalOperatorsDemo
java AssignmentOperatorsDemo
java UnaryOperatorsDemo
java BitwiseOperatorsDemo
java TernaryOperatorDemo
```

---

## 🔹 One-Line Exam Definition

👉 **Operators in Java are symbols used to perform operations on variables and values, such as arithmetic, comparison, logical, assignment, unary, bitwise, and ternary operations.**