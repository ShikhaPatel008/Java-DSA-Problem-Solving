package If_Else;
import java.util.Scanner;

public class TernaryBasic {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println((n%2 ==0)? "Even no." : "Odd no.");
    }
}
