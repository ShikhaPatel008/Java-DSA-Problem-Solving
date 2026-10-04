package If_Else;

import java.util.Scanner;
// absolute value or magnitude means +ve value of a number
public class AbsoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n= sc.nextInt();
        if(n>=0) System.out.println("Absolute value of n" + n);
        else System.out.println("Absolute value" +(-n));
    }
}
