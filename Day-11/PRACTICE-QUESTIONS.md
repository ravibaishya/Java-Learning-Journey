# Day 11 — Professional Practice Set
## Eclipse IDE, Developer Workflow, Errors, Content Assist & Debugging
### Medium → Hard → Tricky

> **Practice rule:** Do not treat Eclipse as a shortcut list.  
> First understand what the IDE is doing, then reason about the developer workflow.

---

# Current Day 11 Scope

Strictly based on the Day 11 learning session:

```text
IDE
Eclipse
Manual Java workflow
Project → src → Package → Class
Variables + Methods
Automatic compilation
Red error
Yellow warning
Content Assist
Ctrl + Space
sysout
Static method + class name
Dot operator
Breakpoints
Debug mode
F6 / step execution
Variables view
Runtime flow
Code formatting
Ctrl + Shift + F
Organize imports
Ctrl + Shift + O
Developer focus / business requirement
```

The session introduced debugging fundamentals only.  
Do not assume advanced debugging techniques beyond what was demonstrated.

---

# Part A — IDE Fundamentals

### Q1. What Does IDE Mean?

What does:

```text
IDE
```

stand for?

A. Integrated Development Environment  
B. Internal Debug Execution  
C. Java Development Engine  
D. Integrated Data Editor

---

### Q2. Main Purpose

Which statement best describes an IDE?

A. It replaces Java knowledge  
B. It provides tools that support development work  
C. It is only used for writing comments  
D. It only executes `.class` files

---

### Q3. Developer vs IDE

Which responsibility still belongs primarily to the developer?

A. Understanding the requirement and application logic  
B. Generating every semicolon manually  
C. Remembering every available method  
D. Manually formatting every line

---

### Q4. Tricky

A developer says:

> "Because Eclipse automatically compiles my code, I no longer need to understand compilation."

What is the problem with this statement?

Explain the difference between:

```text
understanding the process
```

and:

```text
using an IDE to automate the process
```

---

### Q5. Manual Workflow

Put these in the correct order:

```text
java
.java
output
javac
.class
```

Write the complete flow.

---

# Part B — Manual Process vs IDE

### Q6.

Before using an IDE, the familiar Java workflow was:

```text
.java
 ↓
javac
 ↓
.class
 ↓
java
 ↓
output
```

What is Eclipse mainly doing differently?

A. It removes Java compilation completely  
B. It automates/supports parts of the development workflow  
C. It changes `.java` into another language  
D. It prevents errors from occurring

---

### Q7. Tricky

If Eclipse automatically reports a compilation problem, does that mean Java's compilation rules have disappeared?

A. Yes  
B. No

Explain.

---

### Q8.

Why was manual compilation still considered useful during learning?

A. To understand what the IDE is automating  
B. Because Eclipse cannot compile Java  
C. Because Java does not support IDEs  
D. Because `.class` files are optional

---

# Part C — Eclipse Project Structure

### Q9.

Complete the structure:

```text
Project
   ↓
?
   ↓
Package
   ↓
Class
   ↓
Variables + Methods
```

What belongs at `?`?

---

### Q10.

Which is the correct relationship?

A.

```text
Class → Project → Package → src
```

B.

```text
Project → src → Package → Class
```

C.

```text
Package → Project → Class → src
```

D.

```text
src → Class → Project → Package
```

---

### Q11.

Suppose Eclipse shows:

```text
Java Project
└── src
    └── com.example
        └── HelloWorld.java
```

What does `HelloWorld.java` represent?

A. Package  
B. Java class/source file  
C. Project  
D. Source folder

---

### Q12. Tricky

A developer creates a class directly but does not understand where it belongs in the project structure.

Which Day 11 concept should they revisit?

A. Project → src → Package → Class  
B. `Integer.parseInt()`  
C. JVM memory  
D. Constructor chaining

---

# Part D — Creating Classes in Eclipse

### Q13.

What does Eclipse provide when creating a Java class?

A. A convenient way to generate the basic source structure  
B. A replacement for the Java language  
C. A new JVM  
D. A database connection

---

### Q14.

Why is understanding the generated source structure still important?

A. The IDE is only providing a convenient interface around Java source concepts  
B. Eclipse writes completely different programming language code  
C. The generated code cannot be edited  
D. Java classes do not exist outside Eclipse

