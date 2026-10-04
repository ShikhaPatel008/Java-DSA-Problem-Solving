package Loops;
import java.util.Scanner;

public class Alphabet_ASCII {
    static void main(String[] args) {

        for(int i=65 ; i<=90 ; i++){
            System.out.println((char)i+ " "+ i);
        }
        for(char ch =65; ch <= 90 ;ch++){
            System.out.println(ch + " " + (int)ch);
        }
        for(char ch ='A'; ch <= 'Z' ; ch++){
            System.out.println(ch + " " + (int)ch);
        }
//        ALL 3 LOOPS CAN SOLVE
    }
}
