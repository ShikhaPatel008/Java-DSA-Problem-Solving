package Loops;
import java.util.Scanner;

public class CountDigitsOfNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        if(n==0) n=7; // since 0 - 9 are all 1 digit no.
        int count =0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("No. of digits = " + count);
    }
}
