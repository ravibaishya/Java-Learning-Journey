# Java Learning Journey — Day 13

## Constructors in Depth: How Java Chooses the Right Constructor

Day 13 went deeper into **object creation and constructors**.

The important shift was from simply knowing that a constructor exists to understanding **which constructor Java calls, why a constructor call can fail, how multiple constructors work, and what happens when no constructor is written**.

The practical work also connected constructors with object state, access modifiers, inheritance, naming conventions, and requirement-driven coding.

---

## 1. Start with the Object Model

A useful foundation:

```text
Class
  ↓
Blueprint
  ↓
Object
  ↓
Data + Methods
  ↓
Object State + Behaviour
```

A class defines the structure.

An object is an instance created from that class.

The object's data is represented through variables, while its behaviour is represented through methods.

---

## 2. Why Constructors Are Needed

Suppose an `Account` class represents users in a banking system.

Different users have different values:

```text
User 1 → amount = 200
User 2 → amount = 10000
```

The class is the same, but the object data changes.

A constructor provides a way to initialize those values when creating the object.

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

Now:

```java
Account acc1 = new Account(200, "Ravi");
Account acc2 = new Account(10000, "Amit");
```

The same class can create objects with different states.

---

## 3. Object Creation Is a Constructor Call

Consider:

```java
Account acc = new Account();
```

The important question is not only:

> "Am I creating an object?"

Also ask:

> "Which constructor is this object creation trying to call?"

Java looks for a matching constructor in the class.

```text
new Account(...)
       ↓
Find matching constructor
       ↓
Constructor exists?
   ↙             ↘
 YES              NO
  ↓                ↓
Call it        Compilation error
```

This matching process is one of the most important fundamentals from this session.

---

## 4. Argument Type and Order Both Matter

Suppose the class contains:

```java
Account(int amount, String name)
{
    this.amount = amount;
    this.name = name;
}
```

This works:

```java
new Account(2000, "Ravi");
```

because the argument pattern is:

```text
int → String
```

But this does not match:

```java
new Account("Ravi", 2000);
```

because the pattern becomes:

```text
String → int
```

The order of arguments matters.

```text
Constructor:
(int, String)

Call:
(2000, "Ravi")   ✓

Call:
("Ravi", 2000)   ✗
```

Java needs a constructor whose parameter list matches the call.

---

## 5. Multiple Constructors

A class can contain multiple constructors when different creation requirements exist.

Example:

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
}
```

Now different object-creation requirements can use different constructors:

```java
new Account();
new Account(2000);
new Account(2000, "Ravi");
```

Think of this as:

```text
                Account
                   │
        ┌──────────┼──────────┐
        ↓          ↓          ↓
      ()         (int)    (int,String)
```

This is constructor overloading.

---

## 6. The Important Default-Constructor Rule

One of the most important rules discussed:

```text
No constructor written by developer
              ↓
Compiler provides a no-argument constructor
```

But:

```text
Developer writes at least one constructor
              ↓
Compiler does NOT add the no-argument constructor automatically
```

Example:

```java
class Account
{
}
```

The class can be instantiated using:

```java
new Account();
```

because a no-argument constructor is provided implicitly.

Now add:

```java
Account(int amount)
{
    this.amount = amount;
}
```

Then this:

```java
new Account();
```

no longer matches a constructor.

Why?

Because the class now has:

```text
Account(int)
```

but does not automatically receive:

```text
Account()
```

### Golden rule

> **The compiler supplies the default no-argument constructor only when the class declares no constructor at all.**

---

## 7. Default Values of Instance Variables

When an object is created without explicitly assigning instance-variable values, Java gives those variables their default values.

For example:

```java
class Account
{
    int amount;
    String name;
}
```

After:

```java
Account acc = new Account();
```

the object state includes:

```text
amount → 0
name   → null
```

The constructor can later initialize these values explicitly.

---

## 8. `this` Means the Current Object

Consider:

```java
Account(int amount, String name)
{
    this.amount = amount;
    this.name = name;
}
```

The two sides have different roles:

```text
this.amount
    ↓
instance variable of the current object

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
value received by the constructor
```

A practical way to remember it:

```text
this → "this current object"
```

---

## 9. Every Object Has Its Own Instance State

Suppose:

```java
Account acc1 = new Account();
Account acc2 = new Account(2000, "Ravi");
```

`acc1` and `acc2` are separate objects.

Their instance variables are object-specific.

```text
acc1
├── amount = 0
└── name   = null

