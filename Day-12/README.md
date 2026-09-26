# Java Learning Journey — Day 12

## From Classes to Objects — Understanding Object State with Constructors

Day 12 connected a few concepts that are easy to memorize separately but much more useful when understood together:

**Class → Object → Constructor → Instance State → `this` → Debugging**

The practical focus was on creating multiple objects from the same class and observing how each object maintains its own data.

---

## 1. A Class Is a Blueprint

A class defines what an object should contain and what it can do.

For example:

```java
class AccountHolder
{
    int amount;
    long account;
    String name;
    long phoneNumber;
}
```

Here, `AccountHolder` describes the structure.

It does not mean that one actual account holder already exists.

The actual entities are created as objects.

---

## 2. Object = Real Instance of a Class

```java
AccountHolder user1 = new AccountHolder();
AccountHolder user2 = new AccountHolder();
```

Both objects are created from the same class.

But they are **different objects**.

A useful mental model:

```text
AccountHolder
     │
     ├── user1
     │     ├── amount
     │     ├── account
     │     ├── name
     │     └── phoneNumber
     │
     └── user2
           ├── amount
           ├── account
           ├── name
           └── phoneNumber
```

The class defines the structure.

Each object owns its own instance state.

---

## 3. Why Constructors Matter

Instead of creating an object first and assigning every field separately, a constructor can initialize the object's state when the object is created.

```java
class AccountHolder
{
    int amount;
    long account;
    String name;
    long phoneNumber;

    AccountHolder(int amount, long account, String name, long phoneNumber)
    {
        this.amount = amount;
        this.account = account;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
```

Now an object can be created with its required information:

```java
AccountHolder user1 =
    new AccountHolder(50000, 10101, "Ravi", 9876543210L);

AccountHolder user2 =
    new AccountHolder(75000, 20202, "Amit", 9123456780L);
```

The constructor receives the values and initializes the newly created object's state.

---

## 4. Understanding `this`

One of the most important ideas from this session:

> `this` refers to the current object.

Look at:

```java
this.amount = amount;
```

There are two `amount` variables here:

```text
this.amount
    ↓
instance variable belonging to the current object

amount
    ↓
constructor parameter
```

So:

```java
this.amount = amount;
```

means:

```text
current object's amount
        =
constructor's amount parameter
```

The same idea applies to the other fields:

```java
this.account = account;
this.name = name;
this.phoneNumber = phoneNumber;
```

---

## 5. One Class, Different Object States

The important difference is not the class.

The class is the same:

```text
AccountHolder
```

The objects are different:

```text
user1 → Ravi  → 50000
user2 → Amit  → 75000
```

Each object has its own instance variables.

This is one of the foundations of object-oriented programming.

---

## 6. Watching the Constructor with the Debugger

The session also connected constructors with Eclipse debugging.

A breakpoint can be placed inside the constructor:

```java
AccountHolder(int amount, long account, String name, long phoneNumber)
{
    this.amount = amount;
    this.account = account;
    this.name = name;
    this.phoneNumber = phoneNumber;
}
```

When the program reaches the breakpoint, the debugger allows us to inspect:

- Constructor parameters
- Current object state
- Values being assigned
- Execution flow

Using **F6 / Step Over** helps observe the program line by line.

This turns debugging into a way of understanding what the program is actually doing at runtime.

---

## 7. Program Arguments vs VM Arguments

Another distinction discussed during the session:

### Program Arguments

Values supplied to the application.

```text
Application input
        ↓
String[] args
```

They are handled by the Java program.

### VM Arguments

Values supplied to configure the JVM.

```text
JVM configuration
        ↓
Memory / runtime settings
```

The two should not be confused.

---

## 8. Heap Dump — Initial Introduction

A heap dump was introduced as a way of capturing information about objects and heap memory.

At this stage, the important point is simply:

```text
Objects
   ↓
Heap memory
   ↓
Heap information can be inspected
```

The deeper analysis of heap dumps was not the focus of this session.

---

## 9. Eclipse + GitHub Workflow

The session also introduced the basic relationship between Eclipse and GitHub:

```text
Local Project
     ↓
Git
     ↓
GitHub Repository
```

The basic GitHub workflow discussed included:

```text
Clone
  ↓
Work on code
  ↓
Commit
  ↓
Push
```

And pulling changes from the remote repository:

```text
GitHub
  ↓
Pull
  ↓
Local Project
```

The goal at this stage was understanding the workflow, not advanced Git operations.

---

## Practical Focus

The main practical exercise used an `AccountHolder` class with:

- `amount`
- `account`
- `name`
- `phoneNumber`
- A constructor
- Multiple objects
- Different values for each object
- Eclipse breakpoints
- Step-by-step debugging

This exercise makes the relationship between **class, object, constructor and instance state** much easier to see.

---

## Key Takeaways

- A **class** defines a structure.
- An **object** is an instance of that class.
- Each object has its own **instance variables**.
- A **constructor** initializes an object's state during object creation.
- `this` refers to the **current object**.
- `this.variable = parameter` connects an instance variable with a constructor parameter.
- Eclipse debugging can show how constructor execution changes object state.
- Program arguments are application input; VM arguments configure the JVM.
- Heap dumps were introduced as a tool for inspecting heap/object information.
- GitHub provides a remote repository that can be connected to the local development workflow.

---

## Day 12 Learning Map

```text
Class
  ↓
Object
  ↓
Instance Variables
  ↓
Constructor
  ↓
`this`
  ↓
Object State
  ↓
Debug with Breakpoints
  ↓
Understand Runtime Behaviour
```

### The bigger picture

This session moved the learning from simply **writing Java syntax** toward understanding **how objects are created, initialized and observed while a program runs**.

That shift is important for everything that follows in object-oriented Java.
