# Java Program Execution Flow

Java program execution flow explains the complete lifecycle of a Java program — from writing source code to execution on hardware.

---

# Java Execution Architecture

```text
  Java Code (.java)
        |
        ↓
  javac Compiler
        |
        ↓
  Bytecode (.class)
        |
        ↓
  Java Virtual Machine (JVM)
        |
        ↓
  Operating System (OS)
        |
        ↓
    Hardware
        |
        ↓
     Output
```

---

# 1. Java Source Code (.java File)

This is the program written by the developer.

Example:

```java
class Hello {

    public static void main(String[] args) {

        System.out.print("hi");

    }
}
```

The file is saved as:

```text
Hello.java
```

The source code is:

- Human-readable
- Written using Java syntax
- Not directly understood by the machine

---

# 2. Compilation Using javac Compiler

The Java compiler (`javac`) converts the Java source file into bytecode.

Command:

```bash
javac Hello.java
```

Conversion:

```text
   Hello.java
        |
        ↓
   Hello.class
```

The generated `.class` file contains **Java bytecode**.

---

# What is Bytecode?

Bytecode is an intermediate code generated after compilation.

Properties of bytecode:

- Not human-readable
- Not machine-specific
- Platform-independent
- Executed by JVM

Bytecode allows Java programs to run on different operating systems.

---

# 3. Java Bytecode (.class File)

Example:

```text
Hello.class
```

This file:

- Contains bytecode instructions
- Cannot directly execute on hardware
- Requires JVM for execution

Think of bytecode as a universal instruction format understood by JVM.

---

# 4. Java Virtual Machine (JVM)

JVM stands for:

```text
Java Virtual Machine
```

JVM is responsible for executing Java bytecode.

It acts as a middle layer between:

```text
Java Program
      |
      ↓
Operating System
```

---

# Responsibilities of JVM

Inside JVM:

### 1. Class Loader

Loads `.class` files into memory.

---

### 2. Bytecode Verifier

Checks bytecode for:

- Security issues
- Valid instructions

---

### 3. Execution Engine

Executes bytecode.

It contains:

- Interpreter
- JIT Compiler

---

## Interpreter

Reads bytecode line by line and executes it.

---

## JIT Compiler (Just-In-Time Compiler)

Converts frequently used bytecode into machine code for faster execution.

---

# 5. Operating System (OS)

The JVM runs on top of the operating system.

Examples:

- Windows
- Linux
- macOS

The OS manages:

- Memory
- Files
- Processes
- System resources

Java code does not directly communicate with the OS.

The JVM handles communication.

---

# 6. Hardware (HW)

The final execution happens on physical hardware.

Examples:

- CPU
- RAM
- Storage

Flow:

```text
Bytecode
    ↓
   JVM
    ↓
Machine Instructions
    ↓
CPU Execution
```

---

# Complete Execution Flow

```text
  Developer writes code
        ↓
  Hello.java
        ↓
  javac Compiler
        ↓
  Hello.class (Bytecode)
        ↓
       JVM
        ↓
  Operating System
        ↓
  Computer Hardware
        ↓
  Program Output
```

---

# Why Java is Platform Independent?

Java follows:

```text
Write Once, Run Anywhere (WORA)
```

Meaning:

Compile once:

```text
.java → .class
```

Run anywhere:

```text
Windows JVM
Linux JVM
macOS JVM
```

The same bytecode works on different systems because JVM handles platform differences.

---

# Important Commands

Compile Java program:

```bash
javac Hello.java
```

Run Java program:

```bash
java Hello
```

---

# Quick Summary

| Component | Purpose |
|----------|---------|
| `.java` | Source code written by developer |
| `javac` | Converts Java code into bytecode |
| `.class` | Contains bytecode |
| JVM | Executes bytecode |
| OS | Provides system resources |
| Hardware | Performs actual execution |

---

# One-Line Definition

**Java program execution is the process where Java source code is compiled into platform-independent bytecode, which is executed by the JVM on a specific operating system and hardware.**