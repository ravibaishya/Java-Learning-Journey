# Day 17 — Java Control Flow
## Professional Practice Questions
### Foundation → Medium → Hard → Tricky

> **Source boundary:** These questions are based strictly on the Day 17 session material: control flow, `if`, `if-else`, `else if`, conditions, execution paths, condition ordering, method return values, practical static/non-static usage, naming/comments, business-rule boundaries, debugging with Eclipse, and the MakeMyTrip discount task.
>
> **Explicitly excluded:** `for` loops and other later control-flow topics, because loops were identified as the next session.

---

# Section A — Foundation

### Q1
What is meant by **control flow** in a Java program?

A. How Java stores objects  
B. How a program chooses different execution paths  
C. How Java compiles source code  
D. How packages are imported

### Q2
Complete the statement:

> A ______ determines which part of the program should execute.

### Q3
Write the basic syntax of an `if` statement.

### Q4
If the condition inside an `if` statement evaluates to `true`, what happens?

### Q5
If the condition inside an `if` statement evaluates to `false`, what happens to the `if` block?

### Q6
What is the purpose of the `else` block?

### Q7
In an `if-else` structure, how many alternative branches can execute during one execution of that structure?

### Q8
Write the basic syntax of:

```java
if
else
```

### Q9
What is the purpose of `else if`?

### Q10
Why is `else if` useful when a requirement has more than two possible cases?

### Q11
Consider:

```java
if (marks > 60) {
    System.out.println("Eligible");
}
```

What happens when:

```text
marks = 75
```

### Q12
Using the same code, what happens when:

```text
marks = 55
```

### Q13
Write an `if` condition that represents:

> A booking should be restricted when the number of passengers is greater than 6.

### Q14
Write an `if-else` structure for:

> If the passenger count is greater than 6, reject the booking; otherwise continue the booking.

### Q15
Write an `if` condition representing:

> Apply an offer when the order value is above ₹2,000.

### Q16
What is the difference between these two structures?

```java
if (condition) {
}
```

and

```java
if (condition) {
} else {
}
```

### Q17
What does an `else` block represent conceptually?

### Q18
What happens when the first condition in an `else-if` chain is false?

### Q19
What happens when a matching condition is found in an `else-if` chain?

### Q20
Why should a developer think about the exact ranges when writing multiple conditions?

---

# Section B — Code Reading & Output

### Q21
Predict the output:

```java
int fare = 4000;

if (fare > 5000) {
    System.out.println("Discount");
} else {
    System.out.println("No Discount");
}
```

### Q22
Predict the output:

```java
int passengers = 5;

if (passengers > 6) {
    System.out.println("Rejected");
} else {
    System.out.println("Allowed");
}
```

### Q23
Predict the output:

```java
int passengers = 7;

if (passengers > 6) {
    System.out.println("Rejected");
} else {
    System.out.println("Allowed");
}
```

### Q24
Predict the output:

```java
int marks = 80;

if (marks > 60) {
    System.out.println("Selected");
}

System.out.println("Done");
```

### Q25
Predict the output:

```java
int marks = 40;

if (marks > 60) {
    System.out.println("Selected");
}

System.out.println("Done");
```

### Q26
Trace this code:

```java
int budget = 2500;

if (budget < 1000) {
    System.out.println("Plan A");
} else if (budget <= 3000) {
    System.out.println("Plan B");
} else {
    System.out.println("Plan C");
}
```

Which path executes?

### Q27
Trace:

```java
int budget = 5000;

if (budget < 1000) {
    System.out.println("A");
} else if (budget <= 3000) {
    System.out.println("B");
} else if (budget <= 5000) {
    System.out.println("C");
} else {
    System.out.println("D");
}
```

What is printed?

### Q28
Trace:

```java
int budget = 7000;

if (budget < 1000) {
    System.out.println("A");
} else if (budget <= 3000) {
    System.out.println("B");
} else if (budget <= 5000) {
    System.out.println("C");
} else {
    System.out.println("D");
}
```

