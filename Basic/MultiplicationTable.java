package Basic;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int table =0;
        int i =1 ;
        while(i<=10 ){
            table = n*i;
            System.out.println(table);
            i++;
        }
        
    }
}