acc2
├── amount = 2000
└── name   = "Ravi"
```

That is why instance variables are associated with each object.

---

## 10. Access Modifiers Also Apply to Constructors

A constructor can have an access modifier.

For example:

```java
public Account()
{
}
```

A `public` constructor can be called from other accessible classes.

The session also revised:

```text
private  → within the class
default  → within the same package
protected → same package + subclass access
public   → broadly accessible
```

The practical point was that constructor accessibility controls **who can invoke that constructor**.

---

## 11. Java's Top-Level `Object` Class

The session also revisited Java's `Object` class.

If a class does not explicitly extend another class:

```java
class A
{
}
```

it is implicitly part of the inheritance hierarchy under:

```text
Object
  ↑
  A
```

For a simple hierarchy:

```text
Object
   ↑
   A
   ↑
   B
```

`B` is indirectly related to `Object` through `A`.

The `Object` class provides methods that are inherited through the Java class hierarchy, such as `equals()` and `hashCode()`.

---

## 12. Using Eclipse to Explore Java Types

A useful Eclipse workflow discussed in the session:

```text
Ctrl + Shift + T
        ↓
Open Type
        ↓
Search for a Java class
```

This can be used to explore classes such as:

```text
Object
```

The goal is not memorizing the complete library source, but becoming comfortable navigating Java's type hierarchy.

---

## 13. Constructor Matching — Think Like the Compiler

When you write:

```java
new Account(2000, "Ravi");
```

mentally trace it like this:

```text
1. Type requested:
   Account

2. Arguments:
   int, String

3. Search constructors in Account

4. Find:
   Account(int, String)

5. Invoke that constructor

6. Initialize the new object's state
```

When there is no matching constructor:

```text
new Account("Ravi", 2000)
          ↓
Expected matching constructor:
Account(String, int)
          ↓
Not found
          ↓
Compilation error
```

This way of reading the code is more useful than memorizing error messages.

---

## 14. Requirements Should Drive Constructor Design

The hands-on task used an e-commerce-style `Product` model.

The product attributes included:

```text
productName
price
description
quantity
```

The requirement described multiple ways a user should be able to create a product.

That naturally leads to multiple constructor signatures.

For example:

```text
Product(name, description, quantity)
Product(name, description)
Product()
```

The exact implementation should follow the stated requirement.

The important lesson is:

> **Do not start coding before understanding all the requirements.**

First identify:

```text
What data is required?
        ↓
Which object states are allowed?
        ↓
Which constructors represent those states?
        ↓
Then write the code
```

---

## 15. Naming Conventions Are Part of Good Code

During the practical review, naming conventions were emphasized.

Readable code should make it easy to distinguish instance variables from local parameters.

A common style used in the exercise was:

```java
class Product
{
    String productName;

    Product(String productName)
    {
        this.productName = productName;
    }
}
```

The names are clear because:

```text
this.productName → instance variable
productName      → parameter
```

The broader lesson is simple:

> Good naming improves the future readability of your code.

---

## 16. Hands-On Practice Was the Main Test

The session repeatedly returned to one idea:

**understanding comes from practicing constructor calls, not just remembering definitions.**

Useful experiments include:

```java
new Account();
new Account(2000);
new Account(2000, "Ravi");
```

Then deliberately try:

```java
new Account("Ravi", 2000);
```

and observe the compilation error.

This helps build the mental model of constructor matching.

---

## Day 13 Learning Map

```text
Class
  ↓
Object
  ↓
Object Creation
  ↓
Constructor Call
  ↓
Argument Type + Order
  ↓
Constructor Overloading
  ↓
Default Constructor Rule
  ↓
Instance State
  ↓
`this`
  ↓
Access Modifiers
  ↓
Object Class / Inheritance
  ↓
Requirement-Driven Coding
```

---

## Key Takeaways

- Object creation involves calling a matching constructor.
- Constructor parameter **types and order** matter.
- A class can have multiple constructors.
- The compiler provides a no-argument constructor only when no constructor is declared.
- Once a constructor is explicitly declared, the no-argument constructor is not added automatically.
- `this` refers to the current object.
- Instance variables belong to individual objects.
- Constructor access depends on its access modifier.
- Java classes ultimately participate in the `Object` class hierarchy.
- Requirements should be understood before coding.
- Naming conventions improve readability and maintainability.
- Constructor concepts become much clearer through hands-on experiments.

---

## Practical Challenge

Create a `Product` class with:

```text
productName
price
description
quantity
```

Design constructors for the required product-creation scenarios.

Then test every constructor from a separate class and deliberately try an invalid argument order.

The goal is not only to make the code compile.

The goal is to understand **which constructor Java selects and why**.
