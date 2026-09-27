# Day 13 — Professional Practice Set
## Constructors in Depth: Matching, Overloading, Default Constructor & Object State
### Medium → Hard → Tricky

> **Practice rule:** For every `new ClassName(...)`, do not just ask “what object is created?”
> Ask: **What constructor signature is Java looking for, does it exist, and what object state will it initialize?**

---

# Current Day 13 Scope

Strictly based on the Day 13 learning material:

```text
Class → Object → Data + Methods
Object creation and constructor calls
Constructor matching
Argument type matching
Argument order matching
Multiple constructors
Constructor overloading
Default/no-argument constructor rule
Instance-variable default values
`this`
Object-specific instance state
Constructor access modifiers
Java's Object class
Basic inheritance hierarchy to Object
Eclipse Open Type — Ctrl + Shift + T
Requirement-driven constructor design
Naming conventions
Product constructor design
Hands-on constructor experiments
```

This set does **not** introduce constructor chaining, `super()`, method overloading, polymorphism, collections, exception handling, or advanced inheritance behavior because those topics are not supported by the supplied Day 13 material.

---

# Part A — Object Creation & Constructor Matching

### Q1.

Consider:

```java
class Account
{
    Account()
    {
    }
}
```

What is Java trying to find when this executes?

```java
new Account();
```

A. A matching constructor  
B. A matching method  
C. A matching variable  
D. A matching package

---

### Q2.

What is the constructor signature in:

```java
Account(int amount, String name)
{
}
```

A. `Account()`  
B. `Account(int)`  
C. `Account(int, String)`  
D. `Account(String, int)`

---

### Q3.

Given:

```java
class Account
{
    Account(int amount, String name)
    {
    }
}
```

Which call matches?

A.

```java
new Account(2000, "Ravi");
```

B.

```java
new Account("Ravi", 2000);
```

C.

```java
new Account(2000);
```

D.

```java
new Account();
```

---

### Q4.

Why does:

```java
new Account("Ravi", 2000);
```

not match:

```java
Account(int amount, String name)
```

A. Argument types are in the wrong order  
B. Constructor names are different  
C. Objects cannot receive Strings  
D. `this` is missing

---

### Q5. Tricky

A constructor expects:

```text
(int, String)
```

The call supplies:

```text
(String, int)
```

Both types individually exist in Java.

Why can the call still fail?

Explain the importance of **order**.

---

# Part B — Constructor Overloading

### Q6.

Which situation represents constructor overloading?

A.

```java
Account()
Account(int)
Account(int, String)
```

B.

```java
Account()
Account()
Account()
```

C.

```java
Account()
Customer()
Product()
```

D.

```java
amount()
name()
```

---

### Q7.

Given:

```java
class Account
{
    Account()
    {
    }

    Account(int amount)
    {
    }

    Account(int amount, String name)
    {
    }
}
```

How many constructors are declared?

A. 1  
B. 2  
C. 3  
D. 4

---

### Q8.

Which call selects the no-argument constructor?

```java
new Account();
```

A. `Account()`  
B. `Account(int)`  
C. `Account(int, String)`  
D. No constructor

---

### Q9.

Which call selects:

```java
Account(int amount)
```

A.

```java
new Account();
```

B.

```java
new Account(2000);
```

C.

```java
new Account(2000, "Ravi");
```

D.

```java
new Account("Ravi", 2000);
```

---

### Q10.

Which call selects:

```java
Account(int amount, String name)
```

A.

```java
new Account(2000, "Ravi");
```

B.

```java
new Account("Ravi");
```

C.

```java
new Account(2000);
```

D.

```java
new Account();
```

---

# Part C — Think Like the Compiler

Use:

```java
class Account
{
    Account()
    {
    }

    Account(int amount)
    {
    }

    Account(int amount, String name)
    {
    }
}
```

### Q11.

For:

```java
new Account(2000);
```

