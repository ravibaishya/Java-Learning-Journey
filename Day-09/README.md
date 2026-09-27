# Java Learning Journey — Day 09

## Methods: Turning Logic into Reusable Code

Today’s session moved task-specific logic outside `main()`.

> **A method is a block of code that performs a task and can be called whenever that task is needed.**

## 1. Why Methods?

Software contains tasks such as adding numbers, transferring funds, sending email, or registering a user.

Instead of putting all logic inside `main()`, a task can be placed inside a method and called when required.

```text
Requirement → Task / Work → Method → Reusable Logic
```

If the same logic is needed many times, call the method instead of rewriting it.

## 2. Anatomy of a Method

```java
static boolean doTransaction(
        int amountToBeTxn,
        String senderAccNo,
        String recAccNo)
{
    // business logic
    return true;
}
```

```text
static                 → method modifier
boolean                → return type
doTransaction          → method name
(...)                  → parameters
{ ... }                → method body
return true;           → return statement + value
```

## 3. Method Naming

Methods need meaningful names because they are called by name.

Use camelCase:

```java
calculateTotal()
sendEmail()
doTransaction()
```

```text
first word  → lowercase
next words  → first letter uppercase
```

## 4. Parameters

A method may need input from its caller.

```java
static boolean doTransaction(
        int amountToBeTxn,
        String senderAccNo,
        String recAccNo)
```

Parameters:

```text
int amountToBeTxn
String senderAccNo
String recAccNo
```

Java is strongly typed, so each parameter has a data type.

## 5. Arguments

When calling the method, actual values are supplied:

```java
FundTransfer.doTransaction(
    10,
    "987654321",
    "1234567890"
);
```

```text
Method declaration → parameters
Method call        → arguments
```

## 6. Return Type and Return Value

A method can send a result back to its caller.

```java
static boolean doTransaction(...)
{
    return true;
}
```

```text
boolean → return type
true    → return value
```

For example:

```java
static int addNumbers(...)
{
    return 30;
}
```

The returned value must match the declared return type.

## 7. Calling a Static Method

The practical example used a `static` method.

```java
FundTransfer.doTransaction(
    10,
    "987654321",
    "1234567890"
);
```

Pattern:

```text
ClassName.methodName(...)
```

The `.` is the dot operator used to access the static method through the class name.

## 8. Method Execution Flow

The `FundTransfer` example demonstrated:

```text
JVM
 ↓
main()
 ↓
doTransaction(...)
 ↓
method body
 ↓
return true
 ↓
control returns to main()
 ↓
result is used
```

Example:

```java
boolean result =
    FundTransfer.doTransaction(
        10,
        "987654321",
        "1234567890"
    );

System.out.println("Is txn successful ? " + result);
```

The returned `true` becomes the value of `result`.

## 9. Fund Transfer Example

Requirement:

```text
Transfer funds between two accounts
```

Inputs:

```text
amount to be transferred
sender account
receiver account
```

Output:

```text
true / false
```

Basic calculation:

```java
int senderBalance = 100;
int recBalance = 200;
int txnAmount = 10;

senderBalance = senderBalance - txnAmount;
recBalance = recBalance + txnAmount;
```

Result:

```text
Sender   : 100 → 90
Receiver : 200 → 210

Total before = 300
Total after  = 300
```

The example connected simple arithmetic with a real business task.

## 10. Keep Task Logic Outside `main()`

Instead of putting everything in `main()`:

```text
main()
  ↓
calls method
  ↓
method performs task
  ↓
returns result
  ↓
main() continues
```

`main()` remains the starting point while separate methods perform individual tasks.

## 11. In-built vs User-defined Methods

### In-built methods

Methods already provided by Java libraries/classes.

Examples:

```java
Integer.parseInt()
System.out.println()
```

### User-defined methods

Methods written by the developer according to a requirement.

```java
static int addNumbers(...)
{
    ...
}
```

## 12. Single Responsibility — First Introduction

The session also introduced **Single Responsibility**.

A class should focus on one functionality rather than mixing unrelated responsibilities.

For example, a fund-transfer class should not also contain unrelated features such as:

```text
Fund Transfer
+ Add Beneficiary
+ Send SMS
+ Open Fixed Deposit
```

The principle introduced today:

> **One class should be responsible for one functionality.**

This was only an introduction; deeper SOLID concepts can be studied later.

## 13. Meaningful Names Matter

Prefer:

```java
amountToBeTxn
senderAccNo
recAccNo
doTransaction()
```

rather than vague names such as:

```java
a
b
c
x
task()
```

Meaningful names help other developers understand the code.

## 14. Compilation and Execution

The session also reinforced:

```text
.java → javac → .class → java → execution
```

```text
javac → compilation
java  → execution
```

## 15. Today's Practice Task

Write a program to add two numbers.

Requirements:

```text
Input:
Two numbers from command-line arguments

Method:
Create a separate method for addition

Output:
Return the sum
```

The addition logic should not be written directly inside `main()`.

```text
String[] args
     ↓
convert input
     ↓
call add method
     ↓
method calculates sum
     ↓
return sum
     ↓
main() receives result
```

Follow Java naming conventions.
---
## Visual Note

![Java Day 09 — Methods](../assets/java-day-09-methods.png)

---
## Quick Revision

```text
METHOD
│
├── Name
├── Parameters
├── Return Type
├── Body
└── Return Statement / Value
```

```text
Parameter → declared in method
Argument  → supplied during method call

Return type  → type of result
Return value → actual result

Static method → ClassName.method()
Non-static method → Object.method()
```

## Key Takeaway

```text
Large Requirement
       ↓
Smaller Tasks
       ↓
Methods
       ↓
Reusable Logic
       ↓
Method Calls
       ↓
Returned Results
```

**Methods turn individual pieces of logic into reusable building blocks.**

## Repository Structure

```text
Day-09/
├── FundTransfer.java
├── README.md
└── Exercises/
```
