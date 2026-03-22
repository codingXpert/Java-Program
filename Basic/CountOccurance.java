// Find the count of a digit in a number


import java.util.Scanner;

public class CountOccurance {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        long num = sc.nextLong();

        System.out.println("Enter the digit to count");
        int n = sc.nextInt();
        int count = 0;

        while (num > 0) {
            long rem = num % 10;
            if (rem == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("The digit " + n + " occurs " + count + " times in the number ");
    }
}