what is the first thing Java should determine?

A. Requested type is `Account` and the argument pattern is `(int)`  
B. The object name must be `2000`  
C. The class must be renamed  
D. The JVM must find a method called `new`

---

### Q12.

For:

```java
new Account(2000, "Ravi");
```

the argument pattern is:

A. `(String, int)`  
B. `(int, String)`  
C. `(int)`  
D. `()`

---

### Q13.

For:

```java
new Account("Ravi", 2000);
```

the argument pattern is:

A. `(int, String)`  
B. `(String, int)`  
C. `(String)`  
D. `()`

---

### Q14. Hard

Java finds these constructors:

```text
Account()
Account(int)
Account(int, String)
```

Then the program contains:

```java
new Account("Ravi", 2000);
```

What does Java effectively search for?

A. `Account(String, int)`  
B. `Account(int, String)` only  
C. `Account()`  
D. Any constructor with two parameters regardless of types

---

### Q15. Tricky

Suppose the class has:

```java
Account(int amount, String name)
```

but the program calls:

```java
new Account(2000, "Ravi", 10);
```

What is the issue?

A. No constructor with three matching arguments exists  
B. Java ignores the extra argument automatically  
C. Java calls the two-parameter constructor and discards `10`  
D. `this` removes the extra argument

---

# Part D — Default Constructor Rule

### Q16.

Consider:

```java
class Account
{
}
```

No constructor is written.

Can this be instantiated using:

```java
new Account();
```

A. Yes  
B. No

---

### Q17.

Why?

A. The compiler provides a no-argument constructor when no constructor is declared  
B. Every class always has every possible constructor  
C. `new` creates a constructor automatically  
D. `Object` supplies the exact constructor

---

### Q18.

Now consider:

```java
class Account
{
    Account(int amount)
    {
    }
}
```

Can this be instantiated using:

```java
new Account();
```

A. Yes  
B. No

---

### Q19. Important

Why does the answer to Q18 differ from Q16?

A. Once the developer declares a constructor, the compiler does not automatically add the no-argument constructor  
B. `int` removes the class's object capability  
C. `new` works only with Strings  
D. Constructors cannot accept primitive types

---

### Q20. Tricky

A developer says:

> “If a class has `Account(int)`, Java will also create `Account()` automatically.”

Is that consistent with the Day 13 rule?

A. Yes  
B. No

Explain.

---

### Q21.

Which statement correctly summarizes the rule?

A. Compiler adds `Account()` only when the class declares no constructor at all  
B. Compiler always adds `Account()`  
C. Compiler adds `Account()` whenever another constructor exists  
D. Constructor overloading automatically creates every possible signature

---

# Part E — Default Instance Values

Use:

```java
class Account
{
    int amount;
    String name;
}
```

### Q22.

After:

```java
Account acc = new Account();
```

assuming no explicit constructor assignment, what are the instance-variable default values?

A. `amount = 0`, `name = null`  
B. `amount = null`, `name = 0`  
C. `amount = 1`, `name = ""`  
D. Both are undefined

---

### Q23.

What does:

```java
null
```

represent for the `String name` instance variable in this example?

A. No object reference/value is assigned to it yet  
B. The String `"null"`  
C. Integer zero  
D. Empty String

---

### Q24. Tricky

Which is the more accurate statement?

A. Default values belong to the newly created object's instance state  
B. Default values change the class definition  
C. Default values are constructor parameters  
D. Default values are VM arguments

---

# Part F — Constructor + `this`

Use:

```java
class Account
{
    int amount;
    String name;

    Account(int amount, String name)
    {
        this.amount = amount;
        this.name = name;
    }
}
```

### Q25.

What does:

```java
this
```

represent?

A. Current object  
B. Current class definition  
C. JVM  
D. Constructor parameter list

---

### Q26.

In:

```java
this.amount = amount;
```

the left-side `amount` is:

