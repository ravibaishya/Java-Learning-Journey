# Day 19 — Professional Practice Questions
## Interactive Input, Scanner, `for` / `while` / `do-while`, and `break`

> **Source boundary:** These questions are based on the Day 19 session material. The primary focus is interactive console input, `Scanner`, input validation, loop selection, `while`, `do-while`, `break`, array search, and performance-oriented reasoning.
>
> **No answers are included.**

---

# Section A — Foundation

### Q1
Why are command-line arguments less suitable for an interactive prompt-based application?

### Q2
What is interactive console input?

### Q3
Which Java class was introduced for reading interactive console input?

### Q4
Which package contains `Scanner`?

### Q5
Write the import statement required for `Scanner`.

### Q6
What does this statement create?

```java
Scanner sc = new Scanner(System.in);
```

### Q7
What is `System.in`?

### Q8
What is the purpose of:

```java
sc.nextLine();
```

### Q9
What is the purpose of:

```java
sc.nextInt();
```

### Q10
What is the difference between `next()` and `nextLine()`?

### Q11
What happens when a program expects an integer but the user enters non-integer input?

### Q12
Name the Scanner-related exception discussed for an invalid integer input.

### Q13
What does:

```java
sc.hasNextInt()
```

check?

### Q14
Why can input validation be useful before calling `nextInt()`?

### Q15
What is the purpose of:

```java
sc.close();
```

### Q16
Why should a resource be closed after its work is finished?

### Q17
What is the basic syntax of a `while` loop?

### Q18
When is the condition of a `while` loop checked?

### Q19
Can a `while` loop execute zero times?

### Q20
What is the basic syntax of a `do-while` loop?

---

# Section B — Scanner and Input

### Q21
Write the code required to create a Scanner that reads from standard console input.

### Q22
Write a statement that reads a user's name as a complete line.

### Q23
Write a statement that reads an integer price.

### Q24
Write a statement that reads one token using Scanner.

### Q25
A program contains:

```java
int age = sc.nextInt();
```

What type of input does the program expect?

### Q26
A user enters:

```text
25
```

for:

```java
sc.nextInt();
```

Is this compatible with the expected input type?

### Q27
A user enters:

```text
twenty five
```

for:

```java
sc.nextInt();
```

What problem should you expect?

### Q28
Write an `if` statement using `hasNextInt()` before reading an integer.

### Q29
Why is this pattern safer than immediately calling `nextInt()`?

```java
if (sc.hasNextInt()) {
    int value = sc.nextInt();
}
```

### Q30
What should the program consider doing when `hasNextInt()` returns `false`?

---

# Section C — Tricky Scanner Behavior

### Q31
Consider:

```java
int price = sc.nextInt();
String address = sc.nextLine();
```

Why can `address` appear to be empty?

### Q32
What remains in the input after `nextInt()` consumes the integer entered by the user?

### Q33
How can an additional `nextLine()` be used to consume the remaining newline?

### Q34
Complete the pattern:

```java
int price = sc.nextInt();

__________;

String address = sc.nextLine();
```

### Q35
Explain the execution sequence of:

```java
int price = sc.nextInt();
sc.nextLine();
String address = sc.nextLine();
```

### Q36
Why is the `nextInt()` + `nextLine()` behavior important for a beginner to understand?

### Q37
A developer says:

> "`nextLine()` is broken because it doesn't wait for my address."

What should you explain about the input buffer behavior demonstrated in the session?

### Q38
Which Scanner method should be considered when you want an entire line rather than the next token?

### Q39
Which Scanner method should be considered when the program specifically needs an integer?

### Q40
Why should the developer think about how input is consumed, not just what data type is required?

---

# Section D — Medium: `for` vs `while`

### Q41
What was the session's main reason for using a `for` loop?

### Q42
What type of situation was presented as a natural use case for `while`?

### Q43
A program needs to process exactly 10,000 known customer records.

Which loop is conceptually suitable based on today's session?

### Q44
A guessing game continues until the user enters the correct number.

Which loop is conceptually suitable?

### Q45
Why is the total number of iterations in a guessing game unknown in advance?

### Q46
A developer chooses `while` simply because it can technically perform repeated execution.

Why is that weaker reasoning than choosing the loop based on the requirement?

### Q47
Complete:

```text
Known number of iterations
        ↓
      ______

Unknown number of iterations
        ↓
      ______
```

