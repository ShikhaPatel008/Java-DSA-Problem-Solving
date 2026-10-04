package Patterns;

import java.util.Scanner;

public class NumberAlphabetTriangle {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2 !=0) {   // odd rows -> Numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            else {    // even rows -> Aplhabets
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
