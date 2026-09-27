# Day 14 — Professional Practice Set
## Debugging Beyond the Code: Runtime Flow in Eclipse
### Medium → Hard → Tricky

> **Practice rule:** Do not answer only from what the source code *looks like*. Trace what happens at runtime: class loading → static state → object creation → constructor → method call → breakpoint → execution flow → runtime state.

---

# Current Day 14 Scope

Strictly based on the Day 14 learning material:

```text
Object creation flow
Constructor and instance-state initialization
this
Instance vs Static variables
static vs final
Class loading
Static-state initialization
Object class / Object hierarchy
Breakpoints
Meaningful breakpoint placement
F5 — Step Into
F6 — Step Over
F7 — Step Return
F8 — Continue to next breakpoint
Driver/Main class vs Service class
Service method calls
Runtime state inspection
Following execution paths
Updating/removing breakpoints during investigation
Debugging as a diagnostic skill
```

This set does **not** introduce loops, exception handling, collections, advanced JVM internals, multithreading, or advanced debugging features because they were not part of the supplied Day 14 learning material.

---

# Part A — Object Creation Flow

### Q1.

Consider:

```java
Invoice inv = new Invoice(...);
```

Which event is directly associated with object creation?

A. Matching constructor execution  
B. Git push  
C. F8 execution  
D. Class formatting

---

### Q2.

Complete the simplified Day 14 flow:

```text
new
 ↓
Memory for the object
 ↓
?
 ↓
Constructor parameters receive values
 ↓
Instance variables are initialized
```

A. Matching constructor  
B. GitHub push  
C. F8  
D. Object class

---

### Q3.

What is the constructor's role in the Day 14 object-creation flow?

A. Initialize the new object's instance state  
B. Configure GitHub  
C. Replace the JVM  
D. Create a breakpoint

---

### Q4. Medium

Consider:

```java
Invoice inv =
    new Invoice(5000, "Laptop");
```

What should you mentally trace?

A.

```text
new
→ object creation
→ matching constructor
→ parameters receive values
→ instance state initialized
```

B.

```text
new
→ F8
→ GitHub
→ static variable
```

C.

```text
new
→ class deleted
→ constructor skipped
```

D.

```text
new
→ breakpoint created
```

---

# Part B — `this` and Constructor State

Use:

```java
Invoice(int amount, String itemName)
{
    this.amount = amount;
    this.itemName = itemName;
}
```

### Q5.

What does:

```java
this.amount
```

represent?

A. Instance variable of the current object  
B. Constructor parameter  
C. Static variable automatically  
D. JVM variable

---

### Q6.

What does the right-side:

```java
amount
```

represent?

A. Constructor parameter  
B. Current object's field  
C. Class name  
D. Breakpoint

---

### Q7.

What does:

```java
this.amount = amount;
```

mean?

A. Current object's `amount` receives the constructor parameter's value  
B. Constructor parameter receives the class's value  
C. A static variable is created  
D. The object is returned

---

### Q8. Tricky

A developer writes:

```java
Invoice(int amount)
{
    amount = amount;
}
```

Why does this fail to express the intended instance-field assignment?

A. It does not explicitly identify the current object's instance variable  
B. Constructors cannot accept `int`  
C. `amount` cannot be used twice  
D. `int` variables cannot be initialized in constructors

---

### Q9.

Why does the Day 14 material emphasize clear naming with `this`?

A. It makes the assignment between the current object's field and parameter explicit  
B. It makes every variable static  
C. It prevents object creation  
D. It removes constructors

---

# Part C — Instance vs Static

### Q10.

Which describes an instance variable?

A. Object-specific state  
B. Class-level shared state  
C. JVM configuration  
D. GitHub state

---

### Q11.

Which describes a static variable?

A. Class-level/shared state  
B. A separate copy automatically created for every object  
C. Constructor parameter  
D. Local variable only

---

### Q12.

Suppose:

```text
Invoice 1 → amount = 1000
Invoice 2 → amount = 5000
```

This is an example of:

A. Instance state  
B. Static shared state  
C. VM arguments  
D. Breakpoint state

---

### Q13.

Suppose:

```text
Invoice class
      ↓
static GST
      ↓
shared by Invoice objects
```

This represents:

A. Static/class-level state  
B. Separate instance state  
C. Constructor parameters  
D. Local method state

