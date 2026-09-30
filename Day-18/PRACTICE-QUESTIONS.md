# Arrays & `for` Loop — Professional Practice Questions
## Foundation → Medium → Hard → Tricky

> **Source boundary:** These questions are based strictly on the session material covering arrays, indexing, fixed size, default values, primitive/String/object arrays, `O(1)` random read, `array.length`, the `for` loop, loop execution order, processing arrays, `startsWith()`, Eclipse debugging, and the SBI customer-filtering requirement.
>
> **Not included:** `while`/`do-while` implementation, enhanced `for`, collections, multidimensional arrays, advanced loop topics, and later concepts.

---

# Section A — Foundation

### Q1
What is an array?

### Q2
Why was an array compared to a container or bucket?

### Q3
What type of data can an array store?

### Q4
Can an array store `int` values?

### Q5
Can an array store `String` values?

### Q6
Can an array store objects such as `Employee` or `User`?

### Q7
What does it mean when we say an array is fixed in size?

### Q8
What happens to the size of an array after it has been created?

### Q9
What is meant by index-based access?

### Q10
What is the first index of a Java array?

### Q11
What is the last valid index of an array having size `5`?

### Q12
How many elements can this array hold?

```java
int numbers[] = new int[10];
```

### Q13
Write a Java statement that creates an integer array with five elements.

### Q14
What does this statement mean?

```java
productIds[2] = 23;
```

### Q15
What does this statement do?

```java
System.out.println(productIds[2]);
```

### Q16
If an array has size `7`, what are its valid indexes?

### Q17
Complete the rule:

```text
Last valid index = ______
```

### Q18
What is `array.length` used for?

### Q19
If:

```java
int[] values = new int[8];
```

what is:

```java
values.length
```

### Q20
What does `O(1)` random read mean in the context of an array?

---

# Section B — Array Creation and Access

### Q21
Predict the contents immediately after creating:

```java
int[] values = new int[5];
```

### Q22
Write code to assign these values:

```text
100
77
23
90
12
```

to a five-element integer array.

### Q23
After:

```java
productIds[0] = 100;
productIds[1] = 77;
productIds[2] = 23;
productIds[3] = 90;
productIds[4] = 12;
```

what is stored at index `3`?

### Q24
What value is returned by:

```java
productIds[2]
```

for the values used in the session?

### Q25
Why is this valid?

```java
productIds[4]
```

but this is not a valid index for a five-element array?

```java
productIds[5]
```

### Q26
Draw the following array as an index-value table:

```java
int[] productIds = {100, 77, 23, 90, 12};
```

### Q27
What is the difference between:

```java
productIds
```

and:

```java
productIds[2]
```

### Q28
Why does Java start array indexing at `0`?

Keep your answer within the session-level understanding rather than introducing advanced JVM details.

### Q29
If:

```java
int[] data = new int[4];
```

which index represents the first element?

### Q30
Which index represents the final element?

---

# Section C — Default Values

### Q31
What values exist in a newly created integer array before explicit assignments?

### Q32
Predict the array state after:

```java
int[] values = new int[5];

values[0] = 100;
```

### Q33
Predict the array state after:

```java
int[] values = new int[5];

values[0] = 100;
values[1] = 77;
```

### Q34
Why can debugging be useful for observing default array values?

### Q35
A newly created integer array displays:

```text
[0, 0, 0, 0, 0]
```

What does this tell you?

### Q36
If a value has not yet been assigned to an integer-array position, what value should you expect from the session's example?

### Q37
The session also discussed a `String` array. Why should you not automatically assume its default value is the same as an integer array?

### Q38
How could Eclipse's debugger help you verify the default state of an array?

---

# Section D — String and Object Arrays

### Q39
Write a statement that creates a `String` array capable of holding three values.

### Q40
Assign these values to a `String` array:

```text
Bangalore
Chennai
Mumbai
```

### Q41
What is the first valid index of the city array?

### Q42
What is the last valid index if the city array has three elements?

### Q43
Can the same indexing rules used for an integer array be used for a `String` array?

### Q44
What does an array of objects mean?

### Q45
If `User` is a class, write the statement that creates an array capable of holding five `User` references.

### Q46
Does creating:

```java
User[] users = new User[5];
```

automatically create five `User` objects?

Explain based on the session-level distinction between classes, objects, and arrays.

### Q47
Conceptually distinguish:

```text
User
User object
User[]
```

