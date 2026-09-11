# Day 4 — Command-Line Arguments in Java

## Overview

Day 4 connected the basic Java execution flow with a practical question:

> **How can the same program work with different input without changing the source code every time?**

The class introduced **command-line arguments** as a way to provide input when a Java program is executed.

The practical examples used employee data, order details, and a larger data-processing scenario to show why avoiding hardcoded input matters.

---

## 1. From Development to Output

The class started by looking at what happens when we develop a Java program.

```text
Write Source Code
       ↓
     Compile
       ↓
   Bytecode (.class)
       ↓
      JVM
       ↓
     Output
```

### Compilation

The Java compiler is:

```text
javac
```

It checks the source code against Java's rules and converts:

```text
.java → .class
```

The `.class` file contains Java bytecode.

### Execution

The **JVM (Java Virtual Machine)** loads the bytecode and executes the program.

The class also introduced the idea that when the JVM starts, it uses memory from RAM. Heap, Stack, Metaspace and Program Counter were mentioned as parts of the JVM memory/runtime discussion; deeper memory management is a later topic.

A simple classroom illustration was used to show that running a JVM consumes part of the available system memory.

---

## 2. A Practical Problem With Hardcoding

The class emphasized:

> **NEVER DO HARD CODING**

The reason is simple.

Suppose a program contains fixed input:

```java
System.out.println("Employee A");
System.out.println("Employee B");
System.out.println("Employee C");
```

If the input changes, the source code has to change.

That means:

```text
Change Code
    ↓
Compile Again
    ↓
Execute Again
```

This takes time and becomes impractical when the same program has to process changing or large amounts of data.

The goal is therefore:

```text
Same Program
     +
Different Input
     ↓
Different Output
```

---

# 3. Command-Line Arguments

Command-line arguments provide a way to pass input to a Java program when it is executed.

They are received through the `args` array:

```java
public static void main(String args[])
```

For example:

```bash
java EmployeeDetails Ajay Amit Deepti
```

The values are available through the array:

```text
args
┌─────────┬─────────┬──────────┐
│  Ajay   │  Amit   │  Deepti  │
└─────────┴─────────┴──────────┘
     0         1          2
```

Java arrays use **zero-based indexing**.

Therefore:

```java
args[0] → first argument
args[1] → second argument
args[2] → third argument
```

---

# 4. Practical Exercise — Employee Details

The class demonstrated command-line arguments using employee values.

The practical program assigns the first three arguments to String variables:

```java
String emp1 = args[0];
String emp2 = args[1];
String emp3 = args[2];
```

and prints them.

### Classroom Program

```java
class EmployeeDetails
{
    public static void main(String args[])
    {
        String emp1 = args[0];
        String emp2 = args[1];
        String emp3 = args[2];

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
```

### Example execution

```bash
javac EmployeeDetails.java
java EmployeeDetails Ajay Amit Deepti
```

The important part is not the employee names.

The important part is that the program can receive different names without changing the source code.

---

# 5. Practical Exercise — Order Details

Another classroom task was to create a program that receives:

- Order ID
- Product name
- Person who placed the order
- Delivery address

Example input discussed in class:

```text
ORD11234
IPhone16
Customer
"2nd Stage, BTM Layout, Bangalore"
```

The corresponding Java approach is to receive these values through `args`.

```java
String orderId = args[0];
String productName = args[1];
String orderPlacedBy = args[2];
String deliveryAddress = args[3];
```

The actual classroom `Amazon.java` exercise follows this structure.

```java
class Amazon
{
    public static void main(String args[])
    {
        String orderId = args[0];
        String productName = args[1];
        String orderPlacedBy = args[2];
        String deliveryAddress = args[3];

        System.out.println(orderId);
        System.out.println(productName);
        System.out.println(orderPlacedBy);
        System.out.println(deliveryAddress);
    }
}
```

The exercise demonstrates how multiple pieces of String input can be received from the command line.

---

# 6. Practical Exercise — Credit Card Data

The class also used a credit-card data processing scenario involving different malls.

The program receives three values:

```java
String mall1 = args[0];
String mall2 = args[1];
String mall3 = args[2];
```

and uses those values in processing messages.

```java
class CreditCardData
{
    public static void main(String args[])
    {
        String mall1 = args[0];
        String mall2 = args[1];
        String mall3 = args[2];

        System.out.println("We are analysing " + mall1 + " Data.");
        System.out.println("We are processing " + mall2 + " Data.");
        System.out.println("We are proceeding your " + mall3 + " Data.");
    }
}
```

Again, the program structure remains the same while the input values can change.

---

