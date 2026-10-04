package Patterns;

import java.util.Scanner;

public class StarPlusPattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int mid= (n+1)/2;
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}
