package If_Else;
import java.util.Scanner;

public class GreatestOf3Number {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc. nextInt();
        System.out.print("Enter b : ");
        int b = sc. nextInt();
        System.out.print("Enter c : ");
        int c = sc. nextInt();
        if(a>=b) {
            if(a>=c)
                System.out.println("a is gratest");
            else // c>a
                System.out.println("c is greatest");
        }
        else{ // b>a
            if (b>=c)
                System.out.println("b is greatest");
        else // c>b
            System.out.println("c is greatest");
        }
    }
}