# 7. A Bigger Real-World Picture — Analyzer Engine

The rough class notes connected the simple command-line examples to a larger real-world scenario.

The idea was an **Analyzer Engine** receiving data from many files.

The notes illustrated a situation with:

```text
200+ files
   ↓
Mall/customer data files
   ↓
Analyzer Engine
   ↓
Processed result
   ↓
Email to customer
```

Examples of input files shown in the notes included files such as:

```text
M1.txt
Vega city mall Today's data.txt
Nexus mall latest data.txt
```

This was an important reason behind the discussion about avoiding hardcoded data.

A real application may need to process changing data repeatedly. The program should therefore be designed so that the data can change without requiring the developer to rewrite the program logic every time.

---

# 8. Program Arguments vs JVM Arguments

The class introduced two different kinds of arguments.

## Program Arguments

These are values supplied to the Java application.

Example:

```bash
java EmployeeDetails Ajay Amit Deepti
```

Here:

```text
Ajay
Amit
Deepti
```

are program arguments.

They are received through:

```java
String args[]
```

and accessed using indexes.

---

## JVM Arguments

JVM arguments are used to configure the JVM rather than provide application data.

Examples discussed in class included configuration related to:

- Heap size
- Stack size
- Garbage Collection (GC)

So the distinction is:

```text
Program Arguments
        ↓
Input for the Java program

JVM Arguments
        ↓
Configuration for the JVM
```

They serve different purposes.

---

# 9. Arguments Are Stored in an Array

One of the important connections from today's class was between command-line arguments and arrays.

If we run:

```bash
java EmployeeDetails Ajay Amit Deepti
```

the values can be visualised as:

```text
args
 ┌─────────┬─────────┬──────────┐
 │  Ajay   │  Amit   │  Deepti  │
 └─────────┴─────────┴──────────┘
      0         1          2
```

Therefore:

```java
args[0]
args[1]
args[2]
```

refer to the first, second and third values.

This reinforced the earlier understanding that Java arrays start indexing from `0`.

---

# 10. Important Development Insight

The class also highlighted a practical cost of changing source code repeatedly.

If the data changes and the program is hardcoded:

```text
New Data
   ↓
Modify Source Code
   ↓
Compile Again
   ↓
Execute Again
```

With external input:

```text
New Data
   ↓
Run Same Program
   ↓
Different Result
```

This is a small example of a much bigger software-development principle:

> **Separate changing data from the program logic whenever possible.**

---

# 11. Key Takeaways

- Java source code is compiled using `javac`.
- Compilation converts `.java` source code into `.class` bytecode.
- JVM loads and executes the bytecode.
- Changing Java source code requires recompilation before executing the updated version.
- Hardcoding changing input makes a program less flexible.
- Command-line arguments allow input to be supplied when the program runs.
- Command-line arguments are received through `String[] args`.
- Arguments are accessed using array indexes such as `args[0]`, `args[1]`, etc.
- Java arrays use zero-based indexing.
- Program arguments and JVM arguments are different.
- JVM arguments can configure aspects such as heap, stack and garbage collection.
- The classroom examples showed how the same basic program can process different employee, order or data values.
- The larger Analyzer Engine example showed why flexible input becomes important when processing many data files.

---

## Visual Note

![Java Day 4 — Command-Line Arguments](../assets/java-day-04-command-line-arguments.png)

---

## Today's Classroom Files

```text
Day-04/
├── EmployeeDetails.java
├── Amazon.java
├── CreditCardData.java
└── README.md
```

The repository should preserve the classroom exercises separately from additional self-practice.

---

## Suggested Self-Practice

After understanding the classroom examples, additional exercises can be kept under:

```text
Day-04/
└── Exercises/
```

Possible exercises include:

1. Personal Introduction
2. Student Details
3. Employee Profile
4. Product Information
5. Amazon Order
6. Bank Account Details
7. Credit Card Processing
8. Movie Ticket Booking
9. Food Delivery Order
10. Travel Booking

For Day 4 practice, keep the exercises focused on:

```text
String
String[] args
args[index]
```

Do not introduce numeric conversion concepts here; those belong to the next stage of the learning journey.

---

## Learning Log

| Day | Focus | Practical Work |
|---|---|---|
| Day 4 | Command-Line Arguments | Employee Details |
| Day 4 | Dynamic Input | Order Details |
| Day 4 | Data Processing | Credit Card Data |
| Day 4 | Real-World Thinking | Analyzer Engine scenario |

---

## Key Takeaway

> **Don't make the program change just because the input changed.**

Day 4 was the first practical step toward separating **input data** from **program logic**.

**Learn → Practice → Understand → Apply**