A. Instance variable of the current object  
B. Constructor parameter  
C. Class name  
D. Local method name

---

### Q27.

The right-side `amount` is:

A. Instance variable  
B. Constructor parameter  
C. Object reference  
D. Class

---

### Q28.

Translate:

```java
this.name = name;
```

into plain English.

A. Current object's `name` receives the constructor's `name` parameter  
B. The class is renamed  
C. The constructor receives the object's name  
D. The JVM creates a String class

---

### Q29. Tricky

Why is this useful?

```java
this.amount = amount;
```

A. It distinguishes the current object's field from the constructor parameter with the same name  
B. It creates two amounts  
C. It converts `amount` into an object  
D. It makes `amount` static

---

# Part G — Object-Specific State

### Q30.

Given:

```java
Account acc1 = new Account();
Account acc2 = new Account(2000, "Ravi");
```

Which statement is correct?

A. `acc1` and `acc2` are separate objects  
B. `acc1` and `acc2` are automatically the same object  
C. Only `acc2` is an object  
D. Only `acc1` is an object

---

### Q31.

Based on the Day 13 model, what state can `acc1` have?

```text
amount = ?
name   = ?
```

A. `0`, `null`  
B. `2000`, `"Ravi"`  
C. `"Ravi"`, `2000`  
D. Both undefined

---

### Q32.

What state does `acc2` have after:

```java
new Account(2000, "Ravi");
```

with the constructor from the notes?

A. `amount = 2000`, `name = "Ravi"`  
B. `amount = 0`, `name = null`  
C. `amount = "Ravi"`, `name = 2000`  
D. Both are class values

---

### Q33. Hard

Why can the same class produce:

```text
acc1 → amount = 0,    name = null
acc2 → amount = 2000, name = "Ravi"
```

A. Each object has its own instance state and may be initialized differently  
B. Java creates a different class for every object  
C. Constructors change the class definition  
D. Instance variables are static

---

# Part H — Access Modifiers on Constructors

### Q34.

Can a constructor have an access modifier?

A. Yes  
B. No

---

### Q35.

Consider:

```java
public Account()
{
}
```

What does `public` affect here?

A. Accessibility of the constructor  
B. Data type of the object  
C. Number of instance variables  
D. Constructor parameter order

---

### Q36.

The Day 13 revision described:

```text
private
default
protected
public
```

as access levels.

What practical question should you ask about a constructor's access modifier?

A. Who is allowed to invoke that constructor?  
B. How much memory does the object use?  
C. What data type is the constructor?  
D. Which JVM starts first?

---

### Q37. Tricky

A constructor is:

```java
private Account()
{
}
```

What is the key Day 13 concept?

A. Its accessibility is restricted  
B. It automatically becomes public  
C. It becomes a method  
D. It cannot initialize object state

---

# Part I — `Object` Class

### Q38.

If:

```java
class A
{
}
```

does not explicitly extend another class, the Day 13 material places it in the hierarchy under:

A. `Object`  
B. `String`  
C. `System`  
D. `Integer`

---

### Q39.

Which hierarchy matches the simple example?

A.

```text
Object
  ↑
  A
```

B.

```text
A
  ↑
Object
```

C.

```text
String
  ↑
A
```

D.

```text
JVM
  ↑
A
```

---

### Q40.

Given:

```java
class A
{
}

class B extends A
{
}
```

the simplified hierarchy is:

```text
Object
   ↑
   ?
   ↑
   B
```

What belongs at `?`?

A. `A`  
B. `String`  
C. `System`  
D. `Integer`

---

### Q41. Tricky

Why can `B` be described as indirectly related to `Object` in this hierarchy?

A. `B` extends `A`, and `A` is under `Object` in the hierarchy  
B. `B` directly extends every Java class  
C. Constructors create inheritance automatically  
D. `this` creates the hierarchy

---

### Q42.