### Q48
Is the loop-selection rule a strict statement that `for` can never solve an unknown-count problem? Explain at the level taught in the session.

### Q49
Why does the requirement matter more than memorizing loop syntax?

### Q50
Give one example of a `for`-loop requirement and one example of a `while`-loop requirement from today's learning.

---

# Section E — Medium: `while` Loop

### Q51
Write the basic syntax of a `while` loop.

### Q52
What happens before the body of a `while` loop executes?

### Q53
What happens if the initial condition is false?

### Q54
Trace:

```java
int number = 0;

while (number < 3) {
    System.out.println(number);
    number++;
}
```

What values are printed?

### Q55
How many times does the body execute in the previous example?

### Q56
What happens to `number` after each iteration?

### Q57
Why is this statement important?

```java
number++;
```

### Q58
What could happen if the loop condition depends on `number` but `number` never changes?

### Q59
Explain why a `while` loop should normally have a path toward making its condition false.

### Q60
Trace the condition checks for:

```java
int number = 0;

while (number < 2) {
    System.out.println(number);
    number++;
}
```

---

# Section F — Hard: `while` Loop Reasoning

### Q61
Consider:

```java
int number = 10;

while (number < 10) {
    System.out.println(number);
}
```

Does the body execute? Explain.

### Q62
Consider:

```java
int number = 0;

while (number < 3) {
    System.out.println(number);
}
```

What problem exists in the loop?

### Q63
What value is never changed in Question 62?

### Q64
Why can the loop fail to terminate?

### Q65
Modify the reasoning of Question 62 so the condition can eventually become false.

### Q66
A `while` loop is intended to keep asking a user for input until a valid result is obtained.

Why is a changing condition important?

### Q67
Explain this pattern:

```text
Check condition
      ↓
True
      ↓
Read/process input
      ↓
Update state
      ↓
Check condition again
```

### Q68
Why is user-driven repetition a natural use case for `while`?

### Q69
What is the difference between:

```text
known iteration count
```

and:

```text
termination depends on user behavior
```

### Q70
A developer hardcodes a maximum number of attempts for a guessing game even though the requirement says “keep asking until correct.”

What design question should they ask?

---

# Section G — Medium: `do-while`

### Q71
What is the defining difference between `while` and `do-while`?

### Q72
When is the condition checked in a `do-while` loop?

### Q73
Can a `do-while` body execute even if its condition is initially false?

### Q74
How many times will this body execute?

```java
do {
    System.out.println("Hello");
} while (false);
```

### Q75
Why does the previous code execute once?

### Q76
Write the basic syntax of a `do-while` loop.

### Q77
Complete:

```text
while:
Condition → Body

do-while:
Body → ______
```

### Q78
Which loop is appropriate when the requirement says:

> Execute the menu once, then ask whether the user wants to continue.

Explain.

### Q79
Why was an ATM-style interaction used as a practical example for `do-while`?

### Q80
Explain the mental model:

```text
while
→ Check first

do-while
→ Execute first
```

---

# Section H — Hard: Loop Selection

### Q81
Choose the most conceptually appropriate loop:

> Process every element of an array whose size is already known.

### Q82
Choose the most conceptually appropriate loop:

> Keep asking for a guess until the correct number is entered.

### Q83
Choose the most conceptually appropriate loop:

> Show an interaction screen once, then decide whether to repeat.

### Q84
Explain why the three previous requirements naturally map to:

```text
for
while
do-while
```

### Q85
A developer says:

> “All loops are basically the same, so loop selection doesn't matter.”

How would you respond based on today's session?

### Q86
What questions should a developer ask before selecting a loop?

### Q87
Complete this decision model:

```text
Do I know the number of iterations?
        │
      Yes
        ↓
       for

        │
       No
        ↓
      while

Need the body to run at least once?
        ↓
     do-while
```

What requirement information is being used in this decision?

---

# Section I — Medium: `break`

### Q88
What does `break` do inside a loop?

### Q89
When is `break` useful?

### Q90
Why can `break` improve the efficiency of a search?

### Q91
Suppose an array contains 100,000 cities and Bangalore is found at index 300.

If the requirement is only to determine whether Bangalore exists, why might continuing to index 99,999 be unnecessary?

### Q92
Write the basic statement used to terminate the loop immediately.

### Q93
Complete:

```text
Search
  ↓
Target found
  ↓
Requirement satisfied
  ↓
________
```

### Q94
Why should `break` be connected to a meaningful requirement rather than inserted randomly?

### Q95
What is the difference between:

```text
Find whether Bangalore exists
```

and:

```text
Count every Bangalore occurrence
```

with respect to using `break`?

---

# Section J — Hard: City Search

Assume:

```java
String[] cities = {
    "Mumbai",
    "Bangalore",
    "Chennai",
    "Delhi"
};
```

### Q96
Write a `for` loop that checks every city.

### Q97
What condition would identify Bangalore?

### Q98
Where would `break` be placed if the requirement is only to find whether Bangalore exists?

### Q99
Trace the search if Bangalore is at index `1`.

### Q100
How many elements need to be inspected before the requirement is satisfied in that example?

### Q101
What changes if Bangalore is at the final index?

### Q102
What changes if Bangalore does not exist?

### Q103
Should the loop stop early if Bangalore is not found yet? Why?

### Q104
If Bangalore appears twice and the requirement is only existence, why is the first match sufficient?

### Q105
If the requirement changes to “count all Bangalore entries,” why is the first match no longer enough?

---

# Section K — Tricky: Performance Reasoning

### Q106
Two programs both correctly answer:

> “Does Bangalore exist?”

Program A stops at the first match.

Program B always scans the complete array.

What is the practical difference?

### Q107
Why is “correct output” not the only concern in professional programming?

### Q108
What questions should a developer ask when looking for unnecessary work inside a loop?

### Q109
Explain the relationship:

```text
Requirement satisfied early
        ↓
No reason to continue
        ↓
break
        ↓
Fewer unnecessary iterations
```

### Q110
If the target is usually near the beginning of a very large array, why can early termination be particularly useful?

### Q111
If the target is usually near the end, does `break` become useless? Explain carefully.

### Q112
Can a `break` change the correctness of a program if the requirement actually requires processing all remaining elements?

### Q113
Why must `break` be chosen according to the business requirement?

### Q114
A developer uses `break` after finding the first matching customer, but the requirement says:

> Print every customer whose balance is below ₹2,000.

What is the problem?

### Q115
A developer does not use `break` when the requirement is only:

> Determine whether at least one customer satisfies the condition.

What performance consideration should they review?

---

# Section L — Hard: Scanner + Loop

### Q116
Why do interactive input and `while` loops naturally work together?

### Q117
Design the logic for:

> Keep asking the user for a number until the correct number is entered.

Do not write the full program yet.

### Q118
What should the loop condition represent in the guessing-game requirement?

### Q119
What should happen when the guess is correct?

### Q120
What should happen when the guess is incorrect?

### Q121
Why is the number of iterations unknown before the game begins?

### Q122
Which loop was used as the natural fit for this requirement?

### Q123
Write the high-level flow:

```text
Start
 ↓
Read guess
 ↓
Correct?
 ├── Yes → ______
 └── No  → ______
```

### Q124
Why would a `for` loop be less expressive for this particular requirement, even though repeated execution is possible with it?

### Q125
Where does `Scanner` fit into the guessing-game flow?

---

# Section M — Tricky: Input Validation + Loop

### Q126
A program expects an integer guess.

Why should it consider:

```java
hasNextInt()
```

before:

```java
nextInt()
```

?

### Q127
What should the program do conceptually when `hasNextInt()` is false?

### Q128
How can input validation prevent the program from immediately attempting an incompatible integer read?

### Q129
Design the conceptual flow:

```text
User input
 ↓
Valid integer?
 ├── Yes → read integer
 └── No  → ______
```

### Q130
Why is validation different from simply assuming the user always provides correct input?

### Q131
A guessing game uses `nextInt()` directly.

The user enters text.

What issue can occur?

### Q132
How could the program's input-reading strategy be improved based on today's session?

---

# Section N — Hard: Resource and Scanner Reasoning

### Q133
Why should a Scanner created for input eventually be closed when its work is complete?

### Q134
What general software principle was used to explain closing resources?

### Q135
Explain the analogy:

```text
Open resource
 ↓
Use resource
 ↓
Finish work
 ↓
Close/release resource
```

### Q136
Is closing a Scanner the same thing as garbage collection? Explain.

### Q137
What is garbage collection responsible for at a high level?

### Q138
What does it mean for an object to become unreachable?

