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

# Variable-length arguments

Variable-length arguments in Java, commonly known as varargs, are a feature introduced in Java 5 that allows a method to accept a flexible number of arguments of the same type.  This is declared using an ellipsis (...) after the data type, such as public void myMethod(int... numbers), where the parameter behaves internally as a single-dimensional array.

Inside the method, the varargs parameter acts like an array, allowing developers to access its length or iterate over its elements.  A method can include only one varargs parameter, and it must always be the last parameter in the list, though it can coexist with fixed parameters before it.  If no arguments are passed, Java automatically creates an empty array rather than passing a null value.

* **Syntax:** return\_type methodName(data\_type ... parameterName) { ... }

* **Example:**

```java
public static void sum(int... nums);
```

accepts zero or more integers.

* **Compilation:** The Java compiler converts varargs into an array type (e.g., int... becomes int\[]) at compile time.

* **Usage:** It eliminates the need for multiple overloaded methods or manually passing arrays when the argument count is unknown.

***Key rules for using varargs include:***

**Placement:** The variable-length parameter must be the last parameter declared in the method signature if other parameters are present.

**Quantity:** A method or constructor can accept at most one variable-length argument.

**Type Specificity:** The arguments passed must be of the same type (or subtypes) as the declared vararg type.

**Calling:** A varargs method can be called with zero or more arguments, or a pre-existing array of the matching type can be passed directly.

```java
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
//        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
//        demo(3,3,5,6,7,8,632,324,56);
//        demo("r", "ertyui", "", "y");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
```
