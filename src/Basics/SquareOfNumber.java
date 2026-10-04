package Basics;

import java.util.Scanner;

public class SquareOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        double a = sc.nextDouble();
        double square = a*a;
        System.out.println("Square of Number = " + square );
    }
}
