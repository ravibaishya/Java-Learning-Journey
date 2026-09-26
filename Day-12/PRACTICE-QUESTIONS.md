# Day 12 — Professional Practice Set
## Classes, Objects, Constructors, `this`, Instance State & Debugging
### Medium → Hard → Tricky

> **Practice rule:** Do not memorize constructor syntax alone.
> Trace **class → object → constructor → parameter → `this` → instance state**.

---

# Current Day 12 Scope

Strictly based on the Day 12 learning material:

```text
Class as a blueprint
Object as an instance
Instance variables
Multiple objects
Object-specific state
Constructors
Constructor parameters
`this`
this.variable = parameter
Constructor execution
Eclipse breakpoints
F6 / Step Over
Runtime object state
Program Arguments
VM Arguments
Heap dump — introductory concept
Eclipse + GitHub basic workflow
Clone → Work → Commit → Push
GitHub → Pull → Local Project
```

This practice set does **not** introduce constructor chaining, `super()`, inheritance, polymorphism, collections, exception handling, or advanced heap-dump analysis because those were not part of the supplied Day 12 material.

---

# Part A — Class vs Object

### Q1. Blueprint or Instance?

Consider:

```java
class AccountHolder
{
    int amount;
    String name;
}
```

What is `AccountHolder`?

A. An object  
B. A class  
C. A constructor  
D. A parameter

---

### Q2.

Which statement best describes a class?

A. It is one actual person/account in memory  
B. It defines the structure an object can have  
C. It is always a constructor  
D. It is the same thing as an instance variable

---

### Q3.

Given:

```java
AccountHolder user1 =
    new AccountHolder();
```

What is `user1`?

A. Class  
B. Object reference  
C. Constructor parameter  
D. Instance variable declaration

---

### Q4.

What does:

```java
new AccountHolder()
```

represent in the Day 12 model?

A. Creating an object  
B. Creating a package  
C. Creating a method  
D. Creating a parameter

---

### Q5. Tricky

A developer says:

> "If I have one class, I automatically have only one object."

Is that correct?

Explain using:

```java
AccountHolder user1 =
    new AccountHolder();

AccountHolder user2 =
    new AccountHolder();
```

---

# Part B — Multiple Objects, Same Class

### Q6.

Given:

```java
AccountHolder user1 =
    new AccountHolder();

AccountHolder user2 =
    new AccountHolder();
```

Are `user1` and `user2` the same object?

A. Yes  
B. No

---

### Q7.

Both objects were created from:

```java
AccountHolder
```

What is the same?

A. Their object state must be identical  
B. Their class/structure comes from the same class  
C. Their variable values must be identical  
D. They share one instance-variable storage automatically

---

### Q8.

What can be different between:

```java
user1
user2
```

A. Their instance-variable values  
B. Their class definition  
C. Their Java language  
D. Their constructor definition

---

### Q9. Predict the State

Suppose:

```java
class AccountHolder
{
    int amount;
    String name;
}
```

and:

```java
AccountHolder user1 =
    new AccountHolder();

AccountHolder user2 =
    new AccountHolder();

user1.amount = 50000;
user1.name = "Ravi";

user2.amount = 75000;
user2.name = "Amit";
```

What should be the state of `user1`?

What should be the state of `user2`?

---

### Q10. Tricky

If:

```java
user1.amount = 50000;
```

does that automatically change:

```java
user2.amount
```

A. Yes  
B. No

Explain using the concept of object-specific instance state.

---

# Part C — Instance Variables

### Q11.

In:

```java
class AccountHolder
{
    int amount;
    long account;
    String name;
    long phoneNumber;
}
```

Which are instance variables?

A. `amount`, `account`, `name`, `phoneNumber`  
B. `AccountHolder` only  
C. `new` only  
D. `class` only

---

### Q12.

Why are these variables called instance variables in the Day 12 example?

