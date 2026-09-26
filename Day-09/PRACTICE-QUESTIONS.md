# Day 09 — Professional Practice Set
## Methods, Parameters, Arguments, Return Values & Single Responsibility
### Medium → Hard → Tricky

> **Rule:** Read the method signature first.  
> Then identify the caller, parameters, arguments, return type, return value, and execution flow.

---

# Current Day 09 Scope

Practice only these concepts:

```text
Methods
Method name
Parameters
Arguments
Return type
Return value
return statement
Static methods
ClassName.method()
Instance method calling concept
Built-in methods
User-defined methods
Method execution flow
Command-line input
Integer.parseInt()
Meaningful naming
Single Responsibility — introduction
Fund transfer example
```

The questions deliberately avoid later topics such as loops, arrays beyond `String[] args`, exception handling, inheritance, constructors, collections, and advanced OOP.

---

# Part A — Method Anatomy

### Q1. Identify the Parts

Given:

```java
static boolean doTransaction(
        int amount,
        String senderAccNo,
        String receiverAccNo)
{
    return true;
}
```

Identify:

1. Method modifier
2. Return type
3. Method name
4. Parameters
5. Method body
6. Return statement
7. Return value

---

### Q2. Method or Parameter?

In:

```java
static int addNumbers(int a, int b)
{
    return a + b;
}
```

Which are parameters?

A. `addNumbers`
B. `int`
C. `a` and `b`
D. `a + b`

---

### Q3. Parameter vs Argument

Given:

```java
static int addNumbers(int a, int b)
{
    return a + b;
}
```

and:

```java
addNumbers(10, 20);
```

Which statement is correct?

A. `10` and `20` are parameters  
B. `a` and `b` are arguments  
C. `10` and `20` are arguments  
D. `int a` and `int b` are arguments

---

### Q4. Return Type

What is the return type?

```java
static boolean checkStatus()
{
    return true;
}
```

A. `true`
B. `boolean`
C. `checkStatus`
D. `static`

---

### Q5. Return Value

In:

```java
return true;
```

what is the return value?

A. `boolean`
B. `true`
C. `return`
D. `checkStatus`

---

# Part B — Predict the Result

### Q6. Simple Return

```java
static int getAmount()
{
    return 100;
}

public static void main(String[] args)
{
    int amount = getAmount();
    System.out.println(amount);
}
```

What is printed?

---

### Q7. Addition Method

```java
static int addNumbers(int a, int b)
{
    return a + b;
}

public static void main(String[] args)
{
    int result = addNumbers(10, 20);
    System.out.println(result);
}
```

Predict the output.

---

### Q8. Boolean Method

```java
static boolean doTransaction(int amount)
{
    return true;
}

public static void main(String[] args)
{
    boolean status = doTransaction(500);
    System.out.println(status);
}
```

What is printed?

---

### Q9. Method Result Used in Another Expression

```java
static int addNumbers(int a, int b)
{
    return a + b;
}

public static void main(String[] args)
{
    System.out.println(addNumbers(5, 10) + 5);
}
```

Predict the output.

---

### Q10. Same Method, Different Arguments

```java
static int addNumbers(int a, int b)
{
    return a + b;
}

public static void main(String[] args)
{
    System.out.println(addNumbers(10, 5));
    System.out.println(addNumbers(20, 5));
}
```

Predict both lines.

---

# Part C — Static Method Thinking

### Q11. Correct Calling Style

Given:

```java
class FundTransfer
{
    static boolean doTransaction(int amount)
    {
        return true;
    }
}
```

Which is the correct call?

A.

```java
FundTransfer.doTransaction(100);
```

B.

```java
FundTransfer->doTransaction(100);
```

C.

```java
doTransaction.FundTransfer(100);
```

D.

```java
FundTransfer.doTransaction;
```

---

### Q12. Identify the Dot Operator

In:

```java
FundTransfer.doTransaction(10);
```

what is the purpose of `.`?

A. It terminates the statement  
B. It accesses the static method through the class name  
C. It converts the argument  
D. It returns the value

---

### Q13. Trace the Static Call

Read:

```java
boolean result =
    FundTransfer.doTransaction(
        10,
        "987654321",
        "1234567890"
    );
```

Write the execution flow in order:

```text
?
?
?
?
?
```

Include:

```text
main()
doTransaction()
method body
return
result
```

---

# Part D — Command-Line Input + Methods

### Q14. Method with Parsed Input

Given the command:

```text
java AddNumbers 20 30
```

