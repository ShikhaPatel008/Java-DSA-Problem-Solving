package If_Else;

import java.util.Scanner;
public class CheckIfInteger {
    static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a real no. : ");
       double n = sc.nextDouble(); // example: n = -3.141569
       int x= (int) n; // x = -3
       if(n-x >0 ){   // n-x = 0.141569 (which is greater than 0) so, n is not an integer
           System.out.println("Not an integer");
       }
        System.out.println("Is an integer");
    }
}
