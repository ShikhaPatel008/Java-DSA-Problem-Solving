package Loops;
import java.util.Scanner;

public class BasicLoops {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n= sc.nextInt();
        System.out.print("All odd no. divisible by 3 upto n are : ");
        for(int i=1; i<= n; i++){
            if(i%3==0 && i%2!=0)
            System.out.print(i + " ");
        }
    }
}
