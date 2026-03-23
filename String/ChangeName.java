public class ChangeName {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    public static void changeName(String name) {
        name = "Rahul Rana";   //  the value of name is changed but it will not reflect in main method because String is immutable and we are creating a new string object here not changing the original string object
    }
}