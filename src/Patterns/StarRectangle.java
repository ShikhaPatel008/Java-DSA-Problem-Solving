package Patterns;
import java.util.Scanner;

public class StarRectangle {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row= sc.nextInt();
        System.out.print("Enter columns : ");
        int col= sc.nextInt();
        for(int i=1; i<=row; i++){ // kitni lines hogi
            for(int j=1; j<=col; j++){ // har line me kitne * honge
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
