package Arrays;
import java .util.Scanner;

public class maximumElementInArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.print("Enter element of array: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int max= arr[0];  // ot int max = Integer.MIN_VALUE
        for(int i=0; i<n; i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        System.out.print("maximum element of array is : "+ max);
    }
}