and:

```java
static int addNumbers(int a, int b)
{
    return a + b;
}

public static void main(String[] args)
{
    int first = Integer.parseInt(args[0]);
    int second = Integer.parseInt(args[1]);

    int result = addNumbers(first, second);

    System.out.println(result);
}
```

What is printed?

---

### Q15. What Is Passed to the Method?

Using Q14, what values reach the method?

```java
addNumbers(first, second);
```

A. `"20"` and `"30"` as Strings  
B. `20` and `30` as `int` values  
C. `first` and `second` as Strings  
D. `args[0]` and `args[1]` unchanged

---

### Q16. Find the Responsibility of Each Part

In the program:

```java
int first = Integer.parseInt(args[0]);
int second = Integer.parseInt(args[1]);

int result = addNumbers(first, second);
```

Identify:

```text
Input source
Conversion
Method call
Result storage
```

---

# Part E — Tricky Signature Matching

### Q17.

Given:

```java
static boolean doTransaction(
        int amount,
        String senderAccNo,
        String recAccNo)
{
    return true;
}
```

Which call correctly matches the parameters?

A.

```java
doTransaction("10", 987654321, "1234567890");
```

B.

```java
doTransaction(10, "987654321", "1234567890");
```

C.

```java
doTransaction(10, 20, 30);
```

D.

```java
doTransaction("10", "987654321", 1234567890);
```

---

### Q18. Order Matters

Given:

```java
static boolean doTransaction(
        int amount,
        String senderAccNo,
        String recAccNo)
{
    return true;
}
```

Why is this call not a match?

```java
doTransaction(
    "987654321",
    10,
    "1234567890"
);
```

Explain using parameter type and position.

---

### Q19. Missing Argument

What is wrong here?

```java
doTransaction(
    10,
    "987654321"
);
```

A. Wrong method name  
B. Missing an argument  
C. Return type is wrong  
D. `doTransaction` cannot accept numbers

---

### Q20. Extra Argument

What is the issue?

```java
doTransaction(
    10,
    "987654321",
    "1234567890",
    "EXTRA"
);
```

Explain the mismatch.

---

# Part F — Return Type Traps

### Q21.

Which implementation correctly matches:

```java
static int addNumbers(int a, int b)
```

A.

```java
return true;
```

B.

```java
return "30";
```

C.

```java
return 30;
```

D.

```java
return;
```

---

### Q22.

Which implementation correctly matches:

```java
static boolean doTransaction()
```

A.

```java
return 10;
```

B.

```java
return "true";
```

C.

```java
return true;
```

D.

```java
return 1;
```

---

### Q23. Spot the Mismatch

```java
static int calculateTotal(int a, int b)
{
    return true;
}
```

What is wrong?

Write the corrected return statement for adding the two numbers.

---

### Q24. Return Value vs Return Type

For:

```java
static int calculate()
{
    return 50;
}
```

Which pairing is correct?

```text
Return type  → ?
Return value → ?
```

---

# Part G — Method Execution Flow

### Q25. Put the Steps in Order

For:

```java
static int addNumbers(int a, int b)
{
    return a + b;
}

public static void main(String[] args)
{
    int result = addNumbers(10, 20);
    System.out.println(result);
}
```

Arrange:

```text
A. method returns 30
B. main() calls addNumbers()
C. method receives arguments
D. method calculates a + b
E. result receives 30
F. println() displays result
```

---

### Q26. Flow Prediction

A method call is:

```java
boolean result =
    FundTransfer.doTransaction(
        10,
        "A100",
        "B200"
    );
```

If the method executes:

```java
return true;
```

what is stored in `result`?

---

### Q27. Method Does Not Print

Suppose:

```java
static int addNumbers(int a, int b)
{
    return a + b;
}
```

There is no `System.out.println()` inside the method.

Will this line still display the result?

```java
System.out.println(addNumbers(10, 20));
```

Explain why.

---

# Part H — Built-in vs User-Defined

### Q28.

Which is a built-in/library method?

A.

```java
addNumbers()
```

B.

```java
doTransaction()
```

C.

```java
Integer.parseInt()
```

D.

```java
calculateTotal()
```

---

### Q29.

Which is a user-defined method?

A.

```java
System.out.println()
```

B.

```java
Integer.parseInt()
```

C.

```java
doTransaction()
```

D.

Both A and B

---

### Q30. Classify Each

Classify the following as **built-in/library** or **user-defined**:

```java
System.out.println()
Integer.parseInt()
addNumbers()
doTransaction()
```

---

# Part I — Meaningful Naming

### Q31. Which Is Clearer?

Which method name better communicates the task?

A.

```java
task()
```

B.

```java
doIt()
```

C.

```java
doTransaction()
```

D.

```java
x()
```

Then explain why.

---

### Q32. Parameter Naming

Which parameter list communicates the fund-transfer requirement more clearly?

A.

```java
int a, String b, String c
```

B.

```java
int amountToBeTxn,
String senderAccNo,
String recAccNo
```

Explain what each parameter represents.

---

### Q33. Naming Trap

Would this method be understandable from its name alone?

```java
static boolean abc(int x, String y, String z)
```

What information is lost compared with:

```java
static boolean doTransaction(
    int amountToBeTxn,
    String senderAccNo,
    String recAccNo)
```

---

# Part J — Single Responsibility

### Q34.

A class named:

```text
FundTransfer
```

contains methods for:

```text
transfer funds
add beneficiary
send SMS
open fixed deposit
```

What concept introduced on Day 09 suggests separating unrelated responsibilities?

A. Parameter passing  
B. Single Responsibility  
C. Return type  
D. Parsing

---

### Q35. Apply the Principle

Which design is closer to the Day 09 Single Responsibility idea?

A.

```text
FundTransfer
 ├── transfer()
 ├── sendSMS()
 ├── addBeneficiary()
 └── openFD()
```

B.

```text
FundTransfer
 └── transfer()

NotificationService
 └── sendSMS()
```

Explain your choice without introducing advanced SOLID concepts.

---

### Q36. Responsibility Check

A class called `FundTransfer` has:

```java
static boolean doTransaction(...)
{
    ...
}
```

Is the method name and responsibility aligned with the class name?

What does that suggest about code organization?

---

# Part K — Fund Transfer Reasoning

### Q37. Track the Balances

Given:

```java
int senderBalance = 100;
int recBalance = 200;
int txnAmount = 10;

senderBalance = senderBalance - txnAmount;
recBalance = recBalance + txnAmount;
```

What are the final values?

```text
senderBalance = ?
recBalance = ?
```

---

### Q38. Total-Before / Total-After

Using Q37:

```text
Total before = sender + receiver
Total after  = sender + receiver
```

Calculate both totals.

---

### Q39. Why Return `boolean`?

Suppose:

```java
static boolean doTransaction(...)
{
    return true;
}
```

and:

```java
boolean result =
    FundTransfer.doTransaction(...);
```

Why is `boolean` useful for the caller in this particular example?

A. It can represent a success/failure-style result  
B. It stores account numbers  
C. It performs parsing  
D. It replaces the method name

---

# Part L — Debug the Code

### Q40. Return Type Error

Find the problem:

```java
static int addNumbers(int a, int b)
{
    System.out.println(a + b);
}
```

What is missing?

---

### Q41. Wrong Call Style

Given:

```java
class FundTransfer
{
    static boolean doTransaction(int amount)
    {
        return true;
    }
}
```

A developer writes:

```java
FundTransfer.doTransaction;
```

Why is this incomplete?

Rewrite the correct method call.

---

### Q42. Logic in the Wrong Place

A developer writes:

```java
public static void main(String[] args)
{
    int first = Integer.parseInt(args[0]);
    int second = Integer.parseInt(args[1]);

    int result = first + second;

    System.out.println(result);
}
```

The Day 09 practice requirement is to place the addition logic in a separate method.

Rewrite only the structural change needed so that:

```text
main()
  ↓
add method
  ↓
return result
  ↓
main()
```

---

### Q43. Parameter/Argument Confusion

A developer says:

> "`10` and `20` are the parameters of `addNumbers(10,20)`."

Is that statement correct according to Day 09 terminology?

Correct it.

---

# Part M — Hard Output Challenge

### Q44.

```java
static int addNumbers(int a, int b)
{
    System.out.println("Inside method");
    return a + b;
}

public static void main(String[] args)
{
    System.out.println("Before call");

    int result = addNumbers(10, 20);

    System.out.println("After call");
    System.out.println(result);
}
```

Predict the exact output order.

---

### Q45.

```java
static boolean doTransaction(
        int amount,
        String sender,
        String receiver)
{
    System.out.println("Transaction started");
    return true;
}

public static void main(String[] args)
{
    boolean status =
        doTransaction(10, "A", "B");

    System.out.println("Status: " + status);
}
```

