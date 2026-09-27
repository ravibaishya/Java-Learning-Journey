# Java Learning Journey — Day 14

## Debugging Beyond the Code: Following Runtime Flow in Eclipse

Day 14 moved from simply **writing and running Java code** to understanding what the program is doing while it runs.

The central theme was:

**Object Creation → Instance State → Static State → Method Calls → Breakpoints → Step Through the Flow**

The session used an e-commerce-style `Invoice` and `NotificationService` example to make debugging practical.

---

## 1. A Constructor Initializes Object State

Consider an `Invoice` object receiving values such as:

```text
amount
itemName
billingAddress
customerId
```

When an object is created:

```java
Invoice inv = new Invoice(...);
```

the flow discussed was:

```text
new
 ↓
Memory for the object
 ↓
Matching constructor
 ↓
Constructor parameters receive values
 ↓
Instance variables are initialized
 ↓
Object is referred by its reference
```

The constructor is therefore not just syntax.

It is part of the **object creation and initialization flow**.

---

## 2. `this` Makes the Assignment Meaningful

A common constructor pattern is:

```java
Invoice(int amount, String itemName)
{
    this.amount = amount;
    this.itemName = itemName;
}
```

Here:

```text
this.amount
    ↓
instance variable of the current object

amount
    ↓
local constructor parameter
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

Without clear naming, it is easy to accidentally assign a local variable to itself.

For readable code, the `this` form makes the intention explicit.

---

## 3. Instance vs Static — The Important Difference

The session revisited the distinction between instance and static variables.

### Instance variable

Specific to an object.

```text
Invoice 1 → amount = 1000
Invoice 2 → amount = 5000
```

Each object has its own value.

### Static variable

Common at the class level.

```text
Invoice class
     ↓
static GST
     ↓
shared by Invoice objects
```

The mental model:

```text
INSTANCE
Object level
One copy/state per object

STATIC
Class level
Common/shared state
```

This distinction becomes important when debugging values in an application.

---

## 4. Static Does Not Mean Constant

A question in the session was whether a static variable can be changed.

The answer demonstrated in the session:

```text
static → can be reassigned

final → cannot be reassigned
```

So:

```java
static int gst = 18;
```

can be changed later.

But:

```java
final int gst = 18;
```

cannot be reassigned after initialization.

The important point is that **`static` and `final` solve different problems**.

---

## 5. What Happens Before Object Creation?

The session also connected object creation with class loading.

A simplified flow discussed was:

```text
Execution starts
       ↓
Required class is loaded
       ↓
Static state is initialized
       ↓
Object creation
       ↓
Constructor executes
       ↓
Instance state is initialized
```

This helps explain why class-level/static information and object-level/instance information are different.

---

## 6. Java's `Object` Root

The session revisited Java's root class:

```text
java.lang.Object
        ↑
    Your Class
```

When a class does not explicitly specify a parent class, it is part of the hierarchy under `Object`.

So a simple class such as:

```java
class Invoice
{
}
```

still participates in:

```text
Object
  ↑
Invoice
```

This is the foundation of Java's class hierarchy.

---

# Debugging Is the Main Skill of Day 14

## 7. Why Breakpoints Matter

A breakpoint pauses execution at a selected line.

It gives you a chance to inspect:

```text
Where the program is
        +
What values currently exist
        +
Which method called this code
        +
What happens next
```

The key idea from the session:

> A breakpoint does not change the program's flow. It gives the developer visibility into that flow.

Without a breakpoint, the program continues normally.

With a breakpoint, execution can pause so the internal state can be examined.

---

## 8. Where Should a Breakpoint Be Placed?

The session specifically demonstrated that breakpoints should be placed at meaningful execution points.

Good locations include:

```text
Methods
Constructors
Important business-logic lines
```

Avoid placing a breakpoint at the class declaration merely because you want to debug a method.

For example:

```java
class Invoice       // not the useful place
{
    Invoice(...)     // useful breakpoint
    {
        ...
    }

    void generateInvoice()  // useful breakpoint
    {
        ...
    }
}
```

The goal is to stop where the program is actually doing useful work.

---

## 9. Breakpoints Are Not About Stopping Everywhere

A common beginner approach is:

```text
Put breakpoints everywhere
→ press F6 repeatedly
→ try to understand everything
```

That quickly becomes inefficient.

A better debugging approach is:

```text
Identify the suspected area
        ↓
Place a breakpoint
        ↓
Run the program
        ↓
Observe the actual state
        ↓
Move only where needed
```

Debugging should narrow the search, not create more noise.

---

# The Eclipse Debugging Controls

## 10. F5 — Step Into

**F5 = Step Into**

Use it when you want to enter the method or constructor being called.

Example:

```java
service.sendNotification();
```

Pressing F5 can take you inside:

```java
sendNotification()
```

This is useful when the problem may be inside the called method.

---

## 11. F6 — Step Over

**F6 = Step Over**

Move to the next line in the current flow.

```text
Current line
     ↓
F6
     ↓
Next line
```

Use it when you understand the called method or do not need to inspect its internals.

---

## 12. F7 — Step Return

**F7 = Step Return**

When you are already inside a method and decide:

> "This method looks fine. I don't need to debug the rest of it."

use F7.

The debugger returns to the place from which the method was called.

```text
Caller
  ↓
Method
  ↓
F7
  ↓
Back to caller
```

This is particularly useful when a method is large and only part of it needs investigation.

---

## 13. F8 — Move to the Next Breakpoint

**F8 = Continue to the next breakpoint**

Suppose you have:

```text
Breakpoint A
        ↓
many lines
        ↓
