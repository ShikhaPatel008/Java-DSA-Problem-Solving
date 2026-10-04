package If_Else;
import java.util.Scanner;

public class SidesOfTriangle {
    static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st side : ");
        int  a = sc.nextInt();
        System.out.print("Enter 2nd side : ");
        int  b = sc.nextInt();
        System.out.print("Enter 3rd side : ");
        int  c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid triangle");

    }
}
