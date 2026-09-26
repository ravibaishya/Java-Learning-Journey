# Day 08 — Professional Practice Set
## Operators & Logical Thinking
### Medium → Hard → Tricky

> **Rule:** Solve first. Run later.  
> Try to predict the result before using the compiler.

### Topics Covered

```text
=              Assignment
+ - * / %      Arithmetic
> < >= <=      Comparison
== !=          Equality / inequality
&&             Logical AND
||             Logical OR
!              Logical NOT
?:             Ternary
++ --          Increment / decrement
```

Also used where relevant in the Day 08 practical work:

```text
String[] args
Integer.parseInt()
```

---

# Part A — Concept Traps

### Q1. `=` or `==`?

Which statement correctly describes the two operators?

A. `=` compares and `==` assigns  
B. `=` assigns and `==` compares  
C. Both assign values  
D. Both compare values

---

### Q2. Boolean Result

What is the type of the result of:

```java
25 >= 20
```

A. `int`  
B. `String`  
C. `boolean`  
D. `char`

---

### Q3. AND Logic

Given:

```text
A = true
B = false
```

What is:

```text
A && B
```

A. `true`  
B. `false`  
C. `1`  
D. Compilation error

---

### Q4. OR Logic

Given:

```text
A = false
B = true
```

What is:

```text
A || B
```

A. `true`  
B. `false`  
C. `null`  
D. Compilation error

---

### Q5. NOT

What is:

```java
!false
```

A. `false`  
B. `true`  
C. `0`  
D. Error

---

### Q6. Ternary Meaning

What does this expression return?

```java
age >= 18 ? "Adult" : "Minor"
```

A. Both strings  
B. `"Adult"` only  
C. `"Minor"` only  
D. It depends on the condition

---

# Part B — Predict the Output

### Q7. Assignment vs Comparison

```java
int x = 10;

System.out.println(x == 10);
System.out.println(x > 10);
System.out.println(x < 10);
```

Write the exact three-line output.

---

### Q8. Arithmetic + Comparison

```java
int a = 12;
int b = 5;

System.out.println(a + b > 15);
System.out.println(a - b == 7);
System.out.println(a % b == 2);
```

Predict all outputs.

---

### Q9. Logical Chain

```java
int age = 22;
int marks = 65;

System.out.println(age >= 18 && marks >= 40);
System.out.println(age < 18 && marks >= 40);
System.out.println(age < 18 || marks >= 40);
```

Predict the output.

---

### Q10. NOT + Comparison

```java
int amount = 1500;

System.out.println(!(amount > 2000));
System.out.println(!(amount < 2000));
```

Predict the exact output.

---

### Q11. Ternary

```java
int age = 17;

String result =
        age >= 18 ? "Allowed" : "Not Allowed";

System.out.println(result);
```

What is printed?

---

### Q12. Ternary with Comparison

```java
int amount = 2500;

String result =
        amount > 2000 ? "High" : "Low";

System.out.println(result);
```

Predict the output.

---

### Q13. Unary Update

```java
int count = 5;

count++;
System.out.println(count);

count--;
System.out.println(count);
```

What is printed?

---

### Q14. Multiple Operators

```java
int a = 10;
int b = 3;

System.out.println(a + b * 2);
System.out.println((a + b) * 2);
```

Predict both outputs and explain why they differ.

---

### Q15. Remainder Trap

```java
int x = 17;

System.out.println(x % 5);
System.out.println(x % 2 == 0);
System.out.println(x % 2 != 0);
```

Predict all three lines.

---

# Part C — Short-Circuit Thinking

### Q16. AND Short-Circuit

Without running the code, what happens?

```java
boolean result =
        false && (10 > 2);

System.out.println(result);
```

A. `true`  
B. `false`  
C. Compilation error  
D. Depends on the second condition

---

### Q17. OR Short-Circuit

What is the result?

```java
boolean result =
        true || (10 < 2);

System.out.println(result);
```

A. `true`  
B. `false`  
C. Compilation error  
D. Unknown

---

### Q18. Find the Unnecessary Condition

Which part does Java not need to evaluate to know the final result?

```java
false && condition2
```

A. `false`  
B. `condition2`  
C. Both  
D. Neither

---

### Q19. Reverse the Thinking

Which expression is guaranteed to be `true` without needing the second condition?

A.

```java
false && condition2
```

B.

```java
true && condition2
```

C.

```java
false || condition2
```

D.

