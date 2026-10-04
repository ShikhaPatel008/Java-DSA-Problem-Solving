package Arrays;
import java.util.Scanner;

public class DuplicateElementInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum= n*(n-1)/2;
        int arraySum = 0;
        for(int i=0 ; i<n ; i++){
            arraySum += arr[i];
        }
        System.out.println("Duplicate element is " + (arraySum - sum));
    }
}
