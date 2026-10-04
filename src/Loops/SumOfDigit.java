package Loops;
import java.util.Scanner;

public class SumOfDigit {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc. nextInt();
        int sum=0;
        while (n!=0){
            if(n<0) n= -n; // if no. is -ve then take its absolute value
            sum += n%10;
            n/= 10;
        }
        System.out.println("Sum of digits = "+ sum);
    }
}
