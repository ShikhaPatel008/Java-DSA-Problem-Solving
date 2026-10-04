package Loops;
import java.util.Scanner;

public class NumPlusReverse {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        System.out.println( n);
        int num= n; // store original number(n) in num since n will become zero in the while loop
        int r=0;
        while(n!=0){
            r *= 10;
            r += n%10;
            n/= 10;
        }
        System.out.println("Reverse number : "+ r);
        int sum= (num + r);
        System.out.println("Sum of number and reverse : "+ sum);
    }
}
