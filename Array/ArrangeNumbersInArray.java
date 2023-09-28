package Array;

import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Value Of Array At " + i + "th Index");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] arrangeArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[start] % 2 != 0) {
                start++;
            } else {
                if (arr[end] % 2 == 0) {
                    end--;
                } else {
                    if (start < end) {
                        int temp = arr[end];
                        arr[end] = arr[start];
                        arr[start] = temp;
                    }

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int takeInput[] = takeInput();
        int arrangeArray[] = arrangeArray(takeInput);
        for (int num : arrangeArray) {
            System.out.print(num + " ");
        }
    }
}
