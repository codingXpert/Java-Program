package String;

// Method 1. By Concatenating
import java.util.Scanner;
// public class ReverseString {
    
//     public static String reverse(String str){
//         String revStr = "";
//         int len = str.length();
//         for(int i = len-1; i>=0 ; i--) {
//             revStr = revStr + str.charAt(i);
//         }
//         return revStr;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The String");
//         String input = sc.nextLine();
//         String reversedString = reverse(input);
//         System.out.println("The Reversed String Is:" + " " + reversedString); 
//     }

// }


//Method 2:- By converting the original string into char array
public class ReverseString {
    
    public static String reverse(String str){
        char stringArray[] = str.toCharArray();
        String revStr = "";
        int len = stringArray.length;
        for(int i = len-1; i>=0 ; i--) {
            revStr = revStr + stringArray[i];
        }
        return revStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String input = sc.nextLine();
        String reversedString = reverse(input);
        System.out.println("The Reversed String Is:" + " " + reversedString); 
    }

}