A. Each object has its own state for them  
B. They belong only to the compiler  
C. They belong only to `main()`  
D. They are always static

---

### Q13.

Two objects are created:

```java
AccountHolder user1 =
    new AccountHolder();

AccountHolder user2 =
    new AccountHolder();
```

How should you mentally visualize their instance state?

```text
AccountHolder
   ↓
user1 → own state
user2 → own state
```

or:

```text
AccountHolder
   ↓
one shared state
```

Choose and explain.

---

# Part D — Constructors

### Q14.

What is the main purpose of the constructor demonstrated on Day 12?

A. Initialize object state during object creation  
B. Compile the source file  
C. Create a package  
D. Configure the JVM

---

### Q15.

Given:

```java
class AccountHolder
{
    int amount;

    AccountHolder(int amount)
    {
        this.amount = amount;
    }
}
```

What is:

```java
AccountHolder(int amount)
```

A. Method  
B. Constructor  
C. Object  
D. Instance variable

---

### Q16.

When this executes:

```java
AccountHolder user1 =
    new AccountHolder(50000);
```

what does the constructor receive?

A. `50000`  
B. `user1`  
C. `AccountHolder`  
D. `this.amount`

---

### Q17.

What is the relationship between:

```java
new AccountHolder(50000)
```

and the constructor?

A. Object creation causes the constructor to receive the supplied value  
B. Constructor creates the package  
C. Constructor is called only after `main()` finishes  
D. Constructor is unrelated to object creation

---

### Q18. Tricky

A developer says:

> "The constructor stores the value in the class itself."

What is more accurate?

A. The constructor initializes the state of the newly created object  
B. It changes the class definition  
C. It changes every object automatically  
D. It changes the JVM configuration

---

# Part E — Constructor Parameters

Use:

```java
class AccountHolder
{
    int amount;
    long account;
    String name;
    long phoneNumber;

    AccountHolder(
        int amount,
        long account,
        String name,
        long phoneNumber)
    {
        this.amount = amount;
        this.account = account;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
```

### Q19.

How many constructor parameters are there?

A. 2  
B. 3  
C. 4  
D. 5

---

### Q20.

What is the type of the first parameter?

A. `int`  
B. `long`  
C. `String`  
D. `boolean`

---

### Q21.

What is the type of:

```java
name
```

inside the constructor parameter list?

A. `int`  
B. `long`  
C. `String`  
D. `char`

---

### Q22.

Which argument list correctly matches the constructor?

A.

```java
AccountHolder(
    "50000",
    10101,
    "Ravi",
    9876543210L
);
```

B.

```java
AccountHolder(
    50000,
    10101L,
    "Ravi",
    9876543210L
);
```

C.

```java
AccountHolder(
    50000L,
    "10101",
    "Ravi",
    9876543210
);
```

D.

```java
AccountHolder(
    true,
    10101L,
    "Ravi",
    9876543210L
);
```

---

# Part F — `this` Fundamentals

### Q23.

What does:

```java
this
```

represent?

A. Current class definition  
B. Current object  
C. Parent object  
D. JVM

---

### Q24.

Given:

```java
this.amount
```

what does it refer to?

A. The `amount` belonging to the current object  
B. The constructor parameter only  
C. The class name  
D. The JVM argument

---

### Q25.

In:

```java
this.amount = amount;
```

identify the left side.

A. Constructor parameter  
B. Current object's instance variable  
C. Class name  
D. Method name

---

### Q26.

In:

```java
this.amount = amount;
```

identify the right side.

A. Current object's instance variable  
B. Constructor parameter  
C. Class name  
D. Object reference

---

### Q27. The Important Translation

Translate:

```java
this.amount = amount;
```

into plain English.

A. The constructor parameter becomes the class  
B. The current object's `amount` receives the parameter's value  
C. The class receives a new object  
D. The parameter receives the object's address

---

### Q28. Tricky