---

### Q14. Hard

Complete:

```text
INSTANCE
→ __________ level
→ one copy/state per object

STATIC
→ __________ level
→ common/shared state
```

---

### Q15. Tricky

Two `Invoice` objects have different values for an instance variable.

Can that happen without creating two different classes?

A. Yes  
B. No

Explain using object-specific state.

---

# Part D — Static Does Not Mean Constant

### Q16.

Consider:

```java
static int gst = 18;
```

Can the value be reassigned?

A. Yes  
B. No

---

### Q17.

Consider:

```java
final int gst = 18;
```

Can the value be reassigned after initialization?

A. Yes  
B. No

---

### Q18.

Which statement is correct?

A. `static` and `final` solve different problems  
B. `static` means constant  
C. `final` means shared by every object  
D. Both keywords always mean the same thing

---

### Q19. Tricky

A developer says:

> “Because `gst` is static, nobody can change it.”

Based strictly on Day 14, is that statement correct?

A. Yes  
B. No

Explain the distinction between `static` and `final`.

---

# Part E — Class Loading and Static State

### Q20.

What simplified event occurs before normal object creation for the relevant class?

A. Required class is loaded and static state is initialized  
B. GitHub is pushed  
C. F6 is pressed  
D. Service method is automatically called

---

### Q21.

Arrange the simplified Day 14 flow:

```text
A. Object creation
B. Class loaded
C. Static state initialized
D. Constructor executes
E. Instance state initialized
```

Write the correct order.

---

### Q22. Hard

Why is the distinction between static and instance state important when debugging?

A. It helps identify whether a value belongs to the class or to a particular object  
B. It determines GitHub permissions  
C. It removes the need for breakpoints  
D. It changes the Java language

---

# Part F — Java `Object` Root

### Q23.

What is the root class revisited in Day 14?

A. `java.lang.Object`  
B. `java.lang.System`  
C. `java.lang.String`  
D. `java.lang.Integer`

---

### Q24.

For:

```java
class Invoice
{
}
```

the simplified hierarchy is:

```text
?
  ↑
Invoice
```

What belongs at `?`?

A. `Object`  
B. `String`  
C. `System`  
D. `Integer`

---

### Q25.

Why does this matter during debugging?

A. It helps understand that Java classes participate in a broader class hierarchy  
B. It automatically creates breakpoints  
C. It makes every variable static  
D. It prevents constructors

---

# Part G — Breakpoints

### Q26.

What does a breakpoint do?

A. Pauses execution at a selected line so runtime state can be inspected  
B. Deletes a line of code  
C. Changes the program's business logic  
D. Compiles the project

---

### Q27.

Which is a useful reason to place a breakpoint?

A. To inspect where the program is and what values currently exist  
B. To rename a class  
C. To push to GitHub  
D. To create a constructor

---

### Q28.

Does a breakpoint itself change the program's logic?

A. Yes  
B. No

---

### Q29. Tricky

A developer says:

> “If I place a breakpoint, the application permanently stops at that line.”

What is the more accurate interpretation?

A. Execution pauses there during debugging, allowing inspection and controlled continuation  
B. The Java source is permanently modified  
C. The method can never execute again  
D. The object is destroyed

---

# Part H — Choosing a Meaningful Breakpoint

### Q30.

Which is the most useful breakpoint location for observing constructor execution?

A. Inside the constructor  
B. Only on the class declaration  
C. In a comment  
D. In the package name

---

### Q31.

Which is a meaningful place to inspect business logic?

A. A relevant method or important business-logic line  
B. A random blank line  
C. The class name only  
D. The project folder name

---

### Q32.

Why is placing a breakpoint at the class declaration generally not useful for debugging a method?

A. The class declaration is not the meaningful execution point of the method's business logic  
B. Classes cannot be debugged  
C. Java ignores classes  
D. Eclipse cannot open Java classes

---

### Q33. Hard

A developer wants to understand why:

```java
sendNotification("SMS");
```

is producing unexpected behaviour.

Which approach is more useful?

A.

```text
Identify suspected area
↓
Place breakpoint
↓
Run
↓
Inspect state
↓
Follow flow
```

B.

```text
Put breakpoints everywhere
↓
Press F6 hundreds of times
```

Explain why.

---

# Part I — F5 Step Into

