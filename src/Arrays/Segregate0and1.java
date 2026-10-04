package Arrays;
import java.util.Scanner;

public class Segregate0and1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element of array(only 0 and 1 are accepted) : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int numberOfZeroes = 0;
       // int numberOfOnes = 0; this is not necessary
        for(int ele : arr){
            if(ele==0) numberOfZeroes++;
            //else numberOfOnes++;
        }
        for (int i=0; i<numberOfZeroes; i++){
            arr[i]=0;
        }
        for (int i=numberOfZeroes; i<arr.length; i++){
            arr[i]=1;
        }
        System.out.print("Segregated 0 and 1 array : ");
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
