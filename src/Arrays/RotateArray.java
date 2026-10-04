package Arrays;
import java.util.Scanner;

public class RotateArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter steps for rotating array (d) : ");
        int d = sc.nextInt();
        d %= n;
        //rotate array :-  reverse array from 0 to d-1 then reverse array from d to n-1 then reverse whole array from 0 to n-1
        reverse(arr,0,d-1);//reverse array from 0 to d-1
        reverse(arr,d,n-1);//reverse array from d to n-1
        reverse(arr,0,n-1);//reverse array from 0 to n-1
        System.out.print("Array after rotation : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