Predict the output.

---

# Part N — Tricky Method Design

### Q46.

Which signature best represents the Day 09 fund-transfer requirement?

```text
Inputs:
amount
sender account
receiver account

Output:
true / false
```

A.

```java
static int doTransaction(
    int amount)
```

B.

```java
static boolean doTransaction(
    int amount,
    String senderAccNo,
    String recAccNo)
```

C.

```java
static String doTransaction(
    boolean status)
```

D.

```java
static void doTransaction()
```

---

### Q47. Read the Signature Before the Body

Consider:

```java
static boolean doTransaction(
        int amount,
        String senderAccNo,
        String recAccNo)
{
    return true;
}
```

Without reading the body, what can you already know?

Choose all correct statements:

A. The method is static  
B. It returns a boolean  
C. It requires three parameters  
D. The first parameter is an `int`  
E. The method definitely performs a successful transaction in every real system

---

### Q48. Caller Perspective

Given:

```java
int result = addNumbers(10, 20);
```

What must be true about `addNumbers()` for this statement to make sense?

A. It should return an `int`  
B. It should return a `String`  
C. It must print the result instead of returning it  
D. It cannot accept parameters

---

# Part O — Professional Coding Tasks

## Q49. Add Two Numbers Using a Method

Create a Java program that:

1. Accepts two numbers through `String[] args`
2. Converts them using `Integer.parseInt()`
3. Passes them to a user-defined method
4. The method calculates the sum
5. The method returns the sum
6. `main()` prints the returned value

Required flow:

```text
args
 ↓
parseInt()
 ↓
method call
 ↓
addition
 ↓
return
 ↓
main()
 ↓
output
```

---

## Q50. Fund Transfer Method

Create a `FundTransfer` class with a static method:

```java
doTransaction(...)
```

The method should accept:

```text
amount
sender account
receiver account
```

Use:

```text
int
String
String
```

and return:

```text
boolean
```

Keep the transaction logic inside the method, not directly inside `main()`.

---

## Q51. Separate the Responsibilities

Create a simple structure containing:

```text
Driver class
FundTransfer class
Notification class
```

The responsibilities should be:

```text
Driver
 → starts the program

FundTransfer
 → handles fund-transfer task

Notification
 → handles notification task
```

Do not add advanced frameworks or concepts.

---

# Final Challenge — Q52

Read this code carefully:

```java
class FundTransfer
{
    static boolean doTransaction(
            int amountToBeTxn,
            String senderAccNo,
            String recAccNo)
    {
        int senderBalance = 100;
        int recBalance = 200;

        senderBalance =
            senderBalance - amountToBeTxn;

        recBalance =
            recBalance + amountToBeTxn;

        System.out.println(
            "Sender Balance: " + senderBalance
        );

        System.out.println(
            "Receiver Balance: " + recBalance
        );

        return true;
    }

    public static void main(String[] args)
    {
        int amount =
            Integer.parseInt(args[0]);

        boolean status =
            FundTransfer.doTransaction(
                amount,
                "SENDER100",
                "RECEIVER200"
            );

        System.out.println(
            "Transaction Status: " + status
        );
    }
}
```

Assume:

```text
java FundTransfer 10
```

Answer all of these:

### A. What value is stored in:

```java
amount
```

### B. What are the three arguments passed to `doTransaction()`?

### C. What are the three parameters?

### D. What happens to the sender balance?

### E. What happens to the receiver balance?

### F. What value is returned by the method?

### G. What is stored in `status`?

### H. Write the exact output.

### I. Identify which code belongs to:

```text
Driver responsibility
Method responsibility
```

### J. Explain the complete execution flow:

```text
main()
  ↓
parse input
  ↓
method call
  ↓
parameters receive arguments
  ↓
transaction logic
  ↓
return boolean
  ↓
status
  ↓
final output
```

---

# Day 09 Self-Test

Before moving forward, explain these without looking at notes:

```text
Method
Parameter
Argument
Return Type
Return Value
return
Static Method
ClassName.method()
Built-in Method
User-defined Method
Method Execution Flow
Single Responsibility
```

### The most important distinction

```text
METHOD DECLARATION
        ↓
Parameters

METHOD CALL
        ↓
Arguments
```

And:

```text
Return Type
     ↓
What kind of result comes back

Return Value
     ↓
The actual result
```

### Day 09 Practice Goal

**Do not just write methods. Read the signature, trace the call, follow the values into the parameters, and track the returned result back to the caller.**
