package Patterns;

import java.util.Scanner;

public class NumberPyramid {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        //           METHOD 1
        for(int i=1; i<=n; i++){  // lines
            for(int j=1; j<=n-i; j++){  // spaces
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){  // (2i-1) stars
                System.out.print(i+" ");
            }
            System.out.println();
        }
//           METHOD 2
        int nsp = n-1, nst = 1;

        for (int i=1; i<=n; i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print(i +" ");
            }
            nsp --;
            nst += 2;
            System.out.println();
        }
    }
}
