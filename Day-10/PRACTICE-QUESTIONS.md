# Day 10 — Professional Practice Set
## Access Modifiers, Packages, Imports, `this` & Multi-Class Visibility
### Medium → Hard → Tricky

> **Practice rule:** Do not decide access from the keyword alone.  
> First identify the **class, member, package relationship, and calling location**.

---

# Current Day 10 Scope

Strictly practice these Day 10 concepts:

```text
private
default / package-private
protected
public

Classes and members
Multiple classes
Driver class
main()
Object creation
Instance method calling
object.method()

Packages
Package naming
Imports
Import ≠ permission

this
Current object

Compilation/access errors
Reading compiler messages
Recompile after source changes

Multi-class application structure
One entry-point / driver style
```

This set intentionally does **not** introduce constructors, inheritance-heavy problems, loops, collections, exception handling, or other later topics.

---

# Quick Reference

```text
private
→ same class

default
→ same package

protected
→ same package
  + appropriate child-class access outside package

public
→ wider access when the class/member is accessible
```

Remember:

```text
import ≠ permission
```

An import helps Java locate a class.  
The access modifier still determines whether it can be used.

---

# Part A — Core Access Modifier Questions

### Q1. Same Class

Which modifier allows direct access within the declaring class?

A. `private`  
B. `default`  
C. `protected`  
D. `public`

---

### Q2. Same Package

A member has no access modifier:

```java
int amount;
```

What access level does it have?

A. private  
B. default/package-private  
C. protected  
D. public

---

### Q3. Protected

Which Day 10 mental model best represents `protected`?

A.

```text
same class only
```

B.

```text
same package only
```

C.

```text
same package + appropriate child class outside package
```

D.

```text
every class everywhere
```

---

### Q4. Public

What is the key idea of `public`?

A. Same class only  
B. Same package only  
C. Wider access when the type/member is otherwise accessible  
D. The member becomes static

---

### Q5. No Modifier Trap

A developer writes:

```java
int orderValue = 500;
```

and says:

> "`orderValue` is public because no private keyword is written."

Is that correct?

Explain the actual rule.

---

### Q6. Explicit `default` Keyword

Which declaration represents default access?

A.

```java
default int amount;
```

B.

```java
int amount;
```

C.

```java
package int amount;
```

D.

```java
visible int amount;
```

---

### Q7. Private Does Not Mean Invisible

A developer says:

> "`private` means nobody can see the variable."

What is the more accurate Day 10 understanding?

---

# Part B — Identify Visibility

Use:

```java
class OrderManagement
{
    private int orderValue;
    int quantity;
    protected String customerName;
    public void placeOrder()
    {
    }
}
```

### Q8.

Which member is private?

### Q9.

Which member has default/package-private access?

### Q10.

Which member is protected?

### Q11.

Which member is public?

### Q12.

Which member is directly accessible from another class only when its access level permits that location?

---

# Part C — Same Class vs Same Package

Use this structure:

```text
package account;

class Account
{
    private int privateBalance = 100;
    int defaultBalance = 200;
    protected int protectedBalance = 300;
    public int publicBalance = 400;
}
```

Another class is in the **same package**:

```text
package account;
```

### Q13.

Can the same-package class access:

```java
privateBalance
```

A. Yes  
B. No

---

### Q14.

Can it access:

```java
defaultBalance
```

A. Yes  
B. No

---

### Q15.

Can it access:

```java
protectedBalance
```

A. Yes  
B. No

---

### Q16.

Can it access:

```java
publicBalance
```

A. Yes  
B. No

---

### Q17. Same Package Trap

Among the four members above, which modifier is **not** available directly to another class in the same package?

A. private  
B. default  
C. protected  
D. public

---

# Part D — Different Package

Now suppose:

```text
package account;
```

contains:

```java
public class Account
{
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;
}
```

And:

```text
package user;
```

contains another class.

### Q18.

Can the `user` package directly access `a`?

### Q19.

Can it directly access `b`?

### Q20.

Can it directly access `c` from an unrelated class?

### Q21.

Can it access `d`, assuming the `Account` class itself is accessible?

---

### Q22. Visibility Pattern

Choose the correct simplified result for an unrelated class in another package:

```text
private   → ?
default   → ?
protected → ?
public    → ?
```

Use:

```text
accessible
not directly accessible
```

---

# Part E — Import vs Permission

### Q23.

Suppose:

```java
import account.Account;
```

What does the `import` statement primarily help with?

A. It changes private members to public  
B. It tells Java where the class/type can be found  
C. It changes the package of the class  
D. It creates an object

---

### Q24. Tricky

A developer writes:

```java
import account.Account;
```

Then tries to access a private member of `Account`.

