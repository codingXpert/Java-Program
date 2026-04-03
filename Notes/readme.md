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

# Function Overloading

Function overloading in Java is a feature that allows a class to have multiple methods with the same name but different parameter lists (different number, type, or sequence of parameters).  This mechanism enables compile-time polymorphism, improving code readability by allowing the same method name to perform different operations based on the input arguments.

***Key characteristics and rules include:***

**Parameter Distinction:** Overloaded methods must differ in their parameter list; changing only the return type or access modifier is insufficient and will cause a compilation error.
Ways to Overload: Methods can be overloaded by changing the number of arguments, the data type of arguments, or the sequence of data types.

**Type Promotion:** Java supports type promotion during method resolution, allowing a method with a larger data type parameter to be called if an exact match for a smaller type (e.g., float to double) is not found.

**Static Binding:** Method overloading is resolved at compile-time, meaning the compiler determines which method to invoke based on the method signature provided in the code.

**Constructor Overloading:** The concept also applies to constructors, allowing a class to have multiple constructors with different argument lists to initialize objects in various ways.

***Example of Method Overloading:***

```java
class Calculator {
    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adds two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15));   // Calls add(int, int, int)
        System.out.println(calc.add(5.5, 10.5));   // Calls add(double, double)
    }
}
```

# Literals in Java

In Java, a Literal is a value of boolean, numeric, character, or string data. Any constant value that can be assigned to the variable is called a literal.

```java
// Here 100 is a constant/literal.
int x = 100; 
```

### Types of Literals in Java\\

Java supports the following types of literals:

1. **Integral Literals in Java:**\
   For Integral data types (byte, short, int, long), we can specify literals in four ways, which are listed below:

   ***1.1 Decimal literals (Base 10):*** In this form, the allowed digits are 0-9(int x = 101;)

   ***1.2 Octal literals (Base 8):*** In this form, the allowed digits are 0-7. The octal number should be prefix with 0(int x = 0146).

   ***1.3 Hexadecimal literals (Base 16):***  In this form, the allowed digits are 0-9, and characters are a-f. We can use both uppercase and lowercase characters, as we know that Java is a case-sensitive programming language, but here Java is not case-sensitive. The hexa-decimal number should be prefix(with 0X or 0x)(int x = 0X123Face).

   ***1.4. Binary literals:*** From 1.7 onward, we can specify literal value even in binary form also, allowed digits are 0 and 1. Literals value should be prefixed with 0b or 0B. int x = 0b1111;

```java
public class Geeks {
    public static void main(String[] args)
    {
          // decimal-form literal
        int a = 101; 
          // octal-form literal
        int b = 0100; 
        // Hexa-decimal form literal
        int c = 0xFace; 
          // Binary literal
        int d = 0b1111; 
      
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
```

**Output**

```java
101
64
64206
15
```

**Output Explanation**\
In Java, numbers can be written in different formats (number systems):

```table
| Format           | Prefix    | Base    |
| ---------------- | --------- | ------- |
| Decimal (normal) | no prefix | Base 10 |
| Octal            | `0`       | Base 8  |
| Hexadecimal      | `0x`      | Base 16 |
| Binary           | `0b`      | Base 2  |
```

```java
✅ 1. int a = 101;
No prefix → Decimal (Base 10)
So it stays the same

👉 Output: 101
```

```java
✅ 2. int b = 0100;
Starts with 0 → Octal (Base 8)

Now convert 0100 (octal) to decimal:

0 × 8² + 1 × 8¹ + 0 × 8⁰
= 0 + 8 + 0
= 64

👉 Output: 64
```

```java
✅ 3. int c = 0xFace;
Starts with 0x → Hexadecimal (Base 16)

Hex digits:
F = 15
A = 10
C = 12
E = 14

Now convert:
F × 16³ + A × 16² + C × 16¹ + E × 16⁰
= 15×4096 + 10×256 + 12×16 + 14
= 61440 + 2560 + 192 + 14
= 64206

👉 Output: 64206
```

```java
✅ 4. int d = 0b1111;
Starts with 0b → Binary (Base 2)

Convert:
1×2³ + 1×2² + 1×2¹ + 1×2⁰
= 8 + 4 + 2 + 1
= 15
```

> ***Note:*** By default, every integral literal is of int type. To specify it as long, add the suffix L or l. There’s no explicit way to define byte or short literals, but if an integral value assigned is within their range, the compiler treats it automatically as a byte or short literal.

***[Read About Other Literala](https://www.geeksforgeeks.org/java/literals-in-java/)***