Why is this useful?

```java
this.amount = amount;
```

when both are named `amount`?

A. `this.amount` clearly identifies the current object's instance variable  
B. `this` changes the variable type  
C. `this` creates a second object  
D. `this` makes the variable static

---

# Part G — Trace the Constructor

Given:

```java
class AccountHolder
{
    int amount;
    String name;

    AccountHolder(int amount, String name)
    {
        this.amount = amount;
        this.name = name;
    }
}
```

and:

```java
AccountHolder user1 =
    new AccountHolder(50000, "Ravi");
```

### Q29.

What value arrives in the constructor's:

```java
amount
```

parameter?

---

### Q30.

What value arrives in:

```java
name
```

parameter?

---

### Q31.

After:

```java
this.amount = amount;
```

what is `user1.amount`?

---

### Q32.

After:

```java
this.name = name;
```

what is `user1.name`?

---

### Q33. Complete the Flow

```text
new AccountHolder(50000, "Ravi")
        ↓
constructor parameters
        ↓
?
        ↓
object state
```

What belongs at `?`?

A. `this.amount = amount` and `this.name = name`  
B. `javac`  
C. `String[] args`  
D. VM arguments

---

# Part H — Multiple Objects + Constructors

### Q34.

Given:

```java
AccountHolder user1 =
    new AccountHolder(
        50000,
        10101L,
        "Ravi",
        9876543210L
    );

AccountHolder user2 =
    new AccountHolder(
        75000,
        20202L,
        "Amit",
        9123456780L
    );
```

Which object receives:

```text
50000
10101
Ravi
9876543210
```

A. `user1`  
B. `user2`  
C. Both  
D. Neither

---

### Q35.

Which object receives:

```text
75000
20202
Amit
9123456780
```

A. `user1`  
B. `user2`  
C. Both  
D. Neither

---

### Q36. Tricky

Both objects use the **same constructor definition**.

Does that mean both objects must have the same values?

A. Yes  
B. No

Explain.

---

### Q37.

What is reused?

A. Constructor logic/definition  
B. The same object state  
C. The same object  
D. The same runtime values

---

### Q38. Hard

If:

```java
user1.name
```

is:

```text
Ravi
```

and:

```java
user2.name
```

is:

```text
Amit
```

what explains the difference?

A. Different objects were initialized with different constructor arguments  
B. Java created two classes  
C. The constructor definition changed between calls  
D. `this` refers to both objects simultaneously

---

# Part I — Output Prediction

### Q39.

```java
class AccountHolder
{
    int amount;
    String name;

    AccountHolder(int amount, String name)
    {
        this.amount = amount;
        this.name = name;
    }

    public static void main(String[] args)
    {
        AccountHolder user =
            new AccountHolder(50000, "Ravi");

        System.out.println(user.amount);
        System.out.println(user.name);
    }
}
```

Predict the exact output.

---

### Q40.

```java
AccountHolder user1 =
    new AccountHolder(50000, "Ravi");

AccountHolder user2 =
    new AccountHolder(75000, "Amit");

System.out.println(user1.name);
System.out.println(user2.name);
```

Predict the output order.

---

### Q41. Tricky

If the two constructor calls are reversed:

```java
AccountHolder user2 =
    new AccountHolder(75000, "Amit");

AccountHolder user1 =
    new AccountHolder(50000, "Ravi");
```

Does the class definition change?

A. Yes  
B. No

What changes?

---

# Part J — Debugging Constructor Execution

### Q42.

Where can a breakpoint be placed to observe constructor execution?

A. Inside the constructor body  
B. Only after `main()` finishes  
C. Only on the package declaration  
D. Only on the class name

---

### Q43.

If a breakpoint is placed on:

```java
this.amount = amount;
```

what can you inspect while debugging?

A. Constructor parameter and current object state  
B. GitHub repository stars  
C. Package history  
D. JVM source code

---

