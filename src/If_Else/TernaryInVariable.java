package If_Else;
import java.util.Scanner;

public class TernaryInVariable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = (n>=0) ? 100 : 0;
        System.out.println(a);
    }
}
