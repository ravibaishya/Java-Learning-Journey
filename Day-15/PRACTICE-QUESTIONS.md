# Day 15 — Professional Practice Set
## Constructor Chaining: `this()`, `super()` & Inheritance Flow
### Medium → Hard → Tricky

> **Practice rule:** For every constructor call, trace the chain.
> Ask: **Which constructor is being called? Same class or parent? Does the signature exist? What executes first?**

---

# Current Day 15 Scope

Strictly based on the Day 15 learning material:

```text
Application logging concept
System.out.println() for learning/tracing
Production logs — introductory concept
this vs this()
this() — same-class constructor call
super() / super(...) — parent constructor call
this(...) must be first constructor statement
super(...) must be first constructor statement
Either this(...) OR super(...)
Implicit super() when neither is explicitly written
Constructor matching still applies
Constructor chaining through inheritance
Parent initialization before child initialization is completed
Object at the root of the hierarchy
Three-level constructor chain
Reading constructor-related compiler errors
Eclipse navigation for following referenced classes/constructors
```

This practice set does **not** introduce unrelated advanced topics such as exception handling, collections, multithreading, logging configuration, custom logger implementation, or advanced inheritance mechanics.

---

# Part A — `this` vs `this()`

### Q1.

What does:

```java
this
```

represent?

A. Current object  
B. Parent class  
C. Another constructor  
D. JVM

---

### Q2.

What does:

```java
this();
```

do?

A. Calls another constructor of the same class  
B. Calls the parent constructor  
C. Creates another object automatically  
D. Calls `main()`

---

### Q3.

Which statement is correct?

A.

```text
this  → current object
this() → same-class constructor
```

B.

```text
this  → parent class
this() → current object
```

C.

```text
this  → constructor
this() → object field
```

D. They are exactly the same.

---

### Q4. Tricky

Consider:

```java
this.amount = amount;
```

and:

```java
this();
```

Why should these not be confused?

A. The first uses `this` to refer to the current object; the second calls another constructor in the same class  
B. Both call constructors  
C. Both refer to the parent class  
D. Both create a new object

---

# Part B — Basic Constructor Chaining with `this()`

Use:

```java
class User
{
    User()
    {
        System.out.println("Default");
    }

    User(String username)
    {
        this();
        System.out.println(username);
    }
}
```

### Q5.

Which constructor is called directly by:

```java
new User("Ravi");
```

A. `User(String)`  
B. `User()`  
C. `Object()`  
D. None

---

### Q6.

What does the `this()` inside `User(String)` call?

A. `User()`  
B. `Object()`  
C. `User(String)` again  
D. A method called `this`

---

### Q7.

After `this()` completes, what happens?

A. Remaining statements of `User(String)` continue executing  
B. The object is destroyed  
C. The parent constructor is automatically called instead  
D. The program always terminates

---

### Q8. Predict the output.

```java
class User
{
    User()
    {
        System.out.println("Default");
    }

    User(String username)
    {
        this();
        System.out.println(username);
    }

    public static void main(String[] args)
    {
        new User("Ravi");
    }
}
```

Write the exact output.

---

### Q9. Hard

Trace:

```text
new User("Ravi")
```

using:

```text
User(String)
      ↓
?
      ↓
return
      ↓
System.out.println(username)
```

What belongs at `?`?

---

# Part C — Why `this()` Is Used

### Q10.

Why might one constructor call another constructor using `this()`?

A. To reuse initialization logic already present in another constructor  
B. To call the parent class  
C. To make the object static  
D. To skip all initialization

---

### Q11.

Consider:

```java
User()
{
    this(100);
}

User(int amount)
{
    // initialization
}
```

What is the purpose of the first constructor calling `this(100)`?

A. Reuse the `User(int)` constructor with a default value  
B. Call the parent constructor  
C. Create a second `User` object  
D. Call `main()`

---

### Q12. Tricky

Which mental model best represents:

```java
Constructor A
    ↓
this(...)
    ↓
Constructor B
```

A. Same class → another constructor  
B. Child class → parent class  
C. Object → JVM  
D. Method → GitHub

---

# Part D — `this(...)` Must Be First

### Q13.

Consider:

```java
User()
{
    this(100);
    System.out.println("Done");
}
```

