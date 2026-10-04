package Methods;

import java.util.Scanner;

public class BuiltInFunctions {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Math. wale
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(16));
        System.out.println(Math.min(2,3));
        System.out.println(Math.max(2,3.4));
        System.out.println(Math.abs(-675));
        System.out.println(Math.floor(-7.8)); // Greatest Integer Function [x]
        System.out.println(Math.ceil(-7.8));
        System.out.println(Math.max(Math.max(3,5),7));  // Maximum of 3 no.
        System.out.print("Enter 4 no. : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(d,b),c),d));// Maximum of 4 no.
        System.out.println(Math.pow(3.141569,2));
    }
}
