# Day 03 Notes — Classes, Methods & Program Flow

## Class

A class gives a Java program a structure and can represent a meaningful real-world entity.

Examples:

- `AccountInfo`
- `EmployeeInfo`
- `PaymentDetails`
- `CustomerInfo`

## Method

A method is used to perform a particular task.

Example:

```java
static void displayAccount()
{
    System.out.println("Account Information");
}
```

The method can then be called from `main()`.

## main()

The `main()` method is the normal starting point for Java application execution.

```java
public static void main(String args[])
```

## Naming

**Class:** PascalCase

`AccountInfo`

**Method:** camelCase

`displayAccountInfo()`

## Output

`System.out.print()` keeps the next output on the same line.

`System.out.println()` moves the next output to a new line.

## Multiple Classes

A Java source file can contain multiple classes. A class intended to be executed needs an appropriate `main()` method.

## Compilation and Execution

```text
.java source file
       ↓
javac FileName.java
       ↓
.class bytecode
       ↓
java ClassName
       ↓
JVM
       ↓
Program output
```

## Development Flow

```text
Requirement
    ↓
Understand
    ↓
Design
    ↓
Develop
    ↓
Build
    ↓
Test
```

The important habit is to understand the requirement before starting to write code.