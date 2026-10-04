package Methods;

import java.util.Scanner;

public class Swap2Numbers {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number (a) : ");
        int a = sc.nextInt();
        System.out.print("Enter another number (b) : ");
        int b = sc.nextInt();
        int temp = a;  // a ki value temp me daldo
        a = b; // b ki value a me daldo
        b= temp; // temp ki value b me daldo
        System.out.println("After Swapping a = "+ a + " and b = "+ b);
    }
}