Is this placement of `this(100)` valid according to Day 15?

A. Yes  
B. No

---

### Q14.

Consider:

```java
User()
{
    System.out.println("Start");
    this(100);
}
```

Is this valid?

A. Yes  
B. No

---

### Q15.

What is the key rule?

A. `this(...)` must be the first statement in the constructor  
B. `this(...)` must be the last statement  
C. `this(...)` can appear anywhere  
D. `this(...)` can appear only in `main()`

---

### Q16. Hard

Why must constructor chaining happen before the remaining constructor statements?

Use this flow:

```text
Constructor starts
      ↓
Constructor call
      ↓
Called constructor completes
      ↓
Remaining statements
```

Explain in your own words.

---

# Part E — `super()` Fundamentals

### Q17.

What does:

```java
super();
```

call?

A. Parent-class constructor with no arguments  
B. Same-class constructor  
C. Current object  
D. Child method

---

### Q18.

What does:

```java
super(200);
```

attempt to call?

A. A superclass constructor matching an `int` argument  
B. Same-class constructor matching an `int`  
C. A method called `super`  
D. A JVM setting

---

### Q19.

Which statement is correct?

```text
this(...)
   ↓
?

super(...)
   ↓
?
```

A.

```text
same-class constructor
parent-class constructor
```

B.

```text
parent-class constructor
same-class constructor
```

C.

```text
object
JVM
```

D.

```text
method
variable
```

---

### Q20. Tricky

A developer says:

> “`this()` and `super()` both call constructors, so they are interchangeable.”

Is that correct?

A. Yes  
B. No

Explain the difference.

---

# Part F — First Constructor Statement Rule

### Q21.

Can a constructor begin with:

```java
this(...);
```

A. Yes  
B. No

---

### Q22.

Can a constructor begin with:

```java
super(...);
```

A. Yes  
B. No

---

### Q23.

Can the same constructor begin with both?

```java
this(...);
super(...);
```

A. Yes  
B. No

---

### Q24. Hard

What is the correct mental model?

```text
Constructor
     │
     ├── this(...)  → __________
     │
     └── super(...) → __________
```

Fill the two blanks.

---

# Part G — `this()` OR `super()`

### Q25.

Which is valid as the constructor-call mechanism at the beginning of a constructor?

A. `this(...)` OR `super(...)`  
B. Both together  
C. Neither ever  
D. Only `this()` in every class

---

### Q26.

Why cannot a constructor begin with:

```java
this(100);
super();
```

A. A constructor must choose one constructor-chaining path  
B. `super()` is not a constructor call  
C. `this()` can only be used in methods  
D. Java allows unlimited constructor calls at the beginning

---

### Q27. Tricky

Suppose:

```java
class User
{
    User()
    {
        this(100);
        super();
    }
}
```

What is the key Day 15 issue?

A. Both `this(...)` and `super(...)` are being used as constructor-chain mechanisms  
B. `100` is not an integer  
C. `User()` is not a constructor  
D. `super()` calls the same class

---

# Part H — Implicit `super()`

Consider:

```java
class Parent
{
    Parent()
    {
    }
}

class Child extends Parent
{
    Child()
    {
    }
}
```

### Q28.

If `Child()` has neither explicit `this(...)` nor `super(...)`, what does the compiler supply?

A. `super()`  
B. `this()`  
C. `Object()` directly only  
D. Nothing

---

### Q29.

Conceptually, the constructor behaves like:

```java
Child()
{
    ________;
}
```

What belongs in the blank?

---

### Q30.

Why is the implicit `super()` important?

A. It connects child construction to superclass construction when no explicit constructor call is written  
B. It creates another child object  
C. It skips the parent class  
D. It calls `main()`

---

### Q31. Tricky

A student says:

> “If I do not write `super()`, the parent constructor will never execute.”

Is that consistent with the Day 15 rule?

A. Yes  
B. No

Explain.

---

# Part I — Constructor Matching Still Applies

Suppose:

```java
class Parent
{
    Parent(int value)
    {
    }
}

class Child extends Parent
{
    Child()
    {
        super(200);
    }
}
```

### Q32.

Which parent constructor is being requested?