### Q139
Why should developers not rely on garbage collection as a substitute for explicitly closing a resource?

### Q140
A developer creates an input resource and leaves it active even after input work is finished.

What professional concern should they consider?

---

# Section O — Tricky: `while` vs `do-while`

### Q141
What happens here?

```java
while (false) {
    System.out.println("A");
}
```

### Q142
What happens here?

```java
do {
    System.out.println("A");
} while (false);
```

### Q143
Why are the results different?

### Q144
Which loop is appropriate if the requirement explicitly says:

> The operation must happen once before deciding whether to repeat.

### Q145
Which loop is appropriate if the requirement says:

> Execute only while the condition is already true.

### Q146
Explain why a menu/ATM interaction can naturally fit a `do-while` design.

### Q147
What is the most important execution-order difference between `while` and `do-while`?

---

# Section P — Master Challenge

## Q148 — Interactive Input Design

Design a program flow that asks the user for:

```text
Name
Age
```

Requirements:

- Name should be read as a line.
- Age should be read as an integer.
- Consider the `nextInt()` / `nextLine()` issue.
- Validate integer input before consuming it.
- Do not invent additional validation rules.

Describe the sequence before writing code.

---

## Q149 — Guessing Game Design

Design the complete control-flow model for:

> The program has a lucky number. The user keeps entering guesses until the correct number is entered.

Include:

- Scanner
- input validation
- `while`
- comparison
- success condition
- retry path

---

## Q150 — City Search

Given:

```java
String[] cities = {
    "Mumbai",
    "Delhi",
    "Bangalore",
    "Chennai"
};
```

Write a program that:

1. searches for `"Bangalore"`
2. uses a loop
3. stops immediately when Bangalore is found
4. does not continue scanning unnecessarily

---

## Q151 — Requirement Change

Modify the reasoning of Question 150 for:

> Count how many times `"Bangalore"` appears.

Should the search stop at the first match? Explain.

---

## Q152 — Loop Selection Challenge

For each requirement, choose `for`, `while`, or `do-while` and justify your choice:

1. Process 500 known customer records.
2. Keep asking for a password until the correct password is entered.
3. Display a menu at least once and then ask whether to continue.

---

## Q153 — Debugging Challenge

Consider:

```java
int number = 0;

while (number < 10) {
    System.out.println(number);
}
```

Identify the problem and explain how you would reason about it during debugging.

---

## Q154 — Scanner Debugging Challenge

Consider:

```java
int age = sc.nextInt();
String name = sc.nextLine();
```

The name appears to be skipped.

Explain exactly what you would investigate and what change the session demonstrated.

---

## Q155 — Performance Challenge

You have:

```text
100,000 cities
```

and need only:

```text
Does Bangalore exist?
```

Bangalore is found at index `50`.

Explain why continuing through the remaining cities is unnecessary for this requirement.

---

## Q156 — Final Professional Challenge

Design a small console application that:

1. Creates a `Scanner`.
2. Accepts interactive integer input.
3. Validates the integer using `hasNextInt()`.
4. Uses a `while` loop for a user-driven repeated operation.
5. Stops when the requirement is satisfied.
6. Uses `break` where early termination is appropriate.
7. Handles the `nextInt()` / `nextLine()` behavior correctly if both are required.
8. Closes the Scanner when input work is complete.

Do not introduce exception-handling techniques that were not taught in this session.

---

# Final Revision Map

```text
COMMAND-LINE INPUT
        ↓
Fixed at program start
        ↓
Interactive input needed
        ↓
Scanner
        ↓
System.in
        ↓
Validate input
        ↓
Read input


LOOP SELECTION
        ↓
Known iterations?
   ┌────┴────┐
  Yes       No
   ↓         ↓
  for      while
             ↓
       Must execute once?
             ↓
          do-while


SEARCH
   ↓
Process element
   ↓
Required result found?
   ↓
Yes → break
   ↓
Stop unnecessary work
```

# Final Developer Thinking

Before writing a loop, ask:

```text
What am I trying to achieve?
        ↓
How many times do I need to repeat?
        ↓
Do I know the number beforehand?
        ↓
Must the body execute at least once?
        ↓
What condition ends the repetition?
        ↓
Can the requirement be satisfied early?
        ↓
If yes, can I stop with break?
```

The goal is not merely to make a loop run.

The goal is to make the loop represent the **actual requirement efficiently and clearly**.