Which methods were specifically mentioned as examples of methods provided through `Object`?

A. `equals()` and `hashCode()`  
B. `main()` and `println()`  
C. `parseInt()` and `print()`  
D. `new()` and `this()`

---

# Part J — Eclipse Type Navigation

### Q43.

What does:

```text
Ctrl + Shift + T
```

do in the Day 13 Eclipse workflow?

A. Open Type  
B. Run Java Application  
C. Format code  
D. Organize imports

---

### Q44.

What can Open Type help you explore?

A. Java classes/types such as `Object`  
B. Only GitHub repositories  
C. Only constructor arguments  
D. Only JVM memory

---

### Q45. Tricky

Why was the Open Type workflow introduced?

A. To become comfortable navigating Java's type hierarchy  
B. To memorize every line of library source code  
C. To replace constructor practice  
D. To create object state automatically

---

# Part K — Constructor Matching: Medium → Hard

Use:

```java
class Product
{
    Product()
    {
    }

    Product(String name, String description)
    {
    }

    Product(String name, String description, int quantity)
    {
    }
}
```

### Q46.

Which constructor matches:

```java
new Product();
```

A. `Product()`  
B. `Product(String, String)`  
C. `Product(String, String, int)`  
D. None

---

### Q47.

Which constructor matches:

```java
new Product("Laptop", "Office laptop");
```

A. `Product()`  
B. `Product(String, String)`  
C. `Product(String, String, int)`  
D. None

---

### Q48.

Which constructor matches:

```java
new Product(
    "Laptop",
    "Office laptop",
    5
);
```

A. `Product()`  
B. `Product(String, String)`  
C. `Product(String, String, int)`  
D. None

---

### Q49.

What happens with:

```java
new Product(
    "Laptop",
    5,
    "Office laptop"
);
```

A. No matching constructor based on the declared signatures  
B. The three arguments are reordered automatically  
C. Java ignores the order  
D. The two-argument constructor is selected

---

### Q50. Hard

The class contains:

```text
Product()
Product(String, String)
Product(String, String, int)
```

A developer writes:

```java
new Product("Laptop");
```

What does Java search for?

A. `Product(String)`  
B. `Product()`  
C. `Product(String, String)`  
D. Any constructor containing String

---

### Q51. Tricky

Suppose:

```java
Product(String name, String description)
```

exists.

A developer writes:

```java
new Product(null, null);
```

Based strictly on the supplied Day 13 material, what should you focus on when reasoning about the call?

A. The argument count/order and declared parameter types  
B. The object must automatically become `null`  
C. The constructor becomes `Product()`  
D. `null` changes the constructor definition

---

# Part L — Default Constructor Trap

### Q52.

Consider:

```java
class Account
{
    int amount;
}
```

No constructor is declared.

Is:

```java
new Account();
```

valid under the Day 13 rule?

A. Yes  
B. No

---

### Q53.

Now:

```java
class Account
{
    int amount;

    Account(int amount)
    {
        this.amount = amount;
    }
}
```

Is:

```java
new Account();
```

valid?

A. Yes  
B. No

---

### Q54. Hard

A student says:

> “But the compiler gave a default constructor in the first class, so it should still give one in the second class.”

What rule should correct this reasoning?

---

### Q55. Tricky

Which class supports `new Account()` through the compiler-supplied no-argument constructor?

A.

```java
class Account
{
}
```

B.

```java
class Account
{
    Account(int amount)
    {
    }
}
```

C. Both  
D. Neither

---

# Part M — Requirement-Driven Constructor Design

Suppose an e-commerce `Product` has:

```text
productName
price
description
quantity
```

### Q56.

Before writing constructors, what should you identify first?

A. The product-creation requirements/object states  
B. Random constructor signatures  
C. Git commands  
D. JVM memory settings

---

### Q57.

If one valid requirement is:

```text
Create product with name, description and quantity
```

