package Array;
import java.util.Scanner;

public class FindingLargestElement {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n; i++) {
            System.out.println("Enter The Value Of Array At " + i + "th Index");
            arr[i] = sc.nextInt();
        } 
        return arr; 
    }

    public static int largestNumber(int arr[]){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int takeInput[] = takeInput();
        int largestNumber = largestNumber(takeInput);
        System.out.println("The Largest No. Is " + largestNumber);
    }
}
