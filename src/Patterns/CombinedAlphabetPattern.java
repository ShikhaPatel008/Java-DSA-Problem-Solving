package Patterns;

import java.util.Scanner;

public class CombinedAlphabetPattern {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2 !=0) {  // odd row -> lower case
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 96) + " ");
                }
            }
            else {  // even row -> upper case
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