### Q34.

What does **F5** mean in the Day 14 Eclipse workflow?

A. Step Into  
B. Step Over  
C. Step Return  
D. Continue

---

### Q35.

Given:

```java
service.sendNotification("SMS");
```

when is F5 useful?

A. When you want to enter `sendNotification()`  
B. When you want to skip the method entirely  
C. When you want to return from the method  
D. When you want to continue to the next breakpoint

---

### Q36. Tricky

You are stopped at:

```java
service.sendNotification("SMS");
```

You suspect the problem is inside `sendNotification()`.

Which control is most appropriate to inspect that method?

A. F5  
B. F6  
C. F7  
D. F8

---

# Part J — F6 Step Over

### Q37.

What does **F6** mean?

A. Step Over  
B. Step Into  
C. Step Return  
D. Continue to next breakpoint

---

### Q38.

What is the main idea of Step Over?

A. Move to the next line in the current flow without entering the called method  
B. Return from the current method  
C. Jump to the next breakpoint  
D. Open a Java class

---

### Q39.

You understand the called method and do not need to inspect its internals.

Which control is appropriate?

A. F6  
B. F5  
C. F7  
D. F8

---

### Q40. Tricky

A line calls:

```java
sendSMS();
```

You are currently debugging the caller and already know `sendSMS()` is working correctly.

Which is more appropriate if you want to move through the caller?

A. F6  
B. F5  
C. F7  
D. F8

---

# Part K — F7 Step Return

### Q41.

What does **F7** mean?

A. Step Return  
B. Step Into  
C. Step Over  
D. Continue

---

### Q42.

You are currently inside:

```java
sendNotification()
```

and decide you do not need to inspect the rest of this method.

What does F7 help you do?

A. Return to the place from which the method was called  
B. Enter a deeper method  
C. Move to the next breakpoint  
D. Restart the application

---

### Q43.

Complete:

```text
Caller
  ↓
Method
  ↓
F7
  ↓
__________
```

A. Back to caller  
B. Next breakpoint  
C. New object  
D. Class loading

---

# Part L — F8 Continue

### Q44.

What does **F8** do?

A. Continue to the next breakpoint  
B. Enter the current method  
C. Return from the method  
D. Move exactly one line

---

### Q45.

Suppose:

```text
Breakpoint A
     ↓
many lines
     ↓
Breakpoint B
```

You are at Breakpoint A and want to continue until Breakpoint B.

Which control is useful?

A. F8  
B. F6 repeatedly  
C. F7  
D. F5

---

### Q46. Hard

Why can F8 be more efficient than:

```text
F6 → F6 → F6 → F6 → ...
```

when the next critical point is already known?

A. It moves execution to the next breakpoint rather than manually stepping every intervening line  
B. It skips all program logic permanently  
C. It changes the source code  
D. It disables debugging

---

# Part M — F5 / F6 / F7 / F8

### Q47.

Match:

| Key | Meaning |
|---|---|
| F5 | ? |
| F6 | ? |
| F7 | ? |
| F8 | ? |

---

### Q48. Tricky

You are inside a method and want to inspect another method called by the current line.

Which control?

A. F5  
B. F6  
C. F7  
D. F8

---

### Q49.

You are inside a method and want to return to its caller.

A. F5  
B. F6  
C. F7  
D. F8

---

### Q50.

You want to execute the next line without entering the internals of a called method.

A. F5  
B. F6  
C. F7  
D. F8

---

### Q51.

You want to run until the next breakpoint.

A. F5  
B. F6  
C. F7  
D. F8

---

# Part N — Driver vs Service Class

### Q52.

Which structure is more realistic according to Day 14?

A.

```text
Driver / Main
      ↓
NotificationService
      ↓
sendNotification()
```

B.

```text
Every class
   ↓
main()
   ↓
main()
```

C.

```text
GitHub
   ↓
Constructor
```

D.

```text
Object
   ↓
F8
```

---

### Q53.

Does a service class need to become another driver class simply because it contains business logic?

A. Yes  
B. No

---

### Q54.

What can the driver class do?

A. Create the service object and call its public method  
B. Replace every service method  
C. Automatically become a constructor  
D. Disable breakpoints

---

### Q55.

Given:

```java
NotificationService service =
    new NotificationService();

service.sendNotification("SMS");
```

