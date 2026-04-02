// print all 3 digits Armstrong numbers
// Ex- 153 = (1*1*1) + (5*5*5) + (3*3*3) should be 153

public class Armstrong {

    public static void main(String args[]) {
        for (int i = 100; i < 1000; i++) {
            printArmstrong(i);
        }
    }

    public static void printArmstrong(int n) {
        int sum = 0;
        int original = n;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (sum == original) {
            System.out.println(sum + ", ");
        }
    }
}
