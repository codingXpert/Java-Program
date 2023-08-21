// You have been given a random integer array/list(ARR) of size N, and an integer X. 
// You need to search for the integer X in the given array/list using 'Linear Search'.
//  You have been required to return the index at which X is present in the array/list. 
//  If X has multiple occurrences in the array/list, then you need to return the index
// at which the first occurrence of X would be encountered. 

// In case X is not present in the array/list, then return -1.


package Array;
import java.util.Scanner;

public class LinearSearch {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter The Value Of Array At " + i + "th Index");
            arr[i] = sc.nextInt();
        } 
        return arr;
    }

    public static int searchElement(int[] arr, int x){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int takeInput[] = takeInput();
        int targetIndex = searchElement(takeInput, 2);
        if(targetIndex == -1){
            System.out.println(targetIndex);
        }else{
            System.out.println("Value Is Present At The Index " + targetIndex);
        }
        
    }
}
