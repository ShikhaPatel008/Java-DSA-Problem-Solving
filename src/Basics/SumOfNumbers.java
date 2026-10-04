package Basics;

import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.print("Enter 1st numbers : ");
        int a = add.nextInt();
        System.out.print("Enter 2nd numbers : ");
        int b = add.nextInt();
        System.out.print("Enter 3rd numbers : ");
        int c = add.nextInt();
        int sum = a+b+c;
        System.out.println("Sum of 3 no. = " + sum );
    }
}