### Q44.

What does `F6` help you do in the Day 12 debugging exercise?

A. Step through execution line by line  
B. Push code to GitHub  
C. Create an object automatically  
D. Change an access modifier

---

### Q45. Debugging Flow

Arrange:

```text
A. Inspect constructor parameter
B. Create object
C. Reach breakpoint
D. Execute assignment
E. Observe object state
```

---

### Q46. Hard

Suppose the debugger stops at:

```java
this.name = name;
```

and shows:

```text
parameter name = "Ravi"
```

What should happen to the current object's `name` after this line executes?

A. It becomes `"Ravi"`  
B. It becomes `null`  
C. It becomes `"name"`  
D. It becomes the class name

---

### Q47. Tricky

If the debugger shows:

```text
amount = 50000
this.amount = 0
```

before:

```java
this.amount = amount;
```

what should you expect immediately after executing the assignment?

A. Current object's amount becomes `50000`  
B. Parameter amount becomes `0`  
C. Both become `0`  
D. The object is destroyed

---

# Part K — Program Arguments vs VM Arguments

### Q48.

What are program arguments?

A. Values supplied to the application  
B. JVM configuration values  
C. Heap-dump files  
D. Git commits

---

### Q49.

Where do program arguments enter a Java application in the demonstrated model?

A. `String[] args`  
B. `this`  
C. `this.amount`  
D. `new`

---

### Q50.

What are VM arguments used for?

A. Configuring the JVM/runtime  
B. Initializing every object field  
C. Naming packages  
D. Calling constructors

---

### Q51. Tricky

Which statement is correct?

A. Program arguments and VM arguments are the same thing  
B. Program arguments are application input; VM arguments configure the JVM  
C. VM arguments are always stored in object fields  
D. Program arguments create constructors

---

### Q52.

Classify:

```text
Customer name supplied to application
```

A. Program argument  
B. VM argument

---

### Q53.

Classify:

```text
JVM runtime/memory configuration
```

A. Program argument  
B. VM argument

---

# Part L — Heap Dump Introduction

### Q54.

What was the Day 12 introduction to a heap dump?

A. A way of capturing information about objects and heap memory  
B. A way to compile `.java` files  
C. A way to push code to GitHub  
D. A way to call a constructor

---

### Q55. Tricky

Does the Day 12 material teach advanced heap-dump analysis?

A. Yes  
B. No

What was the intended level?

---

### Q56.

Complete:

```text
Objects
   ↓
Heap memory
   ↓
?
```

A. Heap information can be inspected  
B. Objects become source code  
C. JVM disappears  
D. GitHub creates a constructor

---

# Part M — Eclipse + GitHub Workflow

### Q57.

What is the basic relationship introduced?

```text
Local Project
     ↓
?
     ↓
GitHub Repository
```

A. Git  
B. JVM  
C. Constructor  
D. `this`

---

### Q58.

Which workflow was introduced?

A.

```text
Clone → Work → Commit → Push
```

B.

```text
Compile → Constructor → Heap Dump
```

C.

```text
Import → Debug → F6
```

D.

```text
Package → Object → this
```

---

### Q59.

What direction does `Pull` represent in the demonstrated workflow?

```text
GitHub
  ↓
Pull
  ↓
Local Project
```

A. Remote → local  
B. Local → remote  
C. JVM → object  
D. Object → constructor

---

### Q60. Tricky

A developer makes changes locally and wants those committed changes on the remote GitHub repository.

Which operation belongs to the demonstrated direction?

A. Push  
B. Pull  
C. Heap dump  
D. F6

---

# Part N — Debug the Concept

### Q61.

A developer writes:

```java
class AccountHolder
{
    int amount;

    AccountHolder(int amount)
    {
        amount = amount;
    }
}
```

What is the conceptual problem with this assignment in the Day 12 context?