### Q48
Why can an object array be useful in a banking application?

### Q49
Give three examples from the session of application objects that could be stored in arrays.

### Q50
Complete the relationship:

```text
Class
   ↓
Objects
   ↓
Array of ______
```

---

# Section E — Medium: Array Length and Indexing

### Q51
Write a `for` loop header that processes every element of:

```java
int[] numbers
```

without hardcoding its size.

### Q52
Why is:

```java
index < array.length
```

preferred when processing all elements of an array?

### Q53
What is the problem with writing:

```java
for (int index = 0; index <= array.length; index++)
```

when the intention is to process every valid array element?

### Q54
What is the correct relationship between:

```text
array.length
```

and:

```text
last valid index
```

### Q55
For an array of size `10`, what happens when the loop variable reaches `10` in:

```java
for (int i = 0; i < array.length; i++)
```

### Q56
Why is the condition:

```java
i < array.length
```

rather than:

```java
i <= array.length
```

used for normal full-array traversal?

### Q57
Write the loop header for an array named:

```java
customers
```

### Q58
Write the expression that accesses the current element inside:

```java
for (int index = 0; index < customers.length; index++)
```

### Q59
Explain the difference between:

```java
customers.length
```

and:

```java
customers[index]
```

### Q60
A five-element array is processed with:

```java
for (int i = 0; i < values.length; i++)
```

List all values of `i` for which the body executes.

---

# Section F — Medium: `for` Loop Fundamentals

### Q61
What problem does a loop solve?

### Q62
Why would writing the same logic 100 times be a poor approach?

### Q63
What are the three parts of a `for` loop?

### Q64
Write the general syntax of a `for` loop.

### Q65
What happens during the initialization part of a `for` loop?

### Q66
How many times does the initialization part execute in a normal `for` loop?

### Q67
What does the condition part determine?

### Q68
What does the update part do?

### Q69
Write the execution sequence of:

```java
for (initialization; condition; update) {
    // logic
}
```

### Q70
Complete this flow:

```text
Initialization
      ↓
Condition
      ↓
__________
      ↓
Update
      ↓
Condition
```

### Q71
Why does the condition execute repeatedly?

### Q72
When does a `for` loop stop?

### Q73
What is the practical reason for choosing a `for` loop discussed in the session?

### Q74
Why is an array a natural use case for a `for` loop?

### Q75
Explain this relationship:

```text
Known array size
       ↓
array.length
       ↓
for loop
       ↓
process every element
```

---

# Section G — Medium: Trace the `for` Loop

### Q76
Predict the output:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Q77
How many times does the body execute?

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Q78
What is the value of `i` immediately after initialization?

```java
for (int i = 0; i < 10; i++) {
}
```

### Q79
What happens after the body executes for the first time?

### Q80
What is the value of `i` immediately before the final false condition check in:

```java
for (int i = 0; i < 10; i++) {
}
```

### Q81
Trace the following:

```java
for (int i = 0; i < 3; i++) {
    System.out.println(i);
}
```

Write the sequence:

```text
Initialization →
Condition →
Body →
Update →
...
```

### Q82
How many times is `i++` executed in the previous example?

### Q83
At what value does the condition become false?

### Q84
Why does the body not execute when the condition is false?

### Q85
What is the difference between the final value of `i` and the last value printed by the loop?

---

# Section H — Hard: Array + `for` Loop

### Q86
Write a program fragment that prints every element of:

```java
int[] productIds = {100, 77, 23, 90, 12};
```

### Q87
Trace the index and value for each iteration of:

```java
for (int index = 0; index < productIds.length; index++) {
    System.out.println(productIds[index]);
}
```

### Q88
What is the value of `productIds.length` in the session's example?

### Q89
What values does `index` take?

### Q90
What value does `productIds[index]` represent during each iteration?

### Q91
Explain why the loop processes all five values without explicitly writing:

```java
productIds[0]
productIds[1]
productIds[2]
productIds[3]
productIds[4]
```

### Q92
Why is this approach more maintainable if the array size changes?

### Q93
Suppose the array changes from five elements to seven.

What part of this loop needs to change?

```java
for (int index = 0; index < productIds.length; index++) {
    System.out.println(productIds[index]);
}
```

### Q94
Why is hardcoding `5` less flexible than using:

```java
productIds.length
```

### Q95
Write a loop that prints only the first three elements of an array.

---

# Section I — Hard: Array + `if` + `for`