what is the application flow?

A.

```text
Driver
↓
Service object
↓
sendNotification()
```

B.

```text
Service
↓
GitHub
↓
F8
```

C.

```text
Constructor
↓
Compiler
↓
Object class
```

D.

```text
Breakpoint
↓
Class loading
```

---

# Part O — Service Flow

Suppose the application supports:

```text
SMS
Email
WhatsApp
```

and:

```java
service.sendNotification("SMS");
```

### Q56.

What should you follow during debugging?

A. The actual runtime path selected by the program  
B. Only the method names  
C. Only the class declaration  
D. Only the GitHub repository

---

### Q57.

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

Where could meaningful breakpoints be placed?

A. Around `sendNotification()` and `sendSMS()`  
B. Only on the package name  
C. Only on the class declaration  
D. Only inside comments

---

### Q58. Hard

Suppose the debugger shows:

```text
notificationType = "SMS"
```

What question does this answer help with?

A. What value actually entered the relevant method/runtime flow?  
B. Which GitHub branch exists?  
C. Which class was compiled yesterday?  
D. What is the keyboard shortcut for F8?

---

### Q59.

Which debugging sequence best represents Day 14?

```text
Value enters method
      ↓
Inspect value
      ↓
Follow branch/path
      ↓
Identify called method
      ↓
Find where behaviour changes
```

A. Correct  
B. Incorrect

Explain.

---

# Part P — Runtime State vs Source-Code Assumption

### Q60.

A developer says:

> “The code looks correct, so the value must be correct.”

What does Day 14 teach you to do instead?

A. Inspect the actual runtime state with the debugger  
B. Rewrite the entire application  
C. Add breakpoints everywhere  
D. Ignore the value

---

### Q61. Tricky

Why can debugging answer questions that reading source code alone may not answer?

A. It can show actual runtime values, current method, object state, and execution path  
B. It changes the Java language  
C. It automatically fixes every bug  
D. It removes constructors

---

### Q62.

Which question is more useful during debugging?

A. “What value actually arrived here?”  
B. “What value do I hope arrived here?”  
C. “What value should GitHub contain?”  
D. “What value did I type yesterday?”

---

# Part Q — Breakpoints Should Evolve

### Q63.

You find that the problem is definitely in Class A.

What is a sensible next debugging step?

A. Remove/disable the unnecessary breakpoint in Class A and investigate the next relevant area  
B. Add 100 more breakpoints everywhere  
C. Stop debugging  
D. Delete Class A

---

### Q64.

Why should breakpoints evolve during an investigation?

A. Your understanding of the suspected problem changes as you observe runtime behaviour  
B. Breakpoints automatically expire  
C. Eclipse requires exactly one breakpoint  
D. GitHub changes breakpoints

---

### Q65. Hard

Which workflow best represents this habit?

```text
Initial suspicion
    ↓
Breakpoint A
    ↓
Observe
    ↓
Problem actually appears in B
    ↓
Adjust breakpoints
    ↓
Investigate B
```

A. Correct debugging workflow  
B. Incorrect because breakpoints should never move  
C. Only useful for GitHub  
D. Only useful for constructors

---

# Part R — Object Creation + Debugging

Use:

```java
class Invoice
{
    int amount;
    String itemName;

    Invoice(int amount, String itemName)
    {
        this.amount = amount;
        this.itemName = itemName;
    }
}
```

### Q66.

When:

```java
Invoice inv =
    new Invoice(5000, "Laptop");
```

executes, which constructor parameter receives `5000`?

A. `amount`  
B. `itemName`  
C. `inv`  
D. `this`

---

### Q67.

After:

```java
this.amount = amount;
```

what should the current object's `amount` contain?

A. `5000`  
B. `"Laptop"`  
C. `null`  
D. The class name

---

### Q68.

If a breakpoint is placed inside the constructor, what can you inspect?

A. Constructor parameters and the object's current state  
B. Only GitHub history  
C. Only the class name  
D. Only VM arguments

---

### Q69. Hard

Trace:

```text
new Invoice(5000, "Laptop")
```

through:

```text
Object creation
↓
Constructor parameters
↓
this.amount
↓
this.itemName
↓
Final object state
```

Write the values at each stage.

---

# Part S — Static vs Instance Debugging Scenario

### Q70.

Suppose two `Invoice` objects have:

```text
inv1.amount = 1000
inv2.amount = 5000
```

What kind of variable is `amount` in this mental model?

A. Instance variable  
B. Static variable

---

### Q71.

Suppose:

```text
Invoice
  ↓
static GST
  ↓
shared state
```

If the static value is reassigned, what category of state is being changed?

A. Class-level/static state  
B. One object's instance state only  
C. Constructor parameter only  
D. Breakpoint state

---

### Q72. Tricky

A developer sees:

```java
static int gst = 18;
```

and says:

> “Because it is static, every object must have a separate copy.”

Is that consistent with Day 14's mental model?

A. Yes  
B. No

Explain.

---

# Part T — Integrated Debugging Challenge

Consider:

```java
class NotificationService
{
    void sendNotification(String type)
    {
        System.out.println("Notification type: " + type);

        if ("SMS".equals(type))
        {
            sendSMS();
        }
    }

    void sendSMS()
    {
        System.out.println("Sending SMS");
    }
}
```

Driver:

```java
class Driver
{
    public static void main(String[] args)
    {
        NotificationService service =
            new NotificationService();

        service.sendNotification("SMS");
    }
}
```

### Q73.

Where would you place the first meaningful breakpoint if you want to inspect the value received by `sendNotification()`?

A. Inside `sendNotification()`  
B. Only on `class NotificationService`  
C. On the project folder  
D. On the package name

---

### Q74.

You stop inside:

```java
sendNotification()
```

and want to inspect `sendSMS()`.

Which key?

A. F5  
B. F6  
C. F7  
D. F8

---

### Q75.

You enter `sendSMS()` but determine that its remaining lines do not need investigation.

Which key helps return to the caller?

A. F5  
B. F6  
C. F7  
D. F8

---

### Q76.

You are at a line before `sendSMS()` and do not need to inspect the internals of that method.

Which key?

A. F5  
B. F6  
C. F7  
D. F8

---

### Q77.

There is a breakpoint inside `sendSMS()`. You want to continue until that breakpoint.

Which key?

A. F5  
B. F6  
C. F7  
D. F8

---

### Q78. Hard

Write the runtime path:

```text
Driver
 ↓
?
 ↓
?
 ↓
?
```

Fill it using:

```text
NotificationService object creation
sendNotification("SMS")
sendSMS()
```

---

### Q79. Tricky

Why is this structure more useful for debugging than putting `main()` inside every business/service class?

A. It separates application entry from business logic and gives a clearer call flow  
B. It makes all methods static  
C. It removes object creation  
D. It disables the debugger

---

# Part U — Final Medium/Hard Output & State Questions

### Q80.

Consider:

```java
class Invoice
{
    int amount = 1000;
    static int gst = 18;
}
```

For two objects:

```text
inv1
inv2
```

Which statement matches the Day 14 model?

A. `amount` represents object-specific state; `gst` represents class-level shared state  
B. Both are necessarily object-specific  
C. Both are necessarily local variables  
D. `gst` is automatically final

---

### Q81.

If:

```java
static int gst = 18;
```

is later reassigned to:

```java
20
```

what changed?

A. Static/class-level value  
B. Constructor parameter  
C. Only one object's instance field  
D. The class hierarchy

---

### Q82. Tricky

If the requirement is to make a value non-reassignable after initialization, which keyword is relevant from Day 14?

A. `final`  
B. `static`  
C. `this`  
D. `new`

---

# Part V — Master Debugging Scenarios

## Q83. Scenario: Wrong Notification Path

You expect:

```text
SMS
```

but the program appears to execute the wrong notification flow.

You have:

```java
service.sendNotification("SMS");
```

Design your first debugging investigation:

1. Where would you put the first breakpoint?
2. What runtime value would you inspect?
3. Which method would you follow next?
4. When would you use F5?
5. When would you use F6?
6. When would you use F7?
7. When would you use F8?

Do not simply list definitions. Apply each control to the scenario.

---

# Q84. Scenario: Constructor State

Consider:

```java
class Invoice
{
    int amount;
    String itemName;

    Invoice(int amount, String itemName)
    {
        this.amount = amount;
        this.itemName = itemName;
    }
}
```

During debugging, the constructor receives:

```text
amount = 5000
itemName = "Laptop"
```

Before executing:

```java
this.amount = amount;
```

