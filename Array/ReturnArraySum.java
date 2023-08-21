package Array;
 import java.util.Scanner;

public class ReturnArraySum {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n; i++) {
            System.out.println("Enter The Value Of Array At " + i + "th Index");
            arr[i] = sc.nextInt();
        } 
        return arr; 
    }
    
    public static int returnSum(int[] arr){
        int sum = 0;
        for (int i =0 ; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int takeInput[] = takeInput();
        int printSum = returnSum(takeInput);
        System.out.print(printSum);
        
    }
    }
    