### Q96
Explain the role of each component:

```java
for (int index = 0; index < cities.length; index++) {
    if (cities[index].startsWith("S")) {
        System.out.println(cities[index]);
    }
}
```

### Q97
Which part repeats?

### Q98
Which part checks the current city?

### Q99
Which part determines whether the city should be printed?

### Q100
What does:

```java
cities[index]
```

represent inside the loop?

### Q101
What does:

```java
startsWith("S")
```

return conceptually?

### Q102
If the current city does not start with `S`, what should happen to that city?

### Q103
Why is `if` needed inside the `for` loop?

### Q104
Explain this complete execution pattern:

```text
Array
 ↓
for
 ↓
current element
 ↓
if condition
 ↓
true → action
false → skip
 ↓
next element
```

### Q105
Write a program fragment that prints only cities beginning with `"S"`.

---

# Section J — Hard: Debugging

### Q106
Why was Eclipse debugging useful in understanding the array example?

### Q107
What can you observe in the debugger while processing an array?

### Q108
What can you observe while stepping through a `for` loop?

### Q109
If a loop is currently at:

```text
index = 2
```

what array element would:

```java
array[index]
```

access?

### Q110
If the debugger shows:

```text
index = 4
```

and the array has five elements, is this a valid index?

### Q111
If the debugger shows:

```text
index = 5
```

for a five-element array, what should you reason about?

### Q112
How would you debug a loop that appears to skip the final element?

### Q113
What should you inspect first if the loop seems to execute one extra time?

### Q114
Why is stepping through the loop better for learning execution order than simply memorizing the `for` syntax?

### Q115
Describe the sequence you would follow in Eclipse to investigate an array-processing problem.

---

# Section K — Hard: SBI Customer Requirement

Assume each customer has:

```text
Customer name
Account balance
Mobile number
```

Requirement:

> Find customers whose balance is less than ₹2,000 and print their name and balance.

### Q116
What class could represent a customer?

### Q117
What fields should the customer class contain based strictly on the requirement?

### Q118
Why would an array of customer objects be useful here?

### Q119
What should the array contain?

### Q120
What should the `for` loop do?

### Q121
What condition should be checked for each customer?

### Q122
What information should be printed when the condition is true?

### Q123
What should happen when a customer's balance is ₹2,000 exactly?

Base your answer strictly on the wording:

```text
balance is less than 2000
```

### Q124
What should happen when the balance is ₹1,999?

### Q125
What should happen when the balance is ₹2,001?

### Q126
Write the conceptual flow:

```text
Customer array
      ↓
for loop
      ↓
current customer
      ↓
balance condition
      ↓
?
```

Complete the final two steps.

---

# Section L — Tricky: Object Array Reasoning

### Q127
Suppose:

```java
Customer[] customers = new Customer[4];
```

What does this statement create?

### Q128
Does it mean four customers have already been created?

Explain.

### Q129
Suppose:

```java
customers[0] = customer1;
customers[1] = customer2;
```

What is stored in those positions conceptually?

### Q130
Why is:

```java
customers[index].balance
```

different from:

```java
customers[index]
```

### Q131
What is the role of `index` in:

```java
customers[index]
```

### Q132
If the customer array has four positions, what are the valid indexes?

### Q133
Why should the loop use:

```java
index < customers.length
```

rather than manually specifying the final index?

### Q134
What would happen conceptually if the loop attempted:

```java
customers[4]
```

for a four-position array?

### Q135
Explain the complete relationship:

```text
Customer class
      ↓
Customer objects
      ↓
Customer[]
      ↓
index
      ↓
current Customer
      ↓
balance
```

---

# Section M — Tricky: Requirement and Design

### Q136
Why should the customer data model and the driver/execution code have separate responsibilities?

### Q137
What is the responsibility of the `Customer` class in the SBI example?

### Q138
What is the responsibility of the Driver class?

### Q139
Why is putting every customer-related operation into one large class less organized?

### Q140
The requirement says:

> Print the name and balance of customers whose balance is less than ₹2,000.

Why is it important to separate:

```text
finding matching customers
```

from unrelated customer-data representation?

### Q141
A developer creates an array with a hardcoded size and then hardcodes the same number in the loop.

What maintainability problem can this create?

### Q142
Why is:

```java
customers.length
```

a better fit for full-array processing than manually writing the expected number of customers?

---

# Section N — Tricky: `O(1)` and Random Read