A. `Parent(int)`  
B. `Parent()`  
C. `Child(int)`  
D. `Object(int)`

---

### Q33.

Why does:

```java
super(200);
```

match:

```java
Parent(int value)
```

A. The argument pattern is `int`  
B. `super` ignores parameter types  
C. Constructors do not have signatures  
D. `200` is automatically a String

---

### Q34.

Suppose the parent contains only:

```java
Parent(int value)
{
}
```

and the child contains:

```java
Child()
{
    super();
}
```

What is the issue?

A. `Parent()` does not exist as a matching no-argument constructor  
B. `super()` always means `Parent(int)`  
C. Child constructors cannot call parents  
D. `int` constructors cannot be inherited

---

### Q35. Hard

Trace:

```text
Child()
 ↓
super()
 ↓
Parent()
 ↓
Does Parent() exist?
```

If the answer is **No**, what happens?

A. Compilation error  
B. Java automatically changes `super()` into `super(0)`  
C. Java ignores the call  
D. The child constructor runs twice

---

# Part J — Parent Before Child

### Q36.

Why does constructor chaining move through the superclass hierarchy?

A. Parent-level initialization occurs before child-level initialization is completed  
B. Child constructors always run first  
C. Parent classes are ignored during object creation  
D. `this()` requires GitHub

---

### Q37.

Which sequence best represents the Day 15 model?

A.

```text
Parent initialization
↓
Child initialization
```

B.

```text
Child initialization
↓
Parent initialization
```

C.

```text
GitHub
↓
Child
↓
Parent
```

D.

```text
Debugger
↓
Parent
```

---

### Q38. Tricky

Why is:

```text
Child initialization first
↓
Parent later
```

not the mental model taught on Day 15?

Explain using superclass construction.

---

# Part K — Three-Level Constructor Chain

Consider:

```java
class A
{
    A()
    {
        System.out.println("A");
    }
}

class B extends A
{
    B()
    {
        System.out.println("B");
    }
}

class C extends B
{
    C()
    {
        System.out.println("C");
    }
}
```

### Q39.

What is the hierarchy?

A.

```text
Object
  ↑
  A
  ↑
  B
  ↑
  C
```

B.

```text
C
↑
B
↑
A
```

C.

```text
Object
↑
C
↑
B
↑
A
```

D. No hierarchy

---

### Q40.

When:

```java
new C();
```

is executed, which constructor is directly associated with the requested object type?

A. `C()`  
B. `B()`  
C. `A()`  
D. `Object()` only

---

### Q41.

If `C()` has no explicit `super()` or `this()`, what constructor-call mechanism is supplied?

A. `super()`  
B. `this()`  
C. `Object()` directly  
D. None

---

### Q42.

If `B()` also has no explicit constructor call, what happens conceptually?

A. `B()` calls `super()` toward `A()`  
B. `B()` calls `this()` toward `C()`  
C. `B()` skips `A()`  
D. `B()` calls `Object()` directly while skipping `A()`

---

### Q43. Hard

Trace the complete constructor chain beginning from:

```java
new C();
```

Use:

```text
C()
↓
?
↓
?
↓
?
```

---

### Q44. Tricky

Why is it useful to think about the **chain** instead of memorizing only the output?

A. The chain explains why each constructor executes and which superclass must be initialized  
B. Output is never useful  
C. Constructor order is random  
D. `super()` is ignored by Java

---

# Part L — `this()` Chain Within One Class

Consider:

```java
class User
{
    User()
    {
        System.out.println("A");
    }

    User(int value)
    {
        this();
        System.out.println("B");
    }

    User(int value, String name)
    {
        this(value);
        System.out.println("C");
    }
}
```

### Q45.

Which constructor does:

```java
new User(10, "Ravi");
```

directly call?

A. `User(int, String)`  
B. `User(int)`  
C. `User()`  
D. `Object()`

---

### Q46.

What does:

```java
this(value);
```

inside `User(int, String)` call?

A. `User(int)`  
B. `User()`  
C. Parent constructor  
D. `Object()`

---

### Q47.

What does:

```java
this();
```

inside `User(int)` call?

A. `User()`  
B. `User(int, String)`  
C. Parent constructor  
D. `Object()`

---

### Q48. Hard

Trace the constructor chain:

```text
new User(10, "Ravi")
        ↓
?
        ↓
?
        ↓
?
```

---

### Q49. Tricky

What is the difference between:

```java
this(value);
```

inside a constructor and:

```java
super(value);
```

inside a child constructor?

A. First targets another constructor in the same class; second targets a constructor in the parent class  
B. Both always target the parent  
C. Both always target the same class  
D. Neither is a constructor call

---

# Part M — Output Prediction

Use:

```java
class User
{
    User()
    {
        System.out.println("Default");
    }

    User(String name)
    {
        this();
        System.out.println(name);
    }
}
```

### Q50.

Predict the exact output:

```java
new User("Ravi");
```

---

### Q51.

How many constructors execute?

A. 1  
B. 2  
C. 3  
D. 0

---

### Q52.

Which constructor executes first?

A. `User(String)`  
B. `User()`  
C. Parent constructor  
D. `Object()` only

---

### Q53.

Which constructor is entered through `this()`?

A. `User()`  
B. `User(String)`  
C. Parent constructor  
D. None

---

# Part N — Compiler Error Reasoning

### Q54.

Consider:

```java
class Parent
{
    Parent(int value)
    {
    }
}

class Child extends Parent
{
    Child()
    {
    }
}
```

What should you check when reasoning about the child constructor?

A. Whether the required superclass constructor is available for the implicit `super()`  
B. Whether GitHub is connected  
C. Whether F8 is pressed  
D. Whether `this` is static

---

### Q55. Hard

Why can this fail?

```java
class Parent
{
    Parent(int value)
    {
    }
}

class Child extends Parent
{
    Child()
    {
    }
}
```

A. The implicit `super()` needs a matching `Parent()` constructor, which is not present  
B. `Child()` cannot exist  
C. `int` constructors are invalid  
D. Parent constructors are never involved

---

### Q56.

What should you ask when a constructor-related compilation error appears?

A.

```text
What constructor am I trying to call?
Which class should contain it?
What parameters does it expect?
Does it exist?
```

B.

```text
Which GitHub branch is active?
```

C.

```text
Which breakpoint should I delete?
```

D.

```text
Which keyboard shortcut formats code?
```

---

### Q57. Tricky

Why is reading the compiler error part of learning constructor chaining?

A. The error can reveal that the requested constructor does not exist or does not match  
B. Compiler errors automatically fix the constructor  
C. Compiler errors replace debugging  
D. Constructor matching is unrelated to errors

---

# Part O — Logging Concept

### Q58.

Why is:

```java
System.out.println("SMS started");
```

useful while learning?

A. It makes execution flow visible  
B. It permanently stores production logs  
C. It replaces all logging frameworks  
D. It creates a database record

---

### Q59.

Why is relying only on an Eclipse console not the production model described in Day 15?

A. A server application needs useful execution information recorded so technical teams can investigate later  
B. Eclipse cannot run Java  
C. Console output is illegal  
D. Constructors cannot print

---

### Q60.

A simplified production logging flow is:

```text
User Action
    ↓
Application / Server
    ↓
Java Code
    ↓
?
    ↓
Log Files
```

What belongs at `?`?

A. Log Information  
B. `this()`  
C. `super()`  
D. Constructor overload

---

### Q61.

Which question can useful logs help answer?

A. Did payment happen?  
B. Which Java keyword is longest?  
C. Which constructor has the most letters?  
D. Which Eclipse shortcut is fastest?

---

### Q62. Tricky

According to Day 15, should you stop using:

```java
System.out.println(...)
```

immediately while learning?

A. No; it remains useful for making execution flow visible during learning  
B. Yes; it is never useful  
C. Yes; Java does not support it  
D. Only constructors can use it

---

### Q63.

Which proper logging technologies were mentioned as later examples?

A. Log4j and SLF4J  
B. JDBC and JPA  
C. Maven and Git  
D. Eclipse and JVM

---

# Part P — Eclipse Navigation

### Q64.

Why is IDE navigation useful when following constructor chains?

A. It helps locate referenced classes and constructors in a large codebase  
B. It automatically rewrites constructors  
C. It disables inheritance  
D. It removes compiler errors

---

### Q65.

What is the practical navigation idea?

