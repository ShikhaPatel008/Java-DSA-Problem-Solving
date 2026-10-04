package Patterns;

import java.util.Scanner;

public class StarTrianglePattern {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){ // kitni lines hogi
            for(int j=1; j<=i; j++){ // har line me kitne * honge
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