### Q29
For this code:

```java
int marks = 60;

if (marks > 60) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

Which branch executes?

### Q30
For this code:

```java
int marks = 61;

if (marks > 60) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

Which branch executes?

---

# Section C — Condition Reasoning

### Q31
A travel application has this requirement:

> If the traveller has less time, book a flight.

Write only the condition and branch structure needed to represent this requirement.

### Q32
A travel application has this requirement:

> If the traveller has less money, use a train.

Write a suitable `if` structure.

### Q33
A student-filtering module must identify students who scored more than 60%.

Write the condition.

### Q34
A booking module allows a maximum of 6 passengers per PNR.

What condition should be checked to detect a booking that exceeds the stated limit?

### Q35
An order receives an offer when its value is above ₹2,000.

Write the condition.

### Q36
A budget-based application has four cases:

```text
Below 1000
1000–3000
3000–5000
Above 5000
```

Should this be implemented with a single `if`, `if-else`, or an `else-if` chain? Explain briefly.

### Q37
Why can boundary values such as `1000`, `3000`, and `5000` become important in a multi-range condition?

### Q38
Suppose a requirement says:

> Budget is less than 1000.

Should a budget of exactly `1000` enter that branch? Explain from the wording of the requirement.

### Q39
Suppose a requirement says:

> Fare is more than 10000.

Should a fare of exactly `10000` enter that branch?

### Q40
A developer writes conditions without checking whether the ranges overlap.

What type of problem can this create in business logic?

---

# Section D — Medium: `if`, `else`, `else if`

### Q41
Write a Java program fragment that prints:

```text
Eligible
```

when marks are greater than 60, otherwise prints:

```text
Not Eligible
```

### Q42
Write a program fragment for:

```text
fare <= 5000       → No discount
fare > 5000        → Discount applicable
```

### Q43
Write an `else-if` chain for:

```text
budget < 1000
budget 1000–3000
budget 3000–5000
budget > 5000
```

Use meaningful output messages.

### Q44
Why is this structure useful?

```java
if (...) {
}
else if (...) {
}
else if (...) {
}
else {
}
```

### Q45
What is wrong with treating every business rule as an independent `if` when the requirements describe mutually exclusive cases?

### Q46
Consider:

```java
if (fare <= 5000) {
    System.out.println("No Discount");
} else if (fare <= 10000) {
    System.out.println("10%");
} else {
    System.out.println("15%");
}
```

For which fare ranges does each branch execute?

### Q47
Test the previous code mentally for:

```text
5000
5001
10000
10001
```

Write the selected branch for each value.

### Q48
A developer changes the first condition from:

```java
fare <= 5000
```

to:

```java
fare < 5000
```

What happens to the boundary value `5000`?

### Q49
Why should a developer not silently decide the meaning of an ambiguous business requirement?

### Q50
The requirement says:

> If fare is 5000 and below, no discount.
> If fare is between 5000 and 10000, apply 10%.

What exact ambiguity exists at `5000`?

---

# Section E — Medium: Methods and Return Values

### Q51
A discount calculation method calculates a numeric discount amount. Why might returning the value be more useful than printing it directly?

### Q52
Which method design better supports a caller that needs to use the calculated discount later?

```java
static void calculateDiscount(double fare)
```

or

```java
static double calculateDiscount(double fare)
```

Explain why.

### Q53
A method calculates `750.0` as a discount but has return type `void`.

What design issue should you investigate?

### Q54
Write a method signature for a method that accepts a fare and returns a calculated discount amount.

### Q55
Write a method signature for a method that accepts an integer passenger count and returns whether the booking should be accepted, using an appropriate return type.

### Q56
Why is a method that returns a result often more reusable than a method that only prints that result?

### Q57
Consider:

```java
static void discount(double fare) {
    double value = fare * 0.10;
    System.out.println(value);
}
```

How could the design change if another method needs to use the calculated value?

### Q58
A developer writes a discount method that prints:

```text
Discount = 1000
```

but the calling method needs to subtract that discount from the total fare.

What should the developer consider changing?

### Q59
Explain the flow:

```text
Input
→ method
→ condition
→ calculation
→ return
→ caller
```

### Q60
Why should the return type match the kind of value the method is expected to return?

---

# Section F — Medium: Static / Non-Static Practical Reasoning

### Q61
Why might a booking operation be implemented as a non-static method when it works with a particular user's data?

### Q62
Why can a pure calculation method be suitable for static use when all required values are passed as parameters?

### Q63
What is the practical difference between:

```java
user.transfer();
```

and a static calculation invoked through a class?

### Q64
A method uses the state of one particular user object.

Would you first consider it as object-related or class-level behavior? Explain.

### Q65
A method receives fare and percentage as parameters and calculates a discount without depending on object state.

Why might static be appropriate?

### Q66
Does choosing `static` or non-static automatically determine whether a method can contain an `if` statement? Explain.

### Q67
Can both static and non-static methods contain control-flow logic?

### Q68
A developer says:

> “Because a method contains an `if`, it must be non-static.”

Is that statement correct? Explain.

---

# Section G — Hard: Debug the Execution Path

### Q69
Consider:

```java
int fare = 12000;

if (fare <= 5000) {
    System.out.println("No Discount");
} else if (fare <= 10000) {
    System.out.println("10%");
} else {
    System.out.println("15%");
}
```

Trace the exact decision path.

### Q70
Trace the same program for:

```text
fare = 5000
```

### Q71
Trace it for:

```text
fare = 5001
```

### Q72
Trace it for:

```text
fare = 10000
```

### Q73
Trace it for:

```text
fare = 10001
```

### Q74
A developer places a breakpoint before an `if-else` chain.

What should they observe while stepping through the code?

### Q75
How can Eclipse debugging help determine which branch actually executed?

### Q76
You place a breakpoint inside the first `if` block, but execution never pauses there.

Give two possible reasoning steps you would perform before changing the code.

### Q77
A breakpoint inside the `else` block is hit unexpectedly.

What should you inspect first?

### Q78
Why is stepping through a branch useful when the console output alone does not explain why a result occurred?

### Q79
Using F6, trace a condition-based program line by line. What should you pay attention to when the condition is evaluated?

### Q80
Suppose the condition is false and execution jumps to the `else` block.

Explain the execution path without running the program.

---

# Section H — Hard: MakeMyTrip Discount Module

Use this business requirement for Questions 81–94:

```text
1. Fare 5000 and below → no discount
2. Fare between 5000 and 10000 → 10% discount
3. Fare above 10000 → 15% discount
4. Maximum discount per customer → 1250
```

### Q81
What control-flow structure is suitable for these three fare categories?

### Q82
Write the high-level decision flow for the discount module without writing Java code.

### Q83
What calculation should be performed for a fare in the 10% category?

### Q84
What calculation should be performed for a fare in the 15% category?

### Q85
How should the maximum discount of ₹1,250 affect the calculated discount?

### Q86
For a fare of ₹4,000, what discount category applies according to the stated requirements?

### Q87
For a fare of ₹7,000, which percentage category applies?

### Q88
For a fare of ₹12,000, which percentage category applies?

### Q89
For a fare of ₹20,000, calculate the percentage-based discount and then determine how the maximum ₹1,250 rule affects the final discount.

### Q90
For a fare of ₹15,000, perform the same reasoning.

### Q91
For a fare of ₹5,000, what ambiguity exists in the requirements?

### Q92
For a fare of ₹10,000, what should you determine from the wording before finalizing the condition?

### Q93
Why should the discount method return the final discount amount rather than simply print it?

### Q94
Design a suitable method signature for the MakeMyTrip discount calculation.

---

# Section I — Hard: Code Quality and Requirement Reasoning

### Q95
A developer writes the entire MakeMyTrip module inside `main()`.

What code-structure concern should you raise based on today's session?

