package Loops;
import java.util.Scanner;

public class PowerLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base(a) : ");
        int a =sc.nextInt();
        System.out.print("Enter exponent(b) : ");
        int b =sc.nextInt();
        int p= 1;
        for(int i=1; i<=b; i++){
            p*= a;
        }
        System.out.println(a+ "raised to the power" + b +" : " + p );
    }
}