The developer says:

> "I imported the class, so Java should allow access."

What is wrong with that reasoning?

---

### Q25.

Complete:

```text
Different package
      ↓
?
      ↓
check access modifier
      ↓
use if accessible
```

What belongs at `?`?

A. `new JVM()`  
B. `import` the class  
C. `delete class`  
D. `make everything private`

---

### Q26. Import Is Not a Modifier

Which of the following is an access modifier?

A. `import`  
B. `package`  
C. `private`  
D. `main`

---

# Part F — Multiple Classes and One Entry Point

### Q27.

Which class is normally responsible for starting the application in the Day 10 structure?

A. Every class  
B. Driver class containing `main()`  
C. Only package class  
D. The import statement

---

### Q28.

Is it necessary for every class in a multi-class Java application to contain:

```java
public static void main(String[] args)
```

A. Yes  
B. No

Explain.

---

### Q29. Structure Question

Which structure better matches the Day 10 style?

A.

```text
Driver
 └── main()

OrderManagement
 └── placeOrder()
```

B.

```text
Driver
 ├── main()
 ├── placeOrder()
 └── every other task

OrderManagement
 └── main()
```

Explain the design idea.

---

### Q30.

Given:

```java
class Driver
{
    public static void main(String[] args)
    {
        OrderManagement order =
            new OrderManagement();

        order.placeOrder("Laptop");
    }
}
```

What is the role of:

```java
new OrderManagement()
```

A. Importing the class  
B. Creating an object  
C. Calling `main()`  
D. Changing access

---

# Part G — Instance Method Calling

### Q31.

Given:

```java
class OrderManagement
{
    public void placeOrder(String itemName)
    {
        System.out.println(itemName);
    }
}
```

Which is the correct way to call the instance method from another class?

A.

```java
OrderManagement.placeOrder("Laptop");
```

B.

```java
OrderManagement order =
    new OrderManagement();

order.placeOrder("Laptop");
```

C.

```java
placeOrder.OrderManagement("Laptop");
```

D.

```java
OrderManagement::placeOrder("Laptop");
```

---

### Q32. Identify the Object

In:

```java
OrderManagement order =
    new OrderManagement();

order.placeOrder("Laptop");
```

Which is the object reference?

A. `OrderManagement`  
B. `order`  
C. `placeOrder`  
D. `"Laptop"`

---

### Q33.

What does this represent?

```java
order.placeOrder("Laptop");
```

A. A package declaration  
B. An instance method call through an object  
C. An import statement  
D. A class declaration

---

### Q34. Flow

Arrange:

```text
A. placeOrder() executes
B. object is created
C. Driver.main() executes
D. method call is made through object
E. control returns
```

---

# Part H — `this`

### Q35.

What does `this` represent?

A. Parent class  
B. Package  
C. Current object  
D. Current package

---

### Q36.

Given:

```java
class OrderManagement
{
    int orderValue;

    void display()
    {
        System.out.println(this.orderValue);
    }
}
```

What does:

```java
this.orderValue
```

refer to?

A. A static variable  
B. The current object's `orderValue`  
C. A package variable  
D. Another class's variable

---

### Q37. Implicit vs Explicit

Inside an instance method:

```java
orderValue
```

and:

```java
this.orderValue
```

can both refer to the current object's member in the demonstrated context.

What does adding `this.` make clearer?

A. The package name  
B. The current-object relationship  
C. The access modifier  
D. The class loader

---

### Q38. Tricky

A developer says:

> "`this` means the class."

Correct the statement.

---

# Part I — Access Modifier + Object Calling

Consider:

```java
class OrderManagement
{
    private void privateTask()
    {
        System.out.println("private");
    }

    public void publicTask()
    {
        System.out.println("public");
    }

    void defaultTask()
    {
        System.out.println("default");
    }

    protected void protectedTask()
    {
        System.out.println("protected");
    }
}
```

### Q39.

Inside the same class, can all four methods be called?

A. Yes  
B. No

---

### Q40.

Another class in the same package tries:

```java
order.privateTask();
```

What should you expect?

A. Works  
B. Access-related compilation error  
C. Runtime-only failure  
D. Import problem

---

### Q41.

Another class in the same package tries:

```java
order.defaultTask();
```

What is the expected result?

A. Accessible  
B. Not accessible

---

### Q42.

Another class in the same package tries:

```java
order.protectedTask();
```

What is the expected result?

A. Accessible  
B. Not accessible

---

### Q43.

Another class in the same package tries:

```java
order.publicTask();
```

What is the expected result?

A. Accessible  
B. Not accessible

---

# Part J — Different Package Trap

### Q44.

Suppose `OrderManagement` is in:

```text
package order;
```

