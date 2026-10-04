package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int [] arr = {5,-6,2,67,43,-97};
//        int n= arr.length;
//        System.out.println(n);
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//
        int []shikha = new int[7];
//        //default values
//        for (int i=0; i<7; i++){
//            System.out.print(shikha[i] + " ");// output will be 0 at all indices since the default value is 0
//        }

        //taking user input
        System.out.print("Enter element of array : ");
        for(int i=0; i<7; i++){
            shikha[i] = sc.nextInt();
        }
        //print
        System.out.print("Double of elements of array are : ");
        for(int i=0; i<7; i++){
            System.out.print(2*shikha[i] + " ");
        }
    }
}
