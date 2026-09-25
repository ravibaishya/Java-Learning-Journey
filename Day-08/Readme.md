# Java Learning Journey — Day 08

## Operators: Making Decisions with Expressions

A variable stores data, but operators are what let a program work with that data.

Today’s session connected Java variables with expressions used to calculate values, compare conditions, and combine multiple checks.

### 1. Assignment Operator

`=` assigns a value to a variable.

```java
int age = 25;
```

Think of it as:

> Store `25` in the variable `age`.

### 2. Arithmetic Operators

| Operator | Meaning | Example |
|---|---|---|
| `+` | Addition | `10 + 5` |
| `-` | Subtraction | `10 - 5` |
| `*` | Multiplication | `10 * 5` |
| `/` | Division | `10 / 5` |
| `%` | Remainder | `10 % 3` |

`%` is useful when we need the remainder after division.

### 3. Comparison Operators

Comparison operators produce a `boolean` result.

```java
int age = 20;

System.out.println(age >= 18);
```

Output:

```text
true
```

Common operators:

```text
>    greater than
<    less than
>=   greater than or equal to
<=   less than or equal to
==   equal to
!=   not equal to
```

**Comparison → boolean result (`true` or `false`)**

### 4. Logical Operators

Logical operators combine boolean conditions.

#### AND — `&&`

Both conditions must be true.

```java
age >= 18 && marks >= 40
```

Example:

```text
age   = 20
marks = 75

age >= 18   → true
marks >= 40 → true

true && true → true
```

#### OR — `||`

At least one condition must be true.

```java
age >= 18 || marks >= 40
```

#### NOT — `!`

Reverses a boolean value.

```java
!true  → false
!false → true
```

### 5. Short-Circuit Evaluation

For `&&`:

```text
false && anything → false
```

For `||`:

```text
true || anything → true
```

Java can stop evaluating when the final result is already known.

This is called **short-circuit evaluation**.

### 6. Ternary Operator

The ternary operator `?:` is a compact way to choose between two values.

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";
```

Pattern:

```text
condition ? value-if-true : value-if-false
```

It is useful for simple two-way choices.

### 7. Unary Operators

Unary operators work with a single operand.

```java
++   increment
--   decrement
```

Example:

```java
int count = 5;
count++;
```

Now:

```text
count = 6
```

Similarly:

```java
count--;
```

reduces the value by one.

---
## Visual Note

![Java Day 08 — Operators](assets/day-08-operators.png)

---

## The Bigger Picture

Operators form expressions:

```text
Variables
   ↓
Values
   ↓
Operators
   ↓
Expression
   ↓
Result
```

Example:

```java
int age = 20;
int marks = 75;

boolean eligible = age >= 18 && marks >= 40;
```

Identify each part:

- `age`, `marks` → variables
- `>=` → comparison operator
- `&&` → logical operator
- `age >= 18 && marks >= 40` → expression
- `eligible` → boolean variable
- `true` → resulting value

---

## What I Took Away

The important part is not simply memorising operator symbols.

It is learning to **read an expression and predict its result**.

Before running code, ask:

1. What are the operands?
2. Which operator is being used?
3. What type of result does it produce?
4. If operators are combined, how does the expression evaluate?

That turns operator questions into a reasoning exercise rather than pure memorisation.

---

## Quick Revision

```text
=          → assignment
+ - * / %  → arithmetic
> < >= <= == != → comparison
&& || !    → logical
?:         → ternary
++ --      → increment / decrement
```

### Key Rule

**Comparison and logical expressions produce `boolean` results.**

## Practice

Write small Java programs using only:

- variables
- arithmetic operators
- comparison operators
- logical operators
- ternary operator
- `++` / `--`

Try to predict the output **before running the program**.

---

**Next:** Continue building Java fundamentals by connecting these expressions with methods, objects, and program flow.
