# Java Learning Journey — Day 16
## Practice Questions — Foundation → Medium → Hard → Tricky

> **Scope:** This practice set is strictly based on the Day 16 learning session.
>
> **Important:** Questions are designed around constructor use, constructor matching, `this`, `this()`, `super()`, constructor chaining, constructor access scope, object initialization, inheritance-based product modelling, comments/documentation, and practical reasoning from the session.
>
> **Excluded:** Control flow, `for` loops, collections, exception handling, and other later topics were not used unless directly required by the Day 16 material.

---

# Part A — Foundation

### Q1
What is the primary purpose of a constructor according to the session?

A. To repeatedly update an existing object  
B. To create and initialize an object's state  
C. To execute a loop  
D. To import another class  

### Q2
Which keyword is used when creating an object?

A. `create`  
B. `object`  
C. `new`  
D. `constructor`

### Q3
Given:

```java
class User {
    String name;

    User(String name) {
        this.name = name;
    }
}
```

What does `this` refer to inside the constructor?

A. The class itself  
B. The current object being initialized  
C. The parent class  
D. The constructor parameter only  

### Q4
What does this constructor call?

```java
this(200);
```

A. A constructor of the parent class  
B. A method named `this`  
C. Another constructor in the same class accepting an `int`  
D. A new object  

### Q5
What does this constructor call?

```java
super();
```

A. Another constructor in the same class  
B. The no-argument constructor of the parent class  
C. The current object's constructor again  
D. A static method  

### Q6
What does this call?

```java
super("Phone");
```

A. Same-class constructor with a `String` parameter  
B. Parent-class constructor with a matching `String` parameter  
C. Current object's `String` variable  
D. A method from `Object` only  

### Q7
Which statement correctly distinguishes `this()` and `super()`?

A. Both always call the parent constructor  
B. `this()` calls another constructor in the same class; `super()` calls a parent constructor  
C. `this()` creates an object; `super()` creates a class  
D. Both are used only for variables  

### Q8
What is constructor chaining?

A. Calling one constructor from another constructor  
B. Calling the same method repeatedly  
C. Creating multiple objects from one class  
D. Importing multiple classes  

### Q9
If neither `this(...)` nor `super(...)` is explicitly written in a constructor, what did the session explain happens?

A. Nothing is called  
B. The compiler supplies a no-argument `super()`  
C. The compiler supplies `this()`  
D. The constructor is deleted  

### Q10
Which statement about `this(...)` and `super(...)` is correct?

A. They can appear anywhere in a constructor  
B. They must be the first statement of a constructor  
C. They must be the last statement  
D. They can only be used inside `main()`  

### Q11
Suppose:

```java
class User {
    User() {}
    User(String name) {}
}
```

What does this call select?

```java
new User("Ravi");
```

A. `User()`  
B. `User(String)`  
C. Both constructors  
D. No constructor  

### Q12
Suppose:

```java
class Product {
    Product(int price) {}
}
```

What happens with:

```java
Product p = new Product();
```

A. The `int` constructor is automatically used  
B. Java supplies a matching no-argument constructor  
C. There is no matching constructor for this call  
D. `price` becomes `0` and compilation succeeds because of that  

### Q13
Which access level allows a constructor to be used from another package, assuming the class itself is accessible?

A. `private`  
B. default  
C. `public`  
D. none  

### Q14
According to the session's access-scope explanation, default/package-private constructor access is available:

A. Anywhere  
B. Only inside the same class  
C. Within the same package  
D. Only inside subclasses  

### Q15
According to the session, `private` access means:

A. Same package only  
B. Same class  
C. All subclasses  
D. All packages  

### Q16
According to the session's simplified access model, `protected` means:

A. Same class only  
B. Same package plus appropriate subclasses  
C. Other packages only  
D. No access  

### Q17
Why can a constructor have `public` access?

A. To make object construction available where the class can be accessed  
B. To make all variables automatically public  
C. To remove constructor matching  
D. To prevent object creation  

### Q18
Why were comments/documentation discussed in the session?

A. To replace Java code  
B. To help developers understand the purpose/functionality of code without reading every implementation line  
C. To make constructors public  
D. To execute code during debugging  

### Q19
What happens when a developer hovers over appropriately written class/method documentation in the IDE?

