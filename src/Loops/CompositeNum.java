package Loops;
import java.util.Scanner;

public class CompositeNum {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        boolean flag= true; //true means prime;
        for(int i=2; i<= Math.sqrt(n) ;i++){
            if(n%i==0)
                flag = false;
            break;
        }
        if(n==1) System.out.println("Neither prime nor composite");
        else if(flag==false) System.out.println("Composite no.");
        else System.out.println("Prime no.");

    }
}
