package Arrays;
import java.util.Scanner;

public class OptimizedSegregate0and1 {
    static void main(String[] args) {
        // using 2 pointer approach
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element of array(only 0 and 1 are accepted) : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if (arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
    }
}