answer:

1. What does `amount` refer to?
2. What does `this.amount` refer to?
3. What should happen after the assignment?
4. What object state should eventually be visible?

---

# Q85. Scenario: Static vs Instance

Suppose:

```text
Invoice 1 → amount = 1000
Invoice 2 → amount = 5000

Invoice class → static GST = 18
```

Answer:

1. Which state belongs to an individual object?
2. Which state belongs at class level?
3. If `Invoice 1` has `amount = 1000`, does that force `Invoice 2` to have `amount = 1000`?
4. If the static GST value is reassigned, is it the same type of state change as changing one object's amount?
5. Which keyword would matter if GST must not be reassigned?

---

# Q86. Final Master Challenge — Runtime Flow

Analyze this Day 14-style application:

```java
class Invoice
{
    int amount;
    String itemName;

    Invoice(int amount, String itemName)
    {
        this.amount = amount;
        this.itemName = itemName;
    }
}

class NotificationService
{
    void sendNotification(String type)
    {
        if ("SMS".equals(type))
        {
            sendSMS();
        }
    }

    void sendSMS()
    {
        System.out.println("Sending SMS");
    }
}

class Driver
{
    public static void main(String[] args)
    {
        Invoice inv =
            new Invoice(5000, "Laptop");

        NotificationService service =
            new NotificationService();

        service.sendNotification("SMS");
    }
}
```

Answer all parts.

### A.
What happens when:

```java
new Invoice(5000, "Laptop")
```

is executed?

### B.
What constructor receives the values?

### C.
What does `this.amount` refer to?

### D.
What does `this.itemName` refer to?

### E.
What should the final `Invoice` instance state contain?

```text
amount = ?
itemName = ?
```

### F.
What object is created for:

```java
new NotificationService()
```

### G.
What method is called from the driver?

### H.
What value enters `sendNotification()`?

### I.
Which branch is expected to execute?

### J.
Which method is called next?

### K.
If you want to inspect the value received by `sendNotification()`, where should you place a breakpoint?

### L.
If you want to enter `sendSMS()`, which key should you use?

### M.
If you are inside `sendSMS()` and want to return to the caller, which key?

### N.
If you do not need to inspect `sendSMS()` internals, which key can step over it?

### O.
If a breakpoint exists later in the flow and you want to continue until it, which key?

### P.
Explain the complete runtime flow:

```text
Class loading
↓
Static state
↓
Invoice object creation
↓
Invoice constructor
↓
Invoice instance state
↓
NotificationService object creation
↓
sendNotification()
↓
Decision
↓
sendSMS()
↓
Debugger observation
```

---

# Day 14 Master Mental Model

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
 ┌────┬────┬────┬────┐
 ↓    ↓    ↓    ↓
F5   F6   F7   F8
 ↓    ↓    ↓    ↓
IN   NEXT BACK NEXT STOP
     LINE      BREAKPOINT
     ↓
Runtime State
     ↓
Actual Execution Path
     ↓
Locate the Problem
```

## Four Debugging Keys

```text
F5 → GO INSIDE
     Step Into

F6 → GO NEXT
     Step Over

F7 → GO BACK
     Step Return

F8 → GO NEXT STOP
     Continue to next breakpoint
```

## Instance vs Static

```text
INSTANCE
    ↓
Object level
    ↓
Each object has its own state

STATIC
    ↓
Class level
    ↓
Shared/common state
```

## Static vs Final

```text
static
  ↓
class-level/shared
  ↓
can be reassigned

final
  ↓
cannot be reassigned after initialization
```

# Final Revision Checklist

Before considering Day 14 complete, explain these without notes:

```text
Object creation flow
Constructor initialization
this
Instance variable
Static variable
Static vs final
Class loading
Static initialization
Object class
Breakpoint
Meaningful breakpoint placement
F5 — Step Into
F6 — Step Over
F7 — Step Return
F8 — Next Breakpoint
Driver/Main class
Service class
Service method call
Runtime state
Execution path
Breakpoint adjustment
Debugging as diagnosis
```

### Day 14 Core Skill

> **When a program behaves unexpectedly, stop guessing from the source code. Place a meaningful breakpoint, inspect the actual runtime state, and use F5/F6/F7/F8 deliberately to follow the execution path until you find where the behaviour changes.**
