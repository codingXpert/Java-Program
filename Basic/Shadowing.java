
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
