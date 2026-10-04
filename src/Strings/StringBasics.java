package Strings;

import java.util.Scanner;

public class StringBasics {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine(); // nextLine - prints complete statement
        System.out.println(s);
        String t = sc.next();  // next -  stops after 1st empty space
        System.out.println(t);
    }
}