```java
true || condition2
```

---

### Q20. Practical Logic

A rule says:

```text
Allow login only when:
password is correct AND account is active
```

Which operator represents the rule?

A. `||`  
B. `&&`  
C. `!`  
D. `?:`

---

### Q21. Another Business Rule

A system should allow an offer when:

```text
customer is a Prime user OR purchase amount is above 5000
```

Which operator should combine the two conditions?

A. `&&`  
B. `||`  
C. `!`  
D. `=`

---

# Part D — Tricky Expression Reading

### Q22. Don't Read Left-to-Right Blindly

```java
int a = 10;
int b = 5;
int c = 2;

System.out.println(a + b * c);
```

What is the output?

A. `30`  
B. `20`  
C. `25`  
D. `40`

---

### Q23. Parentheses Change the Result

```java
int a = 10;
int b = 5;
int c = 2;

System.out.println((a + b) * c);
```

What is the output?

A. `20`  
B. `25`  
C. `30`  
D. `40`

---

### Q24. Combined Boolean Expression

```java
int age = 20;
int marks = 35;

boolean eligible =
        age >= 18 && marks >= 40;

System.out.println(eligible);
```

What is printed?

A. `true`  
B. `false`  
C. `20`  
D. Compilation error

---

### Q25. OR vs AND

```java
int age = 16;
int marks = 80;

System.out.println(age >= 18 && marks >= 40);
System.out.println(age >= 18 || marks >= 40);
```

Predict both outputs.

Then explain in one sentence why they are different.

---

### Q26. Negating a Condition

```java
int amount = 3000;

System.out.println(amount > 2000);
System.out.println(!(amount > 2000));
```

What are the two outputs?

---

### Q27. Ternary as a Result Selector

```java
int marks = 39;

String status =
        marks >= 40 ? "Pass" : "Fail";

System.out.println(status);
```

What is the output?

Then change only the value of `marks` to `40`.

What becomes the output?

---

# Part E — Command-Line Practical

### Q28. String Argument Is Not Automatically an `int`

Assume the program is run as:

```bash
java CheckAmount 2500
```

Given:

```java
String amount = args[0];

System.out.println(amount > 2000);
```

Will this comparison work?

Explain why.

Then write the required conversion step using the class/method learned in Day 05.

---

### Q29. Parse, Compare, Decide

Program:

```java
int amount = Integer.parseInt(args[0]);

System.out.println(amount > 2000);
System.out.println(
        amount > 2000 ? "High" : "Normal"
);
```

Run mentally for:

```text
java CheckAmount 1500
```

Then:

```text
java CheckAmount 2500
```

Write both outputs.

---

### Q30. OR Operator with Command-Line Input

Given:

```java
int amountByUser = Integer.parseInt(args[0]);

int minAmount = 1;
int maxAmount = 2000;

System.out.println(
        amountByUser > minAmount ||
        amountByUser < maxAmount
);
```

Predict the result for:

```text
java OROperator 5000
```

Do not judge whether the business rule is good or bad.

Your task is only to evaluate the Java expression exactly as written.

---

# Part F — Debug the Logic

### Q31. Spot the Wrong Operator

Requirement:

```text
A customer receives free delivery when
the order value is above 500 OR the customer is a Prime user.
```

A developer writes:

```java
boolean freeDelivery =
        orderValue > 500 && isPrimeUser;
```

What is wrong?

Rewrite the expression correctly.

---

### Q32. Spot the Wrong Comparison

Requirement:

```text
Transaction is above 2000.
```

Developer code:

```java
transactionAmount < 2000
```

What concept is wrong?

Rewrite it.

---

### Q33. Spot the `=` vs `==` Mistake

The intended rule is:

```text
status is equal to "ACTIVE"
```

A developer writes:

```java
status = "ACTIVE";
```

What operator should be used for comparison?

Write the corrected expression.

---

### Q34. Ternary Conversion

Convert this requirement into one ternary expression:

```text
age 18 or above → "Adult"
otherwise       → "Minor"
```

Use:

```text
condition ? true-value : false-value
```

---

### Q35. Negation Challenge

Write an expression that is true when:

```text
amount is NOT greater than 2000
```

Use the logical NOT operator.

---

# Part G — Harder Reasoning

### Q36. Predict Without Running

```java
int a = 8;
int b = 4;

boolean result =
        a > 5 && b < 10 || a == 100;

System.out.println(result);
```

What is printed?

Then explain the evaluation in logical steps.