---

### Q15. Trace the Structure

Write the hierarchy for:

```text
Project
src
package
HelloWorld.java
```

using arrows.

---

# Part E — Automatic Compilation

### Q16.

What happens when Eclipse automatically detects compilation problems?

A. The IDE is helping automate compilation/error checking  
B. Java stops using compilation  
C. `.java` becomes executable directly  
D. JVM is replaced by Eclipse

---

### Q17.

Which visual indicator represents a compilation/error problem in the Day 11 session?

A. Yellow  
B. Red  
C. Blue  
D. Green

---

### Q18.

Which indicator represents a warning that does not necessarily prevent compilation?

A. Red  
B. Yellow  
C. Black  
D. Purple

---

### Q19. Tricky

Given:

```java
int amount = 200
```

What is the likely issue?

A. Missing semicolon  
B. Missing package  
C. Missing object  
D. Missing import

---

### Q20.

If Eclipse marks the missing semicolon with a red error indicator, what does that tell the developer?

A. The code has a compilation problem  
B. The program has successfully completed  
C. The variable is unused only  
D. The code is merely formatted incorrectly

---

### Q21. Warning

Given:

```java
int amount = 200;
```

and the variable is never used.

What type of Eclipse indicator was discussed for this kind of situation?

A. Red compilation error  
B. Yellow warning  
C. Blue runtime result  
D. No possible indication

---

### Q22. Error vs Warning

Complete:

```text
Red
 ↓
?

Yellow
 ↓
?
```

Use:

```text
compilation/error problem
warning / potential issue
```

---

### Q23. Hard

A developer sees a yellow warning and immediately says:

> "The program definitely cannot run."

Is that conclusion supported by the Day 11 lesson?

Explain.

---

# Part F — Content Assist

### Q24.

What is Eclipse **Content Assist**?

A. A feature that provides code suggestions  
B. A Java compiler  
C. A debugger breakpoint  
D. A package manager

---

### Q25.

What shortcut was introduced for Content Assist?

A. `Ctrl + Space`  
B. `Ctrl + Shift + F`  
C. `Ctrl + Shift + O`  
D. `F6`

---

### Q26.

If you type:

```java
System.out.
```

what can Content Assist help with?

A. Showing available options/members  
B. Creating a database  
C. Starting the JVM manually  
D. Changing the package

---

### Q27. Tricky

Why is Content Assist more than just a convenience?

A. It can reduce repetitive searching/typing while the developer still chooses what to use  
B. It automatically writes the entire business requirement  
C. It removes the need to understand Java  
D. It guarantees the selected code is logically correct

---

### Q28.

Which statement is closest to the Day 11 learning principle?

A. Memorize every Java member  
B. Let the IDE assist with repetitive work while understanding the underlying Java  
C. Never use shortcuts  
D. Avoid debugging

---

# Part G — `sysout`

### Q29.

What does:

```text
sysout
```

help generate in Eclipse?

A. `System.out.println(...)`  
B. `System.in.read(...)`  
C. `Scanner(...)`  
D. `String[] args`

---

### Q30.

Why was `sysout` introduced?

A. To reduce repetitive typing  
B. To replace methods  
C. To replace Java compilation  
D. To create packages

---

### Q31. Tricky

A developer can generate:

```java
System.out.println();
```

using `sysout`.

Does that mean the developer no longer needs to understand what `System.out.println()` does?

A. Yes  
B. No

Explain.

---

# Part H — Static Method + Class Name

### Q32.

Given:

```java
class HelloWorld
{
    static void doSomething()
    {
        System.out.println("Hello");
    }
}
```

Which call matches the Day 11 example?

A.

```java
HelloWorld.doSomething();
```

B.

```java
HelloWorld->doSomething();
```

C.

```java
doSomething.HelloWorld();
```

D.

```java
HelloWorld.doSomething;
```

---

### Q33.

What does the dot represent in:

```java
HelloWorld.doSomething();
```

A. Accessing the static method through the class name  
B. Ending the program  
C. Creating the package  
D. Starting debugging

---

### Q34.

Which part is the class name?

```java
HelloWorld.doSomething();
```

A. `HelloWorld`  
B. `doSomething`  
C. `()`  
D. `.`

---

### Q35.

