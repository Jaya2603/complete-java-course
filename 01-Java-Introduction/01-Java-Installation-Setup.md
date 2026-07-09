# Java Installation and Environment Setup

## 1. Installing Required Tools

To start Java development, install the following tools.

### IDE (Integrated Development Environment)

You can use any one of the following:

- Visual Studio Code (VS Code)
- Eclipse
- IntelliJ IDEA

---

## 2. Install JDK (Java Development Kit)

JDK contains all the tools required to develop and run Java applications.

Before installing:

- Check for **LTS (Long Term Support)** versions
- Prefer stable versions like Java 17 or Java 21 LTS

Download JDK from:

- Oracle JDK
- OpenJDK distributions (Example: Adoptium)

Example installation location:

```text
C:\Program Files\Java\jdk-21
```

---

# Java Version Check

After installation, verify Java using Command Prompt.

## Check Java Runtime Version

```bash
java --version
```

Example:

```text
java 21.x.x
```

---

## Check Java Compiler Version

```bash
javac --version
```

`javac` is the Java compiler that converts `.java` files into `.class` bytecode files.

Example:

```text
javac 21.x.x
```

---

# Setting Java JDK Path in Windows

Setting the Java path means configuring:

1. `JAVA_HOME` variable
2. Updating the system `Path`

This allows Java commands to work from anywhere in the terminal.

---

# Step 1: Install JDK

Install the Java Development Kit.

Example installation path:

```text
C:\Program Files\Java\jdk-21
```

---

# Step 2: Open Environment Variables

Follow these steps:

1. Press:

```text
Windows + S
```

2. Search:

```text
Environment Variables
```

3. Select:

```text
Edit the system environment variables
```

4. In the **System Properties** window:

```text
Advanced → Environment Variables
```

---

# Step 3: Create JAVA_HOME Variable

Under **System Variables**:

Click:

```text
New
```

Add:

### Variable Name

```text
JAVA_HOME
```

### Variable Value

Add your JDK installation path:

```text
C:\Program Files\Java\jdk-21
```

Click **OK**.

---

# Step 4: Update System Path

Under **System Variables**:

1. Select:

```text
Path
```

2. Click:

```text
Edit
```

3. Click:

```text
New
```

4. Add:

```text
%JAVA_HOME%\bin
```

5. Save all changes.

---

# Step 5: Verify Java Setup

Restart Command Prompt.

Run:

```bash
java --version
```

and:

```bash
javac --version
```

If installation is successful, Java version details will appear.

---

# Common Mistakes to Avoid

❌ Adding `bin` folder inside JAVA_HOME

Wrong:

```text
JAVA_HOME=C:\Program Files\Java\jdk-21\bin
```

Correct:

```text
JAVA_HOME=C:\Program Files\Java\jdk-21
```

---

❌ Keeping old Java versions in Path

Remove old Java paths if they create conflicts.

---

❌ Not restarting terminal

Always close and reopen Command Prompt after updating environment variables.

---

# Quick Summary

| Component | Purpose |
|----------|---------|
| JDK | Develop Java applications |
| JVM | Runs Java bytecode |
| javac | Java compiler |
| JAVA_HOME | Points to JDK location |
| Path | Allows Java commands globally |

---

## Setup Completed

Your system is now ready for Java development.