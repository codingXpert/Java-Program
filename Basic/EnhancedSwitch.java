import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday ");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
            default -> System.out.print("Please enter valid number");
        }
    }
}
