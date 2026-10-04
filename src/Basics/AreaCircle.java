package Basics;

import java.util.Scanner;

public class AreaCircle {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //input lene ke liye
        System.out.print("Enter radius : ");
        double r = sc.nextDouble();
        double area = 3.141592 * r * r;
        System.out.println("Area of circle = " + area + "cm sq");
        
    }
}





