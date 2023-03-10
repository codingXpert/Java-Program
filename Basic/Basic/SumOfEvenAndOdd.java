// Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
// Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
// Input format :
//  Integer N
// Output format :
// Sum_of_Even_Digits Sum_of_Odd_Digits
// (Print first even sum and then odd sum separated by space)
// Constraints
// 0 <= N <= 10^8
// Sample Input 1:
// 1234
// Sample Output 1:
// 6 4
// Sample Input 2:
// 552245
// Sample Output 2:
// 8 15

package Basic;
import java.util.Scanner;

public class SumOfEvenAndOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int digit =0;
        while(n!=0){
             digit = n%10; 
             if(digit%2 == 0){
                evenSum = evenSum + digit;
             }else{
                oddSum = oddSum + digit; 
             }
               n = n/10;         
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