---

### Q37. Same Values, Different Logic

```java
int age = 19;
int marks = 38;

boolean a =
        age >= 18 && marks >= 40;

boolean b =
        age >= 18 || marks >= 40;

System.out.println(a);
System.out.println(b);
```

Predict both outputs.

What does this teach about choosing `&&` vs `||`?

---

### Q38. Short-Circuit Reasoning

Consider:

```java
boolean result =
        false && (50 > 20);

System.out.println(result);
```

Answer these separately:

1. Is the final result `true` or `false`?
2. Why is the second condition unnecessary?
3. What is this evaluation behaviour called?

---

### Q39. Build the Expression

Create one Java boolean expression for:

```text
A user is eligible when:
age is 18 or above
AND
marks are 40 or above
```

Use:

```text
age
marks
>=
&&
```

---

### Q40. Business Rule Translation

Translate this rule into Java:

```text
A transaction should pass when:
amount is above 2000
OR
the customer is a Prime user.
```

Assume:

```java
int amount;
boolean isPrimeUser;
```

Write only the boolean expression.

---

# Part H — Professional Coding Practice

## Q41. Eligibility Checker

Create a Java program using variables:

```text
age
marks
```

Display:

```text
true
```

only when:

```text
age >= 18
AND
marks >= 40
```

Use comparison + logical operators.

Do not use `if`, `else`, loops, or `Scanner`.

---

## Q42. Free Delivery Checker

Create a program using:

```text
orderValue
isPrimeUser
```

Display whether free delivery applies when:

```text
orderValue > 500
OR
isPrimeUser == true
```

Use a boolean expression.

---

## Q43. Adult / Minor

Create a program with:

```java
int age;
```

Use a ternary operator to print:

```text
Adult
```

or:

```text
Minor
```

No `if-else`.

---

## Q44. Even / Odd

Create a program using:

```java
int number;
```

Use `%` to determine whether the number is even or odd.

Use a ternary operator for the final result.

Example idea:

```text
number % 2 == 0
```

---

## Q45. Transaction Threshold

Read the amount through:

```java
String[] args
Integer.parseInt()
```

Then determine whether the amount is above `2000`.

Print:

```text
Above Limit
```

or:

```text
Within Limit
```

Use a ternary operator.

---

# Part I — Deliberate-Trap Questions

These are designed to test whether you understand the expression rather than recognize the symbols.

### Q46.

What is the result?

```java
int x = 10;

System.out.println(x = 20);
```

Before answering, distinguish assignment from comparison.

---

### Q47.

What is the result?

```java
int x = 10;

System.out.println(x == 20);
```

How is this different from Q46?

---

### Q48.

What is the result?

```java
int x = 10;

System.out.println(x > 5 && x < 20);
```

---

### Q49.

What is the result?

```java
int x = 10;

System.out.println(x < 5 || x == 10);
```

---

### Q50.

What is the result?

```java
int x = 10;

System.out.println(!(x == 10));
```

---

# Final Challenge — Q51

Without compiling, determine the output:

```java
int age = 20;
int marks = 45;
int amount = 2500;

boolean condition =
        age >= 18
        && marks >= 40
        || amount > 5000;

String result =
        condition ? "Eligible" : "Not Eligible";

System.out.println(condition);
System.out.println(result);
```

### Explain your reasoning in this order:

```text
1. age >= 18
2. marks >= 40
3. age >= 18 && marks >= 40
4. amount > 5000
5. Complete boolean expression
6. Ternary result
```

Do not simply give the final output.

---

# Bonus — Create Your Own Tricky Expression

Write one expression that combines:

```text
2 comparison operators
+ 1 logical operator
+ 1 NOT operator
```

Then predict its result before running it.

Example structure only:

```java
!(condition1 && condition2)
```

Create your own values and test whether your prediction is correct.

---

# Revision Standard

Before considering Day 08 complete, you should be able to explain these without notes:

```text
=       → assignment
==      → comparison
> < >= <= → comparison
!=      → not equal
&&      → both conditions must be true
||      → at least one condition must be true
!       → reverses boolean
?:      → compact two-way value selection
++      → increment
--      → decrement
%       → remainder
```

And most importantly:

```text
Variables
   ↓
Values
   ↓
Operators
   ↓
Expression
   ↓
Boolean / calculated result
```

### Day 08 Practice Goal

**Don't memorize the symbols. Read the expression, break it into parts, and predict the result.**
