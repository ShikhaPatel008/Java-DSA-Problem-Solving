package Loops;
import java.util.Scanner;

public class SumOfNum_Revese {
     static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter number : ");
         int n = sc.nextInt();
         int sum =0;
         while(n!=0){
             sum += n%10;
             n /= 10;
         }
         System.out.println("Sum of digits : "+ sum);
         int r =0;
         while(sum!=0){
             r *= 10;
             r += sum%10;
             sum /= 10;
         }
         System.out.println("Reverse of sum of digit : "+ r);
    }
}
