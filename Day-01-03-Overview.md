# Java Learning Journey — Day 01 to Day 03

The first three sessions built the foundation for understanding Java — starting with what Java is, moving into how Java source code is compiled and executed, and then understanding how Java programs are organised using classes and methods.

---

## Day 01 — Java Foundation

Day 01 started with the basics of programming and an introduction to Java.

### What I Learned

- What a programming language is
- What Java is
- How Java is used to give instructions to a computer or machine
- Java syntax, grammar and rules
- Important features of Java
- Object-Oriented Programming
- Platform Independence
- Write Once, Run Anywhere (WORA)
- Garbage Collection
- Security-related features
- JIT Compiler
- Why Java is widely used
- Basic Java setup and version check
- Java class structure
- Meaningful class names
- Class naming convention
- `main()` method
- Basic program structure
- Source file and source code

### Java Features Discussed

| Feature | Understanding |
|---|---|
| Object-Oriented | Works with objects representing real-world entities. |
| Platform Independent | Java bytecode can run on supported platforms. |
| Garbage Collection | Automatically reclaims memory from objects that are no longer needed. |
| Secure | Java provides security-related features. |
| JIT Compiler | Helps improve execution performance. |
| Widely Used | Java has broad industry adoption. |

### Platform Independence

A platform refers to an operating system such as Windows, Linux or macOS.

Java follows the idea of:

```text
Write Once, Run Anywhere
```

The basic idea discussed in class was:

```text
Java Source Code
       ↓
    Compiler
       ↓
    Bytecode
       ↓
Supported Platform
```

The important point is that Java bytecode is platform independent.

### Garbage Collection

Garbage Collection automatically reclaims memory occupied by objects that are no longer needed.

```text
Objects Created
      ↓
Memory Occupied
      ↓
Objects Become Unused
      ↓
Garbage Collector
      ↓
Memory Reclaimed
```

The classroom explanation compared this with cleaning unwanted items from a house so that the space can be used again.

### Java Setup

The Java installation was checked using:

```bash
java -version
```

For the course setup, Java 8 or above was accepted.

### Java Class

Java code is written inside a class.

```java
class HelloWorld
{
    // class contents
}
```

The curly braces define the class boundary.

A class name should be meaningful and should match the purpose or functionality of the class.

### Class Naming Convention

Class names follow **PascalCase**.

Examples:

```text
HelloWorld
PaymentInfo
UserManagement
```

### First Java Program

The first practical program was a simple `HelloWorld` program using the `main()` method and `System.out.println()`.

The class and method boundaries were also explained using a house-and-room analogy: the class forms the larger boundary, while a method has its own boundary inside the class.

### Day 01 Takeaway

The first session established the basic picture of Java: what the language is, its important features, how Java remains platform independent, and the basic structure of a Java program.

---

## Day 02 — Java Compilation & Execution

Day 02 focused on what happens after Java source code is written.

The main idea was to understand the journey from source code to the final program output.

### Java Program Flow

```text
Developer
    ↓
.java Source File
    ↓
javac Compiler
    ↓
.class Bytecode
    ↓
java Command
    ↓
JVM
    ↓
CPU
    ↓
Output
```

### Source Code

The Java program written by the developer is called the **source code** or **source file**.

The Java source file uses the:

```text
.java
```

extension.

Example:

```text
Welcome.java
```

### Compilation

The compiler checks the source code against Java syntax, standards and rules.

The compiler command is:

```bash
javac Welcome.java
```

If the source code is valid, compilation produces bytecode.

If compilation fails, the `.class` file is not generated.

### Bytecode

The output of successful Java compilation is bytecode.

Bytecode is stored in a:

```text
.class
```

file.

```text
.java
  ↓
javac
  ↓
.class
```

The `.class` file contains the bytecode that is supplied to the JVM for execution.

### JVM — Java Virtual Machine

The JVM runs Java bytecode.

The `java` command starts the JVM and specifies which class should be executed.

Example:

```bash
java Greeting
```

The selected class needs a `main()` method for normal application execution to start.

### Compilation vs Execution

Java program processing was divided into two phases.

**Compilation**

- Checks syntax and Java rules
- Generates bytecode

**Execution**

- JVM loads the bytecode
- JVM starts execution from the selected class's `main()` method
- Program produces the expected output

The simple flow is:

```text
WRITE → COMPILE → RUN → OUTPUT
```

### Java Class & Case Sensitivity

Java is case-sensitive.

A class uses:

- `class` keyword
- Class name
- Opening curly brace `{`
- Closing curly brace `}`

Everything written inside those braces belongs to that class.

