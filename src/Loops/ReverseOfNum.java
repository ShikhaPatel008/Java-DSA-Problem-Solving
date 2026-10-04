package Loops;
import java.util.Scanner;

public class ReverseOfNum {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int r=0;
        while(n!=0){
            r *= 10;
            r += n%10;
            n/= 10;
        }
        System.out.print("Reverse number : "+ r);
    }
}
