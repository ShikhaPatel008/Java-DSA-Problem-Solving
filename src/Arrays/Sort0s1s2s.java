package Arrays;
import java.util.Scanner;

public class Sort0s1s2s {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array(only 0, 1 2) : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int numberOfZeroes = 0;
        int numberOfOnes = 0;
//      int numberOfTwos= 0; this is not necessary
        for(int ele : arr){
            if(ele==0) numberOfZeroes++;
            else if(ele==1) numberOfOnes++;
//           else numberOfTwos++;
        }
        for (int i=0; i<numberOfZeroes; i++){
            arr[i]=0;
        }
        for (int i=numberOfZeroes; i<(numberOfZeroes + numberOfOnes); i++){
            arr[i]=1;
        }
        for (int i=numberOfZeroes + numberOfOnes; i<n; i++){
            arr[i]=2;
        }
        System.out.print("Sorted array : ");
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
