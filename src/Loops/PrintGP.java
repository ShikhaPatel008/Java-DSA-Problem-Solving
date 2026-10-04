package Loops;
import java.util.Scanner;
public class PrintGP {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st term : ");
        int a= sc.nextInt();
        System.out.print("Enter common ratio : ");
        int r= sc.nextInt();
        System.out.print("Enter no. of terms : ");
        int n= sc.nextInt();
        // nth term of GP = a* r to the power n-1
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            a *= r;
        }
    }
}