what constructor signature naturally represents that requirement?

A.

```java
Product(String name, String description, int quantity)
```

B.

```java
Product(int quantity, String name)
```

C.

```java
Product()
```

D.

```java
Product(String name)
```

---

### Q58.

If another valid requirement is:

```text
Create product with name and description
```

which constructor could represent it?

A.

```java
Product(String name, String description)
```

B.

```java
Product(int quantity)
```

C.

```java
Product()
```

D.

```java
Product(String description, int quantity)
```

---

### Q59. Hard

Why should constructor design follow requirements instead of starting with arbitrary overloads?

A. Constructors should represent the valid ways the object needs to be created  
B. Java allows only three constructors  
C. Constructors cannot have different parameter lists  
D. Requirements do not affect code

---

### Q60. Tricky

A developer creates ten constructors before reading the product requirements.

What Day 13 lesson does this violate?

A. Understand requirements first, then identify required object states and constructors  
B. Always create ten constructors  
C. Always use the no-argument constructor  
D. Avoid instance variables

---

# Part N — Naming Conventions

### Q61.

Which naming style was used to clearly distinguish the field and parameter?

```java
String productName;

Product(String productName)
{
    this.productName = productName;
}
```

A. Same meaningful name for field and parameter, with `this` identifying the field  
B. Random names for every variable  
C. All variables named `x`  
D. Field must always be uppercase

---

### Q62.

In:

```java
this.productName = productName;
```

which one is the instance variable?

A. `this.productName`  
B. `productName` on the right  
C. Both are necessarily different types  
D. Neither

---

### Q63.

What is the practical benefit of meaningful naming?

A. It improves readability and maintainability  
B. It changes constructor matching rules  
C. It changes object memory  
D. It creates additional constructors

---

# Part O — Output & State Prediction

Use:

```java
class Account
{
    int amount;
    String name;

    Account()
    {
    }

    Account(int amount, String name)
    {
        this.amount = amount;
        this.name = name;
    }
}
```

### Q64.

What is the state of:

```java
Account acc1 = new Account();
```

under the Day 13 model?

```text
amount = ?
name   = ?
```

---

### Q65.

What is the state of:

```java
Account acc2 = new Account(2000, "Ravi");
```

```text
amount = ?
name   = ?
```

---

### Q66.

Do `acc1` and `acc2` share one instance-variable state?

A. Yes  
B. No

---

### Q67. Hard

If:

```java
acc2.amount
```

is initialized to `2000`, does that make:

```java
acc1.amount
```

automatically `2000`?

A. Yes  
B. No

Explain using object-specific instance state.

---

# Part P — Compiler-Style Tracing

### Q68.

For:

```java
new Account(2000, "Ravi");
```

write the five-step reasoning process:

```text
1. Requested type = ?
2. Argument pattern = ?
3. Search constructors in = ?
4. Matching constructor = ?
5. Result = ?
```

---

### Q69.

For:

```java
new Account("Ravi", 2000);
```

where only:

```java
Account(int amount, String name)
```

exists, complete:

```text
Requested type = Account
Argument pattern = ?
Matching constructor = ?
Result = ?
```

---

### Q70. Hard

Explain why this way of thinking:

```text
Arguments → Signature → Constructor match
```

is more useful than simply memorizing:

> “This gives a compilation error.”

---

# Part Q — Deliberate Error Analysis

### Q71.

Given:

```java
class Account
{
    Account(int amount)
    {
    }
}
```

What is wrong with:

```java
Account acc = new Account();
```

Explain the exact constructor mismatch.

---

### Q72.

Given:

```java
class Account
{
    Account(int amount, String name)
    {
    }
}
```

What is wrong with:

```java
Account acc =
    new Account("Ravi", 2000);
```

Do not just say “type mismatch.” State the expected and supplied order.

---

### Q73. Hard

Given:

```java
class Product
{
    Product(String name, String description)
    {
    }

    Product(String name, String description, int quantity)
    {
    }
}
```

A developer writes:

```java
new Product(
    "Laptop",
    "Office laptop",
    "5"
);
```

Why does the call not match the three-parameter constructor?

---

### Q74. Tricky

Why is:

```java
"5"
```

different from:

```java
5
```

for constructor matching?

Answer only using the type information relevant to this Day 13 exercise.

---

# Part R — Constructor Access + Matching

### Q75.

Suppose:

```java
private Account()
{
}
```

What two separate questions should you consider when analyzing an attempted constructor call?

A. Does the constructor signature match, and is the constructor accessible from the calling location?  
B. Is the object static, and is the JVM running?  
C. Is the variable local, and is GitHub connected?  
D. Is `this` present, and is the class final?

---

### Q76. Hard

Why is constructor accessibility different from constructor matching?

Explain the distinction between:

```text
Which constructor?
```

and:

```text
Who can invoke it?
```

---

# Part S — Eclipse Exploration

### Q77.

You want to explore Java's `Object` type in Eclipse.

Which shortcut from Day 13 should you remember?

```text
____________________
```

---

### Q78.

After using Open Type, what should be your goal?

A. Become comfortable navigating Java types/hierarchy  
B. Memorize every library implementation detail  
C. Change constructor signatures automatically  
D. Create a GitHub commit

---

# Part T — Final Tricky Scenarios

### Q79.

Consider:

```java
class Account
{
    Account()
    {
    }

    Account(int amount)
    {
    }
}
```

Which statements are true?

A. `new Account()` matches `Account()`  
B. `new Account(2000)` matches `Account(int)`  
C. Both A and B  
D. Neither

---

### Q80.

Consider:

```java
class Account
{
    Account(int amount)
    {
    }
}
```

Which statement is true?

A. `new Account()` does not match a declared constructor  
B. The compiler automatically adds `Account()` because `Account(int)` exists  
C. Both constructors automatically exist  
D. Constructor matching ignores argument count

---

### Q81. Tricky

Consider:

```java
class Account
{
    int amount;

    Account()
    {
    }

    Account(int amount)
    {
        this.amount = amount;
    }
}
```

Then:

```java
Account a = new Account();
Account b = new Account(5000);
```

Write the state:

```text
a.amount = ?
b.amount = ?
```

Explain why they differ.

---

### Q82. Hard

Consider:

```java
class Account
{
    int amount;
    String name;

    Account(int amount, String name)
    {
        this.amount = amount;
        this.name = name;
    }
}
```

Analyze:

```java
Account a =
    new Account(2000, "Ravi");

Account b =
    new Account(10000, "Amit");
```

Answer:

1. How many objects?
2. How many constructor calls?
3. What arguments does the first constructor receive?
4. What arguments does the second constructor receive?
5. What is `a.amount`?
6. What is `b.amount`?
7. What is `a.name`?
8. What is `b.name`?
9. Why can both objects have different states even though they use the same constructor?

---

# Part U — Master Challenge

## Q83. Constructor Selection Table

Given:

```java
class Product
{
    Product()
    {
    }

    Product(String name, String description)
    {
    }

    Product(String name, String description, int quantity)
    {
    }
}
```

For each call, identify:

- Argument pattern
- Matching constructor
- Valid / invalid

| Call | Argument Pattern | Matching Constructor | Valid? |
|---|---|---|---|
| `new Product()` | ? | ? | ? |
| `new Product("A", "B")` | ? | ? | ? |
| `new Product("A", "B", 5)` | ? | ? | ? |
| `new Product("A", 5, "B")` | ? | ? | ? |
| `new Product("A")` | ? | ? | ? |
| `new Product()` | ? | ? | ? |

---

# Q84. Default Constructor Investigation

Write two small classes.

### Class 1

Declare **no constructor**.

Test:

```java
new Account();
```

### Class 2