Breakpoint B
```

Instead of pressing F6 repeatedly:

```text
F6 → F6 → F6 → F6 → ...
```

you can use:

```text
F8
 ↓
Breakpoint B
```

This is useful when you have already identified the next critical section.

---

## 14. F5 / F6 / F7 / F8 — One Mental Model

Keep this simple:

```text
F5 → GO INSIDE
     Step Into

F6 → GO NEXT
     Step Over

F7 → GO BACK
     Step Return

F8 → GO NEXT STOP
     Next Breakpoint
```

These four controls provide different ways to navigate the same runtime execution flow.

---

# Debugging a Realistic Service Flow

## 15. Driver Class vs Service Class

One practical issue discussed in the session was putting `main()` everywhere.

A more realistic structure is:

```text
Driver / Main
      ↓
NotificationService
      ↓
sendNotification()
      ↓
SMS / Email / WhatsApp methods
```

The service class does not need to become another driver class simply because it contains business logic.

The driver class can create the service object and call its public method.

Example:

```java
NotificationService service =
    new NotificationService();

service.sendNotification("SMS");
```

This creates a much clearer application flow.

---

## 16. Debugging a Service Call

Suppose the application supports:

```text
SMS
Email
WhatsApp
```

A simplified flow is:

```text
Driver
  ↓
sendNotification("SMS")
  ↓
Decision
  ↓
sendSMS()
```

Now place breakpoints at meaningful points:

```text
Driver
  ●
  ↓
sendNotification()
  ●
  ↓
sendSMS()
  ●
```

Run the program and observe the path.

This is much more useful than reading the code and guessing what happened.

---

## 17. Follow the Actual Runtime State

While debugging, inspect:

```text
Variable values
Object state
Current method
Calling method
Execution path
```

For example:

```text
notificationType = "SMS"
```

The debugger can reveal whether the program is actually receiving `"SMS"` or something different.

That turns:

```text
"Why is this not working?"
```

into:

```text
"What value entered this method?"
        ↓
"Which branch executed?"
        ↓
"Which method was called?"
        ↓
"Where did the behaviour change?"
```

That is the real value of debugging.

---

## 18. A Breakpoint Is a Diagnostic Tool

Think of debugging like tracing a delivery route.

```text
Order placed
   ↓
Payment
   ↓
Invoice
   ↓
Notification
   ↓
SMS / Email / WhatsApp
```

If the notification is wrong, you do not need to inspect every class at once.

Start near the suspected area:

```text
NotificationService
        ↓
Breakpoint
        ↓
Inspect state
        ↓
Follow the execution path
```

The debugger helps you locate where the actual behaviour diverges from the expected behaviour.

---

## 19. After Finding the Problem, Adjust the Breakpoints

The session also demonstrated an important practical habit.

After one debugging pass:

```text
Found the problem in Class A
        ↓
No need to stop repeatedly in Class A
        ↓
Remove/disable that breakpoint
        ↓
Add a breakpoint in Class B
        ↓
Continue investigation
```

Breakpoints should evolve as your understanding of the problem improves.

---

## 20. Debugging Is About Understanding the System

Reading code alone does not always tell you:

```text
Which value actually arrived?
Which branch actually executed?
Which object was created?
Which method actually ran?
What state existed at that moment?
```

A debugger can show the runtime reality.

That is why debugging is closely connected with understanding the application, not just fixing errors.

---

# Day 14 Mental Model

```text
SOURCE CODE
    ↓
Class Loaded
    ↓
Static State Initialized
    ↓
Object Created
    ↓
Constructor Called
    ↓
Instance State Initialized
    ↓
Method Called
    ↓
Breakpoint
    ↓
F5 / F6 / F7 / F8
    ↓
Inspect Runtime State
    ↓
Locate the Actual Problem
```

---
## Visual Note

![Java Day 14 — Debugging Beyond the Code](../assets/java-day-14-Debugging-Beyond-the-Code.png)

---


## Practical Checklist

Before debugging:

```text
1. What behaviour is wrong?
2. Which class is responsible?
3. Which method is involved?
4. Where should I place the first breakpoint?
```

During debugging:

```text
1. Check the current values.
2. Follow the execution path.
3. Use F5 only when you need to go inside.
4. Use F6 for normal line-by-line movement.
5. Use F7 to return from a method.
6. Use F8 to move to the next breakpoint.
```

After debugging:

```text
1. Identify the incorrect state or flow.
2. Adjust the code.
3. Re-run the program.
4. Update the breakpoints for the next investigation.
```

---

## Key Takeaways

- `this` represents the current object and makes instance-variable assignment explicit.
- Instance variables represent object-specific state.
- Static variables represent class-level shared state.
- `static` does not mean constant; `final` controls reassignment.
- Class loading and static initialization happen before normal object creation for the relevant class.
- Every Java class participates in the `Object` hierarchy.
- Breakpoints provide visibility into runtime execution without changing the program's logic.
- F5 = Step Into.
- F6 = Step Over.
- F7 = Step Return.
- F8 = Continue to the next breakpoint.
- Debugging is more effective when breakpoints are placed around meaningful execution points.
- A realistic application can have a driver class calling service classes; every class does not need its own `main()`.
- Good debugging follows the **actual runtime state**, not assumptions based only on the source code.

---

## Day 14 Learning Map

```text
Object State
    ↓
Static vs Instance
    ↓
Class Loading
    ↓
Method Calls
    ↓
Breakpoints
    ↓
F5 / F6 / F7 / F8
    ↓
Runtime State
    ↓
System-Level Debugging
```

### The bigger lesson

The code tells you **what the program can do**.

Debugging shows you **what the program is actually doing right now**.

That difference is what makes debugging an essential developer skill.