and an unrelated `Driver` is in:

```text
package app;
```

The driver successfully imports `OrderManagement`.

Which access level still does **not** become automatically accessible merely because of the import?

A. private  
B. public  
C. Both  
D. None

---

### Q45.

A package-private class is:

```java
class OrderManagement
{
}
```

A developer in another package writes:

```java
import order.OrderManagement;
```

What is the important Day 10 idea?

A. Import automatically makes the class public  
B. Import does not override the class's access rule  
C. Import converts it to protected  
D. Import creates an object

---

# Part K — Compilation Error Reasoning

### Q46.

A program gives an access-related compilation error.

Which debugging sequence is the most useful?

A.

```text
Randomly change code
→ run again
```

B.

```text
Read error
→ find class/member
→ identify access modifier
→ check package relationship
→ fix cause
→ recompile
```

C.

```text
Delete project
→ recreate everything
```

D.

```text
Add import to every file
```

---

### Q47.

The compiler points to this line:

```java
order.placeOrder("Laptop");
```

What should you inspect first?

A. Which access modifier `placeOrder()` has  
B. Whether the computer has internet  
C. Whether the package has a logo  
D. Whether the class contains a loop

---

### Q48.

A developer changes:

```java
public void placeOrder()
```

to:

```java
private void placeOrder()
```

Then immediately tests an older compiled version.

Why can this lead to confusion?

A. Source and compiled output are no longer synchronized until recompilation  
B. Private methods become static  
C. Import removes errors  
D. `main()` disappears

---

### Q49.

Complete the development flow:

```text
.java
  ↓
modify
  ↓
?
  ↓
updated .class
  ↓
java
```

A. `import`  
B. `javac` / recompilation  
C. `new`  
D. `this`

---

# Part L — Package Organization

### Q50.

Why are packages useful?

A. They organize related classes and help avoid naming conflicts  
B. They make every member public  
C. They replace classes  
D. They eliminate compilation

---

### Q51.

Which package structure follows the convention introduced on Day 10?

A.

```text
Account
```

B.

```text
com.example.account
```

C.

```text
ACCOUNT-PACKAGE
```

D.

```text
account package
```

---

### Q52. Naming Conflict

Suppose two application areas contain:

```text
retail.Order
reseller.Order
```

What problem does the package structure help solve?

A. It lets Java distinguish classes with the same simple name  
B. It converts both classes into one object  
C. It makes both classes private  
D. It removes the need for source files

---

# Part M — Hard Scenario

Use:

```text
package account;
```

```java
public class Account
{
    private int balance = 1000;

    int accountType = 1;

    protected String owner = "Ravi";

    public void display()
    {
        System.out.println(balance);
    }
}
```

Another class is:

```text
package app;
```

and contains:

```java
import account.Account;

class Driver
{
    public static void main(String[] args)
    {
        Account account =
            new Account();

        account.display();
    }
}
```

### Q53.

Can `Driver` create the object if `Account` is public?

A. Yes  
B. No

---

### Q54.

Can `Driver` directly access:

```java
account.balance
```

A. Yes  
B. No

---

### Q55.

Can `Driver` directly access:

```java
account.accountType
```

A. Yes  
B. No

---

### Q56.

Can an unrelated class in another package directly access:

```java
account.owner
```

under the simple Day 10 protected model?

A. Yes  
B. No

---

### Q57.

Can `Driver` call:

```java
account.display();
```

assuming `display()` is public?

A. Yes  
B. No

---

### Q58. The Important Trap

Why can this work:

```java
account.display();
```

while this does not:

```java
System.out.println(account.balance);
```

Explain using the access modifiers.

---

# Part N — Driver vs Functionality

### Q59.

Which class should normally contain the application entry point in the Day 10 structure?

A.

```text
OrderManagement
```

B.

```text
Driver
```

C.

```text
Every service class
```

D.

```text
Every package
```

---

### Q60.

Which design keeps the responsibilities clearer?

A.

```text
Driver
 └── main()
     ├── order logic
     ├── notification logic
     └── every other task
```

B.

```text
Driver
 └── main()
       ↓
OrderManagement
 └── order-related method
```

---

# Part O — Tricky True / False

### Q61.

> A member without an access modifier is public.

True or False?

---

### Q62.

> `import` gives permission to use a private member.

True or False?

---

### Q63.

> Every class must have a `main()` method.

True or False?

---

### Q64.

> `this` represents the current object.

True or False?

---

### Q65.

> Changing an access modifier in source code should be followed by recompilation before testing the changed program.

True or False?

---

### Q66.

> A public class automatically makes every member inside it public.

True or False?

---

# Part P — Debug the Code

### Q67. Private Method