Which part is the method name?

A. `HelloWorld`  
B. `doSomething`  
C. `.`  
D. `static`

---

### Q36. Tricky

A developer types:

```java
HelloWorld.
```

and Eclipse shows available members.

What Day 11 feature can help provide those suggestions?

A. Content Assist  
B. Recompilation  
C. Breakpoint  
D. Variables view

---

# Part I — Breakpoints

### Q37.

What is the purpose of a breakpoint?

A. Pause program execution at a selected point  
B. Delete a line  
C. Format code  
D. Import a package

---

### Q38.

Suppose:

```text
Line 5
Line 6  ← breakpoint
Line 7
Line 8
```

What happens when execution reaches the breakpoint?

A. Execution pauses  
B. The source file is deleted  
C. The method is permanently stopped  
D. The class becomes private

---

### Q39. Tricky

Does placing a breakpoint permanently change the program's business logic?

A. Yes  
B. No

Explain what the breakpoint actually provides.

---

### Q40.

Why is a breakpoint useful?

A. It gives the developer an opportunity to inspect what is happening during execution  
B. It automatically fixes all bugs  
C. It changes variable values automatically  
D. It removes compilation

---

# Part J — Debugging Flow

### Q41.

Put the debugging flow in order:

```text
Inspect values
Reach breakpoint
Start debugging
Pause
Execute next statement
Continue
```

---

### Q42.

What happens after the program reaches a breakpoint?

A. It can pause so the developer can inspect execution  
B. It must terminate permanently  
C. It automatically recompiles the whole project  
D. It deletes the breakpoint

---

### Q43.

Which Eclipse action was introduced for starting debugging?

A. Debug As → Java Application  
B. Run As → Package  
C. Compile As → Java  
D. Import As → Application

---

### Q44.

Which key was demonstrated for moving to the next line during debugging?

A. F2  
B. F4  
C. F6  
D. F12

---

### Q45. Tricky

Suppose execution is paused at a breakpoint.

The developer presses `F6`.

What is the purpose of this action according to Day 11?

A. Move through execution to the next line  
B. Delete the current line  
C. Format the entire file  
D. Organize imports

---

# Part K — Variables View

### Q46.

What can the Variables view help you inspect?

A. Runtime variable values  
B. GitHub followers  
C. Package names only  
D. Source-file extension only

---

### Q47.

Given:

```java
int amount = 200;
```

During debugging, what can the developer inspect?

A. The runtime value of `amount`  
B. Only the variable's spelling  
C. Only the source-file name  
D. Nothing until the program ends

---

### Q48. Tricky

Why can inspecting runtime values be more useful than only reading the source code?

A. The source shows what was written; debugging can show what value the program actually has at that execution point  
B. Source code is always incorrect  
C. Variables view changes the Java language  
D. Runtime values are stored in the package

---

### Q49.

During debugging, which questions can the developer investigate?

Select all that match the Day 11 lesson:

A. Which line is executing?  
B. What values do variables contain?  
C. Which method is being called?  
D. Where did execution flow go?  
E. Which GitHub user starred the repository?

---

# Part L — Debugging a Simple Program

Use:

```java
class Calculator
{
    static int add(int a, int b)
    {
        int result = a + b;
        return result;
    }

    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        int sum = add(a, b);

        System.out.println(sum);
    }
}
```

### Q50.

Where could a breakpoint be placed if you want to inspect:

```java
int sum = add(a, b);
```

during execution?

---

### Q51.

If execution is paused before:

```java
int sum = add(a, b);
```

what values could you inspect for:

```text
a
b
```

based on the code?

---

### Q52.

After stepping through the method and reaching:

```java
return result;
```

what value should `result` contain?

---

### Q53.

After the method returns, what value should:

```java
sum
```

contain?

---

### Q54. Debugging Reasoning

If the output is unexpectedly different from what you predicted, what is the Day 11 debugging approach?

A.

```text
Set a useful breakpoint
→ run in debug
→ inspect values
→ step through execution
```

B.

```text
Rewrite the whole program immediately
```

C.

```text
Ignore runtime values
```

D.

```text
Delete the class
```

---

# Part M — Code Formatting

### Q55.

Which shortcut was introduced for formatting Java source code?

