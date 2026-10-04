package Arrays;

import java.util.Scanner;

public class MinimumElementInArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.print("Enter element of array: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if (arr[i]<min){
                min= arr[i];
            }
        }
        System.out.print("maximum element of array is : "+ min);
    }
}