### Q96
The task specifically asks for a proper class and method.

Why is separating the calculation into a method useful?

### Q97
A method is named:

```java
x()
```

What is wrong with this from a professional Java naming perspective?

### Q98
Suggest a meaningful method name for calculating a MakeMyTrip discount.

### Q99
Why are comments useful when the logic represents a business rule that another developer may maintain later?

### Q100
A developer gets the correct output but has no meaningful class name, no meaningful method name, and no comments.

Does correct output alone satisfy the full task requirement? Explain.

### Q101
A developer uses `void` for a calculation method because they can print the answer.

What requirement-related question should they ask themselves first?

### Q102
Why should developers test more than one normal input for a condition-based module?

### Q103
Why are boundary values particularly important for discount slabs?

### Q104
A developer tests only ₹7,000 and ₹12,000 and concludes that the discount module works.

What important categories of test values are still missing?

---

# Section J — Tricky: Find the Logic Problem

### Q105
Consider:

```java
if (fare > 5000) {
    System.out.println("10%");
} else if (fare > 10000) {
    System.out.println("15%");
}
```

What is the control-flow problem?

### Q106
Why will the second condition never be reached for a fare above ₹10,000 in the previous code?

### Q107
Rearrange the logic conceptually so that the higher fare category can actually be reached.

### Q108
Consider:

```java
if (fare <= 10000) {
    System.out.println("10%");
} else if (fare <= 5000) {
    System.out.println("No Discount");
}
```

What is wrong with the ordering?

### Q109
A condition covers a very broad range before a more specific range.

Why can that make the later condition unreachable?

### Q110
Given:

```java
int fare = 12000;

if (fare <= 5000) {
    System.out.println("A");
} else if (fare <= 10000) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

A developer adds another `else if (fare <= 15000)` after the `else`.

What is wrong structurally?

### Q111
Can an `else` block be followed by another `else if` in the same chain? Explain.

### Q112
Consider:

```java
if (marks > 60) {
    System.out.println("A");
} else if (marks > 80) {
    System.out.println("B");
}
```

For `marks = 90`, which branch executes, and why?

### Q113
How would you reason about the previous code without executing it?

### Q114
Why is condition ordering a developer-design problem rather than merely a syntax problem?

---

# Section K — Tricky: Business Requirement Boundaries

### Q115
A requirement says:

```text
Below 1000
1000 to 3000
3000 to 5000
Above 5000
```

Identify every boundary that needs clarification.

### Q116
If one requirement says `< 1000` and another says `1000 to 3000`, what value belongs to the second range?

### Q117
If a requirement says `3000 to 5000`, does the wording itself tell you whether `3000` and `5000` are inclusive? Explain.

### Q118
Why should the developer ask for clarification instead of silently choosing an interpretation when the requirement is ambiguous?

### Q119
The MakeMyTrip requirement says:

```text
5000 and below
between 5000 to 10000
```

Write a concise clarification question you would send to the product/business team.

### Q120
Why can a one-number boundary change the actual customer-facing result of a discount module?

### Q121
Suppose a developer interprets ₹5,000 as eligible for both “no discount” and “10% discount.”

What type of logic conflict has been created?

### Q122
How would you test an ambiguous boundary after the business rule is clarified?

---

# Section L — Tricky: Corner Cases

### Q123
The mentor tested a negative fare such as:

```text
-1
```

Why is this useful even though a negative fare may not be a normal business input?

### Q124
What is the difference between:

```text
normal case
boundary case
unexpected case
```

in the context of the discount module?

### Q125
Give two boundary values you would test around ₹5,000.

### Q126
Give two boundary values you would test around ₹10,000.

### Q127
Why should a developer test values that produce the maximum discount?

### Q128
For the 15% category, why is a large fare useful as a test input when the maximum discount is capped at ₹1,250?

### Q129
A module works correctly for ₹4,000, ₹7,000, and ₹12,000.

What additional tests would you perform before considering the condition logic sufficiently tested?

### Q130
The requirements do not specify what should happen for a negative fare.

Should you invent a validation rule in the GitHub documentation as if it were taught? Why or why not?

---

# Section M — Master Challenge

## Q131 — Build the Decision Model

Before writing code, create the complete decision model for the MakeMyTrip module:

```text
Input fare
    ↓