A. `Ctrl + Space`  
B. `Ctrl + Shift + F`  
C. `Ctrl + Shift + O`  
D. `F6`

---

### Q56.

What does automatic formatting mainly improve?

A. Indentation and spacing/consistent source structure  
B. Business requirements  
C. Runtime memory  
D. Access modifiers

---

### Q57. Tricky

If formatting changes indentation but does not change the intended Java logic, what is the main purpose?

A. Improve source readability/consistency  
B. Change method return types  
C. Change package access  
D. Debug the program

---

# Part N — Organizing Imports

### Q58.

Which shortcut was introduced for organizing imports?

A. `Ctrl + Space`  
B. `Ctrl + Shift + F`  
C. `Ctrl + Shift + O`  
D. `F6`

---

### Q59.

The session used `Scanner` as an example.

What can Eclipse help do?

A. Add the required import  
B. Change Scanner into a primitive type  
C. Create a breakpoint inside Scanner automatically  
D. Replace `main()`

---

### Q60.

Which import was used as the example?

A.

```java
import java.util.Scanner;
```

B.

```java
import java.lang.Scanner;
```

C.

```java
import eclipse.Scanner;
```

D.

```java
import java.Scanner;
```

---

### Q61. Tricky

A developer manually types every required import even though Eclipse can organize imports.

What Day 11 principle is being missed?

A. Let the IDE handle repetitive mechanical work  
B. Never use packages  
C. Avoid Java classes  
D. Replace imports with breakpoints

---

# Part O — Error / Warning / Fix Reasoning

### Q62.

You see a red error marker.

What should your first response be?

A. Read/understand the reported code problem and fix it  
B. Ignore it because the IDE is always wrong  
C. Run the program anyway without checking  
D. Delete the project

---

### Q63.

You see a yellow warning for an unused local variable.

What should you understand?

A. It is a warning and may not prevent the program from compiling/running  
B. It is always a compilation failure  
C. It means the JVM is unavailable  
D. It means the package is missing

---

### Q64. Hard

A beginner sees:

```text
RED
```

and:

```text
YELLOW
```

and treats them as identical.

Explain the practical distinction introduced on Day 11.

---

### Q65. Debugging Sequence

A developer sees a red error and wants to debug the runtime behavior immediately.

Why is that sequence problematic?

A. A compilation problem needs to be resolved before successful execution/debugging of that code path  
B. Breakpoints cannot exist in Eclipse  
C. Yellow warnings must be fixed first  
D. Variables cannot be inspected

---

# Part P — Developer Workflow

### Q66.

Complete the broader development flow introduced on Day 11:

```text
Business Requirement
        ↓
Understand the problem
        ↓
Design the solution
        ↓
Write Java code
        ↓
Compile
        ↓
Run
        ↓
Debug
        ↓
?
        ↓
Deliver
```

What belongs at `?`?

A. Test  
B. Import  
C. Package  
D. Constructor

---

### Q67.

Why does the session emphasize the **actual requirement/business logic**?

A. Because writing syntax is only one part of software development  
B. Because Java syntax is unnecessary  
C. Because IDEs write all applications automatically  
D. Because debugging replaces design

---

### Q68. Tricky

Which statement best matches the Day 11 lesson?

A. An IDE makes understanding Java unnecessary  
B. An IDE automates useful development work while the developer remains responsible for understanding the problem and code  
C. Manual compilation is impossible after installing Eclipse  
D. Debugging is only for syntax errors

---

# Part Q — Hard Scenario

A developer is building a Java program in Eclipse.

They:

1. Create a Java project.
2. Create a package.
3. Create a class.
4. Write Java code.
5. See a red marker.
6. Fix the code.
7. Use `Ctrl + Space`.
8. Use `sysout`.
9. Set a breakpoint.
10. Run in debug mode.
11. Use `F6`.
12. Inspect a variable.
13. Format the code.
14. Organize imports.

### Q69.

Which steps are related to project/source organization?

A. Project → Package → Class  
B. Breakpoint → Variables  
C. `sysout` → F6  
D. Formatting → debugging

---

### Q70.

Which steps are related to debugging?

A. Breakpoint → Debug As → Java Application → F6 → Variables  
B. Project → Package → Class  
C. `Ctrl + Shift + F` → `Ctrl + Shift + O`  
D. `sysout` → Content Assist

