package Arrays;

import java.util.Scanner;

public class WaveArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter sorted of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i+=2){
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}
