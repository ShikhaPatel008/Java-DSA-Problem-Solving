package Loops;
import java.util.Scanner;

public class Num_Nto1 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.print(i + " ");
        }
    }
}
