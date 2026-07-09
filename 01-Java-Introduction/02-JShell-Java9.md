# JShell in Java 9

## What is JShell?

**JShell** is an interactive tool that allows developers to write and execute Java code **line by line** without creating a complete Java class, compiling manually, or running a program separately.

JShell was introduced in **Java SE 9**.

It is officially known as:

```text
Java REPL (Read-Eval-Print Loop)
```

REPL means:

- **Read** → Takes user input
- **Evaluate** → Executes the code
- **Print** → Displays the result
- **Loop** → Repeats the process

---

# Before Java 9

Before JShell, to test Java code:

1. Create a `.java` file
2. Write a class
3. Write the `main()` method
4. Compile using `javac`
5. Run using `java`

Example:

```java
class Demo {

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }
}
```

Compile:

```bash
javac Demo.java
```

Run:

```bash
java Demo
```

---

# With JShell

You can directly type:

```java
System.out.println("Hello Java");
```

Output:

```text
Hello Java
```

No class, main method, or manual compilation required.

---

# Why JShell is Useful?

JShell is helpful for:

- Quickly testing Java code snippets
- Learning Java interactively
- Trying Java APIs
- Testing small logic
- Experimenting with new Java features
- Checking syntax quickly

---

# Starting JShell

Open Command Prompt or Terminal.

Type:

```bash
jshell
```

Output:

```text
| Welcome to JShell -- Version 9
| Type /help for help
```

Now you can start writing Java code.

---

# Basic JShell Examples

## 1. Simple Calculation

Input:

```java
jshell> 10 + 20
```

Output:

```text
$1 ==> 30
```

Explanation:

JShell automatically stores results in temporary variables like:

```text
$1
$2
$3
```

---

# 2. Variable Declaration

Input:

```java
jshell> int x = 5;
```

Output:

```text
x ==> 5
```

Now use the variable:

```java
jshell> x * 2
```

Output:

```text
$2 ==> 10
```

---

# 3. Creating Methods

Input:

```java
jshell> int square(int n) {
   ...> return n * n;
   ...> }
```

Output:

```text
created method square(int)
```

Calling method:

```java
jshell> square(4)
```

Output:

```text
$3 ==> 16
```

---

# 4. Using Java Classes

Example:

```java
jshell> String name = "Java";
```

Output:

```text
name ==> "Java"
```

Calling String methods:

```java
jshell> name.toUpperCase()
```

Output:

```text
$4 ==> "JAVA"
```

---

# Useful JShell Commands

| Command | Description |
|-------|-------------|
| `/help` | Shows JShell help |
| `/list` | Displays entered code |
| `/edit` | Edit previous snippets |
| `/reset` | Clears current session |
| `/exit` | Exit JShell |

---

# Example

```bash
jshell> /list
```

Shows:

```text
1 : int x = 5;
2 : String name = "Java";
```

---

# Key Idea of JShell

JShell removes Java boilerplate code:

Before:

```java
class Test {

    public static void main(String args[]) {

    }
}
```

After:

```java
int a = 10;
System.out.println(a);
```

Focus directly on logic.

---

# Before Java 9 vs JShell

| Before Java 9 | With JShell |
|--------------|-------------|
| Write complete class | Write code directly |
| Need main method | No main method needed |
| Compile manually | Automatic compilation |
| Run manually | Instant execution |
| Slower testing | Faster experimentation |

---

# Quick Summary

```text
JShell
   |
   |-- Introduced in Java 9
   |
   |-- Java REPL Tool
   |
   |-- Execute code instantly
   |
   |-- No class/main required
   |
   |-- Useful for learning and testing
```

---

## One-Line Definition

**JShell is a Java 9 interactive REPL tool that allows developers to execute Java statements immediately without creating, compiling, and running a complete Java program.**