# Shadowing

## What is Shadowing?

**Shadowing** in Java occurs when a variable declared in an inner scope (like a method, block, or inner class) has the same name as a variable in an outer scope (like a class-level variable).  The inner variable shadows or hides the outer variable within its scope, making the outer variable temporarily inaccessible.

In Java, this commonly occurs when:

* A **local variable** (inside a method) has the same name as a **class variable** (static or instance).

* A **method parameter** has the same name as a **class variable**.

## Code Example: Shadowing in Action

```java
public class Shadowing {
 
    // The reason behind making the x static is because static is object independent thing. And this x might be used inside static function and we can use a non static variable or method inside a static thing
    static int x = 90; // this will be shadowed at line 8. 

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
```

**Inside main():**

```java
System.out.println(x);
```

👉 It prints 90 because it is using the class variable x.

```java
int x;
```

👉 Now we created a new local variable also named x.

⚡ This local x shadows (hides) the class x.

```java
x = 40;
System.out.println(x); // 40
```

👉 Now it prints 40, because:

Java uses the nearest variable
So it uses local x (40) instead of class x (90)

**In fun() method:**

```java
System.out.println(x);
```

👉 It prints 90, because:

There is no local x here
So it uses the class variable x

*In one line:*
👉 Shadowing happens when a local variable hides a class variable with the same name.

*Simple analogy:*
Think of it like:

Class x = 90 → original name
Local x = 40 → nickname

Inside the method, people use the nickname (40), so the original name (90) is hidden.