### main() — Entry Point

The `main()` method is the normal entry point for starting execution of a Java application.

```java
public static void main(String[] args)
{
    // statements
}
```

When a class is selected for execution, the JVM looks for its `main()` method and starts execution from there.

### Statement & Semicolon

A Java statement is an instruction.

A semicolon terminates a statement.

Example:

```java
System.out.println("Hello");
```

The classroom explanation compared the semicolon with punctuation used to mark the end of a sentence.

### print() vs println()

`print()` keeps the next output on the same line.

`println()` prints the content and moves to the next line.

```java
System.out.print("A");
System.out.print("B");
```

Output:

```text
AB
```

Whereas:

```java
System.out.println("A");
System.out.println("B");
```

Output:

```text
A
B
```

### File Name vs Class Name

The compiler is given the **source file name**.

Example:

```bash
javac Welcome.java
```

The JVM is given the **class name** when running the program.

Example:

```bash
java Greeting
```

The `.java` or `.class` extension is not used with the class name in the `java` command.

### Public Class Rule

A Java source file can have at most one public class.

When a class is declared `public`, its name must match the source file name.

Example:

```text
Welcome.java
public class Welcome
```

### Multiple Classes

A single Java source file can contain multiple classes.

When multiple valid classes are compiled, each class can generate its own `.class` file.

```text
2 classes → 2 .class files
3 classes → 3 .class files
```

When running the program, the class name supplied to the JVM determines which class execution starts from, and that class needs a `main()` method.

### Recompile After Changes

If the source code changes, it needs to be compiled again.

```text
Changed .java
     ↓
RECOMPILE
     ↓
New .class
     ↓
Updated Output
```

Otherwise, the existing bytecode may still contain the older version of the program.

### Build — Industry Term

The class introduced the industry use of the term **build**.

The compilation/package process is often referred to as a build.

A common industry statement is:

```text
"The build is failing."
```

### Reading Errors

When an error occurs:

1. Read the error message.
2. Check the file name.
3. Check the line number.
4. Locate the problem.
5. Fix the source code.
6. Save the file.
7. Recompile.
8. Run again.

Example:

```text
Welcome.java : line 6
        ↓
semicolon expected
        ↓
fix
        ↓
recompile
```

### Real-Life Analogies

```text
Class      = House boundary
main()     = Entry gate
Compiler   = Grammar checker
```

The class boundary defines what belongs to the class, `main()` gives the JVM a starting point, and the compiler checks the source code against Java rules.

### Day 02 Takeaway

The second session connected the source code with the execution process:

```text
.java → javac → .class → JVM → Output
```

This made the difference between **writing, compiling and running** a Java program much clearer.

---

## Day 03 — Classes, Methods & Program Flow

Day 03 continued from the Java program structure and moved into classes, methods and execution flow.

### What I Learned

- Meaningful Java class names
- Class structure and boundaries
- `main()` method
- `public`
- `static`
- `void`
- Methods
- Method boundaries
- Method calling
- `String[] args`
- Statements
- Semicolon
- `print()` vs `println()`
- PascalCase
- camelCase
- Multiple classes in one Java file
- Compilation and execution
- Duplicate methods
- Requirement → Design/Decision → Development → Build → Test
- Repetition as a practice habit

### Class Structure

A class contains its own boundary.

```java
class AccountInfo
{
    // class contents
}
```

The opening `{` starts the class boundary and the closing `}` ends it.

The house analogy:

```text
House Boundary
┌─────────────────────────┐
│                         │
│       Rooms / Work      │
│                         │
└─────────────────────────┘
```

The Java equivalent:

```text
Class Boundary
{
    Methods and statements
}
```

### Meaningful Names

A class name should clearly represent its functionality.

For example, if the requirement is to display account information, a meaningful class name can be:

```text
AccountInfo
```

The idea is to understand the requirement first and then choose a meaningful design/class name.

### main() Method

The standard `main()` method is:

```java
public static void main(String[] args)
{
    // statements
}
```

The session broke down the important parts:

| Part | Meaning |
|---|---|
| `public` | JVM can access/call the method from outside the class. |
| `static` | Belongs to the class and can be called without creating an object first. |
| `void` | The method returns no value. |
| `main` | The standard execution entry point. |
| `String[] args` | A parameter representing an array of String values. |

### main() as the Entry Point

The JVM starts normal Java application execution from the `main()` method of the class selected to run.

```text
Class
  ↓
main()
  ↓
Statements / Methods
```

### Methods

A method is used to perform a particular task or piece of work.

For example:

```java
static void displayAccount()
{
    System.out.println("Account Information");
}
```