A. It does not explicitly identify the current object's instance variable  
B. It creates two objects  
C. It changes the constructor into a method  
D. It creates a VM argument

---

### Q62.

How would the Day 12 example explicitly connect the object field and parameter?

A.

```java
this.amount = amount;
```

B.

```java
amount.this = amount;
```

C.

```java
this = amount;
```

D.

```java
object.amount = this;
```

---

### Q63.

Given:

```java
class AccountHolder
{
    int amount;

    AccountHolder(int amount)
    {
        this.amount = amount;
    }
}
```

If:

```java
new AccountHolder(50000);
```

is executed, which `amount` is the constructor parameter?

A. The right-hand `amount` in `this.amount = amount`  
B. `this.amount`  
C. Class `amount`  
D. JVM amount

---

### Q64. Hard

Explain why this mental model is useful:

```text
this.amount
     ↓
current object

amount
     ↓
constructor parameter
```

What problem does it help you avoid?

---

# Part O — Complete Runtime Trace

Use:

```java
class AccountHolder
{
    int amount;
    String name;

    AccountHolder(int amount, String name)
    {
        this.amount = amount;
        this.name = name;
    }

    public static void main(String[] args)
    {
        AccountHolder user1 =
            new AccountHolder(50000, "Ravi");

        AccountHolder user2 =
            new AccountHolder(75000, "Amit");

        System.out.println(user1.name);
        System.out.println(user2.name);
    }
}
```

### Q65.

How many objects are created?

A. 1  
B. 2  
C. 3  
D. 0

---

### Q66.

How many constructor executions occur?

A. 1  
B. 2  
C. 3  
D. 0

---

### Q67.

First constructor call receives:

```text
amount = ?
name = ?
```

---

### Q68.

Second constructor call receives:

```text
amount = ?
name = ?
```

---

### Q69.

After both constructor calls, does `user1` have its own instance state?

A. Yes  
B. No

---

### Q70.

Does `user2` have its own instance state?

A. Yes  
B. No

---

### Q71. Hard

Write the final object-state picture:

```text
user1
 ├── amount = ?
 └── name = ?

user2
 ├── amount = ?
 └── name = ?
```

---

# Part P — Professional Coding Practice

## Q72. AccountHolder Constructor

Create:

```java
class AccountHolder
```

with:

```text
amount
account
name
phoneNumber
```

Add a constructor that initializes all four fields using:

```text
this.variable = parameter
```

---

## Q73. Create Two Different Objects

Create:

```text
user1
user2
```

from the same `AccountHolder` class.

Give them different:

```text
amount
account
name
phoneNumber
```

Print both objects' values.

---

## Q74. Constructor Debugging

Place a breakpoint inside the constructor.

Run the program in Debug mode.

Use:

```text
F6
```

and record:

```text
constructor parameter values
current object state
values after each assignment
```

---

## Q75. Program Arguments Practice

Create a small Java program that receives application input through:

```java
String[] args
```

Then identify which values are:

```text
Program Arguments
```

and explain how they differ from:

```text
VM Arguments
```

Do not introduce advanced JVM configuration.

---

## Q76. GitHub Workflow Practice

Using the basic workflow introduced:

```text
Clone
  ↓
Work
  ↓
Commit
  ↓
Push
```

write one sentence explaining the purpose of each step.

Then explain the reverse-direction operation:

```text
GitHub
  ↓
Pull
  ↓
Local Project
```

---

# Part Q — Final Tricky Questions

### Q77.

Consider:

```java
AccountHolder user1 =
    new AccountHolder(50000, "Ravi");

AccountHolder user2 =
    user1;
```

Are `user1` and `user2` two independently created objects from the two `new` operations?

A. Yes  
B. No

**Important:** Answer only what can be established from the code itself.

---

### Q78.

If:

```java
user1.amount = 50000;
```

and:

```java
user2
```

refers to the same object as `user1`, what would you expect when inspecting that object's `amount` through either reference?