Condition 1
    ↓
Condition 2
    ↓
Condition 3
    ↓
Percentage discount
    ↓
Maximum discount rule
    ↓
Final discount
```

Fill in each decision and calculation.

---

## Q132 — Method Design

Design the class and method structure for the discount module.

Your design must include:

- meaningful class name
- meaningful method name
- parameter
- appropriate return type
- control-flow structure
- comments

Do not write the full implementation yet.

---

## Q133 — Boundary Review

Before coding, list the exact fare values that must be clarified or tested because they sit on the boundaries of the stated ranges.

---

## Q134 — Runtime Trace

Assume the final approved requirements are:

```text
fare <= 5000       → 0% discount
fare > 5000
and fare <= 10000  → 10%
fare > 10000       → 15%
maximum discount   → 1250
```

Trace the complete execution path for:

```text
fare = 12500
```

Include:

1. condition checks
2. selected branch
3. percentage calculation
4. maximum-discount comparison
5. final returned value

---

## Q135 — Debugging Challenge

You run the module with:

```text
fare = 15000
```

but the program enters the 10% branch.

Using only today's debugging concepts, describe the sequence you would follow in Eclipse to investigate the problem.

---

## Q136 — Code Review Challenge

A developer submits a solution that:

- places all logic in `main()`
- prints the discount directly
- uses `void`
- has unclear variable names
- has no comments
- does not test boundary values

List the issues you would identify during a professional code review based on today's session.

---

## Q137 — Requirement-to-Code Challenge

Convert this requirement into a decision structure:

> If the fare is at or below the no-discount limit, return zero. Otherwise determine the appropriate percentage category and then apply the maximum-discount rule.

Do not use loops.

---

## Q138 — Explain Like a Developer

Explain the difference between:

```text
Writing conditions
```

and

```text
Designing business-rule control flow
```

using the MakeMyTrip example.

---

## Q139 — Final Tracing Challenge

Without executing the code, determine the selected branch for each:

```text
4999
5000
5001
9999
10000
10001
20000
```

Assume the clarified rules are:

```text
<= 5000       → No discount
5001–10000    → 10%
> 10000       → 15%
```

---

## Q140 — Professional Implementation Challenge

Create a clean Java implementation of the MakeMyTrip discount module satisfying the clarified rules.

Requirements:

- proper class name
- proper method name
- meaningful variable names
- method returns the calculated discount
- `if / else if / else`
- maximum discount ₹1,250
- comments explaining the business rule
- no unnecessary printing inside the calculation method
- no loops
- no exception handling
- no collections

Then test at least:

```text
4000
5000
5001
10000
10001
15000
20000
```

---

# Practice Boundary

This practice set intentionally stays within **Day 17**.

### Included

- Control flow
- Conditions
- `if`
- `if-else`
- `else if`
- Multiple execution paths
- Condition ordering
- Boundary reasoning
- Business-rule translation
- Method parameters
- Method return values
- Basic static/non-static practical reasoning
- Naming conventions
- Comments
- Eclipse breakpoint/step-based debugging
- MakeMyTrip discount module
- Edge/corner-case reasoning

### Not Included

- `for` loops
- `while` / `do-while`
- `switch`
- arrays
- collections
- exception handling
- advanced validation
- later control-flow topics

---

# Final Challenge

The goal is not merely to memorize:

```java
if
else if
else
```

The real skill is:

```text
Requirement
     ↓
Identify possible cases
     ↓
Define boundaries
     ↓
Order conditions correctly
     ↓
Choose execution path
     ↓
Calculate result
     ↓
Return useful result
     ↓
Debug and test boundaries
```

That is the practical developer mindset behind today's control-flow lesson.