```java
class OrderManagement
{
    private void placeOrder()
    {
        System.out.println("Order");
    }
}

class Driver
{
    public static void main(String[] args)
    {
        OrderManagement order =
            new OrderManagement();

        order.placeOrder();
    }
}
```

What is the problem?

What change would make the method accessible from `Driver`?

---

### Q68. Default Method Across Packages

Suppose:

```java
package order;

public class OrderManagement
{
    void placeOrder()
    {
        System.out.println("Order");
    }
}
```

Another class in:

```text
package app;
```

imports `OrderManagement`.

What access issue should you check?

---

### Q69. Import Misunderstanding

```java
import order.OrderManagement;

class Driver
{
}
```

A developer says:

> "Now all methods of `OrderManagement` can be called."

What is wrong with the statement?

---

### Q70. Missing Object

Given:

```java
class OrderManagement
{
    public void placeOrder()
    {
        System.out.println("Order");
    }
}
```

A developer writes:

```java
OrderManagement.placeOrder();
```

What Day 10 concept explains why the demonstrated instance-method style should instead use an object?

Rewrite the call structure.

---

# Part Q — Professional Coding Practice

## Q71. Access Modifier Demonstration

Create an `OrderManagement` class containing:

```text
private variable
default variable
protected variable
public variable
```

Create another class in the same package and test which members are accessible.

Do not rely on memory alone—compile and observe.

---

## Q72. Package Boundary Exercise

Create two packages:

```text
com.example.account
com.example.app
```

Create an `Account` class in the first package with:

```text
private
default
protected
public
```

members.

Create a `Driver` in the second package.

Import `Account` and test the access rules.

Record the compilation results.

---

## Q73. `this` Practice

Create:

```java
class OrderManagement
{
    int orderValue;

    void display()
    {
        System.out.println(this.orderValue);
    }
}
```

Create an object from `main()` and call:

```java
display()
```

Then explain what `this` refers to during execution.

---

## Q74. Driver + Functionality

Create:

```text
Driver
OrderManagement
```

`Driver` should contain:

```java
main()
```

`OrderManagement` should contain:

```java
placeOrder()
```

Create the object in `Driver` and call the instance method.

---

# Final Challenge — Q75

Read this complete scenario carefully:

```text
package order;
```

```java
public class OrderManagement
{
    private int orderValue = 1200;

    int quantity = 2;

    protected String customerName = "Ravi";

    public void placeOrder(String itemName)
    {
        System.out.println(
            this.customerName + " ordered " + itemName
        );
    }
}
```

Driver:

```text
package app;
```

```java
import order.OrderManagement;

class Driver
{
    public static void main(String[] args)
    {
        OrderManagement order =
            new OrderManagement();

        order.placeOrder("Laptop");

        System.out.println(
            order.orderValue
        );

        System.out.println(
            order.quantity
        );

        System.out.println(
            order.customerName
        );
    }
}
```

Assume the classes are correctly located in their packages.

Answer:

### A.

Will this statement work?

```java
OrderManagement order =
    new OrderManagement();
```

Why?

### B.

Will this work?

```java
order.placeOrder("Laptop");
```

Why?

### C.

Will this work?

```java
order.orderValue
```

Why or why not?

### D.

Will this work?

```java
order.quantity
```

Why or why not?

### E.

Will this work from an **unrelated** class in another package?

```java
order.customerName
```

Use the Day 10 `protected` model.

### F.

Which access problem will the compiler report first when this code is compiled?

Explain how you would investigate it.

### G.

After correcting the source, what should happen before testing again?

---

# Day 10 Master Mental Model

```text
CLASS / MEMBER
      ↓
ACCESS MODIFIER
      ↓
WHO IS CALLING?
      ↓
SAME CLASS?
      ↓
SAME PACKAGE?
      ↓
CHILD CLASS?
      ↓
OTHER PACKAGE?
      ↓
ACCESS ALLOWED?
```

For packages:

```text
Different package
      ↓
import
      ↓
locate type
      ↓
access rule still applies
```

For multi-class applications:

```text
Driver
  ↓
main()
  ↓
create object
  ↓
object.method()
  ↓
functionality class
```

For `this`:

```text
this
 ↓
current object
```

For source changes:

```text
modify .java
     ↓
recompile
     ↓
updated .class
     ↓
run/test
```

# Final Revision Check

Before moving on, make sure you can explain these without notes:

```text
private
default
protected
public

same class
same package
different package

package
import
import ≠ permission

Driver
main()
object.method()

this
current object

compilation error
access error
recompile after source change
```

### Day 10 Practice Goal

**Do not memorize an access-modifier table in isolation. Given a real class, package, member, and caller, reason through whether the access should be allowed and why.**
