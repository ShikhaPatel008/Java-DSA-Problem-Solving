package Arrays;
import java.util.Scanner;

public class SumOfElementOfArray {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter element of array : ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //sum of elements
        int sum=0;
        System.out.print("Sum of element of array : ");
        for (int i=0; i<n; i++){
            sum+= arr[i];
        }
        System.out.print(sum);
    }
}