```text
Large codebase
      ↓
Locate referenced type
      ↓
Jump to its constructor/class
      ↓
Read matching code
```

A. Correct  
B. Incorrect

---

### Q66. Hard

Suppose a child constructor contains:

```java
super(200);
```

but you do not remember the parent's constructors.

What should you do?

A. Navigate to the parent class and inspect its constructor signatures  
B. Guess the signature  
C. Delete `super(200)`  
D. Replace it with `this(200)` automatically

---

# Part Q — Integrated Constructor Reasoning

Consider:

```java
class Parent
{
    Parent()
    {
        System.out.println("Parent");
    }

    Parent(int value)
    {
        System.out.println("Parent " + value);
    }
}

class Child extends Parent
{
    Child()
    {
        super(100);
        System.out.println("Child");
    }
}
```

### Q67.

Which constructor does `Child()` explicitly call?

A. `Parent(int)`  
B. `Parent()`  
C. `Child(int)`  
D. `Object(int)`

---

### Q68.

Is:

```java
super(100);
```

valid?

A. Yes  
B. No

---

### Q69.

Why?

A. `Parent(int)` exists and matches the supplied `int` argument  
B. `super()` ignores parameters  
C. Child constructors cannot call parents  
D. `100` is automatically a String

---

### Q70. Predict the output.

```java
Child c = new Child();
```

Write the exact output order.

---

### Q71. Hard

Why does the parent output occur before the child output in this example?

A. The superclass constructor is called before the remaining child-constructor statements execute  
B. Java always prints parent names first alphabetically  
C. `super()` executes after the child constructor  
D. The child constructor is not executed

---

# Part R — Combined `this()` + `super()`

Consider:

```java
class Parent
{
    Parent(int value)
    {
        System.out.println("Parent " + value);
    }
}

class Child extends Parent
{
    Child()
    {
        this(100);
        System.out.println("Child default");
    }

    Child(int value)
    {
        super(value);
        System.out.println("Child int");
    }
}
```

### Q72.

Which constructor is directly called by:

```java
new Child();
```

A. `Child()`  
B. `Child(int)`  
C. `Parent(int)`  
D. `Object()`

---

### Q73.

What does:

```java
this(100);
```

inside `Child()` call?

A. `Child(int)`  
B. `Parent(int)`  
C. `Parent()`  
D. `Object()`

---

### Q74.

What does:

```java
super(value);
```

inside `Child(int)` call?

A. `Parent(int)`  
B. `Child()`  
C. `Child(int)`  
D. `Object(int)`

---

### Q75. Hard

Trace the complete chain:

```text
new Child()
   ↓
?
   ↓
?
   ↓
?
```

---

### Q76. Tricky

Why can the overall chain use both `this(...)` and `super(...)` even though one constructor cannot use both as its first constructor-call mechanism?

A. Different constructors can participate in the chain: one constructor can call another same-class constructor, and that constructor can then call the parent  
B. Java allows two calls in the same constructor  
C. `this()` and `super()` are not constructor calls  
D. The rule does not apply to inheritance

---

# Part S — Master Three-Level Challenge

Consider:

```java
class A
{
    A()
    {
        System.out.println("A");
    }

    A(int value)
    {
        System.out.println("A " + value);
    }
}

class B extends A
{
    B()
    {
        this(10);
        System.out.println("B default");
    }

    B(int value)
    {
        super(value);
        System.out.println("B int");
    }
}

class C extends B
{
    C()
    {
        System.out.println("C");
    }
}
```

### Q77.

What happens when:

```java
new C();
```

is executed?

Describe the constructor chain without relying only on output.

---

### Q78.

Which constructor is initially entered?

A. `C()`  
B. `B()`  
C. `B(int)`  
D. `A(int)`

---

### Q79.

Does `C()` explicitly write `super()`?

A. Yes  
B. No

---

### Q80.

If no explicit constructor call is written in `C()`, what constructor call is conceptually supplied?

A. `super()` → `B()`  
B. `this()` → `B()`  
C. `super(10)` → `B(int)`  
D. `this(10)` → `B(int)`

---

### Q81.

What does `B()` call?

A. `this(10)` → `B(int)`  
B. `super(10)` → `A(int)`  
C. `this()` → `B()`  
D. `A()`

