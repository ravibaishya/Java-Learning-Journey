# Day 06–07 Practice Questions

## Short Questions

1. What is a data type?
2. Why does Java require a data type when declaring a variable?
3. What is a variable?
4. What is the difference between declaration and initialization?
5. What is the difference between `=` and `==`?
6. What are the eight primitive data types in Java?
7. What is the range of the `byte` data type?
8. Why does a `byte` have 256 possible values?
9. What is the difference between `float` and `double`?
10. What values can a `boolean` store?
11. What is the purpose of the `char` data type?
12. What is a non-primitive data type?
13. What is a local variable?
14. What is an instance variable?
15. What is a static variable?
16. What is the difference between an instance variable and a static variable?
17. What is scope?
18. Why must a local variable be initialized before it is used?
19. Where are objects and instance data generally associated in the basic JVM memory model?
20. Why can a static method not directly access an instance variable without an object reference?

## Coding Practice

Create similar programs for:

1. Employee details using variables
2. Bank account information
3. Product information using different primitive data types
4. Student marks using integer variables
5. Product price using `float` and `double`
6. Account status using `boolean`
7. Employee grade using `char`
8. A class containing local, instance, and static variables
9. A program demonstrating instance variable access using an object
10. A program demonstrating static variable access using the class name

### For each program:

- Choose an appropriate data type for each value.
- Use meaningful variable names.
- Declare and initialize the variables correctly.
- Display the values using `System.out.println()`.
- Compile the program.
- Run it using the class name.

## Practice With Data Types

Create a program that declares one variable of each primitive data type:

```java
byte
short
int
long
float
double
boolean
char
```

Assign suitable values and display them.

Then answer:

- Which variables store whole numbers?
- Which variables store decimal values?
- Which variable stores a logical value?
- Which variable stores a single character?

## Practice With Default Values

Create class-level/static variables for:

```text
byte
short
int
long
float
double
boolean
char
```

Do not explicitly assign values.

Print the variables and observe their default values.

Then explain why local variables behave differently.

## Variable Classification Practice

For each variable, identify whether it is **Local, Instance, or Static**:

```java
class Account {

    static double interestRate = 5.0;

    int balance = 500;

    public static void main(String[] args) {

        int amount = 100;

        System.out.println(amount);
    }
}
```

Then answer:

1. Which variable belongs to the class?
2. Which variable belongs to an object?
3. Which variable belongs to the `main()` method?
4. Which variable can be accessed using `Account.interestRate`?
5. Which variable requires an object reference for access?

## Concept Practice

For each situation, decide whether the value should normally be represented as a **local, instance, or static variable**:

1. A customer's account balance
2. A company's common interest rate
3. A temporary calculation inside a method
4. An employee's employee ID
5. A value shared by every object of the same class

## Quick Code Analysis

What happens in each case?

### Example 1

```java
int amount = 100;
amount = 200;
```

What is the final value of `amount`?

### Example 2

```java
int amount;
System.out.println(amount);
```

Why does this cause a problem?

### Example 3

```java
class Account {

    int balance = 500;

    public static void main(String[] args) {
        System.out.println(balance);
    }
}
```

Why can't `balance` be accessed directly from `main()`?

### Example 4

```java
class Account {

    int balance = 500;

    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println(acc.balance);
    }
}
```

Why does this allow the instance variable to be accessed?

## Challenge Questions

1. Create a class with one local, one instance, and one static variable. Display all three.
2. Create two objects of the same class and give each object a different instance-variable value. Display both values.
3. Create a static variable shared by two objects and demonstrate that the value belongs to the class rather than an individual object.
4. Create a program that stores an employee's age, salary, status, and grade using appropriate primitive data types.
5. Create a program that demonstrates the difference between `object.member` and `ClassName.staticMember`.

## Revision Task

Without looking at your notes, explain this sequence:

```text
Data
  ↓
Data Type
  ↓
Variable
  ↓
Scope
  ↓
Local / Instance / Static
  ↓
Object / Class
  ↓
Member Access
```

The aim is not only to write the program but to explain **why each data type and variable type was chosen**.