---

### Q71.

Which steps mainly reduce repetitive typing/maintenance work?

A. Content Assist, `sysout`, formatting, organize imports  
B. Breakpoints only  
C. Variables view only  
D. Manual compilation only

---

### Q72. Hard

A developer knows how to use:

```text
Ctrl + Space
sysout
F6
Ctrl + Shift + F
Ctrl + Shift + O
```

but cannot explain what a Java method does.

According to Day 11, what is the main problem?

A. The developer is using productivity tools without sufficient Java understanding  
B. Eclipse is broken  
C. F6 should be disabled  
D. Formatting caused the problem

---

# Part R — Professional Practical Tasks

## Q73. Create an Eclipse Project

Create a simple Java project with:

```text
Project
└── src
    └── package
        └── HelloWorld.java
```

Verify the structure in Eclipse.

---

## Q74. Content Assist Practice

Create a small class and practice:

```java
System.out.
```

Use:

```text
Ctrl + Space
```

Observe the suggestions.

Then explain what the IDE is helping you do.

---

## Q75. `sysout` Practice

Use:

```text
sysout
```

to create:

```java
System.out.println("Hello");
```

Then manually write the same statement once.

Explain what the shortcut saves you from doing repeatedly.

---

## Q76. Error vs Warning Practice

Create one example that produces:

```text
Red error
```

and another that produces a:

```text
Yellow warning
```

Record:

```text
What caused it?
Can the code compile?
What does Eclipse tell you?
```

---

## Q77. Breakpoint Practice

Create:

```java
class DebugExample
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println(sum);
    }
}
```

Set a breakpoint at:

```java
int sum = a + b;
```

Run it in debug mode and inspect the variable values.

Use:

```text
F6
```

to move through execution.

---

## Q78. Static Method Practice

Create:

```java
class Utility
{
    static void display()
    {
        System.out.println("Utility method");
    }
}
```

Call it using:

```java
Utility.display();
```

Then use Eclipse Content Assist after:

```java
Utility.
```

---

# Final Challenge — Q79

Analyze this program as if you were debugging it:

```java
class Order
{
    static int calculateTotal(int price, int quantity)
    {
        int total = price * quantity;
        return total;
    }

    public static void main(String[] args)
    {
        int price = 500;
        int quantity = 3;

        int total =
            calculateTotal(price, quantity);

        System.out.println(total);
    }
}
```

Answer without running it first.

### A.

What is the expected output?

### B.

Which line would be useful for a breakpoint if you want to inspect the calculation?

### C.

What values should:

```text
price
quantity
```

contain when the calculation is reached?

### D.

What value should:

```text
total
```

contain inside the method?

### E.

What value should `total` contain after the method returns to `main()`?

### F.

If the output is unexpectedly different, describe a Day 11 debugging process:

```text
?
↓
?
↓
?
↓
?
```

Use only the debugging concepts introduced in the session.

### G.

Which Eclipse features can help reduce the mechanical work while developing this program?

Name at least three from Day 11.

---

# Day 11 Master Mental Model

```text
Java Knowledge
      ↓
Eclipse IDE
      ↓
Project
      ↓
src
      ↓
Package
      ↓
Class
      ↓
Write Code
      ↓
Automatic Compilation
      ↓
Errors / Warnings
      ↓
Content Assist
      ↓
Run
      ↓
Breakpoint
      ↓
Debug
      ↓
Inspect Runtime Values
      ↓
Understand Execution Flow
```

And the larger developer workflow:

```text
Business Requirement
        ↓
Understand
        ↓
Design
        ↓
Code
        ↓
Compile
        ↓
Run
        ↓
Debug
        ↓
Test
        ↓
Deliver
```

# Final Revision Check

Before considering Day 11 complete, explain these without notes:

```text
IDE
Eclipse
manual compilation
Project → src → Package → Class
automatic compilation
red error
yellow warning
Content Assist
Ctrl + Space
sysout
static method + class name
dot operator
breakpoint
Debug As → Java Application
F6
Variables view
runtime flow
Ctrl + Shift + F
Ctrl + Shift + O
developer vs IDE
business requirement
```

### Day 11 Practice Goal

**Do not memorize Eclipse shortcuts. Understand what each tool is helping you accomplish in the Java development workflow.**