A. The program recompiles automatically  
B. Documentation information can be displayed  
C. A new object is created  
D. The constructor is executed  

### Q20
What was the practical reason given for writing documentation/comments in complex systems?

A. Complex code becomes easier to navigate and understand  
B. It makes Java execute faster  
C. It removes inheritance  
D. It eliminates constructors  

---

# Part B — Medium

### Q21
Consider:

```java
class User {
    String name;
    String country;

    User() {
        this("Guest", "India");
    }

    User(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
```

Which constructor is ultimately responsible for assigning the two values when this is executed?

```java
User u = new User();
```

A. Only `User()`  
B. `User(String, String)`  
C. `Object()` directly  
D. No constructor  

### Q22
For Q21, what is the purpose of `this("Guest", "India")`?

A. It calls a parent constructor  
B. It calls another constructor in the same class  
C. It creates another object  
D. It accesses static fields  

### Q23
Why is constructor matching important when using `this(...)`?

A. Java must find a constructor in the same class whose parameters match the supplied arguments  
B. `this(...)` ignores constructor parameters  
C. It always selects the first constructor in the file  
D. It always selects a no-argument constructor  

### Q24
Consider:

```java
class User {
    User() {}
    User(String name) {}
}
```

Which statement is correct?

```java
new User();
new User("Ravi");
```

A. Both calls use the same constructor  
B. Each call selects the constructor matching its arguments  
C. Both fail because constructors cannot be overloaded  
D. Only the second call is valid  

### Q25
Why might a real application use a no-argument constructor path for a new/guest user in the Day 16 example?

A. The system can create an object with default/system-generated details when the user provides minimum information  
B. Java does not support constructor parameters  
C. A no-argument constructor always means anonymous user  
D. The parent class cannot have fields  

### Q26
In the guest-user example, who supplies values such as default guest information?

A. The end user manually enters every value  
B. The system/application logic can supply default values  
C. The JVM randomly chooses values  
D. The compiler asks the user  

### Q27
Why can a constructor with parameters be useful when a user later supplies complete details?

A. It allows those supplied values to initialize the object  
B. It removes the object  
C. It disables constructor matching  
D. It forces the no-argument constructor  

### Q28
Consider:

```java
class User {
    User() {
        this("Guest");
    }

    User(String name) {
        this.name = name;
    }

    String name;
}
```

What is the logical initialization flow?

A. `User(String)` → `User()`  
B. `User()` → `this("Guest")` → `User(String)`  
C. `User()` only  
D. `Object()` → `User()` with no `this()` call  

### Q29
Which line correctly initializes the instance variable from a constructor parameter?

```java
class User {
    String name;

    User(String name) {
        // ?
    }
}
```

A. `name = this.name;`  
B. `this.name = name;`  
C. `this = name;`  
D. `name.this = name;`  

### Q30
Why is `this.name = name;` useful when both the field and parameter have the same name?

A. It distinguishes the object's field from the constructor parameter  
B. It calls the parent constructor  
C. It creates a new class  
D. It changes the package  

### Q31
Consider:

```java
class Product {
    Product(String name, double price, int id) {
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct(String name, double price, int id, int warranty) {
        super(name, price, id);
        this.warranty = warranty;
    }

    int warranty;
}
```

What does `super(name, price, id)` accomplish?

A. Initializes the common product-level state through the parent constructor  
B. Initializes only `warranty`  
C. Calls a constructor in `ElectronicProduct`  
D. Creates a second `ElectronicProduct` object  

### Q32
In the Day 16 product example, which attributes were described as common to products?

A. Name, price, product ID  
B. Warranty, size, color  
C. Only warranty  
D. Only product ID  

### Q33
Which attribute was used as an example of an electronic-product-specific field?

A. Product name  
B. Price  
C. Product ID  
D. Warranty  

### Q34
Why was `super(...)` useful in the electronic-product example?

A. It avoids duplicating initialization of common parent fields  
B. It removes the parent class  
C. It makes all fields static  
D. It prevents object creation  

### Q35
Suppose `ElectronicProduct` extends `Product`. Which is the better representation according to the session's design example?

A. Put every possible attribute into every product class  
B. Keep common product attributes in `Product` and electronic-specific attributes in `ElectronicProduct`  
C. Put warranty into every food product  
D. Put clothing size into every electronic product  

### Q36
Why did the session distinguish common and specific product attributes?

A. Not every attribute applies to every product category  
B. Java requires every class to have exactly three fields  
C. Constructors cannot initialize more than one field  
D. `super()` only works with three fields  

### Q37
Suppose:

```java
class Product {
    Product(String name, double price, int id) {
        // common initialization
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct(String name, double price, int id, int warranty) {
        super(name, price, id);
        this.warranty = warranty;
    }

    int warranty;
}
```

Which constructor runs first when this is executed?

```java
new ElectronicProduct("Phone", 50000, 101, 2);
```

A. `Product(...)`  
B. `ElectronicProduct(...)`  
C. Both at exactly the same time  
D. Neither  

### Q38
Based on the session's explanation, after the parent constructor initializes common state, control returns to the child constructor to complete child-specific initialization.

A. True  
B. False  

### Q39
If a child constructor does not explicitly initialize a child-specific field after calling `super(...)`, what does `super(...)` do?

A. It automatically knows and initializes every child-specific field  
B. It initializes the parent-level state only  
C. It deletes the child field  
D. It calls `this(...)` automatically  

### Q40
Why did Eclipse's “Generate Constructor using Fields” feature appear in the session?

A. To automatically generate constructor code based on selected fields  
B. To execute the constructor  
C. To replace inheritance  
D. To create a package  

### Q41
What is the relationship in the session's product example?

A. `Product` extends `ElectronicProduct`  
B. `ElectronicProduct` extends `Product`  
C. `Product` and `ElectronicProduct` are unrelated  
D. `Driver` extends both  

### Q42
What was the role of the Driver class in the practical example?

A. It was used to execute the code/create and test objects  
B. It was the parent of `Product`  
C. It replaced the constructor  
D. It stored all product attributes  

### Q43
Why did the session use separate product classes instead of putting every category-specific field into one common class?

A. To keep category-specific information in appropriate classes and avoid unnecessary duplication  
B. Because Java does not allow multiple fields  
C. Because constructors cannot use inheritance  
D. Because a Driver cannot call one class  

### Q44
If a clothing product needs `size` and `color`, while an electronic product needs `warranty`, what does the session's modelling approach suggest?

A. Every product must contain all three fields  
B. Category-specific classes should contain their specific attributes  
C. Only `Product` should contain all attributes  
D. Remove inheritance  

### Q45
Why was the example of food products used?

A. To show that some attributes such as size or warranty may not apply to every product category  
B. To demonstrate loops  
C. To demonstrate exception handling  
D. To demonstrate collections  

### Q46
What happens if a constructor with default/package-private access is called from another package?

A. It is accessible automatically  
B. It is not accessible because default access is package-level  
C. It becomes public automatically  
D. It becomes protected automatically  

### Q47
What change made the constructor accessible from the other package in the session's demonstration?

A. Changing it from default access to `public`  
B. Changing it to `private`  
C. Removing the constructor  
D. Adding `this()`  

### Q48
The session emphasized that constructor access follows the same general access-scope model discussed earlier for members. Which statement matches that model?

A. Constructors ignore access modifiers  
B. Constructor access can be controlled with access modifiers  
C. Constructors are always public  
D. Constructors are always private  

### Q49
Why does calling a constructor again not update an already-created object?

A. A constructor is used as part of object creation/initialization; to create another initialized object, use `new` again  
B. Constructors can only run once in the JVM  
C. Constructors are methods and cannot be called  
D. Objects cannot hold state  

### Q50
Given:

```java
User u = new User();
```

and later:

```java
u = new User("Ravi");
```

What has happened?

A. The original object has been re-run through its constructor  
B. A new `User` object has been created and the variable now refers to it  
C. The constructor of the original object was called again  
D. Both objects became the same object  

---

# Part C — Hard

### Q51
Consider:

```java
class User {
    String name;

    User() {
        this("Guest");
    }

    User(String name) {
        this.name = name;
    }
}
```

Trace:

```java
User u = new User();
```

Write the constructor execution order and final value of `u.name`.

### Q52
Now consider:

```java
class User {
    String name;

    User() {
        this("Guest");
    }

    User(String name) {
        this.name = name;
    }
}

User u = new User("Ravi");
```

Does the no-argument constructor execute? Explain why.

### Q53
Consider:

```java
class Product {
    Product() {
        System.out.println("Product()");
    }

    Product(String name) {
        System.out.println("Product(String)");
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct(String name) {
        super();
        System.out.println("ElectronicProduct(String)");
    }
}
```

Predict the output:

```java
new ElectronicProduct("Phone");
```

### Q54
For Q53, change:

```java
super();
```

to:

```java
super(name);
```

Predict the output again.

### Q55
Consider:

```java
class Product {
    Product(int id) {
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct() {
        super();
    }
}
```

Will this compile? Explain the constructor-matching problem.

### Q56
Consider:

```java
class Product {
    Product(int id) {
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct() {
    }
}
```

Will this compile under the constructor rules discussed in the session? Explain what implicit constructor call is relevant.

### Q57
Consider:

```java
class Product {
    Product() {}
    Product(int id) {}
}

class ElectronicProduct extends Product {
    ElectronicProduct(int id) {
        super(id);
    }
}
```

Which constructor is selected in `Product`?

### Q58
Consider:

```java
class Product {
    Product() {}
    Product(int id) {}
}

class ElectronicProduct extends Product {
    ElectronicProduct(int id) {
        this();
    }

    ElectronicProduct() {
        super();
    }
}
```

Trace the constructor chain for:

```java
new ElectronicProduct(101);
```

### Q59
In Q58, which statement is true?

A. `this()` and `super()` are both first statements of the same constructor  
B. `this()` calls another constructor in the same class, and that constructor then calls `super()`  
C. `super()` calls the child constructor  
D. No constructor chaining occurs  

### Q60
Consider:

```java
class Product {
    String name;
    double price;
    int id;

    Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
}

class ElectronicProduct extends Product {
    int warranty;

    ElectronicProduct(String name, double price, int id, int warranty) {
        super(name, price, id);
        this.warranty = warranty;
    }
}
```

After:

```java
ElectronicProduct p =
    new ElectronicProduct("Phone", 50000, 101, 2);
```

How many fields representing the demonstrated state are available in the resulting child object?

### Q61
For Q60, identify which state belongs to the parent portion and which belongs to the child-specific portion.

### Q62
Why is the following approach less suitable for the design demonstrated in the session?

```java
class ElectronicProduct {
    String name;
    double price;
    int id;
    int warranty;
}
```

when many other product categories need the same common fields?

### Q63
Suppose a `ClothingProduct` has:

```text
name
price
productId
size
color
```

and an `ElectronicProduct` has:

```text
name
price
productId
warranty
```

Using the session's modelling approach, identify:
1. Common fields.
2. Electronic-specific field.
3. Clothing-specific fields.

### Q64
Consider:

```java
class Product {
    Product(String name, double price, int id) {
        System.out.println("Common");
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct(String name, double price, int id, int warranty) {
        super(name, price, id);
        System.out.println("Specific");
    }
}
```

Predict the output for:

```java
new ElectronicProduct("Laptop", 70000, 20, 2);
```

### Q65
Now replace the child constructor with:

```java
ElectronicProduct(String name, double price, int id, int warranty) {
    this.warranty = warranty;
}
```

Assuming `Product` has only the parameterized constructor shown above, what compiler-level issue should you expect?

### Q66
Explain why `super(name, price, id)` can be viewed as reducing duplicated initialization in the child constructor.

### Q67
Consider:

```java
class User {
    User() {
        this("Guest");
    }

    User(String name) {
        System.out.println(name);
    }
}
```

Why is this legal, while the following is not?

```java
User() {
    System.out.println("Start");
    this("Guest");
}
```

### Q68
A developer writes:

```java
class User {
    User() {
        this("Guest");
        super();
    }

    User(String name) {}
}
```

What rule from the session is violated?

### Q69
A developer writes:

```java
class User {
    User() {
        this("Guest");
        System.out.println("Created");
    }

    User(String name) {}
}
```

Is the second statement itself a problem? Explain the first-statement rule correctly.

### Q70
A constructor is declared without an access modifier:

```java
User() {
}
```

The class is used from another package. What happens when another-package code tries:

```java
new User();
```

### Q71
A developer changes the constructor to:

```java
public User() {
}
```

What access difference does this introduce according to the Day 16 scope discussion?

### Q72
Suppose:

```java
class User {
    User() {}
}
```

is in package `a`, while the Driver is in package `b`.

Why might the Driver fail to create the object?

### Q73
Why would changing the constructor to `public` fix the access problem in Q72, assuming the class itself is accessible?

### Q74
Consider:

```java
class User {
    User() {
        this("Guest");
    }

    User(String name) {
        this.name = name;
    }

    String name;
}
```

If a developer says, “Calling `this("Guest")` creates a second `User` object,” how would you correct the reasoning?

### Q75
A developer says, “Calling a constructor again on an existing object will reset its fields.”

Based strictly on the session, what is the correct reasoning?

---

# Part D — Tricky

### Q76
Consider:

```java
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

new B();
```

The child constructor does not explicitly contain `super()`.

What constructor call is supplied implicitly according to the session, and what output order should be expected?

### Q77
Consider:

```java
class A {
    A(int x) {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}
```

Will `new B()` compile under the constructor rules discussed? Explain precisely.

### Q78
Consider:

```java
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        this(10);
        System.out.println("B()");
    }

    B(int x) {
        super();
        System.out.println("B(int)");
    }
}
```

Predict the output of:

```java
new B();
```

### Q79
For Q78, identify the complete constructor chain in arrow form.

### Q80
Consider:

```java
class Product {
    Product() {
        System.out.println("Product default");
    }

    Product(String name) {
        System.out.println("Product name");
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct() {
        this("Phone");
        System.out.println("Electronic default");
    }

    ElectronicProduct(String name) {
        super(name);
        System.out.println("Electronic name");
    }
}
```

Predict the exact output order for:

```java
new ElectronicProduct();
```

### Q81
Which constructor is responsible for initializing the common product state in Q80?

### Q82
Consider:

```java
class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class ElectronicProduct extends Product {
    int warranty;

    ElectronicProduct(String name, int warranty) {
        super(name);
        this.warranty = warranty;
    }
}
```

After creating:

```java
ElectronicProduct p =
    new ElectronicProduct("Laptop", 2);
```

A developer says:

> “Because `name` is declared in `Product`, the child object cannot contain/use it.”

Is that consistent with the Day 16 explanation? Explain.

### Q83
A developer wants to create an electronic product but does this:

```java
ElectronicProduct p =
    new ElectronicProduct("Phone", 50000, 101, 2);

p = new ElectronicProduct();
```

What important constructor/object concept from the session does this illustrate?

### Q84
A developer wants to “call the constructor again” on the exact same object:

```java
ElectronicProduct p =
    new ElectronicProduct("Phone", 50000, 101, 2);

// Wants to execute the same constructor again on p
```

According to the session, what should the developer understand instead?

### Q85
Consider:

```java
class User {
    User() {
        this("Guest");
    }

    User(String name) {
        System.out.println("User: " + name);
    }
}

class Driver {
    public static void main(String[] args) {
        User u = new User();
    }
}
```

Trace every constructor call involved in creating `u`.

### Q86
Now consider:

```java
class Product {
    Product(String name, double price, int id) {
        System.out.println("Product");
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct(String name, double price, int id, int warranty) {
        super(name, price, id);
        System.out.println("Electronic");
    }
}

class Driver {
    public static void main(String[] args) {
        ElectronicProduct p =
            new ElectronicProduct("Phone", 50000, 101, 2);
    }
}
```

Trace the execution path from `new` until the object is completely initialized.

### Q87
Why does the Day 16 design avoid copying:

```java
this.name = name;
this.price = price;
this.id = id;
```

into every specialized product constructor?

### Q88
Suppose a new product category is introduced:

```text
FoodProduct
```

with:

```text
name
price
productId
freshness
```

while `ElectronicProduct` has:

```text
name
price
productId
warranty
```

Using the Day 16 design, what belongs in the common parent and what belongs in each child?

### Q89
A developer puts `warranty`, `size`, `color`, and `freshness` into the common `Product` class “because every product might need them someday.”

Using the reasoning from Day 16, what design problem does this create?

### Q90
A developer says:

> “`super()` is mainly a shortcut for avoiding typing.”

What deeper purpose did the session emphasize?

### Q91
A developer says:

> “`this()` and `super()` are basically the same because both call constructors.”

What critical distinction is missing?

### Q92
Consider:

```java
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        this(10);
        System.out.println("B0");
    }

    B(int x) {
        super();
        System.out.println("B1");
    }
}
```

What is the exact execution sequence for:

```java
new B();
```

Do not simply give the output; identify each constructor transition.

### Q93
Consider:

```java
class A {
    A(int x) {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        this(10);
    }

    B(int x) {
        super(x);
        System.out.println("B");
    }
}
```

Does this demonstrate valid constructor chaining? Explain the chain.

### Q94
A constructor contains:

```java
System.out.println("Start");
this("Guest");
```

The developer argues:

> “`this()` is still inside the constructor, so Java should allow it.”

What specific rule makes this invalid?

### Q95
A child constructor contains:

```java
super(name);
this.warranty = warranty;
```

Why is this ordering valid?

### Q96
A child constructor contains:

```java
this.warranty = warranty;
super(name);
```

Why is this invalid according to the session?

### Q97
A class has:

```java
User() {}
User(String name) {}
User(String name, String country) {}
```

A developer calls:

```java
new User(null);
```

Based only on the Day 16 material, should you confidently classify this as a specific constructor selection problem involving `null` overload resolution?

A. Yes, because Day 16 explicitly taught null overload resolution  
B. No, that advanced detail was not established in the session  
C. Yes, because every overloaded constructor is selected randomly  
D. No, because constructors cannot be overloaded  

### Q98
Why is Q97 an important example of staying within the actual learning boundary?

### Q99
A developer asks whether constructor chaining can be used with a loop.

Based strictly on the Day 16 session, should the practice set require knowledge of loops to answer it?

A. Yes  
B. No — loops were explicitly identified as a later topic, not part of the current session  
C. Yes, because constructor chaining requires loops  
D. Only if collections are also used  

### Q100 — Master Challenge
Design the constructor flow for this requirement using only Day 16 concepts:

```text
A common Product should contain:
- name
- price
- productId

An ElectronicProduct should additionally contain:
- warranty

A guest product creation path should be possible with minimal information.

A complete product creation path should accept all required details.

Common initialization should not be duplicated unnecessarily.

The child-specific field should be initialized in the child.

Constructor calls must follow Java's first-statement and matching rules.
```

Your task:

1. Identify the classes.
2. Identify the constructors required.
3. Decide where `this()` is useful.
4. Decide where `super(...)` is useful.
5. Show the constructor chain for guest creation.
6. Show the constructor chain for complete electronic-product creation.
7. Identify which fields belong to the parent and which belong to the child.
8. Explain why the design avoids unnecessary duplication.

Do not use loops, collections, exceptions, or other later topics.

---

# Final Reasoning Challenge

### Q101 — Compiler + Design Challenge

Consider the following deliberately problematic design:

```java
class Product {

    String name;
    double price;
    int productId;

    Product(String name, double price, int productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }
}

class ElectronicProduct extends Product {

    int warranty;

    ElectronicProduct() {
        this("Phone");
        super("Phone", 50000, 101);
    }

    ElectronicProduct(String name) {
        this.warranty = 2;
    }
}
```

Without running the program:

1. Identify every constructor-related problem you can find.
2. Determine which constructor calls are valid or invalid.
3. Explain the first-statement rule.
4. Explain the parent-constructor matching requirement.
5. Explain whether `this("Phone")` can eventually lead to a valid `super(...)` call.
6. Propose a corrected constructor design using only concepts covered in Day 16.

---

# Practice Boundary

This set intentionally focuses on the actual Day 16 learning boundary:

```text
Comments / Documentation
        ↓
Constructor Purpose
        ↓
Object Initialization
        ↓
Constructor Parameters
        ↓
Constructor Matching
        ↓
No-Argument / Parameterized Constructors
        ↓
Constructor Access Scope
        ↓
this
        ↓
this()
        ↓
super()
        ↓
Inheritance
        ↓
Common vs Specific Fields
        ↓
Constructor Chaining
        ↓
Parent → Child Initialization
        ↓
Practical Object-Modelling
```