---

### Q82.

What does `B(int)` call?

A. `super(value)` → `A(int)`  
B. `this(value)` → `B(int)`  
C. `super()` → `A()`  
D. `C()`

---

### Q83. Hard

Write the full constructor chain in order of **entry**:

```text
new C()
↓
?
↓
?
↓
?
↓
?
```

---

### Q84. Hard

Now explain the order in which the constructor bodies **complete**, and why that differs from simply listing the initial call.

---

### Q85. Tricky

Which concept explains the entire scenario?

A. Constructor chaining  
B. Method overloading only  
C. Static initialization only  
D. Logging only

---

# Part T — Final Day 15 Master Challenge

## Q86. Analyze Without Running

Study this code carefully:

```java
class Parent
{
    Parent()
    {
        System.out.println("Parent()");
    }

    Parent(int value)
    {
        System.out.println("Parent(int)");
    }
}

class Child extends Parent
{
    Child()
    {
        this(50);
        System.out.println("Child()");
    }

    Child(int value)
    {
        super(value);
        System.out.println("Child(int)");
    }
}

class Driver
{
    public static void main(String[] args)
    {
        Child obj = new Child();
    }
}
```

Answer every part.

### A.
Which constructor is directly called by:

```java
new Child()
```

### B.
What does `this(50)` call?

### C.
What does `super(value)` call?

### D.
Which class does `super(value)` target?

### E.
What is the complete constructor chain?

### F.
How many constructor bodies execute?

### G.
Which constructor is responsible for initializing the parent side of the object?

### H.
Why can `Child()` use `this(50)` but not also use `super()` as its constructor-call statement?

### I.
Predict the exact output.

### J.
Explain the difference between:

```java
this
this()
super()
```

### K.
If `Parent(int)` were removed, what constructor-matching problem would appear?

### L.
What should you inspect in the parent class to verify whether `super(value)` is valid?

### M.
What rule allows `Child()` to call `this(50)` as its first statement?

### N.
What rule allows `Child(int)` to call `super(value)` as its first statement?

### O.
Explain the full object-creation flow:

```text
new Child()
      ↓
Child constructor
      ↓
this(...)
      ↓
same-class constructor
      ↓
super(...)
      ↓
parent constructor
      ↓
return through chain
      ↓
remaining child statements
```

---

# Day 15 Master Mental Model

## `this` vs `this()`

```text
this
 ↓
Current object


this(...)
 ↓
Another constructor
of the SAME class
```

## `super(...)`

```text
super(...)
 ↓
Constructor of
PARENT class
```

## Constructor Rule

```text
Constructor begins
       ↓
  this(...) OR super(...)
       ↓
Called constructor executes
       ↓
Remaining statements
```

## If Neither Is Written

```text
No explicit this(...)
AND
No explicit super(...)
        ↓
Compiler supplies:
super()
        ↓
Parent no-argument constructor
```

## Constructor Matching

```text
super(...)
   ↓
Read arguments
   ↓
Find parent constructor
   ↓
Match parameter types/order
   ↓
Exists?
 ↙       ↘
YES       NO
 ↓         ↓
Call     Compilation
         error
```

## Inheritance Chain

```text
Object
   ↑
Parent
   ↑
Child

new Child()
     ↓
Child constructor
     ↓
Parent constructor
     ↓
Object constructor
     ↓
return through chain
     ↓
complete child initialization
```

## Same-Class Constructor Chain

```text
User(int, String)
       ↓
this(int)
       ↓
User(int)
       ↓
this()
       ↓
User()
```

---

# Final Revision Checklist

Before considering Day 15 complete, explain these without notes:

```text
Logging concept
System.out.println() for learning
Production logging concept
this
this()
super()
this() vs super()
this(...) first-statement rule
super(...) first-statement rule
this(...) OR super(...)
Implicit super()
Constructor matching
Constructor chaining
Parent initialization
Child initialization
Object hierarchy
Three-level constructor chain
Reading constructor compiler errors
Eclipse navigation for constructors
```

### Day 15 Core Skill

> **Given any constructor call, determine whether it moves within the same class through `this(...)` or moves upward through inheritance with `super(...)`, then trace the complete constructor chain and verify that every required constructor actually exists.**