The method has its own boundary.

```text
Method Start
{
    Task / Work
}
Method End
```

A method can then be called from `main()`.

### Parameters — String[] args

The standard main method contains:

```java
String[] args
```

`String[]` represents an array of String values.

`args` is simply the parameter name and can be changed to another meaningful identifier.

### Statement and Semicolon

A statement is an instruction given to Java.

A semicolon `;` terminates the statement.

```java
System.out.println("Account details");
```

### print() vs println()

```java
System.out.print("A");
System.out.print("B");
```

Output:

```text
AB
```

And:

```java
System.out.println("A");
System.out.println("B");
```

Output:

```text
A
B
```

### Naming Conventions

Class names use **PascalCase**.

Examples:

```text
AccountInfo
EmployeeDetails
PaymentDetails
```

Methods and variables use **camelCase**.

Examples:

```text
displayAccount()
displayEmployee()
printDetails()
```

The compiler checks Java syntax and rules; naming conventions are development best practices.

### Multiple Classes

A single Java source file can contain multiple valid classes.

For example:

```text
Class A
Class B
Class C
```

After successful compilation, each class can have its own `.class` file.

```text
Class A → A.class
Class B → B.class
Class C → C.class
```

When running the program, the class name supplied to the JVM determines where execution starts. That class needs a `main()` method.

### Duplicate Methods

Within one class, two methods cannot have the exact same method signature.

For example, two identical `main()` methods in the same class are not allowed.

```text
Same method signature twice
          ↓
Compilation Error
```

Different method signatures can be possible; method overloading is a separate topic to be studied later.

### Compilation vs Execution

The commands practised were:

```bash
javac FileName.java
```

to compile the **source file**, and:

```bash
java ClassName
```

to start the JVM and **run the class**.

The key rule:

```text
Compile → File Name
Run     → Class Name
```

### Requirement → Development → Build → Test

The instructor emphasised an industry-oriented way of approaching development.

```text
Understand Requirement
          ↓
    Design / Decide
          ↓
      Development
          ↓
          Build
          ↓
      Execute / Test
          ↓
        If OK
          ↓
       Customer
```

If a problem is found, the process goes back through development, build and testing until the code is stable.

Example:

```text
Requirement:
Display account information

        ↓

Meaningful class:
AccountInfo

        ↓

Write the code

        ↓

Compile / Build

        ↓

Run / Test
```

### Practice Habit

The session encouraged repeating the programs multiple times.

The purpose of repetition is to become comfortable with the language and its basic structure rather than simply seeing a program once.

---

# Three-Day Progression

The first three sessions connect naturally:

```text
DAY 01
Java Foundation
    │
    ├── What is Java?
    ├── Java features
    ├── Platform Independence
    ├── WORA
    ├── Garbage Collection
    └── Basic Class + main()
          │
          ▼
DAY 02
Compilation & Execution
    │
    ├── Source Code (.java)
    ├── javac
    ├── Bytecode (.class)
    ├── JVM
    ├── Compilation vs Execution
    ├── File Name vs Class Name
    └── Recompile after changes
          │
          ▼
DAY 03
Classes, Methods & Program Flow
    │
    ├── Meaningful Classes
    ├── main()
    ├── public / static / void
    ├── Methods
    ├── String[] args
    ├── print() / println()
    ├── Naming Conventions
    ├── Multiple Classes
    └── Requirement → Build → Test
```

---

# Quick Revision

```text
Java
 ↓
Class
 ↓
main()
 ↓
Statements / Methods
 ↓
Source File (.java)
 ↓
javac
 ↓
Bytecode (.class)
 ↓
java ClassName
 ↓
JVM
 ↓
Output
```

### Remember

- **Class** → meaningful structure for Java code.
- **main()** → normal execution entry point.
- **Method** → performs a task.
- **`.java`** → source file.
- **`javac`** → compiler command.
- **`.class`** → compiled bytecode.
- **`java ClassName`** → starts execution through the JVM.
- **`print()`** → same line.
- **`println()`** → next line.
- **PascalCase** → class names.
- **camelCase** → methods and variables.
- **Compile with the file name.**
- **Run with the class name.**
- **Recompile after changing source code.**
- **Read the error before trying to fix it.**
- **Understand the requirement before coding.**

---

# Current Learning Position

```text
Day 01 → Java Foundation
Day 02 → Compilation & Execution
Day 03 → Classes & Methods
         ↓
Next → Continue with the next classroom topic
```

This file records the first three sessions of the Java learning journey and keeps the progression from Java fundamentals to program structure and execution in one place.