A. The same object state  
B. Two independent amounts  
C. One becomes a class variable  
D. The constructor runs again automatically

---

### Q79. Constructor vs Object

Which statement is most accurate?

A. Constructor and object are the same thing  
B. Constructor initializes the newly created object's state  
C. Object initializes the constructor  
D. Constructor is an instance variable

---

### Q80. `this` vs Object Reference

Inside:

```java
AccountHolder(int amount)
{
    this.amount = amount;
}
```

what does `this` allow the constructor to refer to?

A. The current object being initialized  
B. The next object that will be created  
C. The class file  
D. The JVM argument list

---

# Final Challenge — Q81

Analyze this program without running it:

```java
class AccountHolder
{
    int amount;
    long account;
    String name;
    long phoneNumber;

    AccountHolder(
        int amount,
        long account,
        String name,
        long phoneNumber)
    {
        this.amount = amount;
        this.account = account;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args)
    {
        AccountHolder user1 =
            new AccountHolder(
                50000,
                10101L,
                "Ravi",
                9876543210L
            );

        AccountHolder user2 =
            new AccountHolder(
                75000,
                20202L,
                "Amit",
                9123456780L
            );

        System.out.println(user1.name);
        System.out.println(user2.name);
    }
}
```

Answer all parts.

### A.
How many objects are created?

### B.
How many times does the constructor execute?

### C.
What are the four arguments in the first constructor call?

### D.
What are the four parameters in the constructor?

### E.
What does:

```java
this.name
```

refer to during the first constructor execution?

### F.
What does:

```java
name
```

refer to in:

```java
this.name = name;
```

### G.
What is the final state of `user1`?

```text
amount = ?
account = ?
name = ?
phoneNumber = ?
```

### H.
What is the final state of `user2`?

```text
amount = ?
account = ?
name = ?
phoneNumber = ?
```

### I.
Write the exact output.

### J.
If a breakpoint is placed at:

```java
this.amount = amount;
```

what runtime information would be useful to inspect?

### K.
If you press `F6`, what are you trying to observe?

### L.
Explain the complete Day 12 flow:

```text
Class
  ↓
new
  ↓
Object creation
  ↓
Constructor
  ↓
Parameters receive arguments
  ↓
this.variable = parameter
  ↓
Object state
  ↓
Breakpoint / F6
  ↓
Runtime observation
```

---

# Day 12 Master Mental Model

```text
CLASS
  ↓
Blueprint / Structure
  ↓
new
  ↓
OBJECT
  ↓
Constructor
  ↓
Initialize state
  ↓
this.variable = parameter
  ↓
INSTANCE STATE
  ↓
Debug / Inspect
```

With multiple objects:

```text
             AccountHolder
                  │
        ┌─────────┴─────────┐
        ↓                   ↓
      user1               user2
        │                   │
   own state            own state
        │                   │
  Ravi / 50000         Amit / 75000
```

Arguments and JVM configuration:

```text
Program Arguments
        ↓
String[] args
        ↓
Application input


VM Arguments
        ↓
JVM
        ↓
Runtime configuration
```

GitHub workflow:

```text
Clone
  ↓
Work
  ↓
Commit
  ↓
Push
  ↓
GitHub

GitHub
  ↓
Pull
  ↓
Local Project
```

# Final Revision Check

Before considering Day 12 complete, explain these without notes:

```text
Class
Object
Instance
Instance variable
Constructor
Constructor parameter
Argument
this
this.variable = parameter
Object state
Multiple objects from one class
Breakpoint
F6 / Step Over
Program Arguments
VM Arguments
Heap dump — basic purpose
Clone
Commit
Push
Pull
```

### Day 12 Practice Goal

**When you see `new ClassName(...)`, mentally follow the values into the constructor, through `this.variable = parameter`, and into the state of that specific object. Then use the debugger to verify your reasoning at runtime.**