Declare:

```java
Account(int amount)
{
    this.amount = amount;
}
```

Test:

```java
new Account();
```

Then answer:

1. Why does the first case work?
2. Why does the second case fail to find a matching no-argument constructor?
3. What changed when you declared the constructor?

---

# Q85. Requirement-Driven Product Design

Create a `Product` class containing:

```text
productName
price
description
quantity
```

Based on these creation requirements:

### Requirement A

Create an empty product object.

### Requirement B

Create a product with:

```text
productName
description
```

### Requirement C

Create a product with:

```text
productName
description
quantity
```

Design the constructor signatures.

Then create one object using each constructor.

Finally, deliberately write one invalid constructor call and explain why Java cannot find a matching constructor.

---

# Q86. Final Compiler-Mindset Challenge

Analyze this without running it:

```java
class Account
{
    int amount;
    String name;

    Account()
    {
    }

    Account(int amount)
    {
        this.amount = amount;
    }

    Account(int amount, String name)
    {
        this.amount = amount;
        this.name = name;
    }

    public static void main(String[] args)
    {
        Account a = new Account();
        Account b = new Account(2000);
        Account c = new Account(5000, "Ravi");
        Account d = new Account("Ravi", 5000);
    }
}
```

Answer:

### A.
Which constructor does `a` attempt to call?

### B.
Which constructor does `b` attempt to call?

### C.
Which constructor does `c` attempt to call?

### D.
Which constructor does `d` attempt to call?

### E.
Which object creations are valid?

### F.
Which one fails constructor matching?

### G.
For the invalid call, what argument pattern was supplied?

### H.
What constructor signatures actually exist?

### I.
What is the final state of `a`?

```text
amount = ?
name   = ?
```

### J.
What is the final state of `b`?

```text
amount = ?
name   = ?
```

### K.
What is the final state of `c`?

```text
amount = ?
name   = ?
```

### L.
Why is `name` still at its default value for `b`?

### M.
Explain the complete decision process Java follows for:

```java
new Account(5000, "Ravi")
```

---

# Day 13 Master Mental Model

```text
new ClassName(arguments)
          ↓
     Identify type
          ↓
    Read argument count
          ↓
    Read argument types
          ↓
     Check argument order
          ↓
 Search constructors in class
          ↓
  Matching signature?
       ↙       ↘
     YES        NO
      ↓          ↓
   Invoke     Compilation
 constructor    error
      ↓
Initialize object state
      ↓
this.field = parameter
```

## Default Constructor Rule

```text
No constructor declared
        ↓
Compiler supplies no-argument constructor
        ↓
new Account()
        ✓
```

But:

```text
At least one constructor declared
        ↓
Compiler does NOT automatically add
the no-argument constructor
        ↓
new Account()
        ↓
Only valid if Account() was explicitly declared
```

## Multiple Constructors

```text
                 Account
                    │
        ┌───────────┼───────────┐
        ↓           ↓           ↓
      ()          (int)    (int,String)
        │           │           │
     object       object      object
      state        state       state
```

## Object State

```text
Account
   │
   ├── a
   │    ├── amount = 0
   │    └── name = null
   │
   └── b
        ├── amount = 2000
        └── name = "Ravi"
```

# Final Revision Checklist

Before considering Day 13 complete, explain these without notes:

```text
Class
Object
Object creation
Constructor call
Constructor signature
Parameter
Argument
Argument type matching
Argument order
Constructor overloading
No-argument constructor
Default constructor rule
Instance-variable default values
this
Object-specific state
Constructor access modifier
Object class
Basic inheritance hierarchy
Ctrl + Shift + T / Open Type
Requirement-driven constructor design
Naming conventions
```

### Day 13 Core Skill

> **Given any `new ClassName(...)` statement, identify the argument pattern, find the matching constructor, determine whether the call is valid, and then trace how that constructor initializes the new object's state.**