### Q143
What does the session mean by:

```text
O(1) → random read
```

for arrays?

### Q144
If you know the index of a value, why can an array provide direct access to it?

### Q145
Compare conceptually:

```java
productIds[0]
```

and:

```java
productIds[4]
```

Does knowing the second value require reading positions `0`, `1`, `2`, and `3` first?

### Q146
Why is index-based access one of the important properties of arrays?

### Q147
Does `O(1)` random read mean that every possible operation on an array is `O(1)`?

Keep the answer within what was actually covered in the session.

---

# Section O — Master Challenge

## Q148 — Trace the Complete Array Program

Consider:

```java
int[] productIds = {100, 77, 23, 90, 12};

for (int index = 0; index < productIds.length; index++) {
    System.out.println(productIds[index]);
}
```

Create a trace table with:

```text
Iteration | index | condition | productIds[index]
```

---

## Q149 — Find Cities Starting With S

Design the logic for:

```text
Input: an array of cities
Requirement: print only cities beginning with "S"
```

Your design must include:

- array
- `array.length`
- `for`
- current index
- `if`
- `startsWith()`

Do not use enhanced `for`.

---

## Q150 — SBI Customer Filter

Design the complete solution structure for:

```text
Customer:
- name
- balance
- mobile

Requirement:
Find customers with balance < 2000
Print name and balance
```

Your design must include:

```text
Customer class
Customer object creation
Customer array
for loop
balance condition
output
```

---

## Q151 — Debugging Challenge

You have:

```java
Customer[] customers = new Customer[5];

for (int index = 0; index <= customers.length; index++) {
    // process customer
}
```

Identify the loop-boundary problem and explain the correct reasoning.

---

## Q152 — Execution Order Challenge

For:

```java
for (int i = 0; i < 3; i++) {
    System.out.println(i);
}
```

Write the complete runtime sequence including:

- initialization
- condition checks
- body execution
- updates
- final exit

---

## Q153 — Array + Condition Challenge

Given:

```java
int[] balances = {1500, 2500, 1800, 5000, 1900};
```

Design a loop that identifies values below `2000`.

Do not use any later topics.

---

## Q154 — Object Array + Condition Challenge

Assume:

```java
Customer[] customers
```

contains valid customer objects.

Write the logic that:

1. visits every customer
2. checks whether balance is less than `2000`
3. prints name and balance only for matching customers

---

## Q155 — Code Review Challenge

A developer writes five separate statements:

```java
System.out.println(productIds[0]);
System.out.println(productIds[1]);
System.out.println(productIds[2]);
System.out.println(productIds[3]);
System.out.println(productIds[4]);
```

What improvement would you suggest based on today's session?

---

## Q156 — Design Challenge

A developer says:

> “I will use an array because I need to store many values, but I will write the processing logic separately for every index.”

Explain why this misses an important benefit of combining arrays with `for`.

---

## Q157 — Final Practical Challenge

Build a Java program for the SBI requirement:

```text
Customer name
Account balance
Mobile number

Find all customers whose balance is less than ₹2,000.
Print their name and balance.
```

Requirements:

- Use a `Customer` class.
- Create customer objects.
- Store customers in an array.
- Use a `for` loop.
- Use `customers.length`.
- Use an `if` condition.
- Print only matching customers.
- Follow proper Java naming conventions.
- Keep the Driver responsible for execution.
- Do not use collections.
- Do not use enhanced `for`.
- Do not use `while` or `do-while`.

---

# Final Revision Map

```text
ARRAY
  ↓
Container for similar-type data
  ↓
Fixed size
  ↓
Index based
  ↓
Starts at 0
  ↓
Last index = length - 1
  ↓
Direct index access → O(1) random read
  ↓
array.length
  ↓
FOR LOOP
  ↓
Initialization
  ↓
Condition
  ↓
Business logic
  ↓
Update
  ↓
Repeat
  ↓
Process every array element
  ↓
IF CONDITION
  ↓
Filter / select required elements
```

## Final Developer Thinking

The important skill from this session is not memorizing:

```java
for (int i = 0; i < array.length; i++)
```

It is understanding **why the pattern exists**:

```text
Many related values
       ↓
Store them together
       ↓
Array
       ↓
Need to process each value
       ↓
for loop
       ↓
Current index
       ↓
Current element
       ↓
Business condition
       ↓
Required action
```

That pattern is the foundation for much of the array-processing logic that follows in Java.